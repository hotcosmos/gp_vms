package com.hotcosmos.vms.domain.invoice;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "vms_bill_info")
public class vmsBillInfo {
    /**
     * 票据ID
     */
    @Id
    @Column(name = "BILL_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String billId;

    /**
     * 发票代码
     */
    @Column(name = "BILL_CODE")
    private String billCode;

    /**
     * 发票号码
     */
    @Column(name = "BILL_NO")
    private String billNo;

    /**
     * 开票日期
     */
    @Column(name = "BILL_DATE")
    private String billDate;

    /**
     * 客户纳税人名称
     */
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    /**
     * 客户纳税人识别号
     */
    @Column(name = "CUSTOMER_TAXNO")
    private String customerTaxno;

    /**
     * 客户地址电话
     */
    @Column(name = "CUSTOMER_ADDRESSANDPHONE")
    private String customerAddressandphone;

    /**
     * 客户银行账号
     */
    @Column(name = "CUSTOMER_BANKANDACCOUNT")
    private String customerBankandaccount;

    /**
     * 合计金额
     */
    @Column(name = "AMT_SUM")
    private BigDecimal amtSum;

    /**
     * 合计税额
     */
    @Column(name = "TAX_AMT_SUM")
    private BigDecimal taxAmtSum;

    /**
     * 价税合计
     */
    @Column(name = "SUM_AMT")
    private BigDecimal sumAmt;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 开票人
     */
    @Column(name = "DRAWER")
    private String drawer;

    /**
     * 复核人
     */
    @Column(name = "REVIEWER")
    private String reviewer;

    /**
     * 收款人
     */
    @Column(name = "PAYEE")
    private String payee;

    /**
     * 我方纳税人名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 我方纳税人识别号
     */
    @Column(name = "TAXNO")
    private String taxno;

    /**
     * 我方地址电话
     */
    @Column(name = "ADDRESSANDPHONE")
    private String addressandphone;

    /**
     * 我方银行账号
     */
    @Column(name = "BANKANDACCOUNT")
    private String bankandaccount;

    /**
     * 所属机构 (合并开票时根据机构进行汇总开票 该字段同时也是用户权限判断字段)
     */
    @Column(name = "INSTCODE")
    private String instcode;

    /**
     * 撤销发起人
     */
    @Column(name = "CANCEL_INITIATOR")
    private String cancelInitiator;

    /**
     * 撤销审核人
     */
    @Column(name = "CANCEL_AUDITOR")
    private String cancelAuditor;

    /**
     * 税控盘号
     */
    @Column(name = "TAX_DISK_NO")
    private String taxDiskNo;

    /**
     * 开票机号
     */
    @Column(name = "MACHINE_NO")
    private String machineNo;

    /**
     * 通知单编号
     */
    @Column(name = "NOTICE_NO")
    private String noticeNo;

    /**
     * 原始票据代码
     */
    @Column(name = "ORI_BILL_CODE")
    private String oriBillCode;

    /**
     * 原始票据号码
     */
    @Column(name = "ORI_BILL_NO")
    private String oriBillNo;

    /**
     * 状态(1-编辑待提交，2-提交待审核，3-审核通过，4-无需审核，5-已开具，7-开具失败，8-已打印，9-打印失败，10-已快递，11-已签收，12-已抄报，13-作废待审核，14-作废已审核，15-已作废，16-红冲待审核，17-红冲已审核，18-已红冲，19-已收回，99-生效完成)
     */
    @Column(name = "DATASTATUS")
    private String datastatus;

    /**
     * 操作说明
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 是否手工录入 （1-自动开票;2-人工审核;3-人工开票）
     */
    @Column(name = "IS_HANDIWORK")
    private String isHandiwork;

    /**
     * 开具类型（1-单笔;2-合并;3-拆分）
     */
    @Column(name = "ISSUE_TYPE")
    private String issueType;

    /**
     * 发票类型 （0-增值税专用发票，1-增值税普通发票，2-增值税电子发票）
     */
    @Column(name = "FAPIAO_TYPE")
    private String fapiaoType;

    /**
     * 开票流水号
     */
    @Column(name = "BILL_BUSINESSID")
    private String billBusinessid;

    /**
     * 申请日期
     */
    @Column(name = "APPLY_DATE")
    private String applyDate;

    /**
     * 发票余额
     */
    @Column(name = "BALANCE")
    private BigDecimal balance;

    /**
     * 退回原因
     */
    @Column(name = "CANCEL_REASON")
    private String cancelReason;

    /**
     * 客户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 保单号
     */
    @Column(name = "CHERNUM")
    private String chernum;

    /**
     * 保全受理号
     */
    @Column(name = "REPNUM")
    private String repnum;

    /**
     * 投保单号
     */
    @Column(name = "TTMPRCNO")
    private String ttmprcno;

    /**
     * 费用类型
     */
    @Column(name = "FEETYP")
    private String feetyp;

    /**
     * 交费频率
     */
    @Column(name = "BILLFREQ")
    private String billfreq;

    /**
     * 承保日期
     */
    @Column(name = "HISSDTE")
    private String hissdte;

    /**
     * 数据来源
     */
    @Column(name = "DSOURCE")
    private String dsource;

    /**
     * 渠道
     */
    @Column(name = "CHANNEL")
    private String channel;

    /**
     * 历史数据标识
     */
    @Column(name = "HISTORYFLAG")
    private String historyflag;

    /**
     * 是否抄报 0-未抄报 1-已抄报
     */
    @Column(name = "IS_REPORTED")
    private String isReported;

    /**
     * 归档状态 0-未归档 1-预归档 2-归档
     */
    @Column(name = "FILE_STATUS")
    private String fileStatus;

    /**
     * 是否送出 0-未送出 1-已送出
     */
    @Column(name = "IS_SENDED")
    private String isSended;

    /**
     * 补打次数
     */
    @Column(name = "PRINT_COUNT")
    private Short printCount;

    /**
     * 回送确认状态（为null或0时表示未回收确认，为1时表示回收确认：外接系统需回送开票信息时使用，默认为‘1’）
     */
    @Column(name = "RECYCLE_STATUS")
    private String recycleStatus;

    /**
     * 电子发票PDF下载地址
     */
    @Column(name = "PDF_URL")
    private String pdfUrl;

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
     * 获取发票代码
     *
     * @return BILL_CODE - 发票代码
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * 设置发票代码
     *
     * @param billCode 发票代码
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    /**
     * 获取发票号码
     *
     * @return BILL_NO - 发票号码
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置发票号码
     *
     * @param billNo 发票号码
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    /**
     * 获取开票日期
     *
     * @return BILL_DATE - 开票日期
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * 设置开票日期
     *
     * @param billDate 开票日期
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate == null ? null : billDate.trim();
    }

    /**
     * 获取客户纳税人名称
     *
     * @return CUSTOMER_NAME - 客户纳税人名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置客户纳税人名称
     *
     * @param customerName 客户纳税人名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 获取客户纳税人识别号
     *
     * @return CUSTOMER_TAXNO - 客户纳税人识别号
     */
    public String getCustomerTaxno() {
        return customerTaxno;
    }

    /**
     * 设置客户纳税人识别号
     *
     * @param customerTaxno 客户纳税人识别号
     */
    public void setCustomerTaxno(String customerTaxno) {
        this.customerTaxno = customerTaxno == null ? null : customerTaxno.trim();
    }

    /**
     * 获取客户地址电话
     *
     * @return CUSTOMER_ADDRESSANDPHONE - 客户地址电话
     */
    public String getCustomerAddressandphone() {
        return customerAddressandphone;
    }

    /**
     * 设置客户地址电话
     *
     * @param customerAddressandphone 客户地址电话
     */
    public void setCustomerAddressandphone(String customerAddressandphone) {
        this.customerAddressandphone = customerAddressandphone == null ? null : customerAddressandphone.trim();
    }

    /**
     * 获取客户银行账号
     *
     * @return CUSTOMER_BANKANDACCOUNT - 客户银行账号
     */
    public String getCustomerBankandaccount() {
        return customerBankandaccount;
    }

    /**
     * 设置客户银行账号
     *
     * @param customerBankandaccount 客户银行账号
     */
    public void setCustomerBankandaccount(String customerBankandaccount) {
        this.customerBankandaccount = customerBankandaccount == null ? null : customerBankandaccount.trim();
    }

    /**
     * 获取合计金额
     *
     * @return AMT_SUM - 合计金额
     */
    public BigDecimal getAmtSum() {
        return amtSum;
    }

    /**
     * 设置合计金额
     *
     * @param amtSum 合计金额
     */
    public void setAmtSum(BigDecimal amtSum) {
        this.amtSum = amtSum;
    }

    /**
     * 获取合计税额
     *
     * @return TAX_AMT_SUM - 合计税额
     */
    public BigDecimal getTaxAmtSum() {
        return taxAmtSum;
    }

    /**
     * 设置合计税额
     *
     * @param taxAmtSum 合计税额
     */
    public void setTaxAmtSum(BigDecimal taxAmtSum) {
        this.taxAmtSum = taxAmtSum;
    }

    /**
     * 获取价税合计
     *
     * @return SUM_AMT - 价税合计
     */
    public BigDecimal getSumAmt() {
        return sumAmt;
    }

    /**
     * 设置价税合计
     *
     * @param sumAmt 价税合计
     */
    public void setSumAmt(BigDecimal sumAmt) {
        this.sumAmt = sumAmt;
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
     * 获取开票人
     *
     * @return DRAWER - 开票人
     */
    public String getDrawer() {
        return drawer;
    }

    /**
     * 设置开票人
     *
     * @param drawer 开票人
     */
    public void setDrawer(String drawer) {
        this.drawer = drawer == null ? null : drawer.trim();
    }

    /**
     * 获取复核人
     *
     * @return REVIEWER - 复核人
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * 设置复核人
     *
     * @param reviewer 复核人
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer == null ? null : reviewer.trim();
    }

    /**
     * 获取收款人
     *
     * @return PAYEE - 收款人
     */
    public String getPayee() {
        return payee;
    }

    /**
     * 设置收款人
     *
     * @param payee 收款人
     */
    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    /**
     * 获取我方纳税人名称
     *
     * @return NAME - 我方纳税人名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置我方纳税人名称
     *
     * @param name 我方纳税人名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取我方纳税人识别号
     *
     * @return TAXNO - 我方纳税人识别号
     */
    public String getTaxno() {
        return taxno;
    }

    /**
     * 设置我方纳税人识别号
     *
     * @param taxno 我方纳税人识别号
     */
    public void setTaxno(String taxno) {
        this.taxno = taxno == null ? null : taxno.trim();
    }

    /**
     * 获取我方地址电话
     *
     * @return ADDRESSANDPHONE - 我方地址电话
     */
    public String getAddressandphone() {
        return addressandphone;
    }

    /**
     * 设置我方地址电话
     *
     * @param addressandphone 我方地址电话
     */
    public void setAddressandphone(String addressandphone) {
        this.addressandphone = addressandphone == null ? null : addressandphone.trim();
    }

    /**
     * 获取我方银行账号
     *
     * @return BANKANDACCOUNT - 我方银行账号
     */
    public String getBankandaccount() {
        return bankandaccount;
    }

    /**
     * 设置我方银行账号
     *
     * @param bankandaccount 我方银行账号
     */
    public void setBankandaccount(String bankandaccount) {
        this.bankandaccount = bankandaccount == null ? null : bankandaccount.trim();
    }

    /**
     * 获取所属机构 (合并开票时根据机构进行汇总开票 该字段同时也是用户权限判断字段)
     *
     * @return INSTCODE - 所属机构 (合并开票时根据机构进行汇总开票 该字段同时也是用户权限判断字段)
     */
    public String getInstcode() {
        return instcode;
    }

    /**
     * 设置所属机构 (合并开票时根据机构进行汇总开票 该字段同时也是用户权限判断字段)
     *
     * @param instcode 所属机构 (合并开票时根据机构进行汇总开票 该字段同时也是用户权限判断字段)
     */
    public void setInstcode(String instcode) {
        this.instcode = instcode == null ? null : instcode.trim();
    }

    /**
     * 获取撤销发起人
     *
     * @return CANCEL_INITIATOR - 撤销发起人
     */
    public String getCancelInitiator() {
        return cancelInitiator;
    }

    /**
     * 设置撤销发起人
     *
     * @param cancelInitiator 撤销发起人
     */
    public void setCancelInitiator(String cancelInitiator) {
        this.cancelInitiator = cancelInitiator == null ? null : cancelInitiator.trim();
    }

    /**
     * 获取撤销审核人
     *
     * @return CANCEL_AUDITOR - 撤销审核人
     */
    public String getCancelAuditor() {
        return cancelAuditor;
    }

    /**
     * 设置撤销审核人
     *
     * @param cancelAuditor 撤销审核人
     */
    public void setCancelAuditor(String cancelAuditor) {
        this.cancelAuditor = cancelAuditor == null ? null : cancelAuditor.trim();
    }

    /**
     * 获取税控盘号
     *
     * @return TAX_DISK_NO - 税控盘号
     */
    public String getTaxDiskNo() {
        return taxDiskNo;
    }

    /**
     * 设置税控盘号
     *
     * @param taxDiskNo 税控盘号
     */
    public void setTaxDiskNo(String taxDiskNo) {
        this.taxDiskNo = taxDiskNo == null ? null : taxDiskNo.trim();
    }

    /**
     * 获取开票机号
     *
     * @return MACHINE_NO - 开票机号
     */
    public String getMachineNo() {
        return machineNo;
    }

    /**
     * 设置开票机号
     *
     * @param machineNo 开票机号
     */
    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo == null ? null : machineNo.trim();
    }

    /**
     * 获取通知单编号
     *
     * @return NOTICE_NO - 通知单编号
     */
    public String getNoticeNo() {
        return noticeNo;
    }

    /**
     * 设置通知单编号
     *
     * @param noticeNo 通知单编号
     */
    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo == null ? null : noticeNo.trim();
    }

