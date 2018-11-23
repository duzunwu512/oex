package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.PaperQtypeMapper;
import com.gzl.dge.oex.domain.PaperQtype;
import com.gzl.dge.oex.service.IPaperQtypeService;
import com.gzl.dge.common.support.Convert;

/**
 * 试卷题型 服务层实现
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Service
public class PaperQtypeServiceImpl implements IPaperQtypeService 
{
	@Autowired
	private PaperQtypeMapper paperQtypeMapper;

	/**
     * 查询试卷题型信息
     * 
     * @param iD 试卷题型ID
     * @return 试卷题型信息
     */
    @Override
	public PaperQtype selectPaperQtypeById(Long iD)
	{
	    return paperQtypeMapper.selectPaperQtypeById(iD);
	}
	
	/**
     * 查询试卷题型列表
     * 
     * @param paperQtype 试卷题型信息
     * @return 试卷题型集合
     */
	@Override
	public List<PaperQtype> selectPaperQtypeList(PaperQtype paperQtype)
	{
	    return paperQtypeMapper.selectPaperQtypeList(paperQtype);
	}
	
    /**
     * 新增试卷题型
     * 
     * @param paperQtype 试卷题型信息
     * @return 结果
     */
	@Override
	public int insertPaperQtype(PaperQtype paperQtype)
	{
	    return paperQtypeMapper.insertPaperQtype(paperQtype);
	}
	
	/**
     * 修改试卷题型
     * 
     * @param paperQtype 试卷题型信息
     * @return 结果
     */
	@Override
	public int updatePaperQtype(PaperQtype paperQtype)
	{
	    return paperQtypeMapper.updatePaperQtype(paperQtype);
	}

	/**
     * 删除试卷题型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePaperQtypeByIds(String ids)
	{
		return paperQtypeMapper.deletePaperQtypeByIds(Convert.toStrArray(ids));
	}
	
}
