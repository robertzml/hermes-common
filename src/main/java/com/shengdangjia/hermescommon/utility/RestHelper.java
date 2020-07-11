package com.shengdangjia.hermescommon.utility;

import com.shengdangjia.hermescommon.model.ErrorCode;
import com.shengdangjia.hermescommon.model.ResponseData;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

/**
 * 响应返回工具类
 */
public class RestHelper<T> {

    /**
     * 构造响应返回
     *
     * @param result    相关数据
     * @param errorCode 错误码
     * @param message   消息
     * @return 返回对象
     */
    public static <T> ResponseData<T> makeResponse(T result, int errorCode, String message) {
        ResponseData<T> data = new ResponseData<T>();
        data.result = result;
        data.errorCode = errorCode;
        data.message = message;
        data.time = LocalDateTime.now();

        try {
            var address = InetAddress.getLocalHost();
            data.ipaddress = address.getHostAddress();
        } catch (UnknownHostException e) {
            data.ipaddress = "unknown";
        }

        return data;
    }

    /**
     * 构造响应返回
     *
     * @param result    相关数据
     * @param errorCode 错误码
     * @return 返回内容
     */
    public static <T> ResponseData<T> makeResponse(T result, ErrorCode errorCode) {
        ResponseData<T> data = new ResponseData<T>();
        data.result = result;
        data.errorCode = errorCode.getCode();
        data.message = errorCode.getErrorMessage();
        data.time = LocalDateTime.now();

        try {
            var address = InetAddress.getLocalHost();
            data.ipaddress = address.getHostAddress();
        } catch (UnknownHostException e) {
            data.ipaddress = "unknown";
        }

        return data;
    }
}

