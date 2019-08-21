package com.yuntian.mall.inventory.controller;


import com.yuntian.common.base.Result;
import com.yuntian.mall.inventory.api.InventoryApi;
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
public class InventoryController implements InventoryApi {



    /**
     * @return
     * @link {http://localhost:7002/inventory/reduceInventory}
     */
    @Override
    public Result reduceInventory(Long productId, Integer count) {
        return new Result();
    }

}
