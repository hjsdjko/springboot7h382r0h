package com.dao;

import com.entity.DushuhuihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DushuhuihuodongVO;
import com.entity.view.DushuhuihuodongView;


/**
 * 读书会活动
 * 
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface DushuhuihuodongDao extends BaseMapper<DushuhuihuodongEntity> {
	
	List<DushuhuihuodongVO> selectListVO(@Param("ew") Wrapper<DushuhuihuodongEntity> wrapper);
	
	DushuhuihuodongVO selectVO(@Param("ew") Wrapper<DushuhuihuodongEntity> wrapper);
	
	List<DushuhuihuodongView> selectListView(@Param("ew") Wrapper<DushuhuihuodongEntity> wrapper);

	List<DushuhuihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DushuhuihuodongEntity> wrapper);
	
	DushuhuihuodongView selectView(@Param("ew") Wrapper<DushuhuihuodongEntity> wrapper);
	

}
