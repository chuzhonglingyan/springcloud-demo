package com.yuntian.mall.order.service;

import com.yuntian.mall.inventory.api.InventoryApi;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:55
 * @Description:
 */
@FeignClient(name = "inventory-server")
public interface InventoryService extends InventoryApi {

}

