package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YueduqiandaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YueduqiandaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YueduqiandaoView;


/**
 * 阅读签到
 *
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface YueduqiandaoService extends IService<YueduqiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YueduqiandaoVO> selectListVO(Wrapper<YueduqiandaoEntity> wrapper);
   	
   	YueduqiandaoVO selectVO(@Param("ew") Wrapper<YueduqiandaoEntity> wrapper);
   	
   	List<YueduqiandaoView> selectListView(Wrapper<YueduqiandaoEntity> wrapper);
   	
   	YueduqiandaoView selectView(@Param("ew") Wrapper<YueduqiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YueduqiandaoEntity> wrapper);
   	

}

