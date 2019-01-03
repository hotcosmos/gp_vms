package com.hotcosmos.vms.domain.invoice;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vms_customer_info")
public class vmsCustomerInfo {
    /**
     * 客户号
     */
    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerId;

    /**
     * 客户保单号
     */
    @Id
    @Column(name = "CHERNUM")
    private String chernum;

    /**
     * 客户纳税人中文名称
     */
    @Column(name = "CUSTOMER_CNAME")
    private String customerCname;

    /**
     * 客户纳税人识别号
     */
    @Column(name = "CUSTOMER_TAXNO")
    private String customerTaxno;

    /**
     * 客户开户账号
     */
    @Column(name = "CUSTOMER_ACCOUNT")
    private String customerAccount;

    /**
     * 客户开户银行中文名称
     */
    @Column(name = "CUSTOMER_CBANK")
    private String customerCbank;

    /**
     * 客户电话
     */
    @Column(name = "CUSTOMER_PHONE")
    private String customerPhone;

    /**
     * 客户邮箱地址
     */
    @Column(name = "CUSTOMER_EMAIL")
    private String customerEmail;

    /**
     * 客户纳税人类别 （S/G/O，S-小规模纳税人，G-一般纳税人，O-其他）
     */
    @Column(name = "TAXPAYER_TYPE")
    private String taxpayerType;

    /**
     * 发票类型 （0-增值税专用发票，1-增值税普通发票，2-增值税电子发票）
     */
    @Column(name = "FAPIAO_TYPE")
    private String fapiaoType;

    /**
     * 客户类型 （I - 私人客户，C - 公司客户）
     */
    @Column(name = "CUSTOMER_TYPE")
    private String customerType;

    /**
     * 客户是否打票（A - 自动打印，M - 手动打印，N - 永不打印）
     */
    @Column(name = "CUSTOMER_FAPIAO_FLAG")
    private String customerFapiaoFlag;

    /**
     * 客户国籍
     */
    @Column(name = "CUSTOMER_NATIONALITY")
    private String customerNationality;

    /**
     * 数据来源（SG-手工,HX-核心）
     */
    @Column(name = "DATA_SOURCE")
    private String dataSource;

    /**
     * 联系人名称
     */
    @Column(name = "LINK_NAME")
    private String linkName;

    /**
     * 联系人电话
     */
    @Column(name = "LINK_PHONE")
    private String linkPhone;

    /**
     * 客户邮编
     */
    @Column(name = "CUSTOMER_ZIP_CODE")
    private String customerZipCode;

    /**
     * 数据写入时间
     */
    @Column(name = "SYNCH_DATE")
    private Date synchDate;

    /**
     * 客户地址
     */
    @Column(name = "CUSTOMER_ADDRESS")
    private String customerAddress;

    /**
     * 联系人地址
     */
    @Column(name = "LINK_ADDRESS")
    private String linkAddress;

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
     * 获取客户保单号
     *
     * @return CHERNUM - 客户保单号
     */
    public String getChernum() {
        return chernum;
    }

    /**
     * 设置客户保单号
     *
     * @param chernum 客户保单号
     */
    public void setChernum(String chernum) {
        this.chernum = chernum == null ? null : chernum.trim();
    }

    /**
     * 获取客户纳税人中文名称
     *
     * @return CUSTOMER_CNAME - 客户纳税人中文名称
     */
    public String getCustomerCname() {
        return customerCname;
    }

    /**
     * 设置客户纳税人中文名称
     *
     * @param customerCname 客户纳税人中文名称
     */
    public void setCustomerCname(String customerCname) {
        this.customerCname = customerCname == null ? null : customerCname.trim();
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
     * 获取客户开户账号
     *
     * @return CUSTOMER_ACCOUNT - 客户开户账号
     */
    public String getCustomerAccount() {
        return customerAccount;
    }

    /**
     * 设置客户开户账号
     *
     * @param customerAccount 客户开户账号
     */
    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount == null ? null : customerAccount.trim();
    }

    /**
     * 获取客户开户银行中文名称
     *
     * @return CUSTOMER_CBANK - 客户开户银行中文名称
     */
    public String getCustomerCbank() {
        return customerCbank;
    }

    /**
     * 设置客户开户银行中文名称
     *
     * @param customerCbank 客户开户银行中文名称
     */
    public void setCustomerCbank(String customerCbank) {
        this.customerCbank = customerCbank == null ? null : customerCbank.trim();
    }

