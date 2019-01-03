package com.hotcosmos.vms.domain.invoice;

import cc.mrbird.common.annotation.ExportConfig;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "vms_trans_info")
public class vmsTransInfo {
    /**
     * 数据对应主键，自增长
     */
    @Id
    @ExportConfig(value = "交易流水号")
    @Column(name = "TRANS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transId;

    /**
     * 交易时间（MUFG:VALDAT）
     */
    @ExportConfig(value = "交易时间")
    @Column(name = "TRANS_DATE")
    private String transDate;

    /**
     * 交易类型（MUFG）
     */
    @ExportConfig(value = "交易类型")
    @Column(name = "TRANS_TYPE")
    private String transType;

    /**
     * 客户账号
     */
    @ExportConfig(value = "客户账号")
    @Column(name = "CUSTOMER_ACCOUNT")
    private String customerAccount;

    /**
     * 含税标志 Y-含/N-不含
     */
    @ExportConfig(value = "含税标志")
    @Column(name = "TAX_FLAG")
    private String taxFlag;

    /**
     * 税率
     */
    @ExportConfig(value = "税率")
    @Column(name = "TAX_RATE")
    private BigDecimal taxRate;

    /**
     * 是否冲账 Y-是/N-否（MUFG:ISREVERSE）
     */
    @ExportConfig(value = "是否冲账")
    @Column(name = "IS_REVERSE")
    private String isReverse;

    /**
     * 备注
     */
    @ExportConfig(value = "备注")
    @Column(name = "REMARK")
    private String remark;

    /**
     * 本体交易币种
     */
    @ExportConfig(value = "本体交易币种")
    @Column(name = "ORG_CURR_CODE")
    private String orgCurrCode;

    /**
     * 本体交易账号
     */
    @ExportConfig(value = "本体交易账号")
    @Column(name = "ORG_ACC_NO")
    private String orgAccNo;

    /**
     * 交易原币金额
     */
    @ExportConfig(value = "交易原币金额")
    @Column(name = "AMT_CCY")
    private BigDecimal amtCcy;

    /**
     * 冲账对应交易ID
     */
    @ExportConfig(value = "冲账对应交易ID")
    @Column(name = "REVERSE_TRANS_ID")
    private String reverseTransId;

    /**
     * 尾差
     */
    @ExportConfig(value = "尾差")
    @Column(name = "SHORT_AND_OVER")
    private BigDecimal shortAndOver;

    /**
     * 未开票金额（人民币）
     */
    @ExportConfig(value = "未开票金额")
    @Column(name = "BALANCE")
    private BigDecimal balance;

    /**
     * 开票机构
     */
    @ExportConfig(value = "开票机构")
    @Column(name = "INSTCODE")
    private String instcode;

    /**
     * 录单机构
     */
    @ExportConfig(value = "录单机构")
    @Column(name = "ORIG_INSTCODE")
    private String origInstcode;

    /**
     * 状态 1-未开票/2-开票编辑锁定中/3-开票中/4-删除/5-被冲账/6-已冲账/ 15已作废/16 已红冲/99-开票完成/88-犹退/201-电票自动开具失败
     */
    @ExportConfig(value = "状态", convert = "s:1-未开票,2-开票编辑锁定中,3-开票中,4-删除,5-被冲账,6-已冲账")
    @Column(name = "DATASTATUS")
    private String datastatus;

    /**
     * 客户号
     */
    @ExportConfig(value = "客户号")
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 金额_人民币(价税合计)
     */
    @ExportConfig(value = "金额_人民币")
    @Column(name = "AMT_CNY")
    private BigDecimal amtCny;

    /**
     * 税额_人民币
     */
    @ExportConfig(value = "税额_人民币")
    @Column(name = "TAX_AMT_CNY")
    private BigDecimal taxAmtCny;

    /**
     * 收入_人民币
     */
    @ExportConfig(value = "收入_人民币")
    @Column(name = "INCOME_CNY")
    private BigDecimal incomeCny;

    /**
     * 本体交易类型
     */
    @ExportConfig(value = "本体交易类型")
    @Column(name = "ORG_TRANS_TYPE")
    private String orgTransType;

    /**
     * 本体交易子类型
     */
    @ExportConfig(value = "本体交易子类型")
    @Column(name = "ORG_TRANS_SUB_TYPE")
    private String orgTransSubType;

    /**
     * 原始交易日期
     */
    @ExportConfig(value = "原始交易日期")
    @Column(name = "REVERSE_TRANS_DATE")
    private String reverseTransDate;

    /**
     * 原始交易业务编号
     */
    @ExportConfig(value = "原始交易业务编号")
    @Column(name = "REVERSE_TRANS_BUS_ID")
    private String reverseTransBusId;

    /**
     * 交易业务编号
     */
    @ExportConfig(value = "交易业务编号")
    @Column(name = "TRANS_BUS_ID")
    private String transBusId;

    /**
     * 交易币种
     */
    @ExportConfig(value = "交易币种")
    @Column(name = "TRANS_CURR")
    private String transCurr;

    /**
     * 交易原币税额
     */
    @ExportConfig(value = "交易原币税额")
    @Column(name = "TAX_AMT_CCY")
    private BigDecimal taxAmtCcy;

    /**
     * 交易原币收入
     */
    @ExportConfig(value = "交易原币收入")
    @Column(name = "INCOME_CCY")
    private BigDecimal incomeCcy;

    /**
     * 附加税1（城市建设）金额
     */
    @ExportConfig(value = "附加税1（城市建设）金额")
    @Column(name = "SURTAX1_AMT_CNY")
    private BigDecimal surtax1AmtCny;

    /**
     * 附加税2（教育附加）金额
     */
    @ExportConfig(value = "附加税2（教育附加）金额")
    @Column(name = "SURTAX2_AMT_CNY")
    private BigDecimal surtax2AmtCny;

    /**
     * 附加税3（地方教育附加）金额
     */
    @ExportConfig(value = "附加税3（地方教育附加）金额")
    @Column(name = "SURTAX3_AMT_CNY")
    private BigDecimal surtax3AmtCny;

    /**
     * 附加税4（其他）金额
     */
    @ExportConfig(value = "附加税4（其他）金额")
    @Column(name = "SURTAX4_AMT_CNY")
    private BigDecimal surtax4AmtCny;

    /**
     * 交易是否打票 A-自动打印/M-手动打印/N-从不打印
     */
    @ExportConfig(value = "交易是否打票")
    @Column(name = "TRANS_FAPIAO_FLAG")
    private String transFapiaoFlag;

    /**
     * 开票日期
     */
    @ExportConfig(value = "开票日期")
    @Column(name = "FAPIAO_DATE")
    private String fapiaoDate;

    /**
     * 发票类型 0-增值税专用发票/1-增值税普通发票/2-增值税电子发票
     */
    @ExportConfig(value = "发票类型")
    @Column(name = "FAPIAO_TYPE")
    private String fapiaoType;

    /**
     * 交易标志 1-权责发生/2-实收实付
     */
    @ExportConfig(value = "交易标志")
    @Column(name = "TRANS_FLAG")
    private String transFlag;

    /**
     * 增值税种类 S-6%/Z-0%/F-免税
     */
    @ExportConfig(value = "增值税种类")
    @Column(name = "VAT_RATE_CODE")
    private String vatRateCode;

    /**
     * 开票时点
     */
    @ExportConfig(value = "开票时点")
    @Column(name = "BILLING_TIME")
    private String billingTime;

    /**
     * 交易账号
     */
    @ExportConfig(value = "交易账号")
    @Column(name = "ASSOCIATE_ACCOUNT_NO")
    private String associateAccountNo;

    /**
     * 本体交易捕获终端号
     */
    @ExportConfig(value = "本体交易捕获终端号")
    @Column(name = "ORIG_CAP_WORKSTATION")
    private String origCapWorkstation;

    /**
     * 科目类型
     */
    @ExportConfig(value = "科目类型")
    @Column(name = "ITEM_CODE")
    private String itemCode;

    /**
     * 机构名称
     */
    @ExportConfig(value = "机构名称")
    @Column(name = "INSTNAME")
    private String instname;

    /**
     * 保单号
     */
    @ExportConfig(value = "保单号")
    @Column(name = "CHERNUM")
    private String chernum;

    /**
     * 保全受理号
     */
    @ExportConfig(value = "保全受理号")
    @Column(name = "REPNUM")
    private String repnum;

    /**
     * 投保单号
     */
    @ExportConfig(value = "投保单号")
    @Column(name = "TTMPRCNO")
    private String ttmprcno;

    /**
     * 费用类型
     */
    @ExportConfig(value = "费用类型")
    @Column(name = "FEETYP")
    private String feetyp;

    /**
     * 缴费频率
     */
    @ExportConfig(value = "缴费频率")
    @Column(name = "BILLFREQ")
    private String billfreq;

    /**
     * 保单年度
     */
    @ExportConfig(value = "保单年度")
    @Column(name = "POLYEAR")
    private BigDecimal polyear;

    /**
     * 承保日期
     */
    @ExportConfig(value = "承保日期")
    @Column(name = "HISSDTE")
    private String hissdte;

    /**
     * 生效日期
     */
    @ExportConfig(value = "生效日期")
    @Column(name = "OCCDATE")
    private String occdate;

    /**
     * 数据来源（SG:手工，HX:核心，其余根据上游系统决定）
     */
    @ExportConfig(value = "数据来源")
    @Column(name = "DSOURCE")
    private String dsource;

    /**
     * 渠道
     */
    @ExportConfig(value = "渠道")
    @Column(name = "CHANNEL")
    private String channel;

    /**
     * 期数
     */
    @ExportConfig(value = "期数")
    @Column(name = "PREMTERM")
    private BigDecimal premterm;

    /**
     * 缴费起始日期
     */
    @ExportConfig(value = "缴费起始日期")
    @Column(name = "INSTFROM")
    private String instfrom;

    /**
     * 缴费终止日期
     */
    @ExportConfig(value = "缴费终止日期")
    @Column(name = "INSTTO")
    private String instto;

    /**
     * 是否收回发票
     */
    @ExportConfig(value = "是否收回发票")
    @Column(name = "WITHDRAWYN")
    private String withdrawyn;

    /**
     * 收入会计科目
     */
    @ExportConfig(value = "收入会计科目")
    @Column(name = "ALTREF")
    private String altref;

    /**
     * 产品代码T5
     */
    @ExportConfig(value = "产品代码T5")
    @Column(name = "ZNTCODE05")
    private String zntcode05;

    /**
     * 主险名称
     */
    @ExportConfig(value = "主险名称")
    @Column(name = "PLANLONGDESC")
    private String planlongdesc;

    /**
     * 历史数据标识
     */
    @ExportConfig(value = "历史数据标识")
    @Column(name = "HISTORYFLAG")
    private String historyflag;

    /**
     * 未开票税额
     */
    @ExportConfig(value = "未开票税额")
    @Column(name = "TAX_CNY_BALANCE")
    private BigDecimal taxCnyBalance;

    @ExportConfig(value = "DATA_SOURCES")
    @Column(name = "DATA_SOURCES")
    private String dataSources;

    @ExportConfig(value = "ORG_TRANS_ID")
    @Column(name = "ORG_TRANS_ID")
    private String orgTransId;

    @ExportConfig(value = "NARRITIVE1")
    @Column(name = "NARRITIVE1")
    private String narritive1;

    @ExportConfig(value = "NARRITIVE2")
    @Column(name = "NARRITIVE2")
    private String narritive2;

    /**
     * 险种代码
     */
    @ExportConfig(value = "险种代码")
    @Column(name = "INSCOD")
    private String inscod;

    /**
     * 险种名称
     */
    @ExportConfig(value = "险种名称")
    @Column(name = "INSNAM")
    private String insnam;

    /**
     * 业务流水号
     */
    @ExportConfig(value = "业务流水号")
    @Column(name = "BUSINESSID")
    private String businessid;

    /**
     * 团个标志 团险-0  个险-1
     */
    @ExportConfig(value = "团个标志")
    @Column(name = "QDFLAG")
    private String qdflag;

    /**
     * 犹豫期截止日期
     */
    @ExportConfig(value = "犹豫期截止日期")
    @Column(name = "HESITATE_PERIOD")
    private String hesitatePeriod;

    @ExportConfig(value = "ISYK")
    @Column(name = "ISYK")
    private String isyk;

    /**
     * 批次号
     */
    @ExportConfig(value = "批次号")
    @Column(name = "BATCH_NO")
    private String batchNo;

    @ExportConfig(value = "批次类型")
    @Column(name = "BATCH_TYPE")
    private String batchType;

    /**
     * UUID 电票标识
     */
    @ExportConfig(value = "电票标识")
    @Column(name = "TRANS_UUID")
    private String transUuid;

    /**
     * 开具失败原因
     */
    @ExportConfig(value = "电票自动开具失败原因")
    @Column(name = "CANCELREASON")
    private String cancelreason;

    /**
     * 此字段插入时间
     */
    @ExportConfig(value = "数据写入时间")
    @Column(name = "SYNCH_DATE")
    private Date synchDate;

    /**
     * 获取数据对应主键，自增长
     *
     * @return TRANS_ID - 数据对应主键，自增长
     */
    public Long getTransId() {
        return transId;
    }

    /**
     * 设置数据对应主键，自增长
     *
     * @param transId 数据对应主键，自增长
     */
    public void setTransId(Long transId) {
        this.transId = transId;
    }

    /**
     * 获取交易时间（MUFG:VALDAT）
     *
     * @return TRANS_DATE - 交易时间（MUFG:VALDAT）
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * 设置交易时间（MUFG:VALDAT）
     *
     * @param transDate 交易时间（MUFG:VALDAT）
     */
    public void setTransDate(String transDate) {
        this.transDate = transDate == null ? null : transDate.trim();
    }

    /**
     * 获取交易类型（MUFG）
     *
     * @return TRANS_TYPE - 交易类型（MUFG）
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 设置交易类型（MUFG）
     *
     * @param transType 交易类型（MUFG）
     */
    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    /**
     * 获取客户账号
     *
     * @return CUSTOMER_ACCOUNT - 客户账号
     */
    public String getCustomerAccount() {
        return customerAccount;
    }

    /**
     * 设置客户账号
     *
     * @param customerAccount 客户账号
     */
    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount == null ? null : customerAccount.trim();
    }

