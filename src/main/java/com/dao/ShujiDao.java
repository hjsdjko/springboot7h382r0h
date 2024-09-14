package com.dao;

import com.entity.ShujiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShujiVO;
import com.entity.view.ShujiView;


/**
 * 书籍
 * 
 * @author 
 * @email 
 * @date 2023-10-31 12:06:25
 */
public interface ShujiDao extends BaseMapper<ShujiEntity> {
	
	List<ShujiVO> selectListVO(@Param("ew") Wrapper<ShujiEntity> wrapper);
	
	ShujiVO selectVO(@Param("ew") Wrapper<ShujiEntity> wrapper);
	
	List<ShujiView> selectListView(@Param("ew") Wrapper<ShujiEntity> wrapper);

	List<ShujiView> selectListView(Pagination page,@Param("ew") Wrapper<ShujiEntity> wrapper);
	
	ShujiView selectView(@Param("ew") Wrapper<ShujiEntity> wrapper);
	

}
