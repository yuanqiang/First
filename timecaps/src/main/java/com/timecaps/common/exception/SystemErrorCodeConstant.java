package com.timecaps.common.exception;

import com.timecaps.common.exception.ErrorCode;
/**
 * Created by yuanqiang on 2018/3/1.
 */

/**
 * 系统级异常定义. code范围: [90000-)
 *
 * @since 1.0.0
 */
public class SystemErrorCodeConstant {

    public static final int INTERFACE_INVOKE_ERROR_CODE = 10000; // 接口调用错误

    public static final ErrorCode SUCCESS = new ErrorCode(0000, "操作成功");

    public static final ErrorCode UNKNOWN_ERROR = new ErrorCode(-1, "系统内部错误.");
    public static final ErrorCode JSON_FORMAT_ERROR = new ErrorCode(90000, "Json格式不正确.");
    public static final ErrorCode SESSION_INVALID = new ErrorCode(90001, "为了您的账户安全，请重新登录.");
    public static final ErrorCode COMMON_USER_INFO_NOT_EXIST = new ErrorCode(90002, "该用户不存在");
    public static final ErrorCode VERSION_NOTSUPORT = new ErrorCode(90003, "版本过低，请您到e.fangdd.com更新最新版本，谢谢.");
    public static final ErrorCode WESTORE_NOTSUPORT = new ErrorCode(90004, "微店功能全面升级啦，快去e.fangdd.com下载更新吧");
    public static final ErrorCode COMMON_USER_INFO_CANCEL = new ErrorCode(90005, "该用户帐号已注销");
    public static final ErrorCode COMMON_NOT_SUPPORT = new ErrorCode(90006, "系统不支持该操作");

    // 90100
    public static final ErrorCode CLIENT_CIC_ERROR = new ErrorCode(90100, "服务器开小差了，请稍后再试");
    public static final ErrorCode CLIENT_SEARCH_WRONG = new ErrorCode(90101, "查询客户失败");
    public static final ErrorCode CLIENT_INFO_NOT_EXIST = new ErrorCode(90102, "指定的客户信息不存在");
    public static final ErrorCode CLIENT_INFO_EXIST = new ErrorCode(90103, "指定的客户信息已经存在");
    public static final ErrorCode COMMON_USER_STORE_ID_NOT_BINDED = new ErrorCode(90104, "经纪人未绑定门店");
    public static final ErrorCode CLIENT_CUST_MOBILE_EMPTY = new ErrorCode(90105, "客户电话号码不允许空");
    public static final ErrorCode CLIENT_PROJECT_ID_EMPTY = new ErrorCode(90106, "请选择报备楼盘");
    public static final ErrorCode CLIENT_CUST_PROJ_BOTH_MUTIPLE = new ErrorCode(90107, "报备的时候客户列表和楼盘数量不能同时大于1");
    public static final ErrorCode CLIENT_RECORD_FAILED = new ErrorCode(90108, "报备失败");
    public static final ErrorCode CLIENT_ALREDY_RECORDED = new ErrorCode(90109, "您已经报备过该客户");
    public static final ErrorCode CLIENT_ALREDY_RECORDED_PROJECT = new ErrorCode(90109, "您在此楼盘报备过相同号码客户，请勿重复报备哦");
    public static final ErrorCode CLIENT_ALREDY_FULL_RECORDED_PROJECT = new ErrorCode(90109, "号码在该楼盘下已存在，请在客户列表查看");
    public static final ErrorCode CLIENT_RECORD_ILLEAAL_NUMBER = new ErrorCode(90110, "不可报备经纪人号码，请报备其他号码");
    public static final ErrorCode CLIENT_EXPIRED_PROJECT = new ErrorCode(90111, "项目合作已结束，不能发起报备/带看哦");
    public static final ErrorCode CLIENT_RECORD_SUCCESS = new ErrorCode(90112, "报备成功");

    public static final ErrorCode HOUSE_NOT_EXIST = new ErrorCode(90113, "楼盘不存在");
    public static final ErrorCode VISIT_INTERFACE_TIMEOUT = new ErrorCode(90114, "访问接口超时，请稍后再试");
    public static final ErrorCode VISIT_INTERFACE_ERROR = new ErrorCode(90115, "访问接口出错，请稍后再试");

    public static final ErrorCode EMPTY_AGENTID = new ErrorCode(90116, "经纪人ID为空");
    public static final ErrorCode EMPTY_AGENT = new ErrorCode(90116, "经纪人为空");
    public static final ErrorCode EMPTY_CUSTMOBILE = new ErrorCode(90117, "客户号码为空");
    public static final ErrorCode EMPTY_PROJECTID = new ErrorCode(90118, "楼盘ID为空");
    public static final ErrorCode INSERT_CUST_PROJECT_IGNORE_FAIL = new ErrorCode(90119, "插入忽略楼盘失败");
    public static final ErrorCode DUPLICATE_KEY_ERROR = new ErrorCode(90120, "数据已存在");
    public static final ErrorCode EMPTY_CITYID = new ErrorCode(90121, "CITY_ID为空");


