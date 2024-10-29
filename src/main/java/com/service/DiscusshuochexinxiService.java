package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuochexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuochexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuochexinxiView;


/**
 * 火车信息评论表
 *
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public interface DiscusshuochexinxiService extends IService<DiscusshuochexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuochexinxiVO> selectListVO(Wrapper<DiscusshuochexinxiEntity> wrapper);
   	
   	DiscusshuochexinxiVO selectVO(@Param("ew") Wrapper<DiscusshuochexinxiEntity> wrapper);
   	
   	List<DiscusshuochexinxiView> selectListView(Wrapper<DiscusshuochexinxiEntity> wrapper);
   	
   	DiscusshuochexinxiView selectView(@Param("ew") Wrapper<DiscusshuochexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuochexinxiEntity> wrapper);
   	

}

