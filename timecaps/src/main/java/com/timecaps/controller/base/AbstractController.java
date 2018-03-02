package com.timecaps.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yuanqiang on 2018/3/2.
 */
public abstract class AbstractController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;
    private final static String unknownStr = "unknown";

    /**
     * 获取用户ID
     * @return
     */
    public long getUserId() {
        return getLongHander("userId");
    }

    /**
     * 获取当前协议版本:7.4.0
     * @return
     */
    public String getVersion() {
        return request.getHeader("version");
    }

    /**
     * 获取APP版本:100050
     * @return
     */
    public String getAppVersion() {
        return request.getHeader("appVersion");
    }

    /**
     * 获取当前session id
     * @return
     */
    public String getToken() {
        return request.getHeader("token");
    }

    /**
     * 获取经度
     * @return
     */
    public String getLat() {
        return request.getHeader("lat");
    }

    /**
     * 获取纬度
     * @return
     */
    public String getLng() {
        return request.getHeader("lng");
    }


    /**
     * 获取Remort IP
     * @return
     */
    public String getRemoteIp() {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || unknownStr.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || unknownStr.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || unknownStr.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 获取当前请求上下文
     * @return
     */
    public Context getContext() {
        Context context = new Context();
        context.setUserId(getUserId());
        context.setCityId(getLongHander("cityId"));
        context.setToken(getToken());
        context.setDeviceToken(request.getHeader("deviceToken"));
        context.setChannel(request.getHeader("channel"));
        context.setVersion(getVersion());
        context.setPlatform(request.getHeader("platform"));
        context.setPlatformVersion(request.getHeader("platformVersion"));
        context.setPlatformOS(request.getHeader("platformOS"));
        context.setDeviceId(request.getHeader("deviceId"));
        context.setAppVersion(request.getHeader("appVersion"));
        context.setIp(getRemoteIp());
        return context;
    }

    /**
     * 从Http Hander里获取信息
     * @param name
     * @return
     */
    public String getHander(String name) {
        return request.getHeader(name);
    }

    /**
     * 从Http Hander里获取信息，并转换成long类型
     * @param name
     * @return
     */
    public long getLongHander(String name) {
        long value = 0;
        String valueStr = request.getHeader(name);
        if (valueStr != null && valueStr.length() > 0) {
            try {
                value = Long.parseLong(valueStr);
            } catch (Exception e) {
                logger.error("getLongHander error", e);
            }
        }
        return value;
    }

    /**
     * http request 相关信息（上下文）
     */
    public static class Context {
        private long userId;
        private long cityId;
        // session token
        private String token;
        // device token
        private String deviceToken;
        // device id
        private String deviceId;
        // 渠道
        private String channel;
        // 当前app版本号 7.4.0
        private String version;
        // 当前app版本号 100050
        private String appVersion;
        // 操作系统：Android/iOS
        private String platform;
        // 操作系统当前版本
        private String platformVersion;
        // 操作系统OS：XIAOMI／OPPO／HUAWEI
        private String platformOS;
        // remote ip
        private String ip;

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public long getCityId() {
            return cityId;
        }

        public void setCityId(long cityId) {
            this.cityId = cityId;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getPlatformVersion() {
            return platformVersion;
        }

        public void setPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        public String getPlatformOS() {
            return platformOS;
        }

        public void setPlatformOS(String platformOS) {
            this.platformOS = platformOS;
        }
    }

}