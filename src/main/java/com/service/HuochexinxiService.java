package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuochexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuochexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuochexinxiView;


/**
 * 火车信息
 *
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public interface HuochexinxiService extends IService<HuochexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuochexinxiVO> selectListVO(Wrapper<HuochexinxiEntity> wrapper);
   	
   	HuochexinxiVO selectVO(@Param("ew") Wrapper<HuochexinxiEntity> wrapper);
   	
   	List<HuochexinxiView> selectListView(Wrapper<HuochexinxiEntity> wrapper);
   	
   	HuochexinxiView selectView(@Param("ew") Wrapper<HuochexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuochexinxiEntity> wrapper);
   	

}

