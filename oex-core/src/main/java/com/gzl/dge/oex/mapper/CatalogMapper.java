package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.Catalog;
import java.util.List;	

/**
 * 考试类别 数据层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface CatalogMapper 
{
	/**
     * 查询考试类别信息
     * 
     * @param iD 考试类别ID
     * @return 考试类别信息
     */
	public Catalog selectCatalogById(Long iD);
	
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
     * 删除考试类别
     * 
     * @param iD 考试类别ID
     * @return 结果
     */
	public int deleteCatalogById(Long iD);
	
	/**
     * 批量删除考试类别
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteCatalogByIds(String[] ids);
	
}