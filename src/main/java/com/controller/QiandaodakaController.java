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

import com.entity.QiandaodakaEntity;
import com.entity.view.QiandaodakaView;

import com.service.QiandaodakaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 签到打卡
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@RestController
@RequestMapping("/qiandaodaka")
public class QiandaodakaController {
    @Autowired
    private QiandaodakaService qiandaodakaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiandaodakaEntity qiandaodaka,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhang")) {
			qiandaodaka.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QiandaodakaEntity> ew = new EntityWrapper<QiandaodakaEntity>();

		PageUtils page = qiandaodakaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiandaodaka), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiandaodakaEntity qiandaodaka, 
		HttpServletRequest request){
        EntityWrapper<QiandaodakaEntity> ew = new EntityWrapper<QiandaodakaEntity>();

		PageUtils page = qiandaodakaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiandaodaka), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiandaodakaEntity qiandaodaka){
       	EntityWrapper<QiandaodakaEntity> ew = new EntityWrapper<QiandaodakaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiandaodaka, "qiandaodaka")); 
        return R.ok().put("data", qiandaodakaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiandaodakaEntity qiandaodaka){
        EntityWrapper< QiandaodakaEntity> ew = new EntityWrapper< QiandaodakaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiandaodaka, "qiandaodaka")); 
		QiandaodakaView qiandaodakaView =  qiandaodakaService.selectView(ew);
		return R.ok("查询签到打卡成功").put("data", qiandaodakaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiandaodakaEntity qiandaodaka = qiandaodakaService.selectById(id);
        return R.ok().put("data", qiandaodaka);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiandaodakaEntity qiandaodaka = qiandaodakaService.selectById(id);
        return R.ok().put("data", qiandaodaka);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiandaodakaEntity qiandaodaka, HttpServletRequest request){
    	qiandaodaka.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiandaodaka);
        qiandaodakaService.insert(qiandaodaka);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiandaodakaEntity qiandaodaka, HttpServletRequest request){
    	qiandaodaka.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiandaodaka);
        qiandaodakaService.insert(qiandaodaka);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QiandaodakaEntity qiandaodaka, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiandaodaka);
        qiandaodakaService.updateById(qiandaodaka);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiandaodakaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
