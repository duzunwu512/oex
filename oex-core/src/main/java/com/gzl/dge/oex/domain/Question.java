package com.gzl.dge.oex.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.gzl.dge.common.base.BaseEntity;

/**
 * 试题表 oex_question
 * 
 * @author Dge
 * @date 2018-11-23
 */
public class Question extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Long iD;
	/** 试题分类 1：单选；2：多选；3：填空；4：判断；5：问答 */
	private Long qtypeId;
	/** 1：极易；2：简单；3：适中；4：困难；5：极难 */
	private Integer dIFFICULTY;
	/** 题干 */
	private String tITLE;
	/** 选项A */
	private String optionA;
	/** 选项B */
	private String optionB;
	/** 选项C */
	private String optionC;
	/** 选项D */
	private String optionD;
	/** 选项E */
	private String optionE;
	/** 选项F */
	private String optionF;
	/** 选项G */
	private String optionG;
	/** 答案 */
	private String aNSWER;
	/** 解析 */
	private String aNALYSIS;
	/** 试卷ID */
	private Long paperId;
	/** 排序 */
	private Integer seq;
	/** 分数 */
	private BigDecimal sCORE;
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

	public void setID(Long iD) 
	{
		this.iD = iD;
	}

	public Long getID() 
	{
		return iD;
	}
	public void setQtypeId(Long qtypeId) 
	{
		this.qtypeId = qtypeId;
	}

	public Long getQtypeId() 
	{
		return qtypeId;
	}
	public void setDIFFICULTY(Integer dIFFICULTY) 
	{
		this.dIFFICULTY = dIFFICULTY;
	}

	public Integer getDIFFICULTY() 
	{
		return dIFFICULTY;
	}
	public void setTITLE(String tITLE) 
	{
		this.tITLE = tITLE;
	}

	public String getTITLE() 
	{
		return tITLE;
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
	public void setANSWER(String aNSWER) 
	{
		this.aNSWER = aNSWER;
	}

	public String getANSWER() 
	{
		return aNSWER;
	}
	public void setANALYSIS(String aNALYSIS) 
	{
		this.aNALYSIS = aNALYSIS;
	}

	public String getANALYSIS() 
	{
		return aNALYSIS;
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
	public void setSCORE(BigDecimal sCORE) 
	{
		this.sCORE = sCORE;
	}

	public BigDecimal getSCORE() 
	{
		return sCORE;
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
            .append("qtypeId", getQtypeId())
            .append("dIFFICULTY", getDIFFICULTY())
            .append("tITLE", getTITLE())
            .append("optionA", getOptionA())
            .append("optionB", getOptionB())
            .append("optionC", getOptionC())
            .append("optionD", getOptionD())
            .append("optionE", getOptionE())
            .append("optionF", getOptionF())
            .append("optionG", getOptionG())
            .append("aNSWER", getANSWER())
            .append("aNALYSIS", getANALYSIS())
            .append("paperId", getPaperId())
            .append("seq", getSeq())
            .append("sCORE", getSCORE())
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
