package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 试题表 oex_question
 * 
 * @author Dge
 * @date 2018-11-28
 */
public class Question extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long id;
	/** 试题分类 1：单选；2：多选；3：填空；4：判断；5：问答 */
	private Long qtypeId;
	/** 1：极易；2：简单；3：适中；4：困难；5：极难 */
	private Integer difficulty;
	/** 题干 */
	private String title;
	/** 选项a */
	private String optionA;
	/** 选项b */
	private String optionB;
	/** 选项c */
	private String optionC;
	/** 选项d */
	private String optionD;
	/** 选项e */
	private String optionE;
	/** 选项f */
	private String optionF;
	/** 选项g */
	private String optionG;
	/** 答案 */
	private String answer;
	/** 解析 */
	private String analysis;
	/** 试卷id */
	private Long paperId;
	/** 排序 */
	private Integer seq;
	/** 分数 */
	private BigDecimal score;
	/** 备注 */
	private String descpt;
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

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setQtypeId(Long qtypeId) 
	{
		this.qtypeId = qtypeId;
	}

	public Long getQtypeId() 
	{
		return qtypeId;
	}
	public void setDifficulty(Integer difficulty) 
	{
		this.difficulty = difficulty;
	}

	public Integer getDifficulty() 
	{
		return difficulty;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getTitle() 
	{
		return title;
	}
	public void setOptionA(String optionA) 
	{
		this.optionA = optionA;
	}

	public String getOptionA() 
	{
		return optionA;
	}
	public void setOptionB(String optionB) 
	{
		this.optionB = optionB;
	}

	public String getOptionB() 
	{
		return optionB;
	}
	public void setOptionC(String optionC) 
	{
		this.optionC = optionC;
	}

	public String getOptionC() 
	{
		return optionC;
	}
	public void setOptionD(String optionD) 
	{
		this.optionD = optionD;
	}

	public String getOptionD() 
	{
		return optionD;
	}
	public void setOptionE(String optionE) 
	{
		this.optionE = optionE;
	}

	public String getOptionE() 
	{
		return optionE;
	}
	public void setOptionF(String optionF) 
	{
		this.optionF = optionF;
	}

	public String getOptionF() 
	{
		return optionF;
	}
	public void setOptionG(String optionG) 
	{
		this.optionG = optionG;
	}

	public String getOptionG() 
	{
		return optionG;
	}
	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}

	public String getAnswer() 
	{
		return answer;
	}
	public void setAnalysis(String analysis) 
	{
		this.analysis = analysis;
	}

	public String getAnalysis() 
	{
		return analysis;
	}
	public void setPaperId(Long paperId) 
	{
		this.paperId = paperId;
	}

	public Long getPaperId() 
	{
		return paperId;
	}
	public void setSeq(Integer seq) 
	{
		this.seq = seq;
	}

	public Integer getSeq() 
	{
		return seq;
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
            .append("id", getId())
            .append("qtypeId", getQtypeId())
            .append("difficulty", getDifficulty())
            .append("title", getTitle())
            .append("optionA", getOptionA())
            .append("optionB", getOptionB())
            .append("optionC", getOptionC())
            .append("optionD", getOptionD())
            .append("optionE", getOptionE())
            .append("optionF", getOptionF())
            .append("optionG", getOptionG())
            .append("answer", getAnswer())
            .append("analysis", getAnalysis())
            .append("paperId", getPaperId())
            .append("seq", getSeq())
            .append("score", getScore())
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
