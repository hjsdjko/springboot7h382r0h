package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DushuhuihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DushuhuihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DushuhuihuodongView;


/**
 * 读书会活动
 *
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface DushuhuihuodongService extends IService<DushuhuihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DushuhuihuodongVO> selectListVO(Wrapper<DushuhuihuodongEntity> wrapper);
   	
   	DushuhuihuodongVO selectVO(@Param("ew") Wrapper<DushuhuihuodongEntity> wrapper);
   	
   	List<DushuhuihuodongView> selectListView(Wrapper<DushuhuihuodongEntity> wrapper);
   	
   	DushuhuihuodongView selectView(@Param("ew") Wrapper<DushuhuihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DushuhuihuodongEntity> wrapper);
   	

}

