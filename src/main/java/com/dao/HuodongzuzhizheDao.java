package com.dao;

import com.entity.HuodongzuzhizheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongzuzhizheVO;
import com.entity.view.HuodongzuzhizheView;


/**
 * 活动组织者
 * 
 * @author 
 * @email 
 * @date 2023-10-31 12:06:25
 */
public interface HuodongzuzhizheDao extends BaseMapper<HuodongzuzhizheEntity> {
	
	List<HuodongzuzhizheVO> selectListVO(@Param("ew") Wrapper<HuodongzuzhizheEntity> wrapper);
	
	HuodongzuzhizheVO selectVO(@Param("ew") Wrapper<HuodongzuzhizheEntity> wrapper);
	
	List<HuodongzuzhizheView> selectListView(@Param("ew") Wrapper<HuodongzuzhizheEntity> wrapper);

	List<HuodongzuzhizheView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongzuzhizheEntity> wrapper);
	
	HuodongzuzhizheView selectView(@Param("ew") Wrapper<HuodongzuzhizheEntity> wrapper);
	

}
