package com.yuntian.mall.inventory.api;

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
@RequestMapping("/inventory")
public interface InventoryApi {

    /**
     * 扣减库存
     *
     * @return
     */
    @RequestMapping(value = "/reduceInventory/{productId}/{count}", method = RequestMethod.POST)
    Result reduceInventory(@PathVariable("productId") Long productId, @PathVariable("count") Integer count);


}