    /**
     * 获取原始票据代码
     *
     * @return ORI_BILL_CODE - 原始票据代码
     */
    public String getOriBillCode() {
        return oriBillCode;
    }

    /**
     * 设置原始票据代码
     *
     * @param oriBillCode 原始票据代码
     */
    public void setOriBillCode(String oriBillCode) {
        this.oriBillCode = oriBillCode == null ? null : oriBillCode.trim();
    }

    /**
     * 获取原始票据号码
     *
     * @return ORI_BILL_NO - 原始票据号码
     */
    public String getOriBillNo() {
        return oriBillNo;
    }

    /**
     * 设置原始票据号码
     *
     * @param oriBillNo 原始票据号码
     */
    public void setOriBillNo(String oriBillNo) {
        this.oriBillNo = oriBillNo == null ? null : oriBillNo.trim();
    }

    /**
     * 获取状态(1-编辑待提交，2-提交待审核，3-审核通过，4-无需审核，5-已开具，7-开具失败，8-已打印，9-打印失败，10-已快递，11-已签收，12-已抄报，13-作废待审核，14-作废已审核，15-已作废，16-红冲待审核，17-红冲已审核，18-已红冲，19-已收回，99-生效完成)
     *
     * @return DATASTATUS - 状态(1-编辑待提交，2-提交待审核，3-审核通过，4-无需审核，5-已开具，7-开具失败，8-已打印，9-打印失败，10-已快递，11-已签收，12-已抄报，13-作废待审核，14-作废已审核，15-已作废，16-红冲待审核，17-红冲已审核，18-已红冲，19-已收回，99-生效完成)
     */
    public String getDatastatus() {
        return datastatus;
    }

