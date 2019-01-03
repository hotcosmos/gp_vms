package com.hotcosmos.vms.domain.invoice;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "vms_trans_bill")
public class vmsTransBill {
    /**
     * 交易ID
     */
    @Id
    @Column(name = "TRANS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String transId;

    /**
     * 票据ID
     */
    @Id
    @Column(name = "BILL_ID")
    private String billId;

    /**
     * 交易明细ID
     */
    @Id
    @Column(name = "BILL_ITEM_ID")
    private String billItemId;

    /**
     * 金额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    @Column(name = "AMT_CNY")
    private BigDecimal amtCny;

    /**
     * 税额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    @Column(name = "TAX_AMT_CNY")
    private BigDecimal taxAmtCny;

    /**
     * 收入_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    @Column(name = "INCOME_CNY")
    private BigDecimal incomeCny;

    /**
     * 未开票金额
     */
    @Column(name = "BALANCE")
    private String balance;

    /**
     * 保单号
     */
    @Column(name = "CHERNUM")
    private String chernum;

    /**
     * 标记(2-作废,3-红冲)
     */
    @Column(name = "MARK")
    private String mark;

    /**
     * 获取交易ID
     *
     * @return TRANS_ID - 交易ID
     */
    public String getTransId() {
        return transId;
    }

    /**
     * 设置交易ID
     *
     * @param transId 交易ID
     */
    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

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
     * 获取交易明细ID
     *
     * @return BILL_ITEM_ID - 交易明细ID
     */
    public String getBillItemId() {
        return billItemId;
    }

    /**
     * 设置交易明细ID
     *
     * @param billItemId 交易明细ID
     */
    public void setBillItemId(String billItemId) {
        this.billItemId = billItemId == null ? null : billItemId.trim();
    }

    /**
     * 获取金额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     *
     * @return AMT_CNY - 金额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    public BigDecimal getAmtCny() {
        return amtCny;
    }

    /**
     * 设置金额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     *
     * @param amtCny 金额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    public void setAmtCny(BigDecimal amtCny) {
        this.amtCny = amtCny;
    }

    /**
     * 获取税额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     *
     * @return TAX_AMT_CNY - 税额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    public BigDecimal getTaxAmtCny() {
        return taxAmtCny;
    }

    /**
     * 设置税额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     *
     * @param taxAmtCny 税额_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    public void setTaxAmtCny(BigDecimal taxAmtCny) {
        this.taxAmtCny = taxAmtCny;
    }

    /**
     * 获取收入_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     *
     * @return INCOME_CNY - 收入_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    public BigDecimal getIncomeCny() {
        return incomeCny;
    }

    /**
     * 设置收入_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     *
     * @param incomeCny 收入_人民币 1-单笔：取销项交易信息表中“金额_人民币”字段；2-批量单笔：取销项交易信息表中“金额_人民币”字段；3-合并：取销项交易信息表中“金额_人民币”字段；4-拆分：取用户输入的拆分后的“金额”字段
     */
    public void setIncomeCny(BigDecimal incomeCny) {
        this.incomeCny = incomeCny;
    }

    /**
     * 获取未开票金额
     *
     * @return BALANCE - 未开票金额
     */
    public String getBalance() {
        return balance;
    }

    /**
     * 设置未开票金额
     *
     * @param balance 未开票金额
     */
    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
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
     * 获取标记(2-作废,3-红冲)
     *
     * @return MARK - 标记(2-作废,3-红冲)
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置标记(2-作废,3-红冲)
     *
     * @param mark 标记(2-作废,3-红冲)
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}