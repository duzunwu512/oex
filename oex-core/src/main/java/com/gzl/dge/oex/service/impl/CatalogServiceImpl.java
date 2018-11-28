package com.gzl.dge.oex.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gzl.dge.common.constant.UserConstants;
import com.gzl.dge.common.utils.StringUtils;
import com.gzl.dge.oex.domain.Area;
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
     * @param id 考试类别ID
     * @return 考试类别信息
     */
    @Override
	public Catalog selectCatalogById(Long id)
	{
	    return catalogMapper.selectCatalogById(id);
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



	@Override
	public List<Map<String, Object>> selectCatalogTree(){
		List<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();
		List<Catalog> cataList = selectCatalogList(new Catalog());
		trees = getTrees(cataList, false);
		return trees;
	}

	private List<Map<String, Object>> getTrees(List<Catalog> cataList, boolean isCheck)
	{

		List<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();
		for (Catalog cata : cataList)
		{
			if (UserConstants.DEPT_NORMAL.equals(cata.getStatus()))
			{
				Map<String, Object> deptMap = new HashMap<String, Object>();
				deptMap.put("id", cata.getId());
				deptMap.put("pId", cata.getParentId());
				deptMap.put("name", cata.getName());
				deptMap.put("title", cata.getName());
				deptMap.put("checked", false);
				trees.add(deptMap);
			}
		}
		return trees;
	}

	
}
