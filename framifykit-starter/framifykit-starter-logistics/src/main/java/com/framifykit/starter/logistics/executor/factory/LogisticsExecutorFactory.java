package com.framifykit.starter.logistics.executor.factory;

import com.framifykit.starter.logistics.executor.KD100Executor;
import com.framifykit.starter.logistics.executor.constant.LogisticsTypeEnum;
import com.framifykit.starter.logistics.executor.ILogisticsExecutor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * <p>
 * 物流组件执行器工厂
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public class LogisticsExecutorFactory {

    private static final Map<String, ILogisticsExecutor> LOGISTICS_EXECUTOR_CONTEXT = new ConcurrentHashMap<>();

    static {
        register(LogisticsTypeEnum.KD_100, new KD100Executor());
    }


    public static ILogisticsExecutor getTaskExecutor(String logisticsType) {
        return LOGISTICS_EXECUTOR_CONTEXT.get(logisticsType);
    }

    /**
     * 注册执行器到容器
     **/
    public static void register(LogisticsTypeEnum logisticsTypeEnum, ILogisticsExecutor logisticsExecutor) {
        LOGISTICS_EXECUTOR_CONTEXT.put(logisticsTypeEnum.getCode(), logisticsExecutor);
    }

    public static ILogisticsExecutor get(LogisticsTypeEnum logisticsTypeEnum) {
        return LOGISTICS_EXECUTOR_CONTEXT.get(logisticsTypeEnum.getCode());
    }
}