    public static final ErrorCode CUST_LEVEL_INVALID = new ErrorCode(90122, "客户等级无效。");
    public static final ErrorCode REQUIRED_PARAMETERS_MISSING = new ErrorCode(90123, "缺少必要的参数。");
    public static final ErrorCode REQUEST_PARAMETERS_INVALID = new ErrorCode(90124, "请求参数不合法。");
    public static final ErrorCode RECORDED_CUST_CANNOT_DELETE_ERROR = new ErrorCode(90125, "客户有报备历史，不可删除。");
    public static final ErrorCode CUST_NAME_IS_EMPTY_ERROR = new ErrorCode(90126, "客户姓名不能为空。");
    public static final ErrorCode CUST_NAME_IS_NOT_SPECIFICATION = new ErrorCode(90126, "请修改正确的客户姓名");
    public static final ErrorCode CUST_MOBILE_IS_EMPTY_ERROR = new ErrorCode(90127, "客户手机号不能为空。");
    public static final ErrorCode CUST_MOBILE_IS_INVADLID = new ErrorCode(90128, "手机号码格式不正确！");
    public static final ErrorCode CUST_MOBILE_COMPLETE_FAIL = new ErrorCode(90128, "手机号码补全失败");
    public static final ErrorCode AGENT_ID_NOT_EXIST_ERROR = new ErrorCode(90129, "经纪人ID不存在。");

    //经纪人相关错误码定义
    public static final ErrorCode COMMON_MOBILE_EMPTY = new ErrorCode(90130, "请输入11位手机号码");
    public static final ErrorCode COMMON_MOBILE_LENGTH_TOO_LONG = new ErrorCode(90131, "请输入11位手机号码");
    public static final ErrorCode AGENT_OPE_USERNAME_EXIST = new ErrorCode(90132, "该手机号码已注册");
    public static final ErrorCode AGENT_OPE_REGISTER_ERROR = new ErrorCode(90133, "注册失败");
    public static final ErrorCode AGENT_OPE_AUTH_CODE_WRONG = new ErrorCode(90134, "验证码有误，请重新输入");
    public static final ErrorCode AGENT_OPE_AUTH_CODE_EMPTY = new ErrorCode(90134, "请输入验证码");

    public static final ErrorCode COMMON_USER_ID_EMPTY = new ErrorCode(90135, "agentId未传输");
    public static final ErrorCode AGENT_OPE_MODIFY_STORE_CODE_NOT_OPEN = new ErrorCode(90136, "暂不支持修改门店");
    public static final ErrorCode AGENT_OPE_STORE_ID_EMPTY = new ErrorCode(90137, "门店码为空");
    public static final ErrorCode AGENT_OPE_STORE_THE_SAME = new ErrorCode(90138, "绑定前后门店不能相同");
    public static final ErrorCode AGENT_OPE_STORE_ID_NOT_EXIST = new ErrorCode(90139, "门店码不存在");
    public static final ErrorCode AGENT_OPE_STORE_INVALID = new ErrorCode(90140, "您绑定的门店已失效，请选择其他门店操作");

    public static final ErrorCode CLIENT_APPLY_GUIDE_FAILED = new ErrorCode(90141, "申请带看失败");
    public static final ErrorCode CLIENT_APPLY_GUIDE_NOT_EXIST = new ErrorCode(90142, "申请带看信息不存在");
    public static final ErrorCode CLIENT_APPLY_GUIDE_SUCCESS_NO_DIALOG = new ErrorCode(90142, "");
    public static final ErrorCode CLIENT_INVALID_STORE = new ErrorCode(90143, "您绑定的门店未签约（或已过期）,暂不能报备客户");
    public static final ErrorCode CLIENT_NEED_TO_RESEND_MSG = new ErrorCode(90144, "今天发起过带看啦！是否要补发预约短信给客户？");
    public static final ErrorCode CLIENT_APPLY_GUIDE_NOT_RECORDED = new ErrorCode(90145, "您还没有报备该客户");
    public static final ErrorCode CLIENT_APPLY_GUIDE_LATER = new ErrorCode(90146, "两次带看间隔不能少于min分钟");
    public static final ErrorCode CLIENT_APPLY_GUIDE_WAITING = new ErrorCode(90147, "报备和带看时间间隔小于规定时间");
    public static final ErrorCode CLIENT_APPLY_GUIDE_IN_PROTECT_TIME = new ErrorCode(90149, "此客户处于他人保护期，暂不能带看");
    public static final ErrorCode CLIENT_OCNFIRM_GUIDE_FAILED = new ErrorCode(90150, "确认带看失败");

    public static final ErrorCode HAVE_NOT_CONFIRMED_ORDER = new ErrorCode(90150, "您当前有未确认的成交申请，请等待房多多确认");
    public static final ErrorCode EMPTY_CONFIRM_CODE = new ErrorCode(90151, "验证码不能为空");

    public static final ErrorCode AGENT_OPE_STORE_NEED_CARD = new ErrorCode(90152, "请上传门店名片");
    public static final ErrorCode AGENT_OPE_STORE_VERIFYING = new ErrorCode(90153, "需要等待门店审核通过才能再次提交审核");

