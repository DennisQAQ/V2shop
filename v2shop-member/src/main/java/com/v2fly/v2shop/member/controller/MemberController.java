package com.v2fly.v2shop.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.v2fly.v2shop.member.feign.CounponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.v2fly.v2shop.member.entity.MemberEntity;
import com.v2fly.v2shop.member.service.MemberService;
import com.v2fly.v2shop.common.utils.PageUtils;
import com.v2fly.v2shop.common.utils.R;



/**
 * 会员
 *
 * @author Dennis wang
 * @email DearDennisWang@gmail.com
 * @date 2022-03-11 11:18:53
 */
@RestController
@RequestMapping("memeber/member")
public class MemberController {
    @Autowired
    private MemberService memberService;


    /**
     * 测试远程调用方法
     */
    @Autowired
    CounponFeignService CounponFeignService ;
    @RequestMapping("/coupons")
    public R testFeign(){
        MemberEntity MemberEntity = new MemberEntity();
        MemberEntity.setNickname("zs");
        R membersCoupon = CounponFeignService.MembersCoupon();

        return R.ok().put("member",MemberEntity).put("coupons",membersCoupon.get("coupons"));
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("memeber:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("memeber:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("memeber:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("memeber:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("memeber:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