    /**
     * 设置状态(1-编辑待提交，2-提交待审核，3-审核通过，4-无需审核，5-已开具，7-开具失败，8-已打印，9-打印失败，10-已快递，11-已签收，12-已抄报，13-作废待审核，14-作废已审核，15-已作废，16-红冲待审核，17-红冲已审核，18-已红冲，19-已收回，99-生效完成)
     *
     * @param datastatus 状态(1-编辑待提交，2-提交待审核，3-审核通过，4-无需审核，5-已开具，7-开具失败，8-已打印，9-打印失败，10-已快递，11-已签收，12-已抄报，13-作废待审核，14-作废已审核，15-已作废，16-红冲待审核，17-红冲已审核，18-已红冲，19-已收回，99-生效完成)
     */
    public void setDatastatus(String datastatus) {
        this.datastatus = datastatus == null ? null : datastatus.trim();
    }

    /**
     * 获取操作说明
     *
     * @return DESCRIPTION - 操作说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置操作说明
     *
     * @param description 操作说明
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取是否手工录入 （1-自动开票;2-人工审核;3-人工开票）
     *
     * @return IS_HANDIWORK - 是否手工录入 （1-自动开票;2-人工审核;3-人工开票）
     */
    public String getIsHandiwork() {
        return isHandiwork;
    }

