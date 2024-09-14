package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdushuhuihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdushuhuihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdushuhuihuodongView;


/**
 * 读书会活动评论表
 *
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface DiscussdushuhuihuodongService extends IService<DiscussdushuhuihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdushuhuihuodongVO> selectListVO(Wrapper<DiscussdushuhuihuodongEntity> wrapper);
   	
   	DiscussdushuhuihuodongVO selectVO(@Param("ew") Wrapper<DiscussdushuhuihuodongEntity> wrapper);
   	
   	List<DiscussdushuhuihuodongView> selectListView(Wrapper<DiscussdushuhuihuodongEntity> wrapper);
   	
   	DiscussdushuhuihuodongView selectView(@Param("ew") Wrapper<DiscussdushuhuihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdushuhuihuodongEntity> wrapper);
   	

}

