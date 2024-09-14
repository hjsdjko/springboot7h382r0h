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


import com.dao.HuodongrizhiDao;
import com.entity.HuodongrizhiEntity;
import com.service.HuodongrizhiService;
import com.entity.vo.HuodongrizhiVO;
import com.entity.view.HuodongrizhiView;

@Service("huodongrizhiService")
public class HuodongrizhiServiceImpl extends ServiceImpl<HuodongrizhiDao, HuodongrizhiEntity> implements HuodongrizhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongrizhiEntity> page = this.selectPage(
                new Query<HuodongrizhiEntity>(params).getPage(),
                new EntityWrapper<HuodongrizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongrizhiEntity> wrapper) {
		  Page<HuodongrizhiView> page =new Query<HuodongrizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongrizhiVO> selectListVO(Wrapper<HuodongrizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongrizhiVO selectVO(Wrapper<HuodongrizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongrizhiView> selectListView(Wrapper<HuodongrizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongrizhiView selectView(Wrapper<HuodongrizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
