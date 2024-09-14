package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujiView;


/**
 * 书籍
 *
 * @author 
 * @email 
 * @date 2023-10-31 12:06:25
 */
public interface ShujiService extends IService<ShujiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujiVO> selectListVO(Wrapper<ShujiEntity> wrapper);
   	
   	ShujiVO selectVO(@Param("ew") Wrapper<ShujiEntity> wrapper);
   	
   	List<ShujiView> selectListView(Wrapper<ShujiEntity> wrapper);
   	
   	ShujiView selectView(@Param("ew") Wrapper<ShujiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujiEntity> wrapper);
   	

}

