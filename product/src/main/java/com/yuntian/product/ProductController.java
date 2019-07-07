package com.yuntian.product;

import com.yuntian.common.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yuntian
 * @Date: 2019/7/7 0007 23:54
 * @Description: 生产者
 *
 */
@RestController
public class ProductController {

    /**
     * @link  {http://localhost:7002/product/getProduct}
     * @return
     */
    @RequestMapping(value = "getProduct")
    public Product getProduct(){
        Product product =new Product();
        product.setName("哈哈");
        product.setAge(12);
        product.setEmail("944610721@qq.com");
        product.setAdd("汉口北大道");
        return product;
    }


}
