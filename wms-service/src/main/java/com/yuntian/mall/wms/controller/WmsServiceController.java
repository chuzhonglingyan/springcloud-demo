package com.yuntian.mall.wms.controller;


import com.yuntian.common.base.Result;
import com.yuntian.mall.wms.api.WmsApi;

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
public class WmsServiceController implements WmsApi {


    /**
     * @return
     * @link {http://localhost:7004/wms/deliver}
     */
    @Override
    public Result deliver(@PathVariable("orderId") Long orderId) {
        return new Result();
    }


}
