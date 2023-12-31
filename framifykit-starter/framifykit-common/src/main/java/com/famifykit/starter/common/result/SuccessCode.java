package com.famifykit.starter.common.result;

import lombok.Getter;

/**
 * <p>
 * 成功码对象
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 */
@Getter
public class SuccessCode implements AbstractCode {

    /**
     * 成功码
     */
    private final Integer code;
    /**
     * 成功提示
     */
    private final String msg;

    public SuccessCode(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }
}
