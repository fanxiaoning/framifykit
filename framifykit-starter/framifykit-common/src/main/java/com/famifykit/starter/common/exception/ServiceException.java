package com.famifykit.starter.common.exception;

import com.famifykit.starter.common.result.AbstractCode;
import com.famifykit.starter.common.exception.enums.ServiceErrorCodeRange;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 业务异常类
 *
 * <p>
 * 在抛出异常时候，务必带上AbstractExceptionEnum枚举
 * <p>
 *
 * @author fxn
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public final class ServiceException extends RuntimeException {

    /**
     * 错误码
     * {@link ServiceErrorCodeRange}
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException() {
    }

    public ServiceException(AbstractCode exception) {
        this.code = exception.getCode();
        this.msg = exception.getMsg();
    }

    public ServiceException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