    /**
     * 设置是否手工录入 （1-自动开票;2-人工审核;3-人工开票）
     *
     * @param isHandiwork 是否手工录入 （1-自动开票;2-人工审核;3-人工开票）
     */
    public void setIsHandiwork(String isHandiwork) {
        this.isHandiwork = isHandiwork == null ? null : isHandiwork.trim();
    }

    /**
     * 获取开具类型（1-单笔;2-合并;3-拆分）
     *
     * @return ISSUE_TYPE - 开具类型（1-单笔;2-合并;3-拆分）
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * 设置开具类型（1-单笔;2-合并;3-拆分）
     *
     * @param issueType 开具类型（1-单笔;2-合并;3-拆分）
     */
    public void setIssueType(String issueType) {
        this.issueType = issueType == null ? null : issueType.trim();
    }

    /**
     * 获取发票类型 （0-增值税专用发票，1-增值税普通发票，2-增值税电子发票）
     *
     * @return FAPIAO_TYPE - 发票类型 （0-增值税专用发票，1-增值税普通发票，2-增值税电子发票）
     */
    public String getFapiaoType() {
        return fapiaoType;
    }

    /**
     * 设置发票类型 （0-增值税专用发票，1-增值税普通发票，2-增值税电子发票）
     *
     * @param fapiaoType 发票类型 （0-增值税专用发票，1-增值税普通发票，2-增值税电子发票）
     */
    public void setFapiaoType(String fapiaoType) {
        this.fapiaoType = fapiaoType == null ? null : fapiaoType.trim();
    }

