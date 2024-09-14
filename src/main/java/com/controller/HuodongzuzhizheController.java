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

import com.entity.HuodongzuzhizheEntity;
import com.entity.view.HuodongzuzhizheView;

import com.service.HuodongzuzhizheService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 活动组织者
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:25
 */
@RestController
@RequestMapping("/huodongzuzhizhe")
public class HuodongzuzhizheController {
    @Autowired
    private HuodongzuzhizheService huodongzuzhizheService;



    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		HuodongzuzhizheEntity u = huodongzuzhizheService.selectOne(new EntityWrapper<HuodongzuzhizheEntity>().eq("zhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"huodongzuzhizhe",  "活动组织者" );
		return R.ok().put("token", token);
	}

	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody HuodongzuzhizheEntity huodongzuzhizhe){
    	//ValidatorUtils.validateEntity(huodongzuzhizhe);
    	HuodongzuzhizheEntity u = huodongzuzhizheService.selectOne(new EntityWrapper<HuodongzuzhizheEntity>().eq("zhanghao", huodongzuzhizhe.getZhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		huodongzuzhizhe.setId(uId);
        huodongzuzhizheService.insert(huodongzuzhizhe);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        HuodongzuzhizheEntity u = huodongzuzhizheService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	HuodongzuzhizheEntity u = huodongzuzhizheService.selectOne(new EntityWrapper<HuodongzuzhizheEntity>().eq("zhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        huodongzuzhizheService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuodongzuzhizheEntity huodongzuzhizhe,
		HttpServletRequest request){
        EntityWrapper<HuodongzuzhizheEntity> ew = new EntityWrapper<HuodongzuzhizheEntity>();

		PageUtils page = huodongzuzhizheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongzuzhizhe), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuodongzuzhizheEntity huodongzuzhizhe, 
		HttpServletRequest request){
        EntityWrapper<HuodongzuzhizheEntity> ew = new EntityWrapper<HuodongzuzhizheEntity>();

		PageUtils page = huodongzuzhizheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongzuzhizhe), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuodongzuzhizheEntity huodongzuzhizhe){
       	EntityWrapper<HuodongzuzhizheEntity> ew = new EntityWrapper<HuodongzuzhizheEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huodongzuzhizhe, "huodongzuzhizhe")); 
        return R.ok().put("data", huodongzuzhizheService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuodongzuzhizheEntity huodongzuzhizhe){
        EntityWrapper< HuodongzuzhizheEntity> ew = new EntityWrapper< HuodongzuzhizheEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huodongzuzhizhe, "huodongzuzhizhe")); 
		HuodongzuzhizheView huodongzuzhizheView =  huodongzuzhizheService.selectView(ew);
		return R.ok("查询活动组织者成功").put("data", huodongzuzhizheView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuodongzuzhizheEntity huodongzuzhizhe = huodongzuzhizheService.selectById(id);
        return R.ok().put("data", huodongzuzhizhe);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuodongzuzhizheEntity huodongzuzhizhe = huodongzuzhizheService.selectById(id);
        return R.ok().put("data", huodongzuzhizhe);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongzuzhizheEntity huodongzuzhizhe, HttpServletRequest request){
    	huodongzuzhizhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongzuzhizhe);
    	HuodongzuzhizheEntity u = huodongzuzhizheService.selectOne(new EntityWrapper<HuodongzuzhizheEntity>().eq("zhanghao", huodongzuzhizhe.getZhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		huodongzuzhizhe.setId(new Date().getTime());
        huodongzuzhizheService.insert(huodongzuzhizhe);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongzuzhizheEntity huodongzuzhizhe, HttpServletRequest request){
    	huodongzuzhizhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongzuzhizhe);
    	HuodongzuzhizheEntity u = huodongzuzhizheService.selectOne(new EntityWrapper<HuodongzuzhizheEntity>().eq("zhanghao", huodongzuzhizhe.getZhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		huodongzuzhizhe.setId(new Date().getTime());
        huodongzuzhizheService.insert(huodongzuzhizhe);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuodongzuzhizheEntity huodongzuzhizhe, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huodongzuzhizhe);
        huodongzuzhizheService.updateById(huodongzuzhizhe);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huodongzuzhizheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
