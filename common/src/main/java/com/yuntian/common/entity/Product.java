package com.yuntian.common.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:45
 * @Description:
 */
@Data
public class Product implements Serializable {


    private static final long serialVersionUID = 4959408742209198182L;
    private String name;
    private int age;
    private String add;
    private String email;


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
