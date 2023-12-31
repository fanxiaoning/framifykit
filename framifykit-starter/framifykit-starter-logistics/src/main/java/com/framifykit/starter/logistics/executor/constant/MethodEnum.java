package com.framifykit.starter.logistics.executor.constant;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * 物流组件执行器类相关方法枚举
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Getter
@AllArgsConstructor
public enum MethodEnum {

    /**
     * 下单
     */
    PLACE_ORDER("placeOrder", "下单"),

    /**
     * 取消下单
     */
    CANCEL_ORDER("cancelOrder", "取消下单"),


    /**
     * 查询物流信息
     */
    QUERY_TRACK("queryTrack", "查询物流信息"),

    /**
     * 查询预估运费和时效
     */

    QUERY_COST("queryCost", "查询预估费用和时效"),


    /**
     * 订阅订单
     */
    SUBSCRIBE_ORDER("subscribeOrder", "订阅订单"),

    /**
     * 查询运力
     */
    QUERY_CAPACITY("queryCapacity", "查询运力"),


    /**
     * 获取验证码
     */
    GET_CODE("getCode", "获取验证码"),

    /**
     * 校验地址
     */
    CHECK_ADDRESS("checkAddress", "校验地址");

    private String code;
    private String name;


    public static MethodEnum getMethodEnum(String code) {
        for (MethodEnum type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }
}
