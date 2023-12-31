package com.famifykit.starter.common.result;

import com.famifykit.starter.common.constant.GlobalCodeConstants;
import com.famifykit.starter.common.exception.enums.ServiceErrorCodeRange;
import lombok.Getter;

/**
 * 错误码对象
 *
 * <p>
 * 全局错误码，占用 [0, 999], 参见 {@link GlobalCodeConstants}
 * * 业务异常错误码，占用 [1 100 100 100, +∞)，参见 {@link ServiceErrorCodeRange}
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 */
@Getter
public class ErrorCode implements AbstractCode {

    /**
     * 错误码
     */
    private final Integer code;
    /**
     * 错误提示
     */
    private final String msg;

    public ErrorCode(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }
}
