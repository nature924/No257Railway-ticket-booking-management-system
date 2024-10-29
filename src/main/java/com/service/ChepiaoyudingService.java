package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChepiaoyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChepiaoyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChepiaoyudingView;


/**
 * 车票预订
 *
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public interface ChepiaoyudingService extends IService<ChepiaoyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChepiaoyudingVO> selectListVO(Wrapper<ChepiaoyudingEntity> wrapper);
   	
   	ChepiaoyudingVO selectVO(@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);
   	
   	List<ChepiaoyudingView> selectListView(Wrapper<ChepiaoyudingEntity> wrapper);
   	
   	ChepiaoyudingView selectView(@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChepiaoyudingEntity> wrapper);
   	

}

