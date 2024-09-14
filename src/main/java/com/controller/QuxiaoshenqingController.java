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

import com.entity.QuxiaoshenqingEntity;
import com.entity.view.QuxiaoshenqingView;

import com.service.QuxiaoshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 取消申请
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:26
 */
@RestController
@RequestMapping("/quxiaoshenqing")
public class QuxiaoshenqingController {
    @Autowired
    private QuxiaoshenqingService quxiaoshenqingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaoshenqingEntity quxiaoshenqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huodongzuzhizhe")) {
			quxiaoshenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiazhang")) {
			quxiaoshenqing.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuxiaoshenqingEntity> ew = new EntityWrapper<QuxiaoshenqingEntity>();

		PageUtils page = quxiaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaoshenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuxiaoshenqingEntity quxiaoshenqing, 
		HttpServletRequest request){
        EntityWrapper<QuxiaoshenqingEntity> ew = new EntityWrapper<QuxiaoshenqingEntity>();

		PageUtils page = quxiaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaoshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaoshenqingEntity quxiaoshenqing){
       	EntityWrapper<QuxiaoshenqingEntity> ew = new EntityWrapper<QuxiaoshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaoshenqing, "quxiaoshenqing")); 
        return R.ok().put("data", quxiaoshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaoshenqingEntity quxiaoshenqing){
        EntityWrapper< QuxiaoshenqingEntity> ew = new EntityWrapper< QuxiaoshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaoshenqing, "quxiaoshenqing")); 
		QuxiaoshenqingView quxiaoshenqingView =  quxiaoshenqingService.selectView(ew);
		return R.ok("查询取消申请成功").put("data", quxiaoshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaoshenqingEntity quxiaoshenqing = quxiaoshenqingService.selectById(id);
        return R.ok().put("data", quxiaoshenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaoshenqingEntity quxiaoshenqing = quxiaoshenqingService.selectById(id);
        return R.ok().put("data", quxiaoshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuxiaoshenqingEntity quxiaoshenqing, HttpServletRequest request){
    	quxiaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaoshenqing);
        quxiaoshenqingService.insert(quxiaoshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaoshenqingEntity quxiaoshenqing, HttpServletRequest request){
    	quxiaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaoshenqing);
        quxiaoshenqingService.insert(quxiaoshenqing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QuxiaoshenqingEntity quxiaoshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaoshenqing);
        quxiaoshenqingService.updateById(quxiaoshenqing);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<QuxiaoshenqingEntity> list = new ArrayList<QuxiaoshenqingEntity>();
        for(Long id : ids) {
            QuxiaoshenqingEntity quxiaoshenqing = quxiaoshenqingService.selectById(id);
            quxiaoshenqing.setSfsh(sfsh);
            quxiaoshenqing.setShhf(shhf);
            list.add(quxiaoshenqing);
        }
        quxiaoshenqingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quxiaoshenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
