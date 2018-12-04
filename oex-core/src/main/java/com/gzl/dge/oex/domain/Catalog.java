package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;
import java.util.Date;

/**
 * 考试类别表 oex_catalog
 * 
 * @author Dge
 * @date 2018-11-23
 */
public class Catalog extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Long id;
	/** 类别名称 */
	private String name;
	/** 父类别 */
	private Long parentId;
	/** 父子关系（格式：_父ID_子ID_子子ID_... ...） */
	private String parentSub;
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
	public void setParentId(Long parentId) 
	{
		this.parentId = parentId;
	}

	public Long getParentId() 
	{
		return parentId;
	}
	public void setParentSub(String parentSub) 
	{
		this.parentSub = parentSub;
	}

	public String getParentSub() 
	{
		return parentSub;
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
            .append("iD", getId())
            .append("name", getName())
            .append("parentId", getParentId())
            .append("parentSub", getParentSub())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
