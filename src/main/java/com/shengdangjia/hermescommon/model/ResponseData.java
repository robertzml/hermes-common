package com.shengdangjia.hermescommon.model;

import java.time.LocalDateTime;

/**
 * 通用返回数据类
 */
public class ResponseData<T> {
    /**
     * 返回数据
     */
    public T result;

    /**
     * 错误码
     */
    public int errorCode;

    /**
     * 消息
     */
    public String message;

    /**
     * 响应时间
     */
    public LocalDateTime time;

    /**
     * 服务端ip
     */
    public String ipaddress;
}