    /**
     * 获取含税标志 Y-含/N-不含
     *
     * @return TAX_FLAG - 含税标志 Y-含/N-不含
     */
    public String getTaxFlag() {
        return taxFlag;
    }

    /**
     * 设置含税标志 Y-含/N-不含
     *
     * @param taxFlag 含税标志 Y-含/N-不含
     */
    public void setTaxFlag(String taxFlag) {
        this.taxFlag = taxFlag == null ? null : taxFlag.trim();
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
     * 获取是否冲账 Y-是/N-否（MUFG:ISREVERSE）
     *
     * @return IS_REVERSE - 是否冲账 Y-是/N-否（MUFG:ISREVERSE）
     */
    public String getIsReverse() {
        return isReverse;
    }

    /**
     * 设置是否冲账 Y-是/N-否（MUFG:ISREVERSE）
     *
     * @param isReverse 是否冲账 Y-是/N-否（MUFG:ISREVERSE）
     */
    public void setIsReverse(String isReverse) {
        this.isReverse = isReverse == null ? null : isReverse.trim();
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取本体交易币种
     *
     * @return ORG_CURR_CODE - 本体交易币种
     */
    public String getOrgCurrCode() {
        return orgCurrCode;
    }

    /**
     * 设置本体交易币种
     *
     * @param orgCurrCode 本体交易币种
     */
    public void setOrgCurrCode(String orgCurrCode) {
        this.orgCurrCode = orgCurrCode == null ? null : orgCurrCode.trim();
    }

    /**
     * 获取本体交易账号
     *
     * @return ORG_ACC_NO - 本体交易账号
     */
    public String getOrgAccNo() {
        return orgAccNo;
    }

    /**
     * 设置本体交易账号
     *
     * @param orgAccNo 本体交易账号
     */
    public void setOrgAccNo(String orgAccNo) {
        this.orgAccNo = orgAccNo == null ? null : orgAccNo.trim();
    }

    /**
     * 获取交易原币金额
     *
     * @return AMT_CCY - 交易原币金额
     */
    public BigDecimal getAmtCcy() {
        return amtCcy;
    }

    /**
     * 设置交易原币金额
     *
     * @param amtCcy 交易原币金额
     */
    public void setAmtCcy(BigDecimal amtCcy) {
        this.amtCcy = amtCcy;
    }

    /**
     * 获取冲账对应交易ID
     *
     * @return REVERSE_TRANS_ID - 冲账对应交易ID
     */
    public String getReverseTransId() {
        return reverseTransId;
    }

    /**
     * 设置冲账对应交易ID
     *
     * @param reverseTransId 冲账对应交易ID
     */
    public void setReverseTransId(String reverseTransId) {
        this.reverseTransId = reverseTransId == null ? null : reverseTransId.trim();
    }

    /**
     * 获取尾差
     *
     * @return SHORT_AND_OVER - 尾差
     */
    public BigDecimal getShortAndOver() {
        return shortAndOver;
    }

    /**
     * 设置尾差
     *
     * @param shortAndOver 尾差
     */
    public void setShortAndOver(BigDecimal shortAndOver) {
        this.shortAndOver = shortAndOver;
    }

    /**
     * 获取未开票金额（人民币）
     *
     * @return BALANCE - 未开票金额（人民币）
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置未开票金额（人民币）
     *
     * @param balance 未开票金额（人民币）
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取开票机构
     *
     * @return INSTCODE - 开票机构
     */
    public String getInstcode() {
        return instcode;
    }

    /**
     * 设置开票机构
     *
     * @param instcode 开票机构
     */
    public void setInstcode(String instcode) {
        this.instcode = instcode == null ? null : instcode.trim();
    }

    /**
     * 获取录单机构
     *
     * @return ORIG_INSTCODE - 录单机构
     */
    public String getOrigInstcode() {
        return origInstcode;
    }

    /**
     * 设置录单机构
     *
     * @param origInstcode 录单机构
     */
    public void setOrigInstcode(String origInstcode) {
        this.origInstcode = origInstcode == null ? null : origInstcode.trim();
    }

    /**
     * 获取状态 1-未开票/2-开票编辑锁定中/3-开票中/4-删除/5-被冲账/6-已冲账/ 15已作废/16 已红冲/99-开票完成/88-犹退/201-电票自动开具失败
     *
     * @return DATASTATUS - 状态 1-未开票/2-开票编辑锁定中/3-开票中/4-删除/5-被冲账/6-已冲账/ 15已作废/16 已红冲/99-开票完成/88-犹退/201-电票自动开具失败
     */
    public String getDatastatus() {
        return datastatus;
    }

    /**
     * 设置状态 1-未开票/2-开票编辑锁定中/3-开票中/4-删除/5-被冲账/6-已冲账/ 15已作废/16 已红冲/99-开票完成/88-犹退/201-电票自动开具失败
     *
     * @param datastatus 状态 1-未开票/2-开票编辑锁定中/3-开票中/4-删除/5-被冲账/6-已冲账/ 15已作废/16 已红冲/99-开票完成/88-犹退/201-电票自动开具失败
     */
    public void setDatastatus(String datastatus) {
        this.datastatus = datastatus == null ? null : datastatus.trim();
    }

    /**
     * 获取客户号
     *
     * @return CUSTOMER_ID - 客户号
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户号
     *
     * @param customerId 客户号
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * 获取金额_人民币(价税合计)
     *
     * @return AMT_CNY - 金额_人民币(价税合计)
     */
    public BigDecimal getAmtCny() {
        return amtCny;
    }

    /**
     * 设置金额_人民币(价税合计)
     *
     * @param amtCny 金额_人民币(价税合计)
     */
    public void setAmtCny(BigDecimal amtCny) {
        this.amtCny = amtCny;
    }

    /**
     * 获取税额_人民币
     *
     * @return TAX_AMT_CNY - 税额_人民币
     */
    public BigDecimal getTaxAmtCny() {
        return taxAmtCny;
    }

    /**
     * 设置税额_人民币
     *
     * @param taxAmtCny 税额_人民币
     */
    public void setTaxAmtCny(BigDecimal taxAmtCny) {
        this.taxAmtCny = taxAmtCny;
    }

    /**
     * 获取收入_人民币
     *
     * @return INCOME_CNY - 收入_人民币
     */
    public BigDecimal getIncomeCny() {
        return incomeCny;
    }

    /**
     * 设置收入_人民币
     *
     * @param incomeCny 收入_人民币
     */
    public void setIncomeCny(BigDecimal incomeCny) {
        this.incomeCny = incomeCny;
    }

    /**
     * 获取本体交易类型
     *
     * @return ORG_TRANS_TYPE - 本体交易类型
     */
    public String getOrgTransType() {
        return orgTransType;
    }

    /**
     * 设置本体交易类型
     *
     * @param orgTransType 本体交易类型
     */
    public void setOrgTransType(String orgTransType) {
        this.orgTransType = orgTransType == null ? null : orgTransType.trim();
    }

    /**
     * 获取本体交易子类型
     *
     * @return ORG_TRANS_SUB_TYPE - 本体交易子类型
     */
    public String getOrgTransSubType() {
        return orgTransSubType;
    }

    /**
     * 设置本体交易子类型
     *
     * @param orgTransSubType 本体交易子类型
     */
    public void setOrgTransSubType(String orgTransSubType) {
        this.orgTransSubType = orgTransSubType == null ? null : orgTransSubType.trim();
    }

    /**
     * 获取原始交易日期
     *
     * @return REVERSE_TRANS_DATE - 原始交易日期
     */
    public String getReverseTransDate() {
        return reverseTransDate;
    }

    /**
     * 设置原始交易日期
     *
     * @param reverseTransDate 原始交易日期
     */
    public void setReverseTransDate(String reverseTransDate) {
        this.reverseTransDate = reverseTransDate == null ? null : reverseTransDate.trim();
    }

    /**
     * 获取原始交易业务编号
     *
     * @return REVERSE_TRANS_BUS_ID - 原始交易业务编号
     */
    public String getReverseTransBusId() {
        return reverseTransBusId;
    }

    /**
     * 设置原始交易业务编号
     *
     * @param reverseTransBusId 原始交易业务编号
     */
    public void setReverseTransBusId(String reverseTransBusId) {
        this.reverseTransBusId = reverseTransBusId == null ? null : reverseTransBusId.trim();
    }

    /**
     * 获取交易业务编号
     *
     * @return TRANS_BUS_ID - 交易业务编号
     */
    public String getTransBusId() {
        return transBusId;
    }

    /**
     * 设置交易业务编号
     *
     * @param transBusId 交易业务编号
     */
    public void setTransBusId(String transBusId) {
        this.transBusId = transBusId == null ? null : transBusId.trim();
    }

    /**
     * 获取交易币种
     *
     * @return TRANS_CURR - 交易币种
     */
    public String getTransCurr() {
        return transCurr;
    }

    /**
     * 设置交易币种
     *
     * @param transCurr 交易币种
     */
    public void setTransCurr(String transCurr) {
        this.transCurr = transCurr == null ? null : transCurr.trim();
    }

    /**
     * 获取交易原币税额
     *
     * @return TAX_AMT_CCY - 交易原币税额
     */
    public BigDecimal getTaxAmtCcy() {
        return taxAmtCcy;
    }

    /**
     * 设置交易原币税额
     *
     * @param taxAmtCcy 交易原币税额
     */
    public void setTaxAmtCcy(BigDecimal taxAmtCcy) {
        this.taxAmtCcy = taxAmtCcy;
    }

    /**
     * 获取交易原币收入
     *
     * @return INCOME_CCY - 交易原币收入
     */
    public BigDecimal getIncomeCcy() {
        return incomeCcy;
    }

    /**
     * 设置交易原币收入
     *
     * @param incomeCcy 交易原币收入
     */
    public void setIncomeCcy(BigDecimal incomeCcy) {
        this.incomeCcy = incomeCcy;
    }

    /**
     * 获取附加税1（城市建设）金额
     *
     * @return SURTAX1_AMT_CNY - 附加税1（城市建设）金额
     */
    public BigDecimal getSurtax1AmtCny() {
        return surtax1AmtCny;
    }

    /**
     * 设置附加税1（城市建设）金额
     *
     * @param surtax1AmtCny 附加税1（城市建设）金额
     */
    public void setSurtax1AmtCny(BigDecimal surtax1AmtCny) {
        this.surtax1AmtCny = surtax1AmtCny;
    }

    /**
     * 获取附加税2（教育附加）金额
     *
     * @return SURTAX2_AMT_CNY - 附加税2（教育附加）金额
     */
    public BigDecimal getSurtax2AmtCny() {
        return surtax2AmtCny;
    }

    /**
     * 设置附加税2（教育附加）金额
     *
     * @param surtax2AmtCny 附加税2（教育附加）金额
     */
    public void setSurtax2AmtCny(BigDecimal surtax2AmtCny) {
        this.surtax2AmtCny = surtax2AmtCny;
    }

    /**
     * 获取附加税3（地方教育附加）金额
     *
     * @return SURTAX3_AMT_CNY - 附加税3（地方教育附加）金额
     */
    public BigDecimal getSurtax3AmtCny() {
        return surtax3AmtCny;
    }

    /**
     * 设置附加税3（地方教育附加）金额
     *
     * @param surtax3AmtCny 附加税3（地方教育附加）金额
     */
    public void setSurtax3AmtCny(BigDecimal surtax3AmtCny) {
        this.surtax3AmtCny = surtax3AmtCny;
    }

    /**
     * 获取附加税4（其他）金额
     *
     * @return SURTAX4_AMT_CNY - 附加税4（其他）金额
     */
    public BigDecimal getSurtax4AmtCny() {
        return surtax4AmtCny;
    }

    /**
     * 设置附加税4（其他）金额
     *
     * @param surtax4AmtCny 附加税4（其他）金额
     */
    public void setSurtax4AmtCny(BigDecimal surtax4AmtCny) {
        this.surtax4AmtCny = surtax4AmtCny;
    }

    /**
     * 获取交易是否打票 A-自动打印/M-手动打印/N-从不打印
     *
     * @return TRANS_FAPIAO_FLAG - 交易是否打票 A-自动打印/M-手动打印/N-从不打印
     */
    public String getTransFapiaoFlag() {
        return transFapiaoFlag;
    }

    /**
     * 设置交易是否打票 A-自动打印/M-手动打印/N-从不打印
     *
     * @param transFapiaoFlag 交易是否打票 A-自动打印/M-手动打印/N-从不打印
     */
    public void setTransFapiaoFlag(String transFapiaoFlag) {
        this.transFapiaoFlag = transFapiaoFlag == null ? null : transFapiaoFlag.trim();
    }

    /**
     * 获取开票日期
     *
     * @return FAPIAO_DATE - 开票日期
     */
    public String getFapiaoDate() {
        return fapiaoDate;
    }

    /**
     * 设置开票日期
     *
     * @param fapiaoDate 开票日期
     */
    public void setFapiaoDate(String fapiaoDate) {
        this.fapiaoDate = fapiaoDate == null ? null : fapiaoDate.trim();
    }

    /**
     * 获取发票类型 0-增值税专用发票/1-增值税普通发票
     *
     * @return FAPIAO_TYPE - 发票类型 0-增值税专用发票/1-增值税普通发票
     */
    public String getFapiaoType() {
        return fapiaoType;
    }

    /**
     * 设置发票类型 0-增值税专用发票/1-增值税普通发票
     *
     * @param fapiaoType 发票类型 0-增值税专用发票/1-增值税普通发票
     */
    public void setFapiaoType(String fapiaoType) {
        this.fapiaoType = fapiaoType == null ? null : fapiaoType.trim();
    }

    /**
     * 获取交易标志 1-权责发生/2-实收实付
     *
     * @return TRANS_FLAG - 交易标志 1-权责发生/2-实收实付
     */
    public String getTransFlag() {
        return transFlag;
    }

    /**
     * 设置交易标志 1-权责发生/2-实收实付
     *
     * @param transFlag 交易标志 1-权责发生/2-实收实付
     */
    public void setTransFlag(String transFlag) {
        this.transFlag = transFlag == null ? null : transFlag.trim();
    }

    /**
     * 获取增值税种类 S-6%/Z-0%/F-免税
     *
     * @return VAT_RATE_CODE - 增值税种类 S-6%/Z-0%/F-免税
     */
    public String getVatRateCode() {
        return vatRateCode;
    }

    /**
     * 设置增值税种类 S-6%/Z-0%/F-免税
     *
     * @param vatRateCode 增值税种类 S-6%/Z-0%/F-免税
     */
    public void setVatRateCode(String vatRateCode) {
        this.vatRateCode = vatRateCode == null ? null : vatRateCode.trim();
    }

    /**
     * 获取开票时点
     *
     * @return BILLING_TIME - 开票时点
     */
    public String getBillingTime() {
        return billingTime;
    }

    /**
     * 设置开票时点
     *
     * @param billingTime 开票时点
     */
    public void setBillingTime(String billingTime) {
        this.billingTime = billingTime == null ? null : billingTime.trim();
    }

    /**
     * 获取交易账号
     *
     * @return ASSOCIATE_ACCOUNT_NO - 交易账号
     */
    public String getAssociateAccountNo() {
        return associateAccountNo;
    }

    /**
     * 设置交易账号
     *
     * @param associateAccountNo 交易账号
     */
    public void setAssociateAccountNo(String associateAccountNo) {
        this.associateAccountNo = associateAccountNo == null ? null : associateAccountNo.trim();
    }

    /**
     * 获取本体交易捕获终端号
     *
     * @return ORIG_CAP_WORKSTATION - 本体交易捕获终端号
     */
    public String getOrigCapWorkstation() {
        return origCapWorkstation;
    }

    /**
     * 设置本体交易捕获终端号
     *
     * @param origCapWorkstation 本体交易捕获终端号
     */
    public void setOrigCapWorkstation(String origCapWorkstation) {
        this.origCapWorkstation = origCapWorkstation == null ? null : origCapWorkstation.trim();
    }

    /**
     * 获取科目类型
     *
     * @return ITEM_CODE - 科目类型
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置科目类型
     *
     * @param itemCode 科目类型
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    /**
     * 获取机构名称
     *
     * @return INSTNAME - 机构名称
     */
    public String getInstname() {
        return instname;
    }

    /**
     * 设置机构名称
     *
     * @param instname 机构名称
     */
    public void setInstname(String instname) {
        this.instname = instname == null ? null : instname.trim();
    }

    /**
     * 获取保单号
     *
     * @return CHERNUM - 保单号
     */
    public String getChernum() {
        return chernum;
    }

    /**
     * 设置保单号
     *
     * @param chernum 保单号
     */
    public void setChernum(String chernum) {
        this.chernum = chernum == null ? null : chernum.trim();
    }

    /**
     * 获取保全受理号
     *
     * @return REPNUM - 保全受理号
     */
    public String getRepnum() {
        return repnum;
    }

    /**
     * 设置保全受理号
     *
     * @param repnum 保全受理号
     */
    public void setRepnum(String repnum) {
        this.repnum = repnum == null ? null : repnum.trim();
    }

    /**
     * 获取投保单号
     *
     * @return TTMPRCNO - 投保单号
     */
    public String getTtmprcno() {
        return ttmprcno;
    }

    /**
     * 设置投保单号
     *
     * @param ttmprcno 投保单号
     */
    public void setTtmprcno(String ttmprcno) {
        this.ttmprcno = ttmprcno == null ? null : ttmprcno.trim();
    }

    /**
     * 获取费用类型
     *
     * @return FEETYP - 费用类型
     */
    public String getFeetyp() {
        return feetyp;
    }

    /**
     * 设置费用类型
     *
     * @param feetyp 费用类型
     */
    public void setFeetyp(String feetyp) {
        this.feetyp = feetyp == null ? null : feetyp.trim();
    }

    /**
     * 获取缴费频率
     *
     * @return BILLFREQ - 缴费频率
     */
    public String getBillfreq() {
        return billfreq;
    }

    /**
     * 设置缴费频率
     *
     * @param billfreq 缴费频率
     */
    public void setBillfreq(String billfreq) {
        this.billfreq = billfreq == null ? null : billfreq.trim();
    }

    /**
     * 获取保单年度
     *
     * @return POLYEAR - 保单年度
     */
    public BigDecimal getPolyear() {
        return polyear;
    }

    /**
     * 设置保单年度
     *
     * @param polyear 保单年度
     */
    public void setPolyear(BigDecimal polyear) {
        this.polyear = polyear;
    }

    /**
     * 获取承保日期
     *
     * @return HISSDTE - 承保日期
     */
    public String getHissdte() {
        return hissdte;
    }

    /**
     * 设置承保日期
     *
     * @param hissdte 承保日期
     */
    public void setHissdte(String hissdte) {
        this.hissdte = hissdte == null ? null : hissdte.trim();
    }

    /**
     * 获取生效日期
     *
     * @return OCCDATE - 生效日期
     */
    public String getOccdate() {
        return occdate;
    }

    /**
     * 设置生效日期
     *
     * @param occdate 生效日期
     */
    public void setOccdate(String occdate) {
        this.occdate = occdate == null ? null : occdate.trim();
    }

    /**
     * 获取数据来源（SG:手工，HX:核心，其余根据上游系统决定）
     *
     * @return DSOURCE - 数据来源（SG:手工，HX:核心，其余根据上游系统决定）
     */
    public String getDsource() {
        return dsource;
    }

    /**
     * 设置数据来源（SG:手工，HX:核心，其余根据上游系统决定）
     *
     * @param dsource 数据来源（SG:手工，HX:核心，其余根据上游系统决定）
     */
    public void setDsource(String dsource) {
        this.dsource = dsource == null ? null : dsource.trim();
    }

    /**
     * 获取渠道
     *
     * @return CHANNEL - 渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置渠道
     *
     * @param channel 渠道
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 获取期数
     *
     * @return PREMTERM - 期数
     */
    public BigDecimal getPremterm() {
        return premterm;
    }

    /**
     * 设置期数
     *
     * @param premterm 期数
     */
    public void setPremterm(BigDecimal premterm) {
        this.premterm = premterm;
    }

    /**
     * 获取缴费起始日期
     *
     * @return INSTFROM - 缴费起始日期
     */
    public String getInstfrom() {
        return instfrom;
    }

    /**
     * 设置缴费起始日期
     *
     * @param instfrom 缴费起始日期
     */
    public void setInstfrom(String instfrom) {
        this.instfrom = instfrom == null ? null : instfrom.trim();
    }

    /**
     * 获取缴费终止日期
     *
     * @return INSTTO - 缴费终止日期
     */
    public String getInstto() {
        return instto;
    }

    /**
     * 设置缴费终止日期
     *
     * @param instto 缴费终止日期
     */
    public void setInstto(String instto) {
        this.instto = instto == null ? null : instto.trim();
    }

    /**
     * 获取是否收回发票
     *
     * @return WITHDRAWYN - 是否收回发票
     */
    public String getWithdrawyn() {
        return withdrawyn;
    }

    /**
     * 设置是否收回发票
     *
     * @param withdrawyn 是否收回发票
     */
    public void setWithdrawyn(String withdrawyn) {
        this.withdrawyn = withdrawyn == null ? null : withdrawyn.trim();
    }

    /**
     * 获取收入会计科目
     *
     * @return ALTREF - 收入会计科目
     */
    public String getAltref() {
        return altref;
    }

    /**
     * 设置收入会计科目
     *
     * @param altref 收入会计科目
     */
    public void setAltref(String altref) {
        this.altref = altref == null ? null : altref.trim();
    }

    /**
     * 获取产品代码T5
     *
     * @return ZNTCODE05 - 产品代码T5
     */
    public String getZntcode05() {
        return zntcode05;
    }

    /**
     * 设置产品代码T5
     *
     * @param zntcode05 产品代码T5
     */
    public void setZntcode05(String zntcode05) {
        this.zntcode05 = zntcode05 == null ? null : zntcode05.trim();
    }

    /**
     * 获取主险名称
     *
     * @return PLANLONGDESC - 主险名称
     */
    public String getPlanlongdesc() {
        return planlongdesc;
    }

    /**
     * 设置主险名称
     *
     * @param planlongdesc 主险名称
     */
    public void setPlanlongdesc(String planlongdesc) {
        this.planlongdesc = planlongdesc == null ? null : planlongdesc.trim();
    }

    /**
     * 获取历史数据标识
     *
     * @return HISTORYFLAG - 历史数据标识
     */
    public String getHistoryflag() {
        return historyflag;
    }

    /**
     * 设置历史数据标识
     *
     * @param historyflag 历史数据标识
     */
    public void setHistoryflag(String historyflag) {
        this.historyflag = historyflag == null ? null : historyflag.trim();
    }

    /**
     * 获取未开票税额
     *
     * @return TAX_CNY_BALANCE - 未开票税额
     */
    public BigDecimal getTaxCnyBalance() {
        return taxCnyBalance;
    }

    /**
     * 设置未开票税额
     *
     * @param taxCnyBalance 未开票税额
     */
    public void setTaxCnyBalance(BigDecimal taxCnyBalance) {
        this.taxCnyBalance = taxCnyBalance;
    }

    /**
     * @return DATA_SOURCES
     */
    public String getDataSources() {
        return dataSources;
    }

    /**
     * @param dataSources
     */
    public void setDataSources(String dataSources) {
        this.dataSources = dataSources == null ? null : dataSources.trim();
    }

    /**
     * @return ORG_TRANS_ID
     */
    public String getOrgTransId() {
        return orgTransId;
    }

    /**
     * @param orgTransId
     */
    public void setOrgTransId(String orgTransId) {
        this.orgTransId = orgTransId == null ? null : orgTransId.trim();
    }

    /**
     * @return NARRITIVE1
     */
    public String getNarritive1() {
        return narritive1;
    }

    /**
     * @param narritive1
     */
    public void setNarritive1(String narritive1) {
        this.narritive1 = narritive1 == null ? null : narritive1.trim();
    }

    /**
     * @return NARRITIVE2
     */
    public String getNarritive2() {
        return narritive2;
    }

    /**
     * @param narritive2
     */
    public void setNarritive2(String narritive2) {
        this.narritive2 = narritive2 == null ? null : narritive2.trim();
    }

    /**
     * 获取险种代码
     *
     * @return INSCOD - 险种代码
     */
    public String getInscod() {
        return inscod;
    }

    /**
     * 设置险种代码
     *
     * @param inscod 险种代码
     */
    public void setInscod(String inscod) {
        this.inscod = inscod == null ? null : inscod.trim();
    }

    /**
     * 获取险种名称
     *
     * @return INSNAM - 险种名称
     */
    public String getInsnam() {
        return insnam;
    }

    /**
     * 设置险种名称
     *
     * @param insnam 险种名称
     */
    public void setInsnam(String insnam) {
        this.insnam = insnam == null ? null : insnam.trim();
    }

    /**
     * 获取业务流水号
     *
     * @return BUSINESSID - 业务流水号
     */
    public String getBusinessid() {
        return businessid;
    }

    /**
     * 设置业务流水号
     *
     * @param businessid 业务流水号
     */
    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    /**
     * 获取团个标志 团险-0  个险-1
     *
     * @return QDFLAG - 团个标志 团险-0  个险-1
     */
    public String getQdflag() {
        return qdflag;
    }

    /**
     * 设置团个标志 团险-0  个险-1
     *
     * @param qdflag 团个标志 团险-0  个险-1
     */
    public void setQdflag(String qdflag) {
        this.qdflag = qdflag == null ? null : qdflag.trim();
    }

    /**
     * 获取	犹豫期截止日期
     *
     * @return HESITATE_PERIOD - 	犹豫期截止日期
     */
    public String getHesitatePeriod() {
        return hesitatePeriod;
    }

    /**
     * 设置	犹豫期截止日期
     *
     * @param hesitatePeriod 犹豫期截止日期
     */
    public void setHesitatePeriod(String hesitatePeriod) {
        this.hesitatePeriod = hesitatePeriod == null ? null : hesitatePeriod.trim();
    }

    /**
     * @return ISYK
     */
    public String getIsyk() {
        return isyk;
    }

    /**
     * @param isyk
     */
    public void setIsyk(String isyk) {
        this.isyk = isyk == null ? null : isyk.trim();
    }

    /**
     * 获取	批次号
     *
     * @return BATCH_NO - 	批次号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置	批次号
     *
     * @param batchNo 批次号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * @return BATCH_TYPE
     */
    public String getBatchType() {
        return batchType;
    }

    /**
     * @param batchType
     */
    public void setBatchType(String batchType) {
        this.batchType = batchType == null ? null : batchType.trim();
    }

    /**
     * 获取UUID 电票标识
     *
     * @return TRANS_UUID - UUID 电票标识
     */
    public String getTransUuid() {
        return transUuid;
    }

    /**
     * 设置UUID 电票标识
     *
     * @param transUuid UUID 电票标识
     */
    public void setTransUuid(String transUuid) {
        this.transUuid = transUuid == null ? null : transUuid.trim();
    }

    /**
     * 获取开具失败原因
     *
     * @return CANCELREASON - 开具失败原因
     */
    public String getCancelreason() {
        return cancelreason;
    }

    /**
     * 设置开具失败原因
     *
     * @param cancelreason 开具失败原因
     */
    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason == null ? null : cancelreason.trim();
    }

    /**
     * 获取此字段插入时间
     *
     * @return SYNCH_DATE - 此字段插入时间
     */
    public Date getSynchDate() {
        return synchDate;
    }

    /**
     * 设置此字段插入时间
     *
     * @param synchDate 此字段插入时间
     */
    public void setSynchDate(Date synchDate) {
        this.synchDate = synchDate;
    }
}