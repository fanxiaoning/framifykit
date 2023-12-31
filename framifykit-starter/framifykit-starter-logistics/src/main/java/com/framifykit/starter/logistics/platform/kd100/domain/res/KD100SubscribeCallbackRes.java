package com.framifykit.starter.logistics.platform.kd100.domain.res;

import com.framifykit.starter.logistics.executor.domain.res.BaseRes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 快递100 订阅回调接口res
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100SubscribeCallbackRes extends BaseRes {

    private Boolean result;

    private String returnCode;

    private String message;
}
