package com.entity.view;

import com.entity.QuxiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 取消申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@TableName("quxiaoshenqing")
public class QuxiaoshenqingView  extends QuxiaoshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaoshenqingView(){
	}
 
 	public QuxiaoshenqingView(QuxiaoshenqingEntity quxiaoshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaoshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