    /**
     * 获取客户电话
     *
     * @return CUSTOMER_PHONE - 客户电话
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * 设置客户电话
     *
     * @param customerPhone 客户电话
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    /**
     * 获取客户邮箱地址
     *
     * @return CUSTOMER_EMAIL - 客户邮箱地址
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * 设置客户邮箱地址
     *
     * @param customerEmail 客户邮箱地址
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }

    /**
     * 获取客户纳税人类别 （S/G/O，S-小规模纳税人，G-一般纳税人，O-其他）
     *
     * @return TAXPAYER_TYPE - 客户纳税人类别 （S/G/O，S-小规模纳税人，G-一般纳税人，O-其他）
     */
    public String getTaxpayerType() {
        return taxpayerType;
    }

    /**
     * 设置客户纳税人类别 （S/G/O，S-小规模纳税人，G-一般纳税人，O-其他）
     *
     * @param taxpayerType 客户纳税人类别 （S/G/O，S-小规模纳税人，G-一般纳税人，O-其他）
     */
    public void setTaxpayerType(String taxpayerType) {
        this.taxpayerType = taxpayerType == null ? null : taxpayerType.trim();
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
     * 获取客户类型 （I - 私人客户，C - 公司客户）
     *
     * @return CUSTOMER_TYPE - 客户类型 （I - 私人客户，C - 公司客户）
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * 设置客户类型 （I - 私人客户，C - 公司客户）
     *
     * @param customerType 客户类型 （I - 私人客户，C - 公司客户）
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    /**
     * 获取客户是否打票（A - 自动打印，M - 手动打印，N - 永不打印）
     *
     * @return CUSTOMER_FAPIAO_FLAG - 客户是否打票（A - 自动打印，M - 手动打印，N - 永不打印）
     */
    public String getCustomerFapiaoFlag() {
        return customerFapiaoFlag;
    }

    /**
     * 设置客户是否打票（A - 自动打印，M - 手动打印，N - 永不打印）
     *
     * @param customerFapiaoFlag 客户是否打票（A - 自动打印，M - 手动打印，N - 永不打印）
     */
    public void setCustomerFapiaoFlag(String customerFapiaoFlag) {
        this.customerFapiaoFlag = customerFapiaoFlag == null ? null : customerFapiaoFlag.trim();
    }

    /**
     * 获取客户国籍
     *
     * @return CUSTOMER_NATIONALITY - 客户国籍
     */
    public String getCustomerNationality() {
        return customerNationality;
    }

    /**
     * 设置客户国籍
     *
     * @param customerNationality 客户国籍
     */
    public void setCustomerNationality(String customerNationality) {
        this.customerNationality = customerNationality == null ? null : customerNationality.trim();
    }

    /**
     * 获取数据来源（SG-手工,HX-核心）
     *
     * @return DATA_SOURCE - 数据来源（SG-手工,HX-核心）
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * 设置数据来源（SG-手工,HX-核心）
     *
     * @param dataSource 数据来源（SG-手工,HX-核心）
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    /**
     * 获取联系人名称
     *
     * @return LINK_NAME - 联系人名称
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * 设置联系人名称
     *
     * @param linkName 联系人名称
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    /**
     * 获取联系人电话
     *
     * @return LINK_PHONE - 联系人电话
     */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * 设置联系人电话
     *
     * @param linkPhone 联系人电话
     */
    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    /**
     * 获取客户邮编
     *
     * @return CUSTOMER_ZIP_CODE - 客户邮编
     */
    public String getCustomerZipCode() {
        return customerZipCode;
    }

    /**
     * 设置客户邮编
     *
     * @param customerZipCode 客户邮编
     */
    public void setCustomerZipCode(String customerZipCode) {
        this.customerZipCode = customerZipCode == null ? null : customerZipCode.trim();
    }

    /**
     * 获取数据写入时间
     *
     * @return SYNCH_DATE - 数据写入时间
     */
    public Date getSynchDate() {
        return synchDate;
    }

    /**
     * 设置数据写入时间
     *
     * @param synchDate 数据写入时间
     */
    public void setSynchDate(Date synchDate) {
        this.synchDate = synchDate;
    }

    /**
     * 获取客户地址
     *
     * @return CUSTOMER_ADDRESS - 客户地址
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * 设置客户地址
     *
     * @param customerAddress 客户地址
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    /**
     * 获取联系人地址
     *
     * @return LINK_ADDRESS - 联系人地址
     */
    public String getLinkAddress() {
        return linkAddress;
    }

    /**
     * 设置联系人地址
     *
     * @param linkAddress 联系人地址
     */
    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress == null ? null : linkAddress.trim();
    }
}