    public static final ErrorCode CLIENT_RECORD_C_NUMBER = new ErrorCode(90154, "客户在到访保护期内，暂不可报备");//c端客户
    public static final ErrorCode CLIENT_APPLAYGUIDE_C_NUMBER = new ErrorCode(90156, "客户在到访保护期内，暂不可带看");//c端客户
    public static final ErrorCode AGENT_OPE_MODIFY_MOBILE_EXIST = new ErrorCode(90155, "该手机号已存在, 请改绑到其它号码");
    public static final ErrorCode CLIENT_CONFIRMGUIDE_C_NUMBER = new ErrorCode(90157, "客户在到访保护期内，暂不可确认带看");//c端客户
    public static final ErrorCode AGENT_OPE_MODIFY_MOBILE_WRONG = new ErrorCode(90158, "重新绑定手机号码出错");
    public static final ErrorCode CLIENT_ALREADY_OCNFIRM_GUIDE = new ErrorCode(90159, "您今天已确认过");
    public static final ErrorCode CLIENT_CONFIREMGUIDE_CODE_ERRO = new ErrorCode(90160, "带看确认码错误");
    public static final ErrorCode AGENT_OPE_AUTH_CODE_WRONG_LIMIT = new ErrorCode(90161, "验证码已错误多次，请稍后再试");
    public static final ErrorCode AGENT_OPE_USER_NOT_EXIST = new ErrorCode(90162, "手机号码未被注册");
    public static final ErrorCode AGENT_OPE_MODIFY_PWD_WRONG = new ErrorCode(90163, "修改密码失败");
    public static final ErrorCode MSG_SEND_FAIL = new ErrorCode(90164, "短信发送失败");
    public static final ErrorCode MOBILE_IN_BLACK_LIST = new ErrorCode(90165, "手机处于黑名单");
    public static final ErrorCode SEND_MSG_TIMES_TOOMUCH = new ErrorCode(90166, "操作频繁，请稍后重试");
    public static final ErrorCode CITY_ID_WRONG = new ErrorCode(90167, "城市不存在");
    public static final ErrorCode COMMISSION_ID_EMPTY = new ErrorCode(90168, "佣金Id为空");


    public static final ErrorCode AGENT_WITH_NO_DEAL = new ErrorCode(90167, "活动期内无首单成交");
    public static final ErrorCode AGENT_REWARD_RECEIVED = new ErrorCode(90168, "流量奖励已领取");
    public static final ErrorCode FLOWPACKET_NO_LEFT = new ErrorCode(90169, "流量已领完");
    public static final ErrorCode FLOWPACKET_NOT_INCLUDED = new ErrorCode(90170, "流量包ID不在业务范围内");
    public static final ErrorCode FLOWPACKET_ADD_OVERFLOW = new ErrorCode(90171, "本月超出流量包的叠加次数");
    public static final ErrorCode ABNORMAL_ACCOUNT = new ErrorCode(90172, "账号异常");
    public static final ErrorCode GET_FLOWPACKET_FAILED = new ErrorCode(90173, "领取流量包失败");
    public static final ErrorCode APPLY_BALANCE_IS_WRONG = new ErrorCode(90174, "申请金额有误");
    public static final ErrorCode LOGIN_PASSWORD_IS_NULL = new ErrorCode(90175, "请输入密码");
    public static final ErrorCode AGENT_NOT_SUPPORT_CREDIT = new ErrorCode(90176, "经纪人等级不支持垫佣");

    public static final ErrorCode JUMPKEY_VALID_FAIL = new ErrorCode(90177, "验证失败");
    public static final ErrorCode AGENT_OPE_LOGIN_ERROR = new ErrorCode(90178, "密码与账号不匹配，请重新输入");
    public static final ErrorCode AGENT_LOGING_TYPE_ERROR = new ErrorCode(90179, "登录异常");
    public static final ErrorCode APPLY_AMOUNT_ERROR = new ErrorCode(90120, "申请垫付金额有误");
    public static final ErrorCode AGENT_LOGING_ERROR = new ErrorCode(90121, "登录失败");
    public static final ErrorCode AGENT_ALREDY_APPLY_COMMISSION = new ErrorCode(90122, "您已经申请过一次垫佣");
    public static final ErrorCode AGENT_APPLY_COMMISSION_WRONG = new ErrorCode(90123, "申请垫佣失败");
    public static final ErrorCode AGENT_OLDPASSWORD_ERROR = new ErrorCode(90124, "原密码有误，请重新输入");
    public static final ErrorCode AGENT_OLDPASSWORD_WRONG = new ErrorCode(90124, "请输入至少6位密码");
    public static final ErrorCode AGENT_OLDPASSWORD_EMPTY = new ErrorCode(90124, "请输入原密码");
    public static final ErrorCode AGENT_NEWPASSWORD_WRONG = new ErrorCode(90124, "请输入至少6位密码");
    public static final ErrorCode AGENT_NEWPASSWORD_EMPTY = new ErrorCode(90124, "请输入密码");
    public static final ErrorCode AGENT_OID_NEW_PASSWORD = new ErrorCode(90124, "新密码与原密码重复，请重新输入");
    public static final ErrorCode AGENT_REGISTER_MOBILE_WRONG = new ErrorCode(90125, "该用户不存在");
    public static final ErrorCode AGENT_WESTORE_FLATID_NULL = new ErrorCode(90126, "微店Id为空");
    public static final ErrorCode AGENT_WESTORE_ALREADY_ADDED_FLAT = new ErrorCode(90127, "您已添加过该户型");
    public static final ErrorCode AGENT_WESTORE_ADDED_FLAT_WRONG = new ErrorCode(90128, "添加户型到微店失败");
    public static final ErrorCode FLAT_NOT_EXIST = new ErrorCode(90129, "户型不存在");
    public static final ErrorCode ACHIEVE_BROKER_NOT_EXIST = new ErrorCode(90130, "未绑定经服专员");
    public static final ErrorCode GET_BROKER_EVALUATELIST_FAILD = new ErrorCode(90131, "获取经服评价列表失败");
    public static final ErrorCode RECOMMEND_CUST_NOT_EXIST = new ErrorCode(90132, "推荐客户不存在");
    public static final ErrorCode RECOMMEND_CUST_COUNT_REACH_MAX = new ErrorCode(90133, "今日推客次数已用完");
    public static final ErrorCode RECIVE_TICKET_WRONG = new ErrorCode(90135, "该城市暂不支持推客");

