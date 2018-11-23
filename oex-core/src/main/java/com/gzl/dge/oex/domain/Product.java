package com.gzl.dge.oex.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.gzl.dge.common.base.BaseEntity;

/**
 * 产品表 oex_product
 * 
 * @author Dge
 * @date 2018-11-23
 */
public class Product extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long iD;
	/** 产品名称 */
	private String name;
	/** 起始日 */
	private Date startDate;
	/** 结束日 */
	private Date endDate;
	/** 价格 */
	private BigDecimal price;
	/** 备注 */
	private String descpt;
	/** 状态（0正常 1停用 2上架 3下架） */
	private String status;
	/** 创建者 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 更新者 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;
	/** 备注 */
	private String remark;

	public void setID(Long iD) 
	{
		this.iD = iD;
	}

	public Long getID() 
	{
		return iD;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setStartDate(Date startDate) 
	{
		this.startDate = startDate;
	}

	public Date getStartDate() 
	{
		return startDate;
	}
	public void setEndDate(Date endDate) 
	{
		this.endDate = endDate;
	}

	public Date getEndDate() 
	{
		return endDate;
	}
	public void setPrice(BigDecimal price) 
	{
		this.price = price;
	}

	public BigDecimal getPrice() 
	{
		return price;
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
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}

	public String getCreateBy() 
	{
		return createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}

	public String getUpdateBy() 
	{
		return updateBy;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("iD", getID())
            .append("name", getName())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("price", getPrice())
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
