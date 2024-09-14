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


import com.dao.YueduqiandaoDao;
import com.entity.YueduqiandaoEntity;
import com.service.YueduqiandaoService;
import com.entity.vo.YueduqiandaoVO;
import com.entity.view.YueduqiandaoView;

@Service("yueduqiandaoService")
public class YueduqiandaoServiceImpl extends ServiceImpl<YueduqiandaoDao, YueduqiandaoEntity> implements YueduqiandaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YueduqiandaoEntity> page = this.selectPage(
                new Query<YueduqiandaoEntity>(params).getPage(),
                new EntityWrapper<YueduqiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YueduqiandaoEntity> wrapper) {
		  Page<YueduqiandaoView> page =new Query<YueduqiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YueduqiandaoVO> selectListVO(Wrapper<YueduqiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YueduqiandaoVO selectVO(Wrapper<YueduqiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YueduqiandaoView> selectListView(Wrapper<YueduqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YueduqiandaoView selectView(Wrapper<YueduqiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
