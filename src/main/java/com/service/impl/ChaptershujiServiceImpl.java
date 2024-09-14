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


import com.dao.ChaptershujiDao;
import com.entity.ChaptershujiEntity;
import com.service.ChaptershujiService;
import com.entity.vo.ChaptershujiVO;
import com.entity.view.ChaptershujiView;

@Service("chaptershujiService")
public class ChaptershujiServiceImpl extends ServiceImpl<ChaptershujiDao, ChaptershujiEntity> implements ChaptershujiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChaptershujiEntity> page = this.selectPage(
                new Query<ChaptershujiEntity>(params).getPage(),
                new EntityWrapper<ChaptershujiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChaptershujiEntity> wrapper) {
		  Page<ChaptershujiView> page =new Query<ChaptershujiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChaptershujiVO> selectListVO(Wrapper<ChaptershujiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChaptershujiVO selectVO(Wrapper<ChaptershujiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChaptershujiView> selectListView(Wrapper<ChaptershujiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChaptershujiView selectView(Wrapper<ChaptershujiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
