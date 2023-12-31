package com.famifykit.starter.common.result;

/**
 * <p>
 * 返回码枚举接口
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public interface AbstractCode {

    /**
     * 获取状态码
     *
     * @return 状态码
     */
    Integer getCode();

    /**
     * 获取信息
     *
     * @return 信息
     */
    String getMsg();

}
