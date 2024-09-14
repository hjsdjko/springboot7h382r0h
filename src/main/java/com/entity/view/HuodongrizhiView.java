package com.entity.view;

import com.entity.HuodongrizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 活动日志
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@TableName("huodongrizhi")
public class HuodongrizhiView  extends HuodongrizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodongrizhiView(){
	}
 
 	public HuodongrizhiView(HuodongrizhiEntity huodongrizhiEntity){
 	try {
			BeanUtils.copyProperties(this, huodongrizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
