package com.yuntian.mall.credits.controller;


import com.yuntian.common.base.Result;
import com.yuntian.mall.credits.api.CreditsApi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:54
 * @Description:
 */
@Slf4j
@RestController
public class CreditsController implements CreditsApi {


    /**
     * @return
     * @link {http://localhost:7001/credits/addCredits}
     */
    @Override
    public Result addCredits(@PathVariable("userId") Long userId, @PathVariable("count") Integer count) {
        return new Result();
    }


}
