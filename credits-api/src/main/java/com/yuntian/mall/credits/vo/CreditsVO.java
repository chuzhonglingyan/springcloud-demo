package com.yuntian.mall.credits.vo;

import lombok.Data;

/**
 * @Auther: yuntian
 * @Date: 2019/8/20 0020 23:04
 * @Description:
 */
@Data
public class CreditsVO {

    /**
     * 用户积分记录
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户总积分
     */
    private Integer total;



}
