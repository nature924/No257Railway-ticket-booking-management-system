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


import com.dao.DiscusshuochexinxiDao;
import com.entity.DiscusshuochexinxiEntity;
import com.service.DiscusshuochexinxiService;
import com.entity.vo.DiscusshuochexinxiVO;
import com.entity.view.DiscusshuochexinxiView;

@Service("discusshuochexinxiService")
public class DiscusshuochexinxiServiceImpl extends ServiceImpl<DiscusshuochexinxiDao, DiscusshuochexinxiEntity> implements DiscusshuochexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuochexinxiEntity> page = this.selectPage(
                new Query<DiscusshuochexinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusshuochexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuochexinxiEntity> wrapper) {
		  Page<DiscusshuochexinxiView> page =new Query<DiscusshuochexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuochexinxiVO> selectListVO(Wrapper<DiscusshuochexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuochexinxiVO selectVO(Wrapper<DiscusshuochexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuochexinxiView> selectListView(Wrapper<DiscusshuochexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuochexinxiView selectView(Wrapper<DiscusshuochexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
