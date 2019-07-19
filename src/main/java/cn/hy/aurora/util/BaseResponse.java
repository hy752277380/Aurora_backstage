package cn.hy.aurora.util;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * 公共响应类
 *
 * @Param <T>
 */
public class BaseResponse<T> {
    private static final int CODE_SUCCESS = 200;
    private static final int CODE_VALID_FAIL = 400;
    private static final int CODE_ERROR = 500;

    private Date timestamp;
    private int status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    private T data;

    public BaseResponse() {
        super();
    }

    public BaseResponse(int status, String error, String message, T data) {
        this.timestamp = new Date();
        this.status = status;
        this.error = error;
        this.message = message;
        this.data = data;
    }

    public static BaseResponse buildSuccess() {
        return new BaseResponse(CODE_SUCCESS, null, "success", null);
    }

    public static BaseResponse buildSuccess(String msg) {
        return new BaseResponse(CODE_SUCCESS, null, msg, null);
    }

    public static <T> BaseResponse buildSuccess(T data) {
        return new BaseResponse(CODE_SUCCESS, null, "success", data);
    }

    public static <T> BaseResponse buildSuccess(String msg, T data) {
        return new BaseResponse(CODE_SUCCESS, null, msg, data);
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
