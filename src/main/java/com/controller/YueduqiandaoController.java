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

import com.entity.YueduqiandaoEntity;
import com.entity.view.YueduqiandaoView;

import com.service.YueduqiandaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 阅读签到
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@RestController
@RequestMapping("/yueduqiandao")
public class YueduqiandaoController {
    @Autowired
    private YueduqiandaoService yueduqiandaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YueduqiandaoEntity yueduqiandao,
		HttpServletRequest request){
        EntityWrapper<YueduqiandaoEntity> ew = new EntityWrapper<YueduqiandaoEntity>();

		PageUtils page = yueduqiandaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yueduqiandao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YueduqiandaoEntity yueduqiandao, 
		HttpServletRequest request){
        EntityWrapper<YueduqiandaoEntity> ew = new EntityWrapper<YueduqiandaoEntity>();

		PageUtils page = yueduqiandaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yueduqiandao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YueduqiandaoEntity yueduqiandao){
       	EntityWrapper<YueduqiandaoEntity> ew = new EntityWrapper<YueduqiandaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yueduqiandao, "yueduqiandao")); 
        return R.ok().put("data", yueduqiandaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YueduqiandaoEntity yueduqiandao){
        EntityWrapper< YueduqiandaoEntity> ew = new EntityWrapper< YueduqiandaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yueduqiandao, "yueduqiandao")); 
		YueduqiandaoView yueduqiandaoView =  yueduqiandaoService.selectView(ew);
		return R.ok("查询阅读签到成功").put("data", yueduqiandaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YueduqiandaoEntity yueduqiandao = yueduqiandaoService.selectById(id);
        return R.ok().put("data", yueduqiandao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YueduqiandaoEntity yueduqiandao = yueduqiandaoService.selectById(id);
        return R.ok().put("data", yueduqiandao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YueduqiandaoEntity yueduqiandao, HttpServletRequest request){
    	yueduqiandao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yueduqiandao);
        yueduqiandaoService.insert(yueduqiandao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YueduqiandaoEntity yueduqiandao, HttpServletRequest request){
    	yueduqiandao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yueduqiandao);
        yueduqiandaoService.insert(yueduqiandao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YueduqiandaoEntity yueduqiandao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yueduqiandao);
        yueduqiandaoService.updateById(yueduqiandao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yueduqiandaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
