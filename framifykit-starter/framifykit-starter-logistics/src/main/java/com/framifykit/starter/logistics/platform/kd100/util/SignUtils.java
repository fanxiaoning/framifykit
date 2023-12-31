package com.framifykit.starter.logistics.platform.kd100.util;

import cn.hutool.crypto.digest.DigestUtil;

/**
 * <p>
 * 快递100 签名工具类
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public class SignUtils {


    /**
     * 快递100加密方式统一为MD5后转大写
     *
     * @param msg
     * @return
     */
    public static String sign(String msg) {
        return DigestUtil.md5Hex(msg).toUpperCase();
    }

    /**
     * 查询加密
     *
     * @param param
     * @param key
     * @param customer
     * @return
     */
    public static String querySign(String param, String key, String customer) {
        return sign(param + key + customer);
    }

    /**
     * 打印/下单 加密
     *
     * @param param
     * @param t
     * @param key
     * @param secret
     * @return
     */
    public static String printSign(String param, String t, String key, String secret) {
        return sign(param + t + key + secret);
    }

    /**
     * 云平台 加密
     *
     * @param key
     * @param secret
     * @return
     */
    public static String cloudSign(String key, String secret) {
        return sign(key + secret);
    }


    /**
     * 短信加密
     *
     * @param key
     * @param userId
     * @return
     */
    public static String smsSign(String key, String userId) {
        return sign(key + userId);
    }
}
