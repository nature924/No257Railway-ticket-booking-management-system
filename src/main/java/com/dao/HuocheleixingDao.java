package com.dao;

import com.entity.HuocheleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuocheleixingVO;
import com.entity.view.HuocheleixingView;


/**
 * 火车类型
 * 
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public interface HuocheleixingDao extends BaseMapper<HuocheleixingEntity> {
	
	List<HuocheleixingVO> selectListVO(@Param("ew") Wrapper<HuocheleixingEntity> wrapper);
	
	HuocheleixingVO selectVO(@Param("ew") Wrapper<HuocheleixingEntity> wrapper);
	
	List<HuocheleixingView> selectListView(@Param("ew") Wrapper<HuocheleixingEntity> wrapper);

	List<HuocheleixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuocheleixingEntity> wrapper);
	
	HuocheleixingView selectView(@Param("ew") Wrapper<HuocheleixingEntity> wrapper);
	

}
