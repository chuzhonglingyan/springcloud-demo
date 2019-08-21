package com.yuntian.mall.credits.api;

import com.yuntian.common.base.Result;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:55
 * @Description:
 */
@RequestMapping("/credits")
public interface CreditsApi {

    /**
     * 给用户增加积分
     * @return
     */
    @RequestMapping(value = "/addCredits/{userId}/{count}",method = RequestMethod.POST)
    Result addCredits(@PathVariable("userId") Long userId, @PathVariable("count") Integer count);
}

