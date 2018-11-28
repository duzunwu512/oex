package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.Question;
import java.util.List;	

/**
 * 试题 数据层
 * 
 * @author Dge
 * @date 2018-11-28
 */
public interface QuestionMapper 
{
	/**
     * 查询试题信息
     * 
     * @param id 试题ID
     * @return 试题信息
     */
	public Question selectQuestionById(Long id);
	
	/**
     * 查询试题列表
     * 
     * @param question 试题信息
     * @return 试题集合
     */
	public List<Question> selectQuestionList(Question question);
	
	/**
     * 新增试题
     * 
     * @param question 试题信息
     * @return 结果
     */
	public int insertQuestion(Question question);
	
	/**
     * 修改试题
     * 
     * @param question 试题信息
     * @return 结果
     */
	public int updateQuestion(Question question);
	
	/**
     * 删除试题
     * 
     * @param id 试题ID
     * @return 结果
     */
	public int deleteQuestionById(Long id);
	
	/**
     * 批量删除试题
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteQuestionByIds(String[] ids);
	
}