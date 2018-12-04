package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户试卷表 oex_user_paper
 * 
 * @author Dge
 * @date 2018-11-28
 */
public class UserPaper extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long id;
	/** 考试用户id */
	private Long userId;
	/** 试卷id */
	private Long paperId;
	/** 得分 */
	private BigDecimal score;
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
	public void setScore(BigDecimal score) 
	{
		this.score = score;
	}

	public BigDecimal getScore() 
	{
		return score;
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
            .append("score", getScore())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
