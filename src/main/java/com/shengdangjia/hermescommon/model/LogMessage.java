package com.shengdangjia.hermescommon.model;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志消息类
 */
public class LogMessage {

    private String[] levels = {"Exception", "Error", "Warning", "Info", "Debug", "Verbose"};

    private int level;

    private String module;

    private String action;

    private String message;

    private long timestamp;

    public LogMessage() {

    }

    public LogMessage(int level, String module, String action, String message) {
        this.setLevel(level);
        this.setModule(module);
        this.setAction(action);
        this.setMessage(message);
        this.setTimestamp(System.currentTimeMillis());
    }

    /**
     * 日志级别
     * 0:Exception 1:Error 2:Warning 3:Info 4:Debug 5:Verbose
     */
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * 模块名称
     */
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    /**
     * 操作名称
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 消息内容
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 日志时间
     */
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        if (this.level > 5 || this.level < 1) {
            this.level = 5;
        }

        Timestamp t = new Timestamp(System.currentTimeMillis());
        Date d = new Date(t.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        return String.format("[%s][%s]-[%s][%s]-[%s]",
                this.levels[this.level], format.format(d), this.module, this.action, this.message);
    }
}