    /**
     * 获取开票流水号
     *
     * @return BILL_BUSINESSID - 开票流水号
     */
    public String getBillBusinessid() {
        return billBusinessid;
    }

    /**
     * 设置开票流水号
     *
     * @param billBusinessid 开票流水号
     */
    public void setBillBusinessid(String billBusinessid) {
        this.billBusinessid = billBusinessid == null ? null : billBusinessid.trim();
    }

    /**
     * 获取申请日期
     *
     * @return APPLY_DATE - 申请日期
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * 设置申请日期
     *
     * @param applyDate 申请日期
     */
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    /**
     * 获取发票余额
     *
     * @return BALANCE - 发票余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置发票余额
     *
     * @param balance 发票余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取退回原因
     *
     * @return CANCEL_REASON - 退回原因
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * 设置退回原因
     *
     * @param cancelReason 退回原因
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    /**
     * 获取客户ID
     *
     * @return CUSTOMER_ID - 客户ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户ID
     *
     * @param customerId 客户ID
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
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
     * 获取交费频率
     *
     * @return BILLFREQ - 交费频率
     */
    public String getBillfreq() {
        return billfreq;
    }

    /**
     * 设置交费频率
     *
     * @param billfreq 交费频率
     */
    public void setBillfreq(String billfreq) {
        this.billfreq = billfreq == null ? null : billfreq.trim();
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
     * 获取数据来源
     *
     * @return DSOURCE - 数据来源
     */
    public String getDsource() {
        return dsource;
    }

    /**
     * 设置数据来源
     *
     * @param dsource 数据来源
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
     * 获取是否抄报 0-未抄报 1-已抄报
     *
     * @return IS_REPORTED - 是否抄报 0-未抄报 1-已抄报
     */
    public String getIsReported() {
        return isReported;
    }

    /**
     * 设置是否抄报 0-未抄报 1-已抄报
     *
     * @param isReported 是否抄报 0-未抄报 1-已抄报
     */
    public void setIsReported(String isReported) {
        this.isReported = isReported == null ? null : isReported.trim();
    }

    /**
     * 获取归档状态 0-未归档 1-预归档 2-归档
     *
     * @return FILE_STATUS - 归档状态 0-未归档 1-预归档 2-归档
     */
    public String getFileStatus() {
        return fileStatus;
    }

    /**
     * 设置归档状态 0-未归档 1-预归档 2-归档
     *
     * @param fileStatus 归档状态 0-未归档 1-预归档 2-归档
     */
    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus == null ? null : fileStatus.trim();
    }

