package com.dao;

import com.entity.QuxiaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaoshenqingVO;
import com.entity.view.QuxiaoshenqingView;


/**
 * 取消申请
 * 
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface QuxiaoshenqingDao extends BaseMapper<QuxiaoshenqingEntity> {
	
	List<QuxiaoshenqingVO> selectListVO(@Param("ew") Wrapper<QuxiaoshenqingEntity> wrapper);
	
	QuxiaoshenqingVO selectVO(@Param("ew") Wrapper<QuxiaoshenqingEntity> wrapper);
	
	List<QuxiaoshenqingView> selectListView(@Param("ew") Wrapper<QuxiaoshenqingEntity> wrapper);

	List<QuxiaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaoshenqingEntity> wrapper);
	
	QuxiaoshenqingView selectView(@Param("ew") Wrapper<QuxiaoshenqingEntity> wrapper);
	

}
