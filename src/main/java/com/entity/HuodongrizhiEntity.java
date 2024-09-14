package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 活动日志
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@TableName("huodongrizhi")
public class HuodongrizhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuodongrizhiEntity() {
		
	}
	
	public HuodongrizhiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 活动编号
	 */
					
	private String huodongbianhao;
	
	/**
	 * 活动名称
	 */
					
	private String huodongmingcheng;
	
	/**
	 * 活动图片
	 */
					
	private String huodongtupian;
	
	/**
	 * 活动经历
	 */
					
	private String huodongjingli;
	
	/**
	 * 活动地点
	 */
					
	private String huodongdidian;
	
	/**
	 * 记录时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jilushijian;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：活动编号
	 */
	public void setHuodongbianhao(String huodongbianhao) {
		this.huodongbianhao = huodongbianhao;
	}
	/**
	 * 获取：活动编号
	 */
	public String getHuodongbianhao() {
		return huodongbianhao;
	}
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
	 * 设置：活动图片
	 */
	public void setHuodongtupian(String huodongtupian) {
		this.huodongtupian = huodongtupian;
	}
	/**
	 * 获取：活动图片
	 */
	public String getHuodongtupian() {
		return huodongtupian;
	}
	/**
	 * 设置：活动经历
	 */
	public void setHuodongjingli(String huodongjingli) {
		this.huodongjingli = huodongjingli;
	}
	/**
	 * 获取：活动经历
	 */
	public String getHuodongjingli() {
		return huodongjingli;
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
	 * 设置：记录时间
	 */
	public void setJilushijian(Date jilushijian) {
		this.jilushijian = jilushijian;
	}
	/**
	 * 获取：记录时间
	 */
	public Date getJilushijian() {
		return jilushijian;
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

}
