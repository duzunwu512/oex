package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.CatalogMapper;
import com.gzl.dge.oex.domain.Catalog;
import com.gzl.dge.oex.service.ICatalogService;
import com.gzl.dge.common.support.Convert;

/**
 * 考试类别 服务层实现
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Service
public class CatalogServiceImpl implements ICatalogService 
{
	@Autowired
	private CatalogMapper catalogMapper;

	/**
     * 查询考试类别信息
     * 
     * @param iD 考试类别ID
     * @return 考试类别信息
     */
    @Override
	public Catalog selectCatalogById(Long iD)
	{
	    return catalogMapper.selectCatalogById(iD);
	}
	
	/**
     * 查询考试类别列表
     * 
     * @param catalog 考试类别信息
     * @return 考试类别集合
     */
	@Override
	public List<Catalog> selectCatalogList(Catalog catalog)
	{
	    return catalogMapper.selectCatalogList(catalog);
	}
	
    /**
     * 新增考试类别
     * 
     * @param catalog 考试类别信息
     * @return 结果
     */
	@Override
	public int insertCatalog(Catalog catalog)
	{
	    return catalogMapper.insertCatalog(catalog);
	}
	
	/**
     * 修改考试类别
     * 
     * @param catalog 考试类别信息
     * @return 结果
     */
	@Override
	public int updateCatalog(Catalog catalog)
	{
	    return catalogMapper.updateCatalog(catalog);
	}

	/**
     * 删除考试类别对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCatalogByIds(String ids)
	{
		return catalogMapper.deleteCatalogByIds(Convert.toStrArray(ids));
	}
	
}
