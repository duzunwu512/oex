package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.PaperQtype;
import java.util.List;	

/**
 * 试卷题型 数据层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface PaperQtypeMapper 
{
	/**
     * 查询试卷题型信息
     * 
     * @param iD 试卷题型ID
     * @return 试卷题型信息
     */
	public PaperQtype selectPaperQtypeById(Long iD);
	
	/**
     * 查询试卷题型列表
     * 
     * @param paperQtype 试卷题型信息
     * @return 试卷题型集合
     */
	public List<PaperQtype> selectPaperQtypeList(PaperQtype paperQtype);
	
	/**
     * 新增试卷题型
     * 
     * @param paperQtype 试卷题型信息
     * @return 结果
     */
	public int insertPaperQtype(PaperQtype paperQtype);
	
	/**
     * 修改试卷题型
     * 
     * @param paperQtype 试卷题型信息
     * @return 结果
     */
	public int updatePaperQtype(PaperQtype paperQtype);
	
	/**
     * 删除试卷题型
     * 
     * @param iD 试卷题型ID
     * @return 结果
     */
	public int deletePaperQtypeById(Long iD);
	
	/**
     * 批量删除试卷题型
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deletePaperQtypeByIds(String[] iDs);
	
}