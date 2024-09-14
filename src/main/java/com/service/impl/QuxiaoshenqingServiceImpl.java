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


import com.dao.QuxiaoshenqingDao;
import com.entity.QuxiaoshenqingEntity;
import com.service.QuxiaoshenqingService;
import com.entity.vo.QuxiaoshenqingVO;
import com.entity.view.QuxiaoshenqingView;

@Service("quxiaoshenqingService")
public class QuxiaoshenqingServiceImpl extends ServiceImpl<QuxiaoshenqingDao, QuxiaoshenqingEntity> implements QuxiaoshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaoshenqingEntity> page = this.selectPage(
                new Query<QuxiaoshenqingEntity>(params).getPage(),
                new EntityWrapper<QuxiaoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaoshenqingEntity> wrapper) {
		  Page<QuxiaoshenqingView> page =new Query<QuxiaoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaoshenqingVO> selectListVO(Wrapper<QuxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaoshenqingVO selectVO(Wrapper<QuxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaoshenqingView> selectListView(Wrapper<QuxiaoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaoshenqingView selectView(Wrapper<QuxiaoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
