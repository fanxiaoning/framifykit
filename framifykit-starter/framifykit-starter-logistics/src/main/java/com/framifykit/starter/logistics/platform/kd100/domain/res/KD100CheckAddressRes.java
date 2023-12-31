package com.framifykit.starter.logistics.platform.kd100.domain.res;

import com.framifykit.starter.logistics.executor.domain.res.BaseRes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *     快递100 校验地址res
 * </p>
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100CheckAddressRes<T> extends BaseRes {

    private String returnCode;

    private Boolean result;

    private String message;

    private T data;
}
