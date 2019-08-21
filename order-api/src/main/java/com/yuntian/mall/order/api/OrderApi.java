package com.yuntian.mall.order.api;

import com.yuntian.common.base.Result;
import com.yuntian.mall.order.vo.OrderVO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yuntian
 * @Date: 2019/8/21 0021 22:11
 * @Description:
 */
@RequestMapping(value = "/order",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public interface OrderApi {


    @RequestMapping(value = "/createOrder/{userId}/{productId}/{totalPrice}")
    Result<OrderVO> createOrder(@PathVariable("userId") Long userId, @PathVariable("productId") Long productId,
                                @PathVariable("totalPrice") Double totalPrice);

    @RequestMapping(value = "pay")
    Result pay(@PathVariable("orderId") Long orderId);

}
