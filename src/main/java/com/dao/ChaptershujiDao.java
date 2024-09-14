package com.dao;

import com.entity.ChaptershujiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChaptershujiVO;
import com.entity.view.ChaptershujiView;


/**
 * 书籍章节表
 * 
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface ChaptershujiDao extends BaseMapper<ChaptershujiEntity> {
	
	List<ChaptershujiVO> selectListVO(@Param("ew") Wrapper<ChaptershujiEntity> wrapper);
	
	ChaptershujiVO selectVO(@Param("ew") Wrapper<ChaptershujiEntity> wrapper);
	
	List<ChaptershujiView> selectListView(@Param("ew") Wrapper<ChaptershujiEntity> wrapper);

	List<ChaptershujiView> selectListView(Pagination page,@Param("ew") Wrapper<ChaptershujiEntity> wrapper);
	
	ChaptershujiView selectView(@Param("ew") Wrapper<ChaptershujiEntity> wrapper);
	

}
