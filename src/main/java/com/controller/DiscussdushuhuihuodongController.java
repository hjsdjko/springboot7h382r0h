package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussdushuhuihuodongEntity;
import com.entity.view.DiscussdushuhuihuodongView;

import com.service.DiscussdushuhuihuodongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 读书会活动评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@RestController
@RequestMapping("/discussdushuhuihuodong")
public class DiscussdushuhuihuodongController {
    @Autowired
    private DiscussdushuhuihuodongService discussdushuhuihuodongService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussdushuhuihuodongEntity discussdushuhuihuodong,
		HttpServletRequest request){
        EntityWrapper<DiscussdushuhuihuodongEntity> ew = new EntityWrapper<DiscussdushuhuihuodongEntity>();

		PageUtils page = discussdushuhuihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussdushuhuihuodong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussdushuhuihuodongEntity discussdushuhuihuodong, 
		HttpServletRequest request){
        EntityWrapper<DiscussdushuhuihuodongEntity> ew = new EntityWrapper<DiscussdushuhuihuodongEntity>();

		PageUtils page = discussdushuhuihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussdushuhuihuodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussdushuhuihuodongEntity discussdushuhuihuodong){
       	EntityWrapper<DiscussdushuhuihuodongEntity> ew = new EntityWrapper<DiscussdushuhuihuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussdushuhuihuodong, "discussdushuhuihuodong")); 
        return R.ok().put("data", discussdushuhuihuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussdushuhuihuodongEntity discussdushuhuihuodong){
        EntityWrapper< DiscussdushuhuihuodongEntity> ew = new EntityWrapper< DiscussdushuhuihuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussdushuhuihuodong, "discussdushuhuihuodong")); 
		DiscussdushuhuihuodongView discussdushuhuihuodongView =  discussdushuhuihuodongService.selectView(ew);
		return R.ok("查询读书会活动评论表成功").put("data", discussdushuhuihuodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussdushuhuihuodongEntity discussdushuhuihuodong = discussdushuhuihuodongService.selectById(id);
        return R.ok().put("data", discussdushuhuihuodong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussdushuhuihuodongEntity discussdushuhuihuodong = discussdushuhuihuodongService.selectById(id);
        return R.ok().put("data", discussdushuhuihuodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussdushuhuihuodongEntity discussdushuhuihuodong, HttpServletRequest request){
    	discussdushuhuihuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussdushuhuihuodong);
        discussdushuhuihuodongService.insert(discussdushuhuihuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussdushuhuihuodongEntity discussdushuhuihuodong, HttpServletRequest request){
    	discussdushuhuihuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussdushuhuihuodong);
        discussdushuhuihuodongService.insert(discussdushuhuihuodong);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussdushuhuihuodongEntity discussdushuhuihuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussdushuhuihuodong);
        discussdushuhuihuodongService.updateById(discussdushuhuihuodong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussdushuhuihuodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
