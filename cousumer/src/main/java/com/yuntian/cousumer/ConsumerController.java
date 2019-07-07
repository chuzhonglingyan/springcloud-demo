package com.yuntian.cousumer;

import com.yuntian.common.entity.Product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:54
 * @Description:
 */
@RestController
public class ConsumerController {

    @Resource
    private ProductService productService;

    /**
     * @link  {http://localhost:7001/consumer/getConsumer}
     * @return
     */
    @RequestMapping(value = "getConsumer")
    public Product getConsumer(){
        return productService.getProduct();
    }
}
