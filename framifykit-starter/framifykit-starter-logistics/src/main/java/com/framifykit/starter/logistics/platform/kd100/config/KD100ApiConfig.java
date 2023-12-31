package com.framifykit.starter.logistics.platform.kd100.config;

import cn.hutool.core.util.StrUtil;
import com.framifykit.starter.logistics.platform.kd100.client.DefaultKD100Client;


/**
 * <p>
 * 快递100 api配置类
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public class KD100ApiConfig {

    private String appKey;

    private String customer;

    private String appSecret;


    private DefaultKD100Client KD100Client;


    private KD100ApiConfig() {

    }

    public static KD100ApiConfig builder() {
        return new KD100ApiConfig();
    }

    public KD100ApiConfig build() {
        this.KD100Client = new DefaultKD100Client(getAppKey(), getCustomer(), getAppSecret());
        return this;
    }

    public String getAppKey() {
        if (StrUtil.isBlank(appKey)) {
            throw new IllegalStateException("appKey 未被赋值");
        }
        return appKey;
    }

    public KD100ApiConfig setKey(String appKey) {
        if (StrUtil.isEmpty(appKey)) {
            throw new IllegalArgumentException("appKey 值不能为 null");
        }
        this.appKey = appKey;
        return this;
    }

    public String getCustomer() {
        if (StrUtil.isBlank(customer)) {
            throw new IllegalStateException("customer 未被赋值");
        }
        return customer;
    }

    public KD100ApiConfig setCustomer(String customer) {
        if (StrUtil.isEmpty(customer)) {
            throw new IllegalArgumentException("customer 值不能为 null");
        }
        this.customer = customer;
        return this;
    }

    public String getAppSecret() {
        if (StrUtil.isBlank(appSecret)) {
            throw new IllegalStateException("appSecret 未被赋值");
        }
        return appSecret;
    }

    public KD100ApiConfig setAppSecret(String appSecret) {
        if (StrUtil.isEmpty(appSecret)) {
            throw new IllegalArgumentException("appSecret 值不能为 null");
        }
        this.appSecret = appSecret;
        return this;
    }


    public DefaultKD100Client getKD100Client() {
        if (KD100Client == null) {
            throw new IllegalStateException("KD100Client 未被初始化");
        }
        return KD100Client;
    }
}
