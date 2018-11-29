package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.Paper;
import java.util.List;	

/**
 * 试卷名称 数据层
 * 
 * @author Dge
 * @date 2018-11-29
 */
public interface PaperMapper 
{
	/**
     * 查询试卷名称信息
     * 
     * @param id 试卷名称ID
     * @return 试卷名称信息
     */
	public Paper selectPaperById(Long id);
	
	/**
     * 查询试卷名称列表
     * 
     * @param paper 试卷名称信息
     * @return 试卷名称集合
     */
	public List<Paper> selectPaperList(Paper paper);
	
	/**
     * 新增试卷名称
     * 
     * @param paper 试卷名称信息
     * @return 结果
     */
	public int insertPaper(Paper paper);
	
	/**
     * 修改试卷名称
     * 
     * @param paper 试卷名称信息
     * @return 结果
     */
	public int updatePaper(Paper paper);
	
	/**
     * 删除试卷名称
     * 
     * @param id 试卷名称ID
     * @return 结果
     */
	public int deletePaperById(Long id);
	
	/**
     * 批量删除试卷名称
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deletePaperByIds(String[] ids);
	
}