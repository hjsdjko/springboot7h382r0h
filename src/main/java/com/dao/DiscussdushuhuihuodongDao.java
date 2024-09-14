package com.dao;

import com.entity.DiscussdushuhuihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdushuhuihuodongVO;
import com.entity.view.DiscussdushuhuihuodongView;


/**
 * 读书会活动评论表
 * 
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface DiscussdushuhuihuodongDao extends BaseMapper<DiscussdushuhuihuodongEntity> {
	
	List<DiscussdushuhuihuodongVO> selectListVO(@Param("ew") Wrapper<DiscussdushuhuihuodongEntity> wrapper);
	
	DiscussdushuhuihuodongVO selectVO(@Param("ew") Wrapper<DiscussdushuhuihuodongEntity> wrapper);
	
	List<DiscussdushuhuihuodongView> selectListView(@Param("ew") Wrapper<DiscussdushuhuihuodongEntity> wrapper);

	List<DiscussdushuhuihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdushuhuihuodongEntity> wrapper);
	
	DiscussdushuhuihuodongView selectView(@Param("ew") Wrapper<DiscussdushuhuihuodongEntity> wrapper);
	

}
