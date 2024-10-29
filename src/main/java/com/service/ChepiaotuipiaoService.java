package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChepiaotuipiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChepiaotuipiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChepiaotuipiaoView;


/**
 * 车票退票
 *
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public interface ChepiaotuipiaoService extends IService<ChepiaotuipiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChepiaotuipiaoVO> selectListVO(Wrapper<ChepiaotuipiaoEntity> wrapper);
   	
   	ChepiaotuipiaoVO selectVO(@Param("ew") Wrapper<ChepiaotuipiaoEntity> wrapper);
   	
   	List<ChepiaotuipiaoView> selectListView(Wrapper<ChepiaotuipiaoEntity> wrapper);
   	
   	ChepiaotuipiaoView selectView(@Param("ew") Wrapper<ChepiaotuipiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChepiaotuipiaoEntity> wrapper);
   	

}

