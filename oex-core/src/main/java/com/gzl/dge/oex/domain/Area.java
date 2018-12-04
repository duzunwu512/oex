package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;
import java.util.Date;

/**
 * 地区表 oex_area
 * 
 * @author Dge
 * @date 2018-11-23
 */
public class Area extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Long id;
	/** 父级 */
	private Long parentId;
	/** 区域名称 */
	private String name;
	/** 类别: 0-国家 1-省份 2-市 3-区 */
	private String level;
	/** 区号 */
	private String code;
	/** 所属省id */
	private Integer provinceId;
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
	public void setParentId(Long parentId)
	{
		this.parentId = parentId;
	}

	public Long getParentId()
	{
		return parentId;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setLevel(String level) 
	{
		this.level = level;
	}

	public String getLevel() 
	{
		return level;
	}
	public void setCode(String code) 
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	public void setProvinceId(Integer provinceId) 
	{
		this.provinceId = provinceId;
	}

	public Integer getProvinceId() 
	{
		return provinceId;
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
            .append("parentId", getParentId())
            .append("name", getName())
            .append("level", getLevel())
            .append("code", getCode())
            .append("provinceId", getProvinceId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