    public static final ErrorCode CUST_IN_OTHER_PERSON_PROTECT_PERIOD = new ErrorCode(90137, "客户处于他人保护期");

    public static final ErrorCode CUST_INTENTION_PROPERTY_UNWRITE = new ErrorCode(90138, "物业类型未填写");

    public static final ErrorCode CUST_NO_NEED_RESEND_MSG = new ErrorCode(90139, "亲~今天已经确认带看，如需再次带看，请明天再试");
    public static final ErrorCode CUST_RESEND_GUIDE_SMS_FREQUENT = new ErrorCode(90140, "补发短信过于频繁，请稍后再试");
    public static final ErrorCode RECORD_CUST_WRONG_CUSTMOBILE = new ErrorCode(90141, "手机号码格式不正确");
    public static final ErrorCode NOT_REPEAT_RECORD = new ErrorCode(90141, "您的操作太快了！");
    public static final ErrorCode CUST_NAME_TOO_LONG_ERROR = new ErrorCode(90142, "客户姓名长度不能超过20个字符");
    public static final ErrorCode CUST_REMARK_TOO_LONG_ERROR = new ErrorCode(90143, "客户备注长度不能超过500个字符");
    public static final ErrorCode AGENT_NO_SUCK_PRIVILEGE_ERROR = new ErrorCode(90144, "经纪人无此访问权限");
    public static final ErrorCode GROUP_MEMBER_NOT_EXIST_ERROR = new ErrorCode(90145, "圈子成员不存在");
    public static final ErrorCode AGENT_CANNOT_JOIN_TO_GROUP_ERROR = new ErrorCode(90145, "用户无法加入到当前圈子");

    /**
     * 调用 圈子 返回的错误码
     */
    public static final ErrorCode COMMED_NOT_EXIST = new ErrorCode(90144, "评论不存在");
    public static final ErrorCode COMMED_DELETE_ERR = new ErrorCode(90145, "评论删除失败");
    public static final ErrorCode OPERATION_ERR = new ErrorCode(90146, "操作失败");

    public static final ErrorCode BIG_AGENT_CANOT_JOIN = new ErrorCode(90147, "共用账号不在活动范围内哦~");
    public static final ErrorCode CLIENT_RECORD_HOUSE_FAILED = new ErrorCode(90148, "获取楼盘信息失败");


    public static final ErrorCode EMPTY_MSG_CODE = new ErrorCode(90148, "短信验证码不能为空");
    public static final ErrorCode ERROR_MSG_CODE = new ErrorCode(90149, "短信验证码不正确");
    public static final ErrorCode ERROR_IMAGE_CODE = new ErrorCode(90150, "验证码不正确");
    public static final ErrorCode ERROR_MSG_CODE_SENDED = new ErrorCode(90150, "验证码已发送");
    public static final ErrorCode AGENT_PHONE_CANOT_REPORT = new ErrorCode(90151, "提交失败，该号码已在房多多平台注册，请更换号码重试。");

    public static final ErrorCode C_REPORT_ERROR = new ErrorCode(90152, "该客户已在房多多报名看房，不可推客");
    public static final ErrorCode GROUP_INFO_ERROR = new ErrorCode(90153, "获取动态失败");
    public static final ErrorCode ERROR_CANNOT_BATCH = new ErrorCode(90154, "数据有误，批量操作失败，请单个操作");
    public static final ErrorCode LOUPAN_NOTSUPORT_HIDE_RECORD = new ErrorCode(90155, "该楼盘不支持隐号报备");
    public static final ErrorCode ALREADY_HIDE_RECORD_CUST = new ErrorCode(90156, "您已全号报备过该客户，请在报备记录找到该客户发起带看");
    public static final ErrorCode AGENT_VALUETE_BROKER_WRONG = new ErrorCode(90157, "一天只能评价专员5次喔");
    public static final ErrorCode AGENT_LOGING_MUCH_TIMES_ERROR = new ErrorCode(90158, "失败次数过多，请稍后重试");
    public static final ErrorCode AGENT_OLD_PASS_TIMES_ERROR = new ErrorCode(90159, "老密码错误次数过多，请稍后重试");
    public static final ErrorCode AGENT_REGISTER_TIMES_ERROR = new ErrorCode(90160, "获取验证码过于频繁，请稍后重试");

