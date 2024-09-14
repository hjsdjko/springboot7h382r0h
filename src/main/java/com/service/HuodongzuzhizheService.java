package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongzuzhizheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongzuzhizheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongzuzhizheView;


/**
 * 活动组织者
 *
 * @author 
 * @email 
 * @date 2023-10-31 12:06:25
 */
public interface HuodongzuzhizheService extends IService<HuodongzuzhizheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongzuzhizheVO> selectListVO(Wrapper<HuodongzuzhizheEntity> wrapper);
   	
   	HuodongzuzhizheVO selectVO(@Param("ew") Wrapper<HuodongzuzhizheEntity> wrapper);
   	
   	List<HuodongzuzhizheView> selectListView(Wrapper<HuodongzuzhizheEntity> wrapper);
   	
   	HuodongzuzhizheView selectView(@Param("ew") Wrapper<HuodongzuzhizheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongzuzhizheEntity> wrapper);
   	

}

