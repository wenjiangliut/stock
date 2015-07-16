package com.yingmu.etf;

import java.util.Date;

/**
 * Created by liutong on 15/7/16.
 */
public class EtfDO {//ctrl+n

    private String secID;//	string	证券ID
    private String tradeDate;//	date	交易日期
    private String ticker;//	string	基金交易代码
    private String exchangeCD;//	string	交易市场编码
    private String secShortName;//	string	证券简称
    private String preClosePrice	;//double	昨收盘
    private String openPrice;//	double	今开盘
    private String highestPrice;//	double	最高价
    private String lowestPrice;//	double	最低价
    private String closePrice;//	double	收盘价
    private String CHG;//	double	涨跌
    private String CHGPct;//	double	涨跌幅
    private String turnoverVol;//	double	成交量
    private String turnoverValue;//	double	成交金额
    private String discount;//	double	贴水
    private String discountRatio; //贴水率

    public String getSecID() {
        return secID;
    }

    public void setSecID(String secID) {
        this.secID = secID;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getExchangeCD() {
        return exchangeCD;
    }

    public void setExchangeCD(String exchangeCD) {
        this.exchangeCD = exchangeCD;
    }

    public String getSecShortName() {
        return secShortName;
    }

    public void setSecShortName(String secShortName) {
        this.secShortName = secShortName;
    }

    public String getPreClosePrice() {
        return preClosePrice;
    }

    public void setPreClosePrice(String preClosePrice) {
        this.preClosePrice = preClosePrice;
    }

    public String getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(String openPrice) {
        this.openPrice = openPrice;
    }

    public String getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(String highestPrice) {
        this.highestPrice = highestPrice;
    }

    public String getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(String lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public String getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(String closePrice) {
        this.closePrice = closePrice;
    }

    public String getCHG() {
        return CHG;
    }

    public void setCHG(String CHG) {
        this.CHG = CHG;
    }

    public String getCHGPct() {
        return CHGPct;
    }

    public void setCHGPct(String CHGPct) {
        this.CHGPct = CHGPct;
    }

    public String getTurnoverVol() {
        return turnoverVol;
    }

    public void setTurnoverVol(String turnoverVol) {
        this.turnoverVol = turnoverVol;
    }

    public String getTurnoverValue() {
        return turnoverValue;
    }

    public void setTurnoverValue(String turnoverValue) {
        this.turnoverValue = turnoverValue;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(String discountRatio) {
        this.discountRatio = discountRatio;
    }



}
