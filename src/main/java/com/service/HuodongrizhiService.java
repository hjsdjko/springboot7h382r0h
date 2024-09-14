package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongrizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongrizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongrizhiView;


/**
 * 活动日志
 *
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface HuodongrizhiService extends IService<HuodongrizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongrizhiVO> selectListVO(Wrapper<HuodongrizhiEntity> wrapper);
   	
   	HuodongrizhiVO selectVO(@Param("ew") Wrapper<HuodongrizhiEntity> wrapper);
   	
   	List<HuodongrizhiView> selectListView(Wrapper<HuodongrizhiEntity> wrapper);
   	
   	HuodongrizhiView selectView(@Param("ew") Wrapper<HuodongrizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongrizhiEntity> wrapper);
   	

}

