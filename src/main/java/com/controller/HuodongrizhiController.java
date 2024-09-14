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

import com.entity.HuodongrizhiEntity;
import com.entity.view.HuodongrizhiView;

import com.service.HuodongrizhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 活动日志
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@RestController
@RequestMapping("/huodongrizhi")
public class HuodongrizhiController {
    @Autowired
    private HuodongrizhiService huodongrizhiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuodongrizhiEntity huodongrizhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huodongzuzhizhe")) {
			huodongrizhi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiazhang")) {
			huodongrizhi.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuodongrizhiEntity> ew = new EntityWrapper<HuodongrizhiEntity>();

		PageUtils page = huodongrizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongrizhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuodongrizhiEntity huodongrizhi, 
		HttpServletRequest request){
        EntityWrapper<HuodongrizhiEntity> ew = new EntityWrapper<HuodongrizhiEntity>();

		PageUtils page = huodongrizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongrizhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuodongrizhiEntity huodongrizhi){
       	EntityWrapper<HuodongrizhiEntity> ew = new EntityWrapper<HuodongrizhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huodongrizhi, "huodongrizhi")); 
        return R.ok().put("data", huodongrizhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuodongrizhiEntity huodongrizhi){
        EntityWrapper< HuodongrizhiEntity> ew = new EntityWrapper< HuodongrizhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huodongrizhi, "huodongrizhi")); 
		HuodongrizhiView huodongrizhiView =  huodongrizhiService.selectView(ew);
		return R.ok("查询活动日志成功").put("data", huodongrizhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuodongrizhiEntity huodongrizhi = huodongrizhiService.selectById(id);
        return R.ok().put("data", huodongrizhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuodongrizhiEntity huodongrizhi = huodongrizhiService.selectById(id);
        return R.ok().put("data", huodongrizhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongrizhiEntity huodongrizhi, HttpServletRequest request){
    	huodongrizhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongrizhi);
        huodongrizhiService.insert(huodongrizhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongrizhiEntity huodongrizhi, HttpServletRequest request){
    	huodongrizhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongrizhi);
        huodongrizhiService.insert(huodongrizhi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuodongrizhiEntity huodongrizhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huodongrizhi);
        huodongrizhiService.updateById(huodongrizhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huodongrizhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
