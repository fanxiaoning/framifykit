package com.framifykit.starter.logistics.executor.config;


/**
 * <p>
 * 物流组件获取配置接口
 * </p>
 *
 * @author fxn
 * @since
 **/
public interface ILogisticsGetConfig<CONFIG> {

    /**
     * 获取配置类
     *
     * @return
     */
    CONFIG getApiConfig();
}
