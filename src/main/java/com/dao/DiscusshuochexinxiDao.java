package com.dao;

import com.entity.DiscusshuochexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuochexinxiVO;
import com.entity.view.DiscusshuochexinxiView;


/**
 * 火车信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public interface DiscusshuochexinxiDao extends BaseMapper<DiscusshuochexinxiEntity> {
	
	List<DiscusshuochexinxiVO> selectListVO(@Param("ew") Wrapper<DiscusshuochexinxiEntity> wrapper);
	
	DiscusshuochexinxiVO selectVO(@Param("ew") Wrapper<DiscusshuochexinxiEntity> wrapper);
	
	List<DiscusshuochexinxiView> selectListView(@Param("ew") Wrapper<DiscusshuochexinxiEntity> wrapper);

	List<DiscusshuochexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuochexinxiEntity> wrapper);
	
	DiscusshuochexinxiView selectView(@Param("ew") Wrapper<DiscusshuochexinxiEntity> wrapper);
	

}
