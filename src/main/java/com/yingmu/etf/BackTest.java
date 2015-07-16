package com.yingmu.etf;

import java.util.List;

/**
 * Created by liutong on 15/7/16.
 */
public class BackTest {

    public static void main(String[] args) { //command + j
        BackTest bt = new BackTest();
        bt.print(2000000d, 16);
        System.out.println();
        System.out.println();
        System.out.println();
        bt.print(2000000d, 47);
        System.out.println();
        System.out.println();
        System.out.println();
        bt.print(2000000d, 57);
        System.out.println();
        System.out.println();
        System.out.println();
        bt.print(2000000d, 67);

    }

    public void print(Double input, int month) {
        System.out.println(month + "月只买50，盈亏 : " + (get50Money(input, month) - input));
        System.out.println(month + "月只买500，盈亏 : " + (get500Money(input, month) - input));
        System.out.println();
        System.out.println(month + "月，1天轮动，盈亏: " + (getMoney(1, input, month) - input));
        System.out.println(month + "月，5天轮动，盈亏: " + (getMoney(5, input, month) - input));
        System.out.println(month + "月，10天轮动，盈亏: " + (getMoney(10, input, month) - input));
        System.out.println(month + "月，20天轮动，盈亏: " + (getMoney(20, input, month) - input));
        System.out.println(month + "月，30天轮动，盈亏: " + (getMoney(30, input, month) - input));
    }

    public Double get50Money(Double input, int month) {
        List<EtfDO> history50 = InitDataUtil.get50EtfList(month);
        for (EtfDO e : history50) {
            input = input * (1 + Double.valueOf(e.getCHGPct()));
        }
        return input;
    }

    public Double get500Money(Double input, int month) {
        List<EtfDO> history500 = InitDataUtil.get500EtfList(month);
        for (EtfDO e : history500) {
            input = input * (1 + Double.valueOf(e.getCHGPct()));
        }
        return input;
    }

    public Double getMoney(int day, Double input, int month) {
        List<EtfDO> history500 = InitDataUtil.get500EtfList(month);
        List<EtfDO> history50 = InitDataUtil.get50EtfList(month);

        Double[] num = init(input);

        int flag = 0;
        for (int i = 0; i < history50.size(); i++) {
            num = changeValue(num, Double.valueOf(history50.get(i).getCHGPct()), Double.valueOf(history500.get(i).getCHGPct()));
            if (flag == day) {
                num = changeNum(num);
                flag = 0;
            }
            flag++;
        }

        return num[0] + num[1];

    }

    /**
     * 当前估值
     *
     * @param num
     * @return
     */
    private Double[] changeValue(Double[] num, Double change50, Double change500) {
        Double value50 = num[0] * (1 + change50);
        Double value500 = num[1] * (1 + change500);
        return new Double[]{value50, value500};
    }


    /**
     * 初始份额
     *
     * @param input
     * @return
     */
    public Double[] init(Double input) {
        Double e50Num = input / 2;
        Double e500Num = input / 2;

        return new Double[]{e50Num, e500Num};
    }

    /**
     * 调仓
     *
     * @param num 份额
     */
    public Double[] changeNum(Double[] num) {
        return new Double[]{(num[0] + num[1]) / 2, (num[0] + num[1]) / 2};
    }


}
