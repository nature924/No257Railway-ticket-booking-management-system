package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChepiaotuipiaoDao;
import com.entity.ChepiaotuipiaoEntity;
import com.service.ChepiaotuipiaoService;
import com.entity.vo.ChepiaotuipiaoVO;
import com.entity.view.ChepiaotuipiaoView;

@Service("chepiaotuipiaoService")
public class ChepiaotuipiaoServiceImpl extends ServiceImpl<ChepiaotuipiaoDao, ChepiaotuipiaoEntity> implements ChepiaotuipiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChepiaotuipiaoEntity> page = this.selectPage(
                new Query<ChepiaotuipiaoEntity>(params).getPage(),
                new EntityWrapper<ChepiaotuipiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChepiaotuipiaoEntity> wrapper) {
		  Page<ChepiaotuipiaoView> page =new Query<ChepiaotuipiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChepiaotuipiaoVO> selectListVO(Wrapper<ChepiaotuipiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChepiaotuipiaoVO selectVO(Wrapper<ChepiaotuipiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChepiaotuipiaoView> selectListView(Wrapper<ChepiaotuipiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChepiaotuipiaoView selectView(Wrapper<ChepiaotuipiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
