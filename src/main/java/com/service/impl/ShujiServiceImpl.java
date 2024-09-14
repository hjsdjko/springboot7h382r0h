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


import com.dao.ShujiDao;
import com.entity.ShujiEntity;
import com.service.ShujiService;
import com.entity.vo.ShujiVO;
import com.entity.view.ShujiView;

@Service("shujiService")
public class ShujiServiceImpl extends ServiceImpl<ShujiDao, ShujiEntity> implements ShujiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujiEntity> page = this.selectPage(
                new Query<ShujiEntity>(params).getPage(),
                new EntityWrapper<ShujiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujiEntity> wrapper) {
		  Page<ShujiView> page =new Query<ShujiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShujiVO> selectListVO(Wrapper<ShujiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujiVO selectVO(Wrapper<ShujiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujiView> selectListView(Wrapper<ShujiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujiView selectView(Wrapper<ShujiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