    public static final ErrorCode GROUP_NOT_EXIST_ERROR = new ErrorCode(90157, "圈子不存在");
    public static final ErrorCode GROUP_ANNOUNCE_ID_ERROR = new ErrorCode(90158, "公告ID错误");
    public static final ErrorCode GROUP_ANNOUNCE_CONTENT_ERROR = new ErrorCode(90159, "请填写公告内容，且不超过1000字");
    public static final ErrorCode GROUP_ANNOUNCE_TITLE_ERROR = new ErrorCode(90160, "请填写公告标题");
    public static final ErrorCode GROUP_ANNOUNCE_GROUP_ERROR = new ErrorCode(90161, "圈子ID错误");

    public static final ErrorCode GROUP_REVIEW_ID_ERROR = new ErrorCode(90162, "精彩回顾ID错误");
    public static final ErrorCode GROUP_REVIEW_TITLE_ERROR = new ErrorCode(90163, "请填写精彩回顾标题");
    public static final ErrorCode GROUP_REVIEW_CONTENT_ERROR = new ErrorCode(90164, "请填写精彩回顾引言，且不超过120字");
    public static final ErrorCode GROUP_REVIEW_IMAGE_ERROR = new ErrorCode(90165, "请填写精彩回顾的图片地址");
    public static final ErrorCode GROUP_REVIEW_URL_ERROR = new ErrorCode(90166, "请填写精彩回顾链接");
    public static final ErrorCode HOUSE_GROUP_EXISTS_ERROR = new ErrorCode(90167, "项目圈子已存在");
    public static final ErrorCode GROUP_CREATE_ERROR = new ErrorCode(90168, "圈子创建失败");

    public static final ErrorCode NON_HOUSE_GROUP_CANNOT_CREATE_ERROR = new ErrorCode(90169, "暂时不能创建项目圈子以外的圈子");
    public static final ErrorCode GROUP_NAME_IS_TOO_LONG_ERROR = new ErrorCode(90170, "圈子名称不能超过10个字符");
    public static final ErrorCode GROUP_INTRO_IS_TOO_LONG_ERROR = new ErrorCode(90171, "圈子简介不能超过100个字符");
    public static final ErrorCode GROUP_TYPE_INVALID_ERROR = new ErrorCode(90172, "圈子类型非法(1-俱乐部，2-大讲堂，3-地方圈子，4-楼盘圈子)");

    public static final ErrorCode PROJECT_SORT_VALUE_WRONG = new ErrorCode(90173, "Top5排序已满，请删除后再进行添加");
    public static final ErrorCode THEMATIC_ACTIVITY_NOT_EXIST = new ErrorCode(90174, "专题活动不存在");
    public static final ErrorCode OPERATE_ACTIVITY_ERROR = new ErrorCode(90175, "运营活动信息数据不符合要求");
    public static final ErrorCode ALREADY_REQUEST_REWARD = new ErrorCode(90176, "您已经申请提现...");
    public static final ErrorCode ACTIVITY_UNQUALIFIED = new ErrorCode(90177, "亲爱的用户，本次活动部分用户可参加，感谢您的支持，您可关注其它活动。");
    public static final ErrorCode MONEY_ERROR = new ErrorCode(90178, "金额异常，申请失败...");
    public static final ErrorCode TASK_UNFINISH = new ErrorCode(90179, "申请失败，挑战未完成...");
    public static final ErrorCode YOU_ALREADY_TEAMED = new ErrorCode(90180, "您已和他人组队，不能重新接受邀请");
    public static final ErrorCode HE_ALREADY_TEAMED = new ErrorCode(90181, "您的好友已经组队成功，不能重新接受邀请");
    public static final ErrorCode WRONG_BANK_ACCOUNT = new ErrorCode(90182, "银行卡号格式不正确");
    public static final ErrorCode PROJECT_IS_EXIST = new ErrorCode(90183, "楼盘已经存在，请重新选择！");

    public static final ErrorCode AGENT_BIND_IDCARD_ERROR = new ErrorCode(90184, "身份证号已被绑定过！");
    public static final ErrorCode AGENT_BIND_IDCARD_REPEAT = new ErrorCode(90185, "你当前身份认证已通过，不可重复绑定");
    public static final ErrorCode CUST_RECORD_ILLEAAL_NUMBER = new ErrorCode(90194, "不可带看自己号码，请选择其他号码");
    public static final ErrorCode CREATE_THEMATIC_ACTIVITY_FAIL = new ErrorCode(90195, "创建专题活动失败");
    public static final ErrorCode NO_TEAM = new ErrorCode(90196, "未组队...");
    public static final ErrorCode ONCE_A_DAY = new ErrorCode(90197, "每天只能鼓励一次哦");
    public static final ErrorCode CANNOT_TEAM_BY_SELF = new ErrorCode(90198, "自己不能接受自己发出的组队邀请哦");
    public static final ErrorCode COUNT_DOWN_TO_ZERO = new ErrorCode(90199, "您今天的抽奖次数已经用完哦");
    public static final ErrorCode FILE_DATA_WRONG = new ErrorCode(90200, "导入文件格式有误！");
    public static final ErrorCode BANNER_IS_FULL = new ErrorCode(90201, "广告位已满！");
    public static final ErrorCode CUST_NAME_TOO_LONG = new ErrorCode(90202, "客户姓名过长！");

