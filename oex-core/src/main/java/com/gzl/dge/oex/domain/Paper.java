package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 试卷名称表 oex_paper
 * 
 * @author Dge
 * @date 2018-11-29
 */
public class Paper extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long id;
	/** 试卷名称 */
	private String name;
	/** 总分 */
	private BigDecimal totalScore;
	/** 地区 */
	private Integer areaId;
	/** 试卷类别id */
	private Long catalogId;
	/** 类型名称 */
	private String catalogName;
	/** 年份 */
	private String yealLabel;
	/** 描述 */
	private String descpt;
	/** 状态（0正常 1停用） */
	private String status;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setTotalScore(BigDecimal totalScore) 
	{
		this.totalScore = totalScore;
	}

	public BigDecimal getTotalScore() 
	{
		return totalScore;
	}
	public void setAreaId(Integer areaId) 
	{
		this.areaId = areaId;
	}

	public Integer getAreaId() 
	{
		return areaId;
	}
	public void setCatalogId(Long catalogId) 
	{
		this.catalogId = catalogId;
	}

	public Long getCatalogId() 
	{
		return catalogId;
	}
	public void setCatalogName(String catalogName) 
	{
		this.catalogName = catalogName;
	}

	public String getCatalogName() 
	{
		return catalogName;
	}
	public void setYealLabel(String yealLabel) 
	{
		this.yealLabel = yealLabel;
	}

	public String getYealLabel() 
	{
		return yealLabel;
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
            .append("name", getName())
            .append("totalScore", getTotalScore())
            .append("areaId", getAreaId())
            .append("catalogId", getCatalogId())
            .append("catalogName", getCatalogName())
            .append("yealLabel", getYealLabel())
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
