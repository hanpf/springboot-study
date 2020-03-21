package com.hpf.study.springbootdemo.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author hanpengfei1
 * @date 2020/3/15  23:12
 */
@ControllerAdvice
public class GlobleExceptionHandler {
    /**
     * 功能描述
     *
     * @param
     * @return
     * @author qqg
     * @date
     */
    @ExceptionHandler(GlobleException.class)
    public void uploadException(Exception ex, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("上传文件大小超出限制");
        printWriter.flush();
        printWriter.close();
    }

    /**
     * 功能描述
     *
     * @param
     * @return 方法可以有返回值，可以是一个json ，一个视图名等
     * @author qqg
     * @date
     */

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String customException(Exception ex) {
        System.out.println("进入异常处理类GlobleExceptionHandler");
        return "数据获取异常";
    }

}
