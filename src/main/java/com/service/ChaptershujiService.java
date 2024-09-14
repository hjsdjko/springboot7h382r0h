package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChaptershujiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChaptershujiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChaptershujiView;


/**
 * 书籍章节表
 *
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public interface ChaptershujiService extends IService<ChaptershujiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChaptershujiVO> selectListVO(Wrapper<ChaptershujiEntity> wrapper);
   	
   	ChaptershujiVO selectVO(@Param("ew") Wrapper<ChaptershujiEntity> wrapper);
   	
   	List<ChaptershujiView> selectListView(Wrapper<ChaptershujiEntity> wrapper);
   	
   	ChaptershujiView selectView(@Param("ew") Wrapper<ChaptershujiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChaptershujiEntity> wrapper);
   	

}

