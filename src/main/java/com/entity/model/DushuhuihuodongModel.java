package com.entity.model;

import com.entity.DushuhuihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 读书会活动
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
public class DushuhuihuodongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动名称
	 */
	
	private String huodongmingcheng;
		
	/**
	 * 活动封面
	 */
	
	private String huodongfengmian;
		
	/**
	 * 活动时间
	 */
	
	private String huodongshijian;
		
	/**
	 * 活动备注
	 */
	
	private String huodongbeizhu;
		
	/**
	 * 活动地点
	 */
	
	private String huodongdidian;
		
	/**
	 * 截止日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhiriqi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
				
	
	/**
	 * 设置：活动名称
	 */
	 
	public void setHuodongmingcheng(String huodongmingcheng) {
		this.huodongmingcheng = huodongmingcheng;
	}
	
	/**
	 * 获取：活动名称
	 */
	public String getHuodongmingcheng() {
		return huodongmingcheng;
	}
				
	
	/**
	 * 设置：活动封面
	 */
	 
	public void setHuodongfengmian(String huodongfengmian) {
		this.huodongfengmian = huodongfengmian;
	}
	
	/**
	 * 获取：活动封面
	 */
	public String getHuodongfengmian() {
		return huodongfengmian;
	}
				
	
	/**
	 * 设置：活动时间
	 */
	 
	public void setHuodongshijian(String huodongshijian) {
		this.huodongshijian = huodongshijian;
	}
	
	/**
	 * 获取：活动时间
	 */
	public String getHuodongshijian() {
		return huodongshijian;
	}
				
	
	/**
	 * 设置：活动备注
	 */
	 
	public void setHuodongbeizhu(String huodongbeizhu) {
		this.huodongbeizhu = huodongbeizhu;
	}
	
	/**
	 * 获取：活动备注
	 */
	public String getHuodongbeizhu() {
		return huodongbeizhu;
	}
				
	
	/**
	 * 设置：活动地点
	 */
	 
	public void setHuodongdidian(String huodongdidian) {
		this.huodongdidian = huodongdidian;
	}
	
	/**
	 * 获取：活动地点
	 */
	public String getHuodongdidian() {
		return huodongdidian;
	}
				
	
	/**
	 * 设置：截止日期
	 */
	 
	public void setJiezhiriqi(Date jiezhiriqi) {
		this.jiezhiriqi = jiezhiriqi;
	}
	
	/**
	 * 获取：截止日期
	 */
	public Date getJiezhiriqi() {
		return jiezhiriqi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
			
}
