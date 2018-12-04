package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 试卷题型表 oex_paper_qtype
 * 
 * @author Dge
 * @date 2018-11-28
 */
public class PaperQtype extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long id;
	/** 题型名称 */
	private String name;
	/** 分值 */
	private BigDecimal score;
	/** 试题类型名称描述 */
	private String descpt;
	/** 次序 */
	private Integer seq;
	/** 试卷id */
	private Long paperId;
	/** 试题分类id */
	private Long qtypeId;
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
	public void setScore(BigDecimal score) 
	{
		this.score = score;
	}

	public BigDecimal getScore() 
	{
		return score;
	}
	public void setDescpt(String descpt) 
	{
		this.descpt = descpt;
	}

	public String getDescpt() 
	{
		return descpt;
	}
	public void setSeq(Integer seq) 
	{
		this.seq = seq;
	}

	public Integer getSeq() 
	{
		return seq;
	}
	public void setPaperId(Long paperId) 
	{
		this.paperId = paperId;
	}

	public Long getPaperId() 
	{
		return paperId;
	}
	public void setQtypeId(Long qtypeId) 
	{
		this.qtypeId = qtypeId;
	}

	public Long getQtypeId() 
	{
		return qtypeId;
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
            .append("score", getScore())
            .append("descpt", getDescpt())
            .append("seq", getSeq())
            .append("paperId", getPaperId())
            .append("qtypeId", getQtypeId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
