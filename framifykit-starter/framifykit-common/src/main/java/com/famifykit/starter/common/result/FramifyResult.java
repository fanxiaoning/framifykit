package com.famifykit.starter.common.result;


import com.famifykit.starter.common.constant.GlobalCodeConstants;
import com.famifykit.starter.common.exception.ServiceException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * <p>
 * 响应对象
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
public class FramifyResult<T> implements Serializable {

    /**
     * 响应码
     * {@link ErrorCode#getCode()}
     * {@link SuccessCode#getCode()}
     */
    private Integer code;

    /**
     * 响应信息
     * {@link ErrorCode#getCode()}
     * {@link SuccessCode#getCode()}
     */
    private String msg;


    /**
     * 返回数据
     */
    private T data;


    /**
     * 将传入的 result 对象，转换成另外一个泛型结果的对象
     * <p>
     * 因为 A 方法返回的 FramifyResult 对象，不满足调用其的 B 方法的返回，所以需要进行转换。
     * </p>
     *
     * @param result 传入的 result 对象
     * @param <T>    返回的泛型
     * @return 新的 FramifyResult 对象
     */
    public static <T> FramifyResult<T> error(FramifyResult<?> result) {
        return error(result.getCode(), result.getMsg());
    }

    public static <T> FramifyResult<T> error(Integer code, String message) {
        FramifyResult<T> result = new FramifyResult<>();
        result.code = code;
        result.msg = message;
        return result;
    }

    public static <T> FramifyResult<T> error(AbstractCode errorCode) {
        return error(errorCode.getCode(), errorCode.getMsg());
    }

    public static <T> FramifyResult<T> success(T data) {
        FramifyResult<T> result = new FramifyResult<>();
        result.code = GlobalCodeConstants.SUCCESS.getCode();
        result.data = data;
        result.msg = "";
        return result;
    }

    public static boolean isSuccess(Integer code) {
        return Objects.equals(code, GlobalCodeConstants.SUCCESS.getCode());
    }

    @JsonIgnore
    public boolean isSuccess() {
        return isSuccess(code);
    }

    @JsonIgnore
    public boolean isError() {
        return !isSuccess();
    }


    /**
     * 异常体系集成
     */
    /**
     * 判断是否有异常。如果有，则抛出 {@link ServiceException} 异常
     */
    public void checkError() throws ServiceException {
        if (isSuccess()) {
            return;
        }
        // 业务异常
        throw new ServiceException(code, msg);
    }

    /**
     * 判断是否有异常。如果有，则抛出 {@link ServiceException} 异常
     * 如果没有，则返回 {@link #data} 数据
     */
    @JsonIgnore
    public T getCheckedData() {
        checkError();
        return data;
    }

    public static <T> FramifyResult<T> error(ServiceException serviceException) {
        return error(serviceException.getCode(), serviceException.getMessage());
    }
}
