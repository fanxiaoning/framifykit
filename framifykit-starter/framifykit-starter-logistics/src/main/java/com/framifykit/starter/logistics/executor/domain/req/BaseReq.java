package com.framifykit.starter.logistics.executor.domain.req;

import com.framifykit.starter.logistics.executor.constant.LogisticsTypeEnum;
import com.framifykit.starter.logistics.executor.constant.MethodEnum;
import lombok.Data;

/**
 * <p>
 * 执行器req父类
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
public class BaseReq {

    /**
     * {@link MethodEnum}
     * 执行器执行方法类型
     */
    private String methodType;

    /**
     * {@link LogisticsTypeEnum}
     * 执行器需要执行的物流公司编码
     */
    private String logisticsTypeCode;
}
