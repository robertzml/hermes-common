package com.shengdangjia.hermescommon.utility;

import com.shengdangjia.hermescommon.model.ErrorCode;
import com.shengdangjia.hermescommon.model.ResponseData;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 响应返回工具类
 */
public class RestHelper {

    /**
     * 构造响应返回
     *
     * @param result    相关数据
     * @param errorCode 错误码
     * @param message   消息
     * @return 返回对象
     */
    public static ResponseData makeResponse(Object result, int errorCode, String message) {
        ResponseData data = new ResponseData();
        data.result = result;
        data.errorCode = errorCode;
        data.message = message;

        return data;
    }

    /**
     * 构造响应返回
     *
     * @param result    相关数据
     * @param errorCode 错误码
     * @return 返回内容
     */
    public static ResponseData makeResponse(Object result, ErrorCode errorCode) {
        ResponseData data = new ResponseData();
        data.result = result;
        data.errorCode = errorCode.getCode();
        data.message = errorCode.getErrorMessage();

        try {
            var address = InetAddress.getLocalHost();
            data.ipaddress = address.getHostAddress();
        } catch (UnknownHostException e) {
            data.ipaddress = "unknown";
        }

        return data;
    }
}

