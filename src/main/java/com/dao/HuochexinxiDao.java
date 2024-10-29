package com.dao;

import com.entity.HuochexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuochexinxiVO;
import com.entity.view.HuochexinxiView;


/**
 * 火车信息
 * 
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public interface HuochexinxiDao extends BaseMapper<HuochexinxiEntity> {
	
	List<HuochexinxiVO> selectListVO(@Param("ew") Wrapper<HuochexinxiEntity> wrapper);
	
	HuochexinxiVO selectVO(@Param("ew") Wrapper<HuochexinxiEntity> wrapper);
	
	List<HuochexinxiView> selectListView(@Param("ew") Wrapper<HuochexinxiEntity> wrapper);

	List<HuochexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuochexinxiEntity> wrapper);
	
	HuochexinxiView selectView(@Param("ew") Wrapper<HuochexinxiEntity> wrapper);
	

}
