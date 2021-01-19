package com.xhqb.mingh.common.exception;

import com.xhqb.mingh.common.enums.ResultEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * 业务异常
 */
@Getter
@Setter
public class BusinessRuntimeException extends RuntimeException {

    /**
     * 错误code
     */
    private String errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;
    /**
     * 错误枚举, 会将对应枚举的 code 和 msg 设置到 errorCode 和 errorMsg
     */
    private ResultEnum resultEnum;

    public BusinessRuntimeException() {
        this.errorCode = ResultEnum.FAILURE.getCode();
        this.errorMsg = ResultEnum.FAILURE.getMsg();
    }

    public BusinessRuntimeException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BusinessRuntimeException(ResultEnum resultEnum) {
        this.errorCode = resultEnum.getCode();
        this.errorMsg = resultEnum.getMsg();
    }

    public BusinessRuntimeException(String message) {
        super(message);
    }

    public BusinessRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessRuntimeException(Throwable cause) {
        super(cause);
    }
}