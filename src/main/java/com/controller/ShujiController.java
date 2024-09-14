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

import com.entity.ShujiEntity;
import com.entity.view.ShujiView;

import com.service.ShujiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 书籍
 * 后端接口
 * @author 
 * @email 
 * @date 2023-10-31 12:06:25
 */
@RestController
@RequestMapping("/shuji")
public class ShujiController {
    @Autowired
    private ShujiService shujiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShujiEntity shuji,
		HttpServletRequest request){
        EntityWrapper<ShujiEntity> ew = new EntityWrapper<ShujiEntity>();

		PageUtils page = shujiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShujiEntity shuji, 
		HttpServletRequest request){
        EntityWrapper<ShujiEntity> ew = new EntityWrapper<ShujiEntity>();

		PageUtils page = shujiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShujiEntity shuji){
       	EntityWrapper<ShujiEntity> ew = new EntityWrapper<ShujiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shuji, "shuji")); 
        return R.ok().put("data", shujiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShujiEntity shuji){
        EntityWrapper< ShujiEntity> ew = new EntityWrapper< ShujiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shuji, "shuji")); 
		ShujiView shujiView =  shujiService.selectView(ew);
		return R.ok("查询书籍成功").put("data", shujiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShujiEntity shuji = shujiService.selectById(id);
		shuji.setClicktime(new Date());
		shujiService.updateById(shuji);
        return R.ok().put("data", shuji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShujiEntity shuji = shujiService.selectById(id);
		shuji.setClicktime(new Date());
		shujiService.updateById(shuji);
        return R.ok().put("data", shuji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShujiEntity shuji, HttpServletRequest request){
    	shuji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shuji);
        shujiService.insert(shuji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShujiEntity shuji, HttpServletRequest request){
    	shuji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shuji);
        shujiService.insert(shuji);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShujiEntity shuji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shuji);
        shujiService.updateById(shuji);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shujiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ShujiEntity shuji, HttpServletRequest request,String pre){
        EntityWrapper<ShujiEntity> ew = new EntityWrapper<ShujiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = shujiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuji), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ShujiEntity shuji, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "shujileixing";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "shuji").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<ShujiEntity> shujiList = new ArrayList<ShujiEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                shujiList.addAll(shujiService.selectList(new EntityWrapper<ShujiEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<ShujiEntity> ew = new EntityWrapper<ShujiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = shujiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuji), params), params));
        List<ShujiEntity> pageList = (List<ShujiEntity>)page.getList();
        if(shujiList.size()<limit) {
            int toAddNum = (limit-shujiList.size())<=pageList.size()?(limit-shujiList.size()):pageList.size();
            for(ShujiEntity o1 : pageList) {
                boolean addFlag = true;
                for(ShujiEntity o2 : shujiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    shujiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(shujiList.size()>limit) {
            shujiList = shujiList.subList(0, limit);
        }
        page.setList(shujiList);
        return R.ok().put("data", page);
    }








}
