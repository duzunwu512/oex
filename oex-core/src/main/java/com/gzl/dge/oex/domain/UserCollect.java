package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;
import java.util.Date;

/**
 * 用户收藏试题表 oex_user_collect
 * 
 * @author Dge
 * @date 2018-11-28
 */
public class UserCollect extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long id;
	/** 考试用户id */
	private Long userId;
	/** 试卷id */
	private Long paperId;
	/** 试题id */
	private Long questionId;
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
	public void setUserId(Long userId) 
	{
		this.userId = userId;
	}

	public Long getUserId() 
	{
		return userId;
	}
	public void setPaperId(Long paperId) 
	{
		this.paperId = paperId;
	}

	public Long getPaperId() 
	{
		return paperId;
	}
	public void setQuestionId(Long questionId) 
	{
		this.questionId = questionId;
	}

	public Long getQuestionId() 
	{
		return questionId;
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
            .append("userId", getUserId())
            .append("paperId", getPaperId())
            .append("questionId", getQuestionId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
