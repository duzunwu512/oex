package com.gzl.dge.oex.service;

import com.gzl.dge.oex.domain.Catalog;
import java.util.List;
import java.util.Map;

/**
 * 考试类别 服务层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface ICatalogService 
{
	/**
     * 查询考试类别信息
     * 
     * @param id 考试类别ID
     * @return 考试类别信息
     */
	public Catalog selectCatalogById(Long id);
	
	/**
     * 查询考试类别列表
     * 
     * @param catalog 考试类别信息
     * @return 考试类别集合
     */
	public List<Catalog> selectCatalogList(Catalog catalog);
	
	/**
     * 新增考试类别
     * 
     * @param catalog 考试类别信息
     * @return 结果
     */
	public int insertCatalog(Catalog catalog);
	
	/**
     * 修改考试类别
     * 
     * @param catalog 考试类别信息
     * @return 结果
     */
	public int updateCatalog(Catalog catalog);
		
	/**
     * 删除考试类别信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCatalogByIds(String ids);

	public List<Map<String, Object>> selectCatalogTree();
	
}