    public static final ErrorCode PROJECT_NAME_CANNOT_NULL = new ErrorCode(90201, "项目名称不能为空！");
    public static final ErrorCode COMPANY_CANNOT_NULL = new ErrorCode(90202, "公司名称不能为空！");
    public static final ErrorCode NAME_CANNOT_NULL = new ErrorCode(90203, "姓名不能为空！");
    public static final ErrorCode OP_SIZE_TOO_BIG = new ErrorCode(90204, "城市运营位已满！");

    public static final ErrorCode SHARE_CONTENT_NOT_EXIST = new ErrorCode(90205, "分享内容不存在");
    public static final ErrorCode STORE_KEEPER_NAME_IS_EMPTY = new ErrorCode(90206, "店主姓名为空");
    public static final ErrorCode STORE_KEEPER_PHONE_IS_EMPTY = new ErrorCode(90207, "店主电话为空");
    public static final ErrorCode STORE_NAME_IS_EMPTY = new ErrorCode(90208, "门店名称为空");
    public static final ErrorCode STORE_CITY_IS_EMPTY = new ErrorCode(90209, "门店所在城市为空");
    public static final ErrorCode ALREADY_REQUEST_NEW_STORE_BEFORE = new ErrorCode(90210, "您之前已经申请过新门店");
    public static final ErrorCode ALREADY_ADDED_THIS_PROJECT = new ErrorCode(90211, "已添加过楼盘，不可重复添加");
    public static final ErrorCode INSERT_MAX_TEN = new ErrorCode(90212, "一次最多只能添加10个楼盘");
    public static final ErrorCode ALREADY_APPLIED_DIDI_VIP = new ErrorCode(90213, "不可重复申请");

    public static final ErrorCode INCREASE_OR_DECREASE_SCORE_INVALID = new ErrorCode(90214, "增加或扣减的积分必须大于0.");
    public static final ErrorCode SCORE_TYPE_INVALID = new ErrorCode(90215, "积分类型不能为空.");
    public static final ErrorCode NOT_HAVE_ENOUGH_SCORE = new ErrorCode(90216, "没有足够的积分.");
    public static final ErrorCode PUSH_TYPE_INVALID = new ErrorCode(90217, "推送类型不能为空.");
    public static final ErrorCode PUSH_NOT_EXIST = new ErrorCode(90217, "推送不存在.");
    public static final ErrorCode PAGE_INFO_INVALID = new ErrorCode(90218, "分页信息不能为空.");
    public static final ErrorCode PAGE_NO_INVALID = new ErrorCode(90219, "分页页码必须大小等于0.");
    public static final ErrorCode PAGE_SIZE_INVALID = new ErrorCode(90220, "分页页大小必须大于0且小于5000.");
    public static final ErrorCode DUPLICATE_SCORE_OP_REQUEST_ERROR = new ErrorCode(90221, "重复的积分操作请求.agentId:%d,scoreType:%s,bizId:%d");

    public static final ErrorCode USER_CITY_EMPTY = new ErrorCode(90222, "获取城市信息异常");
    public static final ErrorCode NOT_IN_TOP_200_DEAL = new ErrorCode(90223, "您的成交名次不在200名之内，不满足领取条件");
    public static final ErrorCode ACTIVITY_OVER = new ErrorCode(90224, "活动已结束");
    public static final ErrorCode ALREADY_SIGIED_UP = new ErrorCode(90225, "您已经报名此活动，请勿重复报名");
    public static final ErrorCode IMPORT_FILE_NOT_EXIST = new ErrorCode(90226, "导入文件不存在！");
    public static final ErrorCode PARSE_IMPORT_FILE_DATA_WRONG = new ErrorCode(90227, "解析文件失败！");
    public static final ErrorCode IMPORT_FILE_IS_EMPTY = new ErrorCode(90228, "导入文件为空！");

    public static final ErrorCode UPDATE_CITY_ALL_CACHE = new ErrorCode(90229, "刷新城市本地缓存信息失败");
    public static final ErrorCode STATISTICS_TRANSACTION_ERROR = new ErrorCode(90230, "避免影响线上业务，N不能超过62");

    public static final ErrorCode POSTER_THEME_LENGTH_ERROR = new ErrorCode(90231, "海报主题不能超过128个字");
    public static final ErrorCode CUST_H5_REPORTED_TO_OTHER_AGENT = new ErrorCode(90232, "您已在房多多预约过此楼盘，不可重复预约");

