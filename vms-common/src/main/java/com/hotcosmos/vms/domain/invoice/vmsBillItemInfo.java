package com.hotcosmos.vms.domain.invoice;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "vms_bill_item_info")
public class vmsBillItemInfo {
    /**
     * 票据ID
     */
    @Id
    @Column(name = "BILL_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String billId;

    /**
     * 票据明细ID
     */
    @Id
    @Column(name = "BILL_ITEM_ID")
    private String billItemId;

    /**
     * 商品ID
     */
    @Column(name = "GOODS_ID")
    private String goodsId;

    /**
     * 商品名称
     */
    @Column(name = "GOODS_NAME")
    private String goodsName;

    /**
     * 规格型号
     */
    @Column(name = "SPECANDMODEL")
    private String specandmodel;

    /**
     * 单位
     */
    @Column(name = "GOODS_UNIT")
    private String goodsUnit;

    /**
     * 商品数量
     */
    @Column(name = "GOODS_NO")
    private BigDecimal goodsNo;

    /**
     * 商品单价
     */
    @Column(name = "GOODS_PRICE")
    private BigDecimal goodsPrice;

    /**
     * 含税标志（Y-含税，N-不含税）
     */
    @Column(name = "TAX_FLAG")
    private String taxFlag;

    /**
     * 金额
     */
    @Column(name = "AMT")
    private BigDecimal amt;

    /**
     * 税率
     */
    @Column(name = "TAX_RATE")
    private BigDecimal taxRate;

    /**
     * 税额
     */
    @Column(name = "TAX_AMT")
    private BigDecimal taxAmt;

    /**
     * 商品税目
     */
    @Column(name = "TAX_ITEM")
    private String taxItem;

    /**
     * 是否主商品(Y/N)
     */
    @Column(name = "IS_MAINGOODS")
    private String isMaingoods;

    /**
     * 票据行性质（0-正常行;1-折扣行;2-被折扣行）
     */
    @Column(name = "ROW_NATURE")
    private String rowNature;

    /**
     * 被折扣明细ID
     */
    @Column(name = "DIS_ITEM_ID")
    private String disItemId;

    /**
     * 折扣率
     */
    @Column(name = "DISCOUNT_RATE")
    private BigDecimal discountRate;

    /**
     * 获取票据ID
     *
     * @return BILL_ID - 票据ID
     */
    public String getBillId() {
        return billId;
    }

    /**
     * 设置票据ID
     *
     * @param billId 票据ID
     */
    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    /**
     * 获取票据明细ID
     *
     * @return BILL_ITEM_ID - 票据明细ID
     */
    public String getBillItemId() {
        return billItemId;
    }

    /**
     * 设置票据明细ID
     *
     * @param billItemId 票据明细ID
     */
    public void setBillItemId(String billItemId) {
        this.billItemId = billItemId == null ? null : billItemId.trim();
    }

    /**
     * 获取商品ID
     *
     * @return GOODS_ID - 商品ID
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品ID
     *
     * @param goodsId 商品ID
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * 获取商品名称
     *
     * @return GOODS_NAME - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 获取规格型号
     *
     * @return SPECANDMODEL - 规格型号
     */
    public String getSpecandmodel() {
        return specandmodel;
    }

    /**
     * 设置规格型号
     *
     * @param specandmodel 规格型号
     */
    public void setSpecandmodel(String specandmodel) {
        this.specandmodel = specandmodel == null ? null : specandmodel.trim();
    }

    /**
     * 获取单位
     *
     * @return GOODS_UNIT - 单位
     */
    public String getGoodsUnit() {
        return goodsUnit;
    }

    /**
     * 设置单位
     *
     * @param goodsUnit 单位
     */
    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    /**
     * 获取商品数量
     *
     * @return GOODS_NO - 商品数量
     */
    public BigDecimal getGoodsNo() {
        return goodsNo;
    }

    /**
     * 设置商品数量
     *
     * @param goodsNo 商品数量
     */
    public void setGoodsNo(BigDecimal goodsNo) {
        this.goodsNo = goodsNo;
    }

    /**
     * 获取商品单价
     *
     * @return GOODS_PRICE - 商品单价
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * 设置商品单价
     *
     * @param goodsPrice 商品单价
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * 获取含税标志（Y-含税，N-不含税）
     *
     * @return TAX_FLAG - 含税标志（Y-含税，N-不含税）
     */
    public String getTaxFlag() {
        return taxFlag;
    }

    /**
     * 设置含税标志（Y-含税，N-不含税）
     *
     * @param taxFlag 含税标志（Y-含税，N-不含税）
     */
    public void setTaxFlag(String taxFlag) {
        this.taxFlag = taxFlag == null ? null : taxFlag.trim();
    }

    /**
     * 获取金额
     *
     * @return AMT - 金额
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * 设置金额
     *
     * @param amt 金额
     */
    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    /**
     * 获取税率
     *
     * @return TAX_RATE - 税率
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * 设置税率
     *
     * @param taxRate 税率
     */
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 获取税额
     *
     * @return TAX_AMT - 税额
     */
    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    /**
     * 设置税额
     *
     * @param taxAmt 税额
     */
    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    /**
     * 获取商品税目
     *
     * @return TAX_ITEM - 商品税目
     */
    public String getTaxItem() {
        return taxItem;
    }

    /**
     * 设置商品税目
     *
     * @param taxItem 商品税目
     */
    public void setTaxItem(String taxItem) {
        this.taxItem = taxItem == null ? null : taxItem.trim();
    }

    /**
     * 获取是否主商品(Y/N)
     *
     * @return IS_MAINGOODS - 是否主商品(Y/N)
     */
    public String getIsMaingoods() {
        return isMaingoods;
    }

    /**
     * 设置是否主商品(Y/N)
     *
     * @param isMaingoods 是否主商品(Y/N)
     */
    public void setIsMaingoods(String isMaingoods) {
        this.isMaingoods = isMaingoods == null ? null : isMaingoods.trim();
    }

    /**
     * 获取票据行性质（0-正常行;1-折扣行;2-被折扣行）
     *
     * @return ROW_NATURE - 票据行性质（0-正常行;1-折扣行;2-被折扣行）
     */
    public String getRowNature() {
        return rowNature;
    }

    /**
     * 设置票据行性质（0-正常行;1-折扣行;2-被折扣行）
     *
     * @param rowNature 票据行性质（0-正常行;1-折扣行;2-被折扣行）
     */
    public void setRowNature(String rowNature) {
        this.rowNature = rowNature == null ? null : rowNature.trim();
    }

    /**
     * 获取被折扣明细ID
     *
     * @return DIS_ITEM_ID - 被折扣明细ID
     */
    public String getDisItemId() {
        return disItemId;
    }

    /**
     * 设置被折扣明细ID
     *
     * @param disItemId 被折扣明细ID
     */
    public void setDisItemId(String disItemId) {
        this.disItemId = disItemId == null ? null : disItemId.trim();
    }

    /**
     * 获取折扣率
     *
     * @return DISCOUNT_RATE - 折扣率
     */
    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    /**
     * 设置折扣率
     *
     * @param discountRate 折扣率
     */
    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }
}