package com.yuntian.mall.order.service;

import com.yuntian.mall.wms.api.WmsApi;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:55
 * @Description:
 */
@FeignClient(name = "wms-server")
public interface WmsService extends WmsApi {

}

