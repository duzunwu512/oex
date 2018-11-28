package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.QuestionMapper;
import com.gzl.dge.oex.domain.Question;
import com.gzl.dge.oex.service.IQuestionService;
import com.gzl.dge.common.support.Convert;

/**
 * 试题 服务层实现
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Service
public class QuestionServiceImpl implements IQuestionService 
{
	@Autowired
	private QuestionMapper questionMapper;

	/**
     * 查询试题信息
     * 
     * @param id 试题ID
     * @return 试题信息
     */
    @Override
	public Question selectQuestionById(Long id)
	{
	    return questionMapper.selectQuestionById(id);
	}
	
	/**
     * 查询试题列表
     * 
     * @param question 试题信息
     * @return 试题集合
     */
	@Override
	public List<Question> selectQuestionList(Question question)
	{
	    return questionMapper.selectQuestionList(question);
	}
	
    /**
     * 新增试题
     * 
     * @param question 试题信息
     * @return 结果
     */
	@Override
	public int insertQuestion(Question question)
	{
	    return questionMapper.insertQuestion(question);
	}
	
	/**
     * 修改试题
     * 
     * @param question 试题信息
     * @return 结果
     */
	@Override
	public int updateQuestion(Question question)
	{
	    return questionMapper.updateQuestion(question);
	}

	/**
     * 删除试题对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteQuestionByIds(String ids)
	{
		return questionMapper.deleteQuestionByIds(Convert.toStrArray(ids));
	}
	
}
