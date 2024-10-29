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


import com.dao.HuocheleixingDao;
import com.entity.HuocheleixingEntity;
import com.service.HuocheleixingService;
import com.entity.vo.HuocheleixingVO;
import com.entity.view.HuocheleixingView;

@Service("huocheleixingService")
public class HuocheleixingServiceImpl extends ServiceImpl<HuocheleixingDao, HuocheleixingEntity> implements HuocheleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuocheleixingEntity> page = this.selectPage(
                new Query<HuocheleixingEntity>(params).getPage(),
                new EntityWrapper<HuocheleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuocheleixingEntity> wrapper) {
		  Page<HuocheleixingView> page =new Query<HuocheleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuocheleixingVO> selectListVO(Wrapper<HuocheleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuocheleixingVO selectVO(Wrapper<HuocheleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuocheleixingView> selectListView(Wrapper<HuocheleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuocheleixingView selectView(Wrapper<HuocheleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
