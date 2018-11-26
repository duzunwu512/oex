package com.gzl.dge.oex.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gzl.dge.common.constant.UserConstants;
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


	@Override
	public List<Map<String, Object>> selectAreaTree(){
		List<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();
		Area area = new Area();
		area.setLevel("0");
		List<Area> list0 = selectAreaList(area);
		area.setLevel("1");
		List<Area> list1 = selectAreaList(area);
		list0.addAll(list1);

		trees = getTrees(list0, false, null);
		return trees;
	}

	public List<Map<String, Object>> getTrees(List<Area> deptList, boolean isCheck, List<String> roleDeptList)
	{

		List<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();
		for (Area dept : deptList)
		{
			if (UserConstants.DEPT_NORMAL.equals(dept.getStatus()))
			{
				Map<String, Object> deptMap = new HashMap<String, Object>();
				deptMap.put("id", dept.getId());
				deptMap.put("pId", dept.getParentId());
				deptMap.put("name", dept.getName());
				deptMap.put("title", dept.getName());
				if (isCheck)
				{
					deptMap.put("checked", roleDeptList.contains(dept.getId() + dept.getName()));
				}
				else
				{
					deptMap.put("checked", false);
				}
				trees.add(deptMap);
			}
		}
		return trees;
	}
	
}
