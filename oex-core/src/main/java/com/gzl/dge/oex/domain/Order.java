package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表 oex_order
 * 
 * @author Dge
 * @date 2018-11-28
 */
public class Order extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long id;
	/** 订单号 */
	private String orderCode;
	/** 用户id */
	private Long userId;
	/** 订单总金额(以分为单位) */
	private BigDecimal totalAmount;
	/** 实付金额 */
	private BigDecimal paidAmount;
	/** 优惠金额 */
	private BigDecimal discountAmount;
	/** 支付方式 */
	private String payType;
	/** 支付日期 */
	private Date payDate;
	/** 产品id */
	private Long productId;
	/** 开具发票标志 0 否 1 是 */
	private String invoiceTag;
	/** 开具发票类型 0 个人 1 公司 */
	private String invoiceType;
	/** 开具发票title */
	private String invoiceTitle;
	/** 在线支付流水号 */
	private String paymentSeq;
	/** 用户备注说明 */
	private String descpt;
	/** 支付状态 */
	private String status;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setOrderCode(String orderCode) 
	{
		this.orderCode = orderCode;
	}

	public String getOrderCode() 
	{
		return orderCode;
	}
	public void setUserId(Long userId) 
	{
		this.userId = userId;
	}

	public Long getUserId() 
	{
		return userId;
	}
	public void setTotalAmount(BigDecimal totalAmount) 
	{
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalAmount() 
	{
		return totalAmount;
	}
	public void setPaidAmount(BigDecimal paidAmount) 
	{
		this.paidAmount = paidAmount;
	}

	public BigDecimal getPaidAmount() 
	{
		return paidAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) 
	{
		this.discountAmount = discountAmount;
	}

	public BigDecimal getDiscountAmount() 
	{
		return discountAmount;
	}
	public void setPayType(String payType) 
	{
		this.payType = payType;
	}

	public String getPayType() 
	{
		return payType;
	}
	public void setPayDate(Date payDate) 
	{
		this.payDate = payDate;
	}

	public Date getPayDate() 
	{
		return payDate;
	}
	public void setProductId(Long productId) 
	{
		this.productId = productId;
	}

	public Long getProductId() 
	{
		return productId;
	}
	public void setInvoiceTag(String invoiceTag) 
	{
		this.invoiceTag = invoiceTag;
	}

	public String getInvoiceTag() 
	{
		return invoiceTag;
	}
	public void setInvoiceType(String invoiceType) 
	{
		this.invoiceType = invoiceType;
	}

	public String getInvoiceType() 
	{
		return invoiceType;
	}
	public void setInvoiceTitle(String invoiceTitle) 
	{
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceTitle() 
	{
		return invoiceTitle;
	}
	public void setPaymentSeq(String paymentSeq) 
	{
		this.paymentSeq = paymentSeq;
	}

	public String getPaymentSeq() 
	{
		return paymentSeq;
	}
	public void setDescpt(String descpt) 
	{
		this.descpt = descpt;
	}

	public String getDescpt() 
	{
		return descpt;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderCode", getOrderCode())
            .append("userId", getUserId())
            .append("totalAmount", getTotalAmount())
            .append("paidAmount", getPaidAmount())
            .append("discountAmount", getDiscountAmount())
            .append("payType", getPayType())
            .append("payDate", getPayDate())
            .append("productId", getProductId())
            .append("invoiceTag", getInvoiceTag())
            .append("invoiceType", getInvoiceType())
            .append("invoiceTitle", getInvoiceTitle())
            .append("paymentSeq", getPaymentSeq())
            .append("descpt", getDescpt())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
