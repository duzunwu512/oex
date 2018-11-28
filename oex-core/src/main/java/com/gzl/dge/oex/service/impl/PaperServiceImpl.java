package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.PaperMapper;
import com.gzl.dge.oex.domain.Paper;
import com.gzl.dge.oex.service.IPaperService;
import com.gzl.dge.common.support.Convert;

/**
 * 试卷名称 服务层实现
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Service
public class PaperServiceImpl implements IPaperService 
{
	@Autowired
	private PaperMapper paperMapper;

	/**
     * 查询试卷名称信息
     * 
     * @param id 试卷名称ID
     * @return 试卷名称信息
     */
    @Override
	public Paper selectPaperById(Long id)
	{
	    return paperMapper.selectPaperById(id);
	}
	
	/**
     * 查询试卷名称列表
     * 
     * @param paper 试卷名称信息
     * @return 试卷名称集合
     */
	@Override
	public List<Paper> selectPaperList(Paper paper)
	{
	    return paperMapper.selectPaperList(paper);
	}
	
    /**
     * 新增试卷名称
     * 
     * @param paper 试卷名称信息
     * @return 结果
     */
	@Override
	public int insertPaper(Paper paper)
	{
	    return paperMapper.insertPaper(paper);
	}
	
	/**
     * 修改试卷名称
     * 
     * @param paper 试卷名称信息
     * @return 结果
     */
	@Override
	public int updatePaper(Paper paper)
	{
	    return paperMapper.updatePaper(paper);
	}

	/**
     * 删除试卷名称对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePaperByIds(String ids)
	{
		return paperMapper.deletePaperByIds(Convert.toStrArray(ids));
	}
	
}
