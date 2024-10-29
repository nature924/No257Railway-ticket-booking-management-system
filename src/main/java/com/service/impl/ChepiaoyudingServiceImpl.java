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


import com.dao.ChepiaoyudingDao;
import com.entity.ChepiaoyudingEntity;
import com.service.ChepiaoyudingService;
import com.entity.vo.ChepiaoyudingVO;
import com.entity.view.ChepiaoyudingView;

@Service("chepiaoyudingService")
public class ChepiaoyudingServiceImpl extends ServiceImpl<ChepiaoyudingDao, ChepiaoyudingEntity> implements ChepiaoyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChepiaoyudingEntity> page = this.selectPage(
                new Query<ChepiaoyudingEntity>(params).getPage(),
                new EntityWrapper<ChepiaoyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChepiaoyudingEntity> wrapper) {
		  Page<ChepiaoyudingView> page =new Query<ChepiaoyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChepiaoyudingVO> selectListVO(Wrapper<ChepiaoyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChepiaoyudingVO selectVO(Wrapper<ChepiaoyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChepiaoyudingView> selectListView(Wrapper<ChepiaoyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChepiaoyudingView selectView(Wrapper<ChepiaoyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
