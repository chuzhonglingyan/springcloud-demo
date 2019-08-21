package com.yuntian.mall.order.service;

import com.yuntian.mall.credits.api.CreditsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:55
 * @Description:
 */
@FeignClient(name = "credits-server")
public interface CreditsService extends CreditsApi {

}

