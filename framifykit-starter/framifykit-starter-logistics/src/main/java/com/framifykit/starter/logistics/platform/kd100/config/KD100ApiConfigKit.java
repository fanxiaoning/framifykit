package com.framifykit.starter.logistics.platform.kd100.config;

import cn.hutool.core.util.StrUtil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * <p>
 * 快递100 api配置kit
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public class KD100ApiConfigKit {

    private static final ThreadLocal<String> TL = new ThreadLocal<>();

    private static final Map<String, KD100ApiConfig> CFG_MAP = new ConcurrentHashMap<>();
    private static final String DEFAULT_CFG_KEY = "_default_key_";

    /**
     * <p>向缓存中设置 KD100ApiConfig </p>
     * <p>每个 appId 只需添加一次，相同 appId 将被覆盖</p>
     *
     * @param KD100ApiConfig 快递100api配置
     * @return {@link KD100ApiConfig}
     */
    public static KD100ApiConfig putApiConfig(KD100ApiConfig KD100ApiConfig) {
        if (CFG_MAP.size() == 0) {
            CFG_MAP.put(DEFAULT_CFG_KEY, KD100ApiConfig);
        }
        return CFG_MAP.put(KD100ApiConfig.getAppKey(), KD100ApiConfig);
    }

    /**
     * 向当前线程中设置 {@link KD100ApiConfig}
     *
     * @param KD100ApiConfig {@link KD100ApiConfig} 快递100api配置对象
     * @return {@link KD100ApiConfig}
     */
    public static KD100ApiConfig setThreadLocalApiConfig(KD100ApiConfig KD100ApiConfig) {
        if (StrUtil.isNotEmpty(KD100ApiConfig.getAppKey())) {
            setThreadLocalAppId(KD100ApiConfig.getAppKey());
        }
        return putApiConfig(KD100ApiConfig);
    }

    /**
     * 通过 KD100ApiConfig 移除快递100api配置
     *
     * @param KD100ApiConfig {@link KD100ApiConfig} 京东物流api配置对象
     * @return {@link KD100ApiConfig}
     */
    public static KD100ApiConfig removeApiConfig(KD100ApiConfig KD100ApiConfig) {
        return removeApiConfig(KD100ApiConfig.getAppKey());
    }

    /**
     * 通过 appKey 移除快递100配置
     *
     * @param appKey 快递100api 应用key
     * @return {@link KD100ApiConfig}
     */
    public static KD100ApiConfig removeApiConfig(String appKey) {
        return CFG_MAP.remove(appKey);
    }

    /**
     * 向当前线程中设置 appKey
     *
     * @param appKey 快递100 api 应用key
     */
    public static void setThreadLocalAppId(String appKey) {
        if (StrUtil.isEmpty(appKey)) {
            appKey = CFG_MAP.get(DEFAULT_CFG_KEY).getAppKey();
        }
        TL.set(appKey);
    }

    /**
     * 移除当前线程中的 appKey
     */
    public static void removeThreadLocalAppId() {
        TL.remove();
    }

    /**
     * 获取当前线程中的  appKey
     *
     * @return 快递100 api 应用key
     */
    public static String getAppKey() {
        String appId = TL.get();
        if (StrUtil.isEmpty(appId)) {
            appId = CFG_MAP.get(DEFAULT_CFG_KEY).getAppKey();
        }
        return appId;
    }

    /**
     * 获取当前线程中的 KD100ApiConfig
     *
     * @return {@link KD100ApiConfig}
     */
    public static KD100ApiConfig getApiConfig() {
        String appId = getAppKey();
        return getApiConfig(appId);
    }

    /**
     * 通过 appKey 获取 KD100ApiConfig
     *
     * @param appKey 快递100 api 应用key
     * @return {@link KD100ApiConfig}
     */
    public static KD100ApiConfig getApiConfig(String appKey) {
        KD100ApiConfig cfg = CFG_MAP.get(appKey);
        if (cfg == null) {
            throw new IllegalStateException("需事先调用 KD100ApiConfigKit.putApiConfig(KD100ApiConfig) 将 appKey对应的 KD100ApiConfig 对象存入，才可以使用 KD100ApiConfigKit.getJdApiConfig() 的系列方法");
        }
        return cfg;
    }
}
