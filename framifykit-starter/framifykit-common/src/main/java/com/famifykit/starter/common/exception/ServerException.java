package com.famifykit.starter.common.exception;

import com.famifykit.starter.common.result.AbstractCode;
import com.famifykit.starter.common.exception.enums.ServiceErrorCodeRange;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 服务器异常类
 * <p>
 * 在抛出异常时候，务必带上AbstractExceptionEnum枚举
 * <p>
 *
 * @author fxn
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public final class ServerException extends RuntimeException {

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
    public ServerException() {
    }

    public ServerException(AbstractCode exception) {
        this.code = exception.getCode();
        this.msg = exception.getMsg();
    }

    public ServerException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
