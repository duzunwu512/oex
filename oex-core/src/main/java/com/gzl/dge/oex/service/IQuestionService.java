package com.gzl.dge.oex.service;

import com.gzl.dge.oex.domain.Question;
import java.util.List;

/**
 * 试题 服务层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface IQuestionService 
{
	/**
     * 查询试题信息
     * 
     * @param iD 试题ID
     * @return 试题信息
     */
	public Question selectQuestionById(Long iD);
	
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
     * 删除试题信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteQuestionByIds(String ids);
	
}