    public static final ErrorCode AGENT_DID_NOT_BIND_STORE = new ErrorCode(90233, "经纪人未绑定门店");
    public static final ErrorCode AGENT_NOT_BIND_STORE_BAN_PURCHASE = new ErrorCode(90233, "您还未绑定门店，请先绑定门店再进行购买");
    public static final ErrorCode PASSWORD_LENGTH_TOO_LONG = new ErrorCode(90234, "请输入至少6位密码");
    public static final ErrorCode NOT_POTENTIAL_HOUSE = new ErrorCode(90235, "该楼盘不是超级导客楼盘.");
    public static final ErrorCode REGISTER_FAILED_FROM_UC = new ErrorCode(90236, "无法在用户中心注册该用户.");
    public static final ErrorCode USER_EXISTS_BUT_USERNAME_DIFF_ERROR = new ErrorCode(90237, "该用户已在经纪人表中存在但姓名与所传参数不同.");
    public static final ErrorCode USER_NAME_INVALID = new ErrorCode(90238, "用户名不合法.");
    public static final ErrorCode ID_INVALID = new ErrorCode(90239, "身份证号不合法.");
    public static final ErrorCode MAX_QUERY_SIZE_LIMIT = new ErrorCode(90240, "单次查询只支持批量查询500条.");

    public static final ErrorCode PROJECT_TARGET_UPDATE_FAILED = new ErrorCode(90241, "楼盘显示配置信息更新失败");
    public static final ErrorCode PROJECT_TARGET_ADD_FAILED = new ErrorCode(90242, "楼盘显示配置信息新增失败");
    public static final ErrorCode PROJECT_TARGET_DEL_FAILED = new ErrorCode(90243, "楼盘显示配置信息删除失败");
    public static final ErrorCode PROJECT_TARGET_QUERY_FAILED = new ErrorCode(90244, "楼盘显示配置信息查询失败");

    public static final ErrorCode ACTIVITY_NOT_START_ERROR = new ErrorCode(90246, "活动尚未开始，敬请期待");
    public static final ErrorCode ACTIVITY_ALREADY_END_ERROR = new ErrorCode(90247, "很抱歉，活动已结束");
    public static final ErrorCode HAS_NO_INVITE_QUALIFY_ERROR = new ErrorCode(90248, "很抱歉，您不具备邀请资格哦");
    public static final ErrorCode HAS_NO_INVITED_QUALIFY_ERROR = new ErrorCode(90249, "很抱歉，您邀请的经纪人已有过带看记录");
    public static final ErrorCode USER_HAS_INVITED_BY_OTHERS_ERROR = new ErrorCode(90250, "很抱歉，您邀请的经纪人已被他人邀请");
    public static final ErrorCode USER_IS_NOT_FDD_USER_ERROR = new ErrorCode(90251, "很抱歉，您邀请的经纪人不是房多多合作经纪人");
    public static final ErrorCode USER_HAS_INVITED_BY_YOURSELF_ERROR = new ErrorCode(90252, "您已邀请过此经纪人");
    public static final ErrorCode CANNOT_INVITE_YOURSELF_ERROR = new ErrorCode(90253, "不可以邀请自己哦");
    public static final ErrorCode NOT_FDD_COOPERATOR_ERROR = new ErrorCode(90254, "您不是房多多合作经纪人，不具备邀请资格哦");

    public static final ErrorCode JOIN_PRIVATE_CUST_ERROR = new ErrorCode(90255, "加入私客失败");
    public static final ErrorCode UNBIND_ERROR = new ErrorCode(90255, "解绑失败");

    public static final ErrorCode HIDE_MOBILE_CUST_ADD_PRIVATE_POOL_ERROR = new ErrorCode(90256, "隐号客户需要补全号码后才能加私");
    public static final ErrorCode CUST_ALREADY_ADD_PRIVATE_POOL_ERROR = new ErrorCode(90257, "已是私客，无需重复添加");
    public static final ErrorCode AGENT_UPDATE_CALL_NUM_NOT_INDUCT = new ErrorCode(90258, "未入职人员无法修改外呼号码哦");
    public static final ErrorCode AGENT_UPDATE_PERSONALITY_NOT_INDUCT = new ErrorCode(90259, "未入职人员无法修改个人介绍哦");
    public static final ErrorCode AGENT_UPDATE_PORTRAIT_NOT_INDUCT = new ErrorCode(90264, "未入职人员无法修改头像哦");
    public static final ErrorCode AGENT_UPDATE_CELLLIST_NOT_INDUCT = new ErrorCode(90265, "未入职人员无法修改精耕小区哦");
    public static final ErrorCode AGENT_UPDATE_TAG_NOT_INDUCT = new ErrorCode(90260, "未入职人员无法修改标签哦");
    public static final ErrorCode AGENT_UPDATE_CAEEERTIME_NOT_INDUCT = new ErrorCode(90266, "未入职人员无法修改从业时间哦");
    public static final ErrorCode ID_CARD_AUDIT_RECORD_NOT_EXIST = new ErrorCode(90261, "该经纪人不存在身份证审核记录");
    public static final ErrorCode ID_CARD_AUDIT_ALREADY_PASS = new ErrorCode(90262, "该经纪人实名认证已经通过");
    public static final ErrorCode ID_CARD_AUDIT_NOT_PASS = new ErrorCode(90263, "该经纪人未通过实名认证");

