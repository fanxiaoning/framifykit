package com.framifykit.starter.logistics.common.constant;


import com.famifykit.starter.common.constant.GlobalCodeConstants;
import com.famifykit.starter.common.result.ErrorCode;

import static com.famifykit.starter.common.exception.enums.ServiceErrorCodePrefix.LOGISTICS_PREFIX;

/**
 * <p>
 * logistics组件返回码枚举
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public interface LogisticsErrorCodeConstants extends GlobalCodeConstants {

    /**
     * 第三方物流接口调用错误
     */
    ErrorCode THIRD_PARTY_API_ERROR = new ErrorCode(LOGISTICS_PREFIX + 200_200, "第三方物流接口调用错误");
}
