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


import com.dao.DushuhuihuodongDao;
import com.entity.DushuhuihuodongEntity;
import com.service.DushuhuihuodongService;
import com.entity.vo.DushuhuihuodongVO;
import com.entity.view.DushuhuihuodongView;

@Service("dushuhuihuodongService")
public class DushuhuihuodongServiceImpl extends ServiceImpl<DushuhuihuodongDao, DushuhuihuodongEntity> implements DushuhuihuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DushuhuihuodongEntity> page = this.selectPage(
                new Query<DushuhuihuodongEntity>(params).getPage(),
                new EntityWrapper<DushuhuihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DushuhuihuodongEntity> wrapper) {
		  Page<DushuhuihuodongView> page =new Query<DushuhuihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DushuhuihuodongVO> selectListVO(Wrapper<DushuhuihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DushuhuihuodongVO selectVO(Wrapper<DushuhuihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DushuhuihuodongView> selectListView(Wrapper<DushuhuihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DushuhuihuodongView selectView(Wrapper<DushuhuihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
