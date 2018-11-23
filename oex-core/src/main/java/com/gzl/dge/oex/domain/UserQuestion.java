package com.gzl.dge.oex.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.gzl.dge.common.base.BaseEntity;

/**
 * 用户做题表 oex_user_question
 * 
 * @author Dge
 * @date 2018-11-23
 */
public class UserQuestion extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Long iD;
	/** 考试用户ID */
	private Long userId;
	/** 试卷ID */
	private Long paperId;
	/** 试题ID */
	private Long questionId;
	/** 答案 */
	private String aNSWER;
	/** 是否正确 */
	private String isRight;
	/** 得分 */
	private BigDecimal sCORE;
	/** 状态（0正常 1停用） */
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
	public void setANSWER(String aNSWER) 
	{
		this.aNSWER = aNSWER;
	}

	public String getANSWER() 
	{
		return aNSWER;
	}
	public void setIsRight(String isRight) 
	{
		this.isRight = isRight;
	}

	public String getIsRight() 
	{
		return isRight;
	}
	public void setSCORE(BigDecimal sCORE) 
	{
		this.sCORE = sCORE;
	}

	public BigDecimal getSCORE() 
	{
		return sCORE;
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
            .append("userId", getUserId())
            .append("paperId", getPaperId())
            .append("questionId", getQuestionId())
            .append("aNSWER", getANSWER())
            .append("isRight", getIsRight())
            .append("sCORE", getSCORE())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
