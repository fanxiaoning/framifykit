package com.famifykit.starter.common.constant;


import com.famifykit.starter.common.result.ErrorCode;
import com.famifykit.starter.common.result.SuccessCode;

/**
 * 全局码枚举
 * 0-999 系统异常码
 * <p>
 * 一般情况下，使用 HTTP 响应状态码 https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Status
 * 虽然说，HTTP 响应状态码作为业务使用表达能力偏弱，但是使用在系统层面还是非常不错的
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 */
public interface GlobalCodeConstants {

    /**
     * 成功
     */
    SuccessCode SUCCESS = new SuccessCode(200, "成功");

    /**
     * 客户端错误
     */
    ErrorCode BAD_REQUEST = new ErrorCode(400, "请求参数不正确");
    ErrorCode UNAUTHORIZED = new ErrorCode(401, "账号未登录");
    ErrorCode FORBIDDEN = new ErrorCode(403, "没有该操作权限");
    ErrorCode NOT_FOUND = new ErrorCode(404, "请求未找到");
    ErrorCode METHOD_NOT_ALLOWED = new ErrorCode(405, "请求方法不正确");
    ErrorCode LOCKED = new ErrorCode(423, "请求失败，请稍后重试");
    ErrorCode TOO_MANY_REQUESTS = new ErrorCode(429, "请求过于频繁，请稍后重试");

    /**
     * 服务端错误
     */
    ErrorCode INTERNAL_SERVER_ERROR = new ErrorCode(500, "系统异常");
    ErrorCode NOT_IMPLEMENTED = new ErrorCode(501, "功能暂时不支持");

    /**
     * 自定义系统错误
     */
    ErrorCode REPEATED_REQUESTS = new ErrorCode(900, "重复请求，请稍后重试");
    ErrorCode UNKNOWN = new ErrorCode(999, "未知错误");
}
