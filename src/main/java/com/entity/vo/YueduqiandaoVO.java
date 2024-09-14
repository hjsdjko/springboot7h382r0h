package com.entity.vo;

import com.entity.YueduqiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 阅读签到
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public class YueduqiandaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 签到日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandaoriqi;
		
	/**
	 * 签到备注
	 */
	
	private String qiandaobeizhu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：签到日期
	 */
	 
	public void setQiandaoriqi(Date qiandaoriqi) {
		this.qiandaoriqi = qiandaoriqi;
	}
	
	/**
	 * 获取：签到日期
	 */
	public Date getQiandaoriqi() {
		return qiandaoriqi;
	}
				
	
	/**
	 * 设置：签到备注
	 */
	 
	public void setQiandaobeizhu(String qiandaobeizhu) {
		this.qiandaobeizhu = qiandaobeizhu;
	}
	
	/**
	 * 获取：签到备注
	 */
	public String getQiandaobeizhu() {
		return qiandaobeizhu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
