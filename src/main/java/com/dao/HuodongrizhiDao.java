package com.dao;

import com.entity.HuodongrizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongrizhiVO;
import com.entity.view.HuodongrizhiView;


/**
 * 活动日志
 * 
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface HuodongrizhiDao extends BaseMapper<HuodongrizhiEntity> {
	
	List<HuodongrizhiVO> selectListVO(@Param("ew") Wrapper<HuodongrizhiEntity> wrapper);
	
	HuodongrizhiVO selectVO(@Param("ew") Wrapper<HuodongrizhiEntity> wrapper);
	
	List<HuodongrizhiView> selectListView(@Param("ew") Wrapper<HuodongrizhiEntity> wrapper);

	List<HuodongrizhiView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongrizhiEntity> wrapper);
	
	HuodongrizhiView selectView(@Param("ew") Wrapper<HuodongrizhiEntity> wrapper);
	

}