    /**
     * 获取是否送出 0-未送出 1-已送出
     *
     * @return IS_SENDED - 是否送出 0-未送出 1-已送出
     */
    public String getIsSended() {
        return isSended;
    }

    /**
     * 设置是否送出 0-未送出 1-已送出
     *
     * @param isSended 是否送出 0-未送出 1-已送出
     */
    public void setIsSended(String isSended) {
        this.isSended = isSended == null ? null : isSended.trim();
    }

    /**
     * 获取补打次数
     *
     * @return PRINT_COUNT - 补打次数
     */
    public Short getPrintCount() {
        return printCount;
    }

    /**
     * 设置补打次数
     *
     * @param printCount 补打次数
     */
    public void setPrintCount(Short printCount) {
        this.printCount = printCount;
    }

    /**
     * 获取回送确认状态（为null或0时表示未回收确认，为1时表示回收确认：外接系统需回送开票信息时使用，默认为‘1’）
     *
     * @return RECYCLE_STATUS - 回送确认状态（为null或0时表示未回收确认，为1时表示回收确认：外接系统需回送开票信息时使用，默认为‘1’）
     */
    public String getRecycleStatus() {
        return recycleStatus;
    }

    /**
     * 设置回送确认状态（为null或0时表示未回收确认，为1时表示回收确认：外接系统需回送开票信息时使用，默认为‘1’）
     *
     * @param recycleStatus 回送确认状态（为null或0时表示未回收确认，为1时表示回收确认：外接系统需回送开票信息时使用，默认为‘1’）
     */
    public void setRecycleStatus(String recycleStatus) {
        this.recycleStatus = recycleStatus == null ? null : recycleStatus.trim();
    }

    /**
     * 获取电子发票PDF下载地址
     *
     * @return PDF_URL - 电子发票PDF下载地址
     */
    public String getPdfUrl() {
        return pdfUrl;
    }

    /**
     * 设置电子发票PDF下载地址
     *
     * @param pdfUrl 电子发票PDF下载地址
     */
    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl == null ? null : pdfUrl.trim();
    }
}