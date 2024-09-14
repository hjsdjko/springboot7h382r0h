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

import com.entity.HuodongshenqingEntity;
import com.entity.view.HuodongshenqingView;

import com.service.HuodongshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 活动申请
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@RestController
@RequestMapping("/huodongshenqing")
public class HuodongshenqingController {
    @Autowired
    private HuodongshenqingService huodongshenqingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuodongshenqingEntity huodongshenqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huodongzuzhizhe")) {
			huodongshenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiazhang")) {
			huodongshenqing.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuodongshenqingEntity> ew = new EntityWrapper<HuodongshenqingEntity>();

		PageUtils page = huodongshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongshenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuodongshenqingEntity huodongshenqing, 
		HttpServletRequest request){
        EntityWrapper<HuodongshenqingEntity> ew = new EntityWrapper<HuodongshenqingEntity>();

		PageUtils page = huodongshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuodongshenqingEntity huodongshenqing){
       	EntityWrapper<HuodongshenqingEntity> ew = new EntityWrapper<HuodongshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huodongshenqing, "huodongshenqing")); 
        return R.ok().put("data", huodongshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuodongshenqingEntity huodongshenqing){
        EntityWrapper< HuodongshenqingEntity> ew = new EntityWrapper< HuodongshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huodongshenqing, "huodongshenqing")); 
		HuodongshenqingView huodongshenqingView =  huodongshenqingService.selectView(ew);
		return R.ok("查询活动申请成功").put("data", huodongshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuodongshenqingEntity huodongshenqing = huodongshenqingService.selectById(id);
        return R.ok().put("data", huodongshenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuodongshenqingEntity huodongshenqing = huodongshenqingService.selectById(id);
        return R.ok().put("data", huodongshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongshenqingEntity huodongshenqing, HttpServletRequest request){
    	huodongshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongshenqing);
        huodongshenqingService.insert(huodongshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongshenqingEntity huodongshenqing, HttpServletRequest request){
    	huodongshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongshenqing);
        huodongshenqingService.insert(huodongshenqing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuodongshenqingEntity huodongshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huodongshenqing);
        huodongshenqingService.updateById(huodongshenqing);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<HuodongshenqingEntity> list = new ArrayList<HuodongshenqingEntity>();
        for(Long id : ids) {
            HuodongshenqingEntity huodongshenqing = huodongshenqingService.selectById(id);
            huodongshenqing.setSfsh(sfsh);
            huodongshenqing.setShhf(shhf);
            list.add(huodongshenqing);
        }
        huodongshenqingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huodongshenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
