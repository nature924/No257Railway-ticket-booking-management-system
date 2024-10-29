package com.dao;

import com.entity.ChepiaotuipiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChepiaotuipiaoVO;
import com.entity.view.ChepiaotuipiaoView;


/**
 * 车票退票
 * 
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public interface ChepiaotuipiaoDao extends BaseMapper<ChepiaotuipiaoEntity> {
	
	List<ChepiaotuipiaoVO> selectListVO(@Param("ew") Wrapper<ChepiaotuipiaoEntity> wrapper);
	
	ChepiaotuipiaoVO selectVO(@Param("ew") Wrapper<ChepiaotuipiaoEntity> wrapper);
	
	List<ChepiaotuipiaoView> selectListView(@Param("ew") Wrapper<ChepiaotuipiaoEntity> wrapper);

	List<ChepiaotuipiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ChepiaotuipiaoEntity> wrapper);
	
	ChepiaotuipiaoView selectView(@Param("ew") Wrapper<ChepiaotuipiaoEntity> wrapper);
	

}
