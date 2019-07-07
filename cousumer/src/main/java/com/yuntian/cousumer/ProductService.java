package com.yuntian.cousumer;

import com.yuntian.common.entity.Product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:55
 * @Description:
 */
@FeignClient(name = "product-server",path ="/product" )
@Component
public interface ProductService {

    @RequestMapping(value = "getProduct")
    Product getProduct();
}

