package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.AreaMapper;
import com.gzl.dge.oex.domain.Area;
import com.gzl.dge.oex.service.IAreaService;
import com.gzl.dge.common.support.Convert;

/**
 * 地区 服务层实现
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Service
public class AreaServiceImpl implements IAreaService 
{
	@Autowired
	private AreaMapper areaMapper;

	/**
     * 查询地区信息
     * 
     * @param id 地区ID
     * @return 地区信息
     */
    @Override
	public Area selectAreaById(Integer id)
	{
	    return areaMapper.selectAreaById(id);
	}
	
	/**
     * 查询地区列表
     * 
     * @param area 地区信息
     * @return 地区集合
     */
	@Override
	public List<Area> selectAreaList(Area area)
	{
	    return areaMapper.selectAreaList(area);
	}
	
    /**
     * 新增地区
     * 
     * @param area 地区信息
     * @return 结果
     */
	@Override
	public int insertArea(Area area)
	{
	    return areaMapper.insertArea(area);
	}
	
	/**
     * 修改地区
     * 
     * @param area 地区信息
     * @return 结果
     */
	@Override
	public int updateArea(Area area)
	{
	    return areaMapper.updateArea(area);
	}

	/**
     * 删除地区对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAreaByIds(String ids)
	{
		return areaMapper.deleteAreaByIds(Convert.toStrArray(ids));
	}
	
}
