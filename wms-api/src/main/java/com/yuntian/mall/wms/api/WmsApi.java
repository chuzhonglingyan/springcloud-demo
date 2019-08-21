package com.yuntian.mall.wms.api;

import com.yuntian.common.base.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:55
 * @Description:
 */
@RequestMapping("/wms")
public interface WmsApi {

    /**
     * 订单发货
     * @return
     */
    @RequestMapping(value = "deliver")
    Result deliver(@PathVariable("orderId") Long orderId);
}

