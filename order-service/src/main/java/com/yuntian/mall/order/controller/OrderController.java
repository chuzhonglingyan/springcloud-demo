package com.yuntian.mall.order.controller;


import com.yuntian.common.base.Result;
import com.yuntian.mall.order.api.OrderApi;
import com.yuntian.mall.order.service.CreditsService;
import com.yuntian.mall.order.service.InventoryService;
import com.yuntian.mall.order.service.WmsService;
import com.yuntian.mall.order.vo.OrderVO;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:54
 * @Description:
 */
@Slf4j
@RestController
public class OrderController implements OrderApi {


    /**
     * 积分服务
     */
    @Resource
    private CreditsService creditsService;

    /**
     * 库存系统
     */
    @Resource
    private InventoryService inventoryService;

    /**
     * 仓库系统
     */
    @Resource
    private WmsService wmsService;

    /**
     * @return
     * @link {http://localhost:7003/order/createOrder}
     */
    @Override
    public Result<OrderVO> createOrder(@PathVariable("userId") Long userId, @PathVariable("productId") Long productId,
                                       @PathVariable("totalPrice") Double totalPrice) {
        OrderVO orderVO = new OrderVO();
        creditsService.addCredits(userId, 1);
        inventoryService.reduceInventory(productId, 1);

        orderVO.setId(2L);
        Result<OrderVO> result = new Result<>();
        result.setCode(99);
        result.setMsg("成功");
        result.setData(orderVO);
        return result;
    }

    @Override
    public Result pay(@PathVariable Long orderId) {
        Long userId = 2L;
        creditsService.addCredits(userId, 1);
        wmsService.deliver(orderId);
        return new Result();
    }

}
