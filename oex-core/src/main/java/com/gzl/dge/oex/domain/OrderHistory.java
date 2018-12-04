package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;
import java.util.Date;

/**
 * 订单付款记录表 oex_order_history
 * 
 * @author Dge
 * @date 2018-11-28
 */
public class OrderHistory extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 收款凭证id，主键 */
	private Long id;
	/** 订单id */
	private Long orderId;
	/** 订单号 */
	private String orderCode;
	/** 在线支付流水号 */
	private String paymentSeq;
	/** 支付方返回数据内容 */
	private String content;
	/** 订单凭证 */
	private String imageUrl;
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
	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}

	public Long getOrderId() 
	{
		return orderId;
	}
	public void setOrderCode(String orderCode) 
	{
		this.orderCode = orderCode;
	}

	public String getOrderCode() 
	{
		return orderCode;
	}
	public void setPaymentSeq(String paymentSeq) 
	{
		this.paymentSeq = paymentSeq;
	}

	public String getPaymentSeq() 
	{
		return paymentSeq;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}

	public String getContent() 
	{
		return content;
	}
	public void setImageUrl(String imageUrl) 
	{
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() 
	{
		return imageUrl;
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
            .append("orderId", getOrderId())
            .append("orderCode", getOrderCode())
            .append("paymentSeq", getPaymentSeq())
            .append("content", getContent())
            .append("imageUrl", getImageUrl())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
