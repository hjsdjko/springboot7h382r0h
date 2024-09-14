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

import com.entity.ChaptershujiEntity;
import com.entity.view.ChaptershujiView;

import com.service.ChaptershujiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 书籍章节表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@RestController
@RequestMapping("/chaptershuji")
public class ChaptershujiController {
    @Autowired
    private ChaptershujiService chaptershujiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChaptershujiEntity chaptershuji,
		HttpServletRequest request){
        EntityWrapper<ChaptershujiEntity> ew = new EntityWrapper<ChaptershujiEntity>();

		PageUtils page = chaptershujiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chaptershuji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChaptershujiEntity chaptershuji, 
		HttpServletRequest request){
        EntityWrapper<ChaptershujiEntity> ew = new EntityWrapper<ChaptershujiEntity>();

		PageUtils page = chaptershujiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chaptershuji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChaptershujiEntity chaptershuji){
       	EntityWrapper<ChaptershujiEntity> ew = new EntityWrapper<ChaptershujiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chaptershuji, "chaptershuji")); 
        return R.ok().put("data", chaptershujiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChaptershujiEntity chaptershuji){
        EntityWrapper< ChaptershujiEntity> ew = new EntityWrapper< ChaptershujiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chaptershuji, "chaptershuji")); 
		ChaptershujiView chaptershujiView =  chaptershujiService.selectView(ew);
		return R.ok("查询书籍章节表成功").put("data", chaptershujiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChaptershujiEntity chaptershuji = chaptershujiService.selectById(id);
        return R.ok().put("data", chaptershuji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChaptershujiEntity chaptershuji = chaptershujiService.selectById(id);
        return R.ok().put("data", chaptershuji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChaptershujiEntity chaptershuji, HttpServletRequest request){
    	chaptershuji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chaptershuji);
        chaptershujiService.insert(chaptershuji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChaptershujiEntity chaptershuji, HttpServletRequest request){
    	chaptershuji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chaptershuji);
        chaptershujiService.insert(chaptershuji);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChaptershujiEntity chaptershuji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chaptershuji);
        chaptershujiService.updateById(chaptershuji);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chaptershujiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
