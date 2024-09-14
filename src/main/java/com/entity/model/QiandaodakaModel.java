package com.entity.model;

import com.entity.QiandaodakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 签到打卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public class QiandaodakaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 签到日期
	 */
	
	private String qiandaoriqi;
		
	/**
	 * 签到时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandaoshijian;
		
	/**
	 * 家长账号
	 */
	
	private String jiazhangzhanghao;
		
	/**
	 * 家长姓名
	 */
	
	private String jiazhangxingming;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 学生性别
	 */
	
	private String xueshengxingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 年级
	 */
	
	private String nianji;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
				
	
	/**
	 * 设置：签到日期
	 */
	 
	public void setQiandaoriqi(String qiandaoriqi) {
		this.qiandaoriqi = qiandaoriqi;
	}
	
	/**
	 * 获取：签到日期
	 */
	public String getQiandaoriqi() {
		return qiandaoriqi;
	}
				
	
	/**
	 * 设置：签到时间
	 */
	 
	public void setQiandaoshijian(Date qiandaoshijian) {
		this.qiandaoshijian = qiandaoshijian;
	}
	
	/**
	 * 获取：签到时间
	 */
	public Date getQiandaoshijian() {
		return qiandaoshijian;
	}
				
	
	/**
	 * 设置：家长账号
	 */
	 
	public void setJiazhangzhanghao(String jiazhangzhanghao) {
		this.jiazhangzhanghao = jiazhangzhanghao;
	}
	
	/**
	 * 获取：家长账号
	 */
	public String getJiazhangzhanghao() {
		return jiazhangzhanghao;
	}
				
	
	/**
	 * 设置：家长姓名
	 */
	 
	public void setJiazhangxingming(String jiazhangxingming) {
		this.jiazhangxingming = jiazhangxingming;
	}
	
	/**
	 * 获取：家长姓名
	 */
	public String getJiazhangxingming() {
		return jiazhangxingming;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：学生性别
	 */
	 
	public void setXueshengxingbie(String xueshengxingbie) {
		this.xueshengxingbie = xueshengxingbie;
	}
	
	/**
	 * 获取：学生性别
	 */
	public String getXueshengxingbie() {
		return xueshengxingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：年级
	 */
	 
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	
	/**
	 * 获取：年级
	 */
	public String getNianji() {
		return nianji;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
			
}
