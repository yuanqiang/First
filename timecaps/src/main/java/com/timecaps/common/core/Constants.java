package com.timecaps.common.core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yuanqiang on 2018/3/1.
 */

/**
 * 内部使用常量类
 *
 */
public class Constants {
    // 处理积分规则定时加载到内存中
    public static final String DEFAULT_PROPERTIES = "server.properties";
    public static final String ERROR_PROPERTIES = "error.properties";

    public final static int OTHER_CITY = 9999999;

    private static final Map<Integer, String> houseTypeIdNameMap = new HashMap<Integer, String>();

    public static Map<Integer, String> getHouseTypeIdNameMap() {
        return houseTypeIdNameMap;
    }

    private static Constants constants = new Constants();
    public static Constants getInstance() {
        return constants;
    }
    public final static int SECOND_IN_DAY = 24 * 60 * 60;

    // 经纪人注册手机号码长度限制，最大为20位
    public final static int MOBILE_LENGTH_MAX = 20;
    /**注册短信模板type*/
    public final static int SMS_REGISTER = 20;
    // 短信验证码的长度
    public final static int AUTH_CODE_LENGTH = 6;

//    // 鉴权中心配置
//    // 鉴权中心域名地址
//    public final static String SSO_HOST = ConfigUtils.getProperty("sso.host", "usercenter.fangdd.net");
//    // 鉴权中心分配给经纪人appKey
//    public final static String SSO_APP_KEY = ConfigUtils.getProperty("sso.app.key", "6ahhsFYjHNO83mUJ2OXS5lhow7M");
//
//    // CCPS 外呼业务
//    public final static String CCPS_HOST = ConfigUtils.getProperty("ccps.host", "ccps.dc.fdd");
//    public final static String CCPS_APP_ID = ConfigUtils.getProperty("ccps.app.id", "9ce15a6f48c74442");
//    public final static String CCPS_SECRET_KEY = ConfigUtils.getProperty("ccps.app.secret", "e3c3b800f8eb5c60c9d75923b586148d");



    //户型销量缓存前缀，根据户型Id查找
    public final static String CACHE_PREFIX_FLAT_SALE = "agent_flat_sales_info_v2_";

    //鲜花鸡蛋
    public final static int flowerPrice = 100;
    public final static int eggPrice = 100;

    static {
        loadProperty();
    }

    public static void loadProperty() {
        // 初始化经纪人设定的户型基本信息
        houseTypeIdNameMap.put(1, "不限");
        houseTypeIdNameMap.put(2, "一室");
        houseTypeIdNameMap.put(3, "二室");
        houseTypeIdNameMap.put(4, "三室");
        houseTypeIdNameMap.put(5, "四室");
        houseTypeIdNameMap.put(6, "五室及以上");
        houseTypeIdNameMap.put(7, "复式");
        houseTypeIdNameMap.put(8, "别墅");
        houseTypeIdNameMap.put(9, "商铺");
    }


    // 经纪人分享house模板URL
    public static final String SHARE_URL = "?aid={agentId}&pid={projectId}";

}

