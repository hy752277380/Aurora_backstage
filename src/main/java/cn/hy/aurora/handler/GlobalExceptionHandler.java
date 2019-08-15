package cn.hy.aurora.handler;

import cn.hy.aurora.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Administrator
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public BaseResponse handlerHttpMessageNotReadableException(MissingServletRequestParameterException e) {
        logger.info("缺少必要的参数,{}", e.getMessage());
        return BaseResponse.buildError(BaseResponse.CODE_VALID_FAIL, "缺少必要的请求参数");
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseResponse handlerNullPointerException(NullPointerException e) {
        logger.info("空指针异常,{}", e.getMessage());
        return BaseResponse.buildError(BaseResponse.CODE_ERROR, "NullPointerException");
    }
}
