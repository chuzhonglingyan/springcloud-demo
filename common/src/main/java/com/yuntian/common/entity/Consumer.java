package com.yuntian.common.entity;

import lombok.Data;

/**
 * @Auther: yuntian
 * @Date: 2019/7/7 0007 23:44
 * @Description:
 */
@Data
public class Consumer {

    private String name;
    private int age;
    private String add;
    private String email;


    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
