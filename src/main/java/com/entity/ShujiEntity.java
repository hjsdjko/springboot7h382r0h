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
 * 书籍
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-10-31 12:06:25
 */
@TableName("shuji")
public class ShujiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShujiEntity() {
		
	}
	
	public ShujiEntity(T t) {
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
	 * 书籍编号
	 */
					
	private String shujibianhao;
	
	/**
	 * 书籍名称
	 */
					
	private String shujimingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 书籍类型
	 */
					
	private String shujileixing;
	
	/**
	 * 图书简介
	 */
					
	private String tushujianjie;
	
	/**
	 * 作者
	 */
					
	private String zuozhe;
	
	/**
	 * 出版时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chubanshijian;
	
	/**
	 * 出版社
	 */
					
	private String chubanshe;
	
	/**
	 * 上架日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangjiariqi;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：书籍编号
	 */
	public void setShujibianhao(String shujibianhao) {
		this.shujibianhao = shujibianhao;
	}
	/**
	 * 获取：书籍编号
	 */
	public String getShujibianhao() {
		return shujibianhao;
	}
	/**
	 * 设置：书籍名称
	 */
	public void setShujimingcheng(String shujimingcheng) {
		this.shujimingcheng = shujimingcheng;
	}
	/**
	 * 获取：书籍名称
	 */
	public String getShujimingcheng() {
		return shujimingcheng;
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
	/**
	 * 设置：书籍类型
	 */
	public void setShujileixing(String shujileixing) {
		this.shujileixing = shujileixing;
	}
	/**
	 * 获取：书籍类型
	 */
	public String getShujileixing() {
		return shujileixing;
	}
	/**
	 * 设置：图书简介
	 */
	public void setTushujianjie(String tushujianjie) {
		this.tushujianjie = tushujianjie;
	}
	/**
	 * 获取：图书简介
	 */
	public String getTushujianjie() {
		return tushujianjie;
	}
	/**
	 * 设置：作者
	 */
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
	/**
	 * 设置：出版时间
	 */
	public void setChubanshijian(Date chubanshijian) {
		this.chubanshijian = chubanshijian;
	}
	/**
	 * 获取：出版时间
	 */
	public Date getChubanshijian() {
		return chubanshijian;
	}
	/**
	 * 设置：出版社
	 */
	public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
	}
	/**
	 * 获取：出版社
	 */
	public String getChubanshe() {
		return chubanshe;
	}
	/**
	 * 设置：上架日期
	 */
	public void setShangjiariqi(Date shangjiariqi) {
		this.shangjiariqi = shangjiariqi;
	}
	/**
	 * 获取：上架日期
	 */
	public Date getShangjiariqi() {
		return shangjiariqi;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
