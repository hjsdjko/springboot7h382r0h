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


import com.dao.HuodongzuzhizheDao;
import com.entity.HuodongzuzhizheEntity;
import com.service.HuodongzuzhizheService;
import com.entity.vo.HuodongzuzhizheVO;
import com.entity.view.HuodongzuzhizheView;

@Service("huodongzuzhizheService")
public class HuodongzuzhizheServiceImpl extends ServiceImpl<HuodongzuzhizheDao, HuodongzuzhizheEntity> implements HuodongzuzhizheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongzuzhizheEntity> page = this.selectPage(
                new Query<HuodongzuzhizheEntity>(params).getPage(),
                new EntityWrapper<HuodongzuzhizheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongzuzhizheEntity> wrapper) {
		  Page<HuodongzuzhizheView> page =new Query<HuodongzuzhizheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongzuzhizheVO> selectListVO(Wrapper<HuodongzuzhizheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongzuzhizheVO selectVO(Wrapper<HuodongzuzhizheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongzuzhizheView> selectListView(Wrapper<HuodongzuzhizheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongzuzhizheView selectView(Wrapper<HuodongzuzhizheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
