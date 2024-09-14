package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaoshenqingView;


/**
 * 取消申请
 *
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface QuxiaoshenqingService extends IService<QuxiaoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaoshenqingVO> selectListVO(Wrapper<QuxiaoshenqingEntity> wrapper);
   	
   	QuxiaoshenqingVO selectVO(@Param("ew") Wrapper<QuxiaoshenqingEntity> wrapper);
   	
   	List<QuxiaoshenqingView> selectListView(Wrapper<QuxiaoshenqingEntity> wrapper);
   	
   	QuxiaoshenqingView selectView(@Param("ew") Wrapper<QuxiaoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaoshenqingEntity> wrapper);
   	

}

