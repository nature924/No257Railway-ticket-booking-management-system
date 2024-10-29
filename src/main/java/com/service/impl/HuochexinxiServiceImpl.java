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


import com.dao.HuochexinxiDao;
import com.entity.HuochexinxiEntity;
import com.service.HuochexinxiService;
import com.entity.vo.HuochexinxiVO;
import com.entity.view.HuochexinxiView;

@Service("huochexinxiService")
public class HuochexinxiServiceImpl extends ServiceImpl<HuochexinxiDao, HuochexinxiEntity> implements HuochexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuochexinxiEntity> page = this.selectPage(
                new Query<HuochexinxiEntity>(params).getPage(),
                new EntityWrapper<HuochexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuochexinxiEntity> wrapper) {
		  Page<HuochexinxiView> page =new Query<HuochexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuochexinxiVO> selectListVO(Wrapper<HuochexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuochexinxiVO selectVO(Wrapper<HuochexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuochexinxiView> selectListView(Wrapper<HuochexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuochexinxiView selectView(Wrapper<HuochexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
