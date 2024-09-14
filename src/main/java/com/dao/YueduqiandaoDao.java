package com.dao;

import com.entity.YueduqiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YueduqiandaoVO;
import com.entity.view.YueduqiandaoView;


/**
 * 阅读签到
 * 
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface YueduqiandaoDao extends BaseMapper<YueduqiandaoEntity> {
	
	List<YueduqiandaoVO> selectListVO(@Param("ew") Wrapper<YueduqiandaoEntity> wrapper);
	
	YueduqiandaoVO selectVO(@Param("ew") Wrapper<YueduqiandaoEntity> wrapper);
	
	List<YueduqiandaoView> selectListView(@Param("ew") Wrapper<YueduqiandaoEntity> wrapper);

	List<YueduqiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<YueduqiandaoEntity> wrapper);
	
	YueduqiandaoView selectView(@Param("ew") Wrapper<YueduqiandaoEntity> wrapper);
	

}