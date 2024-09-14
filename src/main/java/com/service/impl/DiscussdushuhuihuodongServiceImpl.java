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


import com.dao.DiscussdushuhuihuodongDao;
import com.entity.DiscussdushuhuihuodongEntity;
import com.service.DiscussdushuhuihuodongService;
import com.entity.vo.DiscussdushuhuihuodongVO;
import com.entity.view.DiscussdushuhuihuodongView;

@Service("discussdushuhuihuodongService")
public class DiscussdushuhuihuodongServiceImpl extends ServiceImpl<DiscussdushuhuihuodongDao, DiscussdushuhuihuodongEntity> implements DiscussdushuhuihuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdushuhuihuodongEntity> page = this.selectPage(
                new Query<DiscussdushuhuihuodongEntity>(params).getPage(),
                new EntityWrapper<DiscussdushuhuihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdushuhuihuodongEntity> wrapper) {
		  Page<DiscussdushuhuihuodongView> page =new Query<DiscussdushuhuihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdushuhuihuodongVO> selectListVO(Wrapper<DiscussdushuhuihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdushuhuihuodongVO selectVO(Wrapper<DiscussdushuhuihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdushuhuihuodongView> selectListView(Wrapper<DiscussdushuhuihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdushuhuihuodongView selectView(Wrapper<DiscussdushuhuihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