    public static final ErrorCode AGENT_DID_BINDED_STORE = new ErrorCode(90264, "您已经在职，不能绑定新门店");

    public static final ErrorCode COMPANY_NAME_EMPTY = new ErrorCode(90265, "请输入公司名称");
    public static final ErrorCode CITY_NAME_EMPTY = new ErrorCode(90266, "请输入所在城市");

    public static final ErrorCode MOBILE_EMPTY = new ErrorCode(90268, "请输入联系电话");
    public static final ErrorCode MOBILE_IS_INVADLID = new ErrorCode(90269, "电话只能输入数字哦");
    public static final ErrorCode ROLE_EMPTY = new ErrorCode(90267, "请选择您的职务");

    public static final ErrorCode ALC_INVOKE_ERROR = new ErrorCode(90268, "ALC接口调用出错");
    public static final ErrorCode AMC_INVOKE_ERROR = new ErrorCode(90268, "AMC接口调用出错");
    public static final ErrorCode NHC_INVOKE_ERROR = new ErrorCode(90268, "NHC接口调用出错");


    public static final ErrorCode BUSINESS_TYPE_EMPTY = new ErrorCode(90269, "业务类型不能为空");

    public static final ErrorCode PACKAGE_ID_EMPTY = new ErrorCode(90270, "套餐 ID 不能为空");

    public static final ErrorCode PORT_TYPE_ID_EMPTY = new ErrorCode(90270, "端口类型 ID 不能为空");

    public static final ErrorCode PORT_COUNT_EMPTY = new ErrorCode(90270, "端口数量不能为空");


    public static final ErrorCode ADD_OR_UPDATE_HOUSE_ARTICLE_ERROR = new ErrorCode(90269, "添加或修改楼盘日记错误");
    public static final ErrorCode OPERATE_HOUSE_ARTICLE_ERROR = new ErrorCode(90270, "操作楼盘日记错误");
    public static final ErrorCode CONTAIN_SENSITIVE_WORD = new ErrorCode(90271, "输入存在敏感词：");
    public static final ErrorCode CONTAIN_MOBILE = new ErrorCode(90272, "输入存在手机号：");
    public static final ErrorCode ID_CARD_AUDIT_PASS_CAN_LEAD = new ErrorCode(90273, "实名认证通过后才可使用客多多权益");
    public static final ErrorCode NAME_CARD_AUDIT_PASS_CAN_LEAD = new ErrorCode(90274, "名片认证通过后才可使用客多多权益");

    public static final ErrorCode HOLD_CELL_NUMBER_LIMIT = new ErrorCode(90274, "专家小区只能填写一个");
    /** 100000- 工具异常*/
    public static final ErrorCode HOUSEIDS_NOT_EXIST = new ErrorCode(100001, "请先选择推送房源");
    public static final ErrorCode ACCOUNTIDS_NOT_EXIST = new ErrorCode(100002, "请选择发布帐号");
    public static final ErrorCode DELIVER_HOUSE_FAIL = new ErrorCode(100003, "推送房源失败");
    public static final ErrorCode NO_TUIFANG_RIGHT = new ErrorCode(100004, "您未开通推房大师");
    public static final ErrorCode DELIVER_NUMBER_LIMIT = new ErrorCode(100005, "推送房源数超过限制数");
    public static final ErrorCode HOUSE_INFO_NOT_COMPLETED = new ErrorCode(100006, "推送房源信息未完善，请先完善");
    public static final ErrorCode IMPORT_HOUSE_FAIL = new ErrorCode(100007, "导入房源失败");

    public static final ErrorCode RENT_API_INVOKE_ERROR = new ErrorCode(20276, "接口调用失败");
    public static final ErrorCode RENT_PROCESS_ERROR = new ErrorCode(90281, "租房流程接口调用失败");
    public static final ErrorCode RENT_GUIDE_APPLY_FAILED = new ErrorCode(90275, "租房申请带看失败");
    public static final ErrorCode RENT_GUIDE_DETAIL_ERROR = new ErrorCode(90276, "租房带看详情查询失败");
    public static final ErrorCode RENT_GUIDE_LOG_GET_ERROR = new ErrorCode(90277, "租房带看日志查询失败");
    public static final ErrorCode GUIDE_RECORD_NOT_EXIST = new ErrorCode(90278, "带看记录不存在");
    public static final ErrorCode LONGTITUDE_ILLEGAL = new ErrorCode(90278, "经度不合法");
    public static final ErrorCode LATITUDE_ILLEGAL = new ErrorCode(90279, "纬度不合法");
    public static final ErrorCode RENT_HOUSE_NOT_EXIST = new ErrorCode(90280, "房源不存在");
    public static final ErrorCode QUERY_FAILED = new ErrorCode(90281, "查询失败");
    public static final ErrorCode INSERT_FAILED = new ErrorCode(90282, "插入失败");
}
