package com.sean.springboot.bean;


import java.util.HashMap;
import java.util.Map;

public class ResponseCode {
    public static final Integer STATUS_OK = 0;
    /* 90X 其它*/
    public static final Integer STATUS_JSON_SYNTAX_ERROR = 9000;
    public static final Integer UNKNOWN_ERROR = 9001;
    /* 9002 个人容器数量超过限制*/
    public static final Integer PERSONAL_RESOURCE_COUNT_LIMIT = 9002;
    /* 9003 删除容器失败*/
    public static final Integer DELETE_RESOURCE_ERROR = 9003;
    /* 9004 根据代码库信息查询资源失败*/
    public static final Integer GET_RESOURCE_BY_CODE_INFO_ERROR = 9004;
    /* 9005 获取个人容器数量失败*/
    public static final Integer GET_RESOURCE_COUNT_ERROR = 9005;
    /* 9006 已经有同名的容器*/
    public static final Integer REPEATED_RESOURCE_NAME = 9006;
    /* 9007 根据镜像名获取镜像信息失败*/
    public static final Integer GET_IMAGE_BY_IMAGE_NAME_ERROR = 9007;
    /* 9008 镜像名不存在*/
    public static final Integer IMAGE_NAME_NOT_EXIST = 9008;
    /* 9009 镜像不存在*/
    public static final Integer IMAGE_NOT_EXIST = 9009;
    /* 9010 获取资源总数失败*/
    public static final Integer GET_CURRENT_RESOURCE_COUNT_ERROR = 9010;
    /* 9011 系统资源数量已达到上线*/
    public static final Integer RESOURCES_COUNT_LIMIT = 9011;
    /* 9012 删除资源时改库失败*/
    public static final Integer DELETE_RESOURCE_DB_ERROR = 9012;
    /* 9013 删除资源失败*/
    public static final Integer DEL_RESOURCE_FAIL = 9013;
    /* 9014 创建资源异常*/
    public static final Integer CREATE_RESOURCE_EXCEPTION = 9014;
    /* 9015 创建资源失败*/
    public static final Integer CREATE_RESOURCE_FAIL = 9015;
    /* 9016 获取用户信息失败*/
    public static final Integer GET_USERINFO_FAIL = 9016;
    /* 9017 获取资源配置信息失败*/
    public static final Integer GET_RESOURCE_CONF_FAIL = 9017;
    /* 9018 从第三方平台获取创建Web IDE返回code不为0*/
    public static final Integer GET_CODE_INFO_FROM_THIRD_FAIL = 9018;
    /* 9019 从第三方平台获取创建Web IDE返回code不为0*/
    public static final Integer GET_CODE_INFO_FROM_THIRD_PARAM_ERROR = 9019;
    /* 9020 升级失败*/
    public static final Integer UPGRADER_FAIL = 9020;
    /* 9021 创建资源状态会写失败*/
    public static final Integer CREATE_CALLBACK_STATUS_INVALID = 9021;
    /* 9022 创建资源状态会写失败*/
    public static final Integer CREATE_CALLBACK_STATUS_EXCEPTION = 9022;
    /* 9023 容器信息上报失败*/
    public static final Integer CREATE_CALLBACK_POD_EXCEPTION = 9023;
    /* 9024 无已授权的ssh key*/
    public static final Integer NO_AUTH_SSH_KEY = 9024;
    /* 9025 Web IDE暂停失败*/
    public static final Integer SUSPEND_RESOURCE_FAIL = 9025;
    /* 9026 校验镜像与用户所属关系失败*/
    public static final Integer CHECK_USER_OWNER_FAIL = 9026;

    public static final Integer UPDATE_DISPLAYNAME_FAIL = 9027;
    public static final Integer PARAM_DISPLAYNAME_ERROR = 9028;

    /* 9029 删除端口异常 */
    public static final Integer DEL_PORT_EXCEPTION = 9029;
    /* 9030 删除端口失败 */
    public static final Integer DEL_PORT_FAIL = 9030;
    /* 9031 用户无机器访问权限 */
    public static final Integer NO_MACHINE_VISIT_AUTH = 9031;
    /* 9032 修改端口权限异常 */
    public static final Integer CHANGE_PORT_AUTH_EXCEPTION = 9032;
    /* 9033 修改端口权限失败 */
    public static final Integer CHANGE_PORT_AUTH_FAIL = 9033;
    /* 9034 获取端口列表异常 */
    public static final Integer GET_PORT_LIST_EXCEPTION = 9034;
    /* 9035 获取端口列表失败 */
    public static final Integer GET_PORT_LIST_FAIL = 9035;
    /* 9036 添加端口异常 */
    public static final Integer ADD_PORT_EXCEPTION = 9036;
    /* 9037 添加端口失败 */
    public static final Integer ADD_PORT_FAIL = 9037;
    /* 9038 评审插件禁用消息失败 */
    public static final Integer CODE_REVIEW_DISABLE_MSG_ERROR = 9038;
    /* 9039 用户设置了不再提醒时插件拉消息 */
    public static final Integer GET_MSG_WHEN_NO_NOTICE_ERROR = 9039;
    /* 9040 不存在可用的pod*/
    public static final Integer AVAILABLE_POD_NOT_EXIST = 9040;
    /* 9041 分配licence错误*/
    public static final Integer LICENCE_ERROR = 9041;
    /* 9042 无licence*/
    public static final Integer NO_LICENCE = 9042;
    /* 9043 预创建IDEA空pod失败*/
    public static final Integer CREATE_POD_FAIL = 9043;
    /* 9044 查询可用idea pod失败*/
    public static final Integer CHECK_AVAILABLE_POD_FAIL = 9044;
    /* 9045 释放资源状态错误*/
    public static final Integer DELETE_RESOURCE_STATUS_ERROR = 9045;
    /* 9046 查询资源信息错误*/
    public static final Integer GET_RESOURCE_INFO_ERROR = 9046;
    /* 9047 查询资源信息错误*/
    public static final Integer TRY_AGAIN_CREATE_IDEA_RESOURCE = 9047;
    /* 9048 查询专业版IDEA可用pod*/
    public static final Integer NO_AVAILABLE_POD = 9048;
    /* 9049 查询ideaMcPO失败*/
    public static final Integer GET_IDEAMCENTITY_FAIL = 9049;
    /* 9050 非管理员无权操作*/
    public static final Integer NO_HAVE_PERMISSION = 9050;
    /* 9051 无打开开关的镜像*/
    public static final Integer NO_IMAGE_OPEN_ON = 9051;
    /* 9052 无web ide可以升级镜像*/
    public static final Integer NO_WEBIDE_TO_UPDATE_IMAGE = 9052;
    /* 9053 升级镜像完成*/
    public static final Integer WEBIDE_UPDATE_IMAGE_OVER = 9053;
    /* 9054 预创建数量设置不合理*/
    public static final Integer INVALID_PRECREATE_NUM = 9054;
    /* 9055 reload更新reload时间失败*/
    public static final Integer CHANGE_RELOAD_TIME_ERROR = 9055;
    /* 9056 自定义模版镜像信息校验失败*/
    public static final Integer CHECK_TEMPLATE_IMAGE_ERROR = 9056;
    /* 9057 没有修改自定义模版权限*/
    public static final Integer NO_MODIFY_TEMPLATE_AUTH = 9057;
    /* 9058 预览WebIDE数量已经达到最大值！注意此id不能变，前端针对此id做了处理*/
    public static final Integer PREVIEW_RESOURCE_NUM_MAX = 9058;
    /* 9059 更改模板中系统镜像的url或者tag失败*/
    public static final Integer CHANGE_URL_OR_TAG_FAIL = 9059;
    /* 9060 获取用户的iCode token失败*/
    public static final Integer GET_ICODE_TOKEN_FAIL = 9060;
    /* 9061 部分或全部代码库无权限*/
    public static final Integer NO_CODES_AUTH_FAIL = 9061;
    /* 9062 获取模板信息失败*/
    public static final Integer GET_TEMPLATE_FAIL = 9062;
    /* 模版名规则检验失败*/
    public static final Integer TEMPLATE_NAME_NOT_VALID = 9063;
    /* 模版名重复*/
    public static final Integer TEMPLATE_NAME_REPEAT = 9064;
    /* 9065 未获取到广告信息*/
    public static final Integer GET_NO_ADVERTISE = 9065;
    /* 9066 获取广告信息失败*/
    public static final Integer GET_ADVERTISE_ERROR = 9066;
    /* 9067 添加新的广告信息失败*/
    public static final Integer ADD_NEW_ADVERTISE_FAIL = 9067;
    /* 9068 添加新的广告信息失败*/
    public static final Integer HAVE_PREVIEW_RESOURCE_FAIL = 9068;
    /* 9069 获取用户是否添加过资源失败*/
    public static final Integer CHECK_HAS_RESOURCE_FAIL = 9069;
    /* 9070 卧龙聊天发送消息失败*/
    public static final Integer SEND_VIRLON_MESSAGE_FAIL = 9070;
    /* 9071 卧龙聊天接收消息失败*/
    public static final Integer RECEIVE_VIRLON_MESSAGE_FAIL = 9071;
    /* 9072 发送消息失败 */
    public static final Integer SEND_MSG_ERROR = 9072;
    /* 9073 开启webide的docker失败*/
    public static final Integer OPEN_DOCKER_RESOURCE_FAIL = 9073;
    /* 9074 关闭webide的docker失败*/
    public static final Integer CLOSE_DOCKER_RESOURCE_FAIL = 9074;
    /* 9075 资源配置不在计价套餐范围内*/
    public static final Integer RESOURCE_CONFIG_OUT_CHARGE_ERROR = 9075;
    /* 9076 根据代码库信息获取webide失败*/
    public static final Integer GET_RESOURCE_BY_REPO_INFO_FAIL = 9076;
    /*代码库没有绑定模版*/
    public static final Integer CODE_NO_HAVE_THIS_TEMPLATE = 9077;
    /* 9078 第三方平台更新镜像失败*/
    public static final Integer UPDATE_THIRD_RESOURCE_IMAGE_ERROR = 9078;
    /* 9079 修改广告信息失败*/
    public static final Integer UPDATE_ADVERTISE_ERROR = 9079;
    /* 9077 update resource region fail */
    public static final Integer UPDATE_RESOURCE_REGION_FAIL = 9077;
    /*  check user can download error */
    public static final Integer CHECK_CAN_DOWNLOAD_ERROR = 9078;
    /*  check user utoken error */
    public static final Integer INVALID_TOKEN = 9080;
    /* 9081 change resource configure error */
    public static final Integer CHANGE_RESOURCE_CONFIGURE_ERROR = 9081;
    /* 9082 change resource configure error */
    public static final Integer AWARD_MEDAL_ERROR = 9082;
    /* 9083 attach cds error */
    public static final Integer ATTACH_CDS_ERROR = 9083;
    /* 9084 attach cds error */
    public static final Integer DETACH_CDS_ERROR = 9084;
    /* 9085 check is iCoding error */
    public static final Integer CHECK_IS_ICODING = 9085;
    /* 9086 check is ai insider user error */
    public static final Integer CHECK_IS_AI_INSIDER_USER = 9086;
    /* 9087 get job detail fail */
    public static final Integer GET_SCI_JOB_DETAIL_FAIL = 9087;
    /* 9088 get cluster usage fail */
    public static final Integer GET_SCI_USAGE_FAIL = 9088;
    /* 9089 get sci job status fail */
    public static final Integer GET_SCI_RESOURCE_STATUS_FAIL = 9089;
    /* 9086 create ens service error */
    public static final Integer CREATE_ENS_SERVICE_ERROR = 9090;
    /* 9086 delete ens service error */
    public static final Integer DELETE_ENS_SERVICE_ERROR = 9091;

    public static final Integer JWT_TOKEN_ERROR = 9092;
    /* 9093 Web IDE重启失败 */
    public static final Integer RESTART_RESOURCE_FAIL = 9093;
    /* 9094 未登录或登录超时 */
    public static final Integer LOGIN_OUT_TIME = 9094;
    /* 9095 COOKIE为空 */
    public static final Integer COOKIE_EMPTY = 9095;
    /* 9096 COOKIE解析失败 */
    public static final Integer COOKIE_ERROR = 9096;
    /* 9097 登录账户重复 */
    public static final Integer LOGIN_NAME_REPEAT = 9097;
    /* 9098 原密码错误 */
    public static final Integer OLD_PWD_ERROR = 9098;

    /* 9099 第三方获取仓库列表失败 */
    public static final Integer REPO_LIST_ERROR = 9099;

    /* 9100 第三方获取仓库分支列表失败 */
    public static final Integer REPO_BRANCH_LIST_ERROR = 9100;

    /* 9101 第三方请求失败 */
    public static final Integer TH_REQUEST_ERROR = 9101;

    /* 9102 命令行执行失败 */
    public static final Integer EXEC_CMD_ERROR = 9102;

    /* 9103 获取公钥失败 */
    public static final Integer FETCH_PUBLIC_ERROR = 9103;

    /* 9104 添加公钥失败 */
    public static final Integer PUSH_PUBLIC_ERROR = 9104;

    /* 9105 容器中执行命令失败 */
    public static final Integer POD_EXEC_CMD_ERROR = 9105;

    /* 9106 弹性伸缩失败 */
    public static final Integer AUTO_SCALE_ERROR = 9106;

    /* 9107 获取服务详情失败 */
    public static final Integer GET_SERVICE_DETAIL_ERROR = 9107;

    /* 9108 修改环境变量失败 */
    public static final Integer MODIFY_ENV_ERROR = 9108;

    /* 9109 删除持久化卷失败 */
    public static final Integer DELETE_VOLUME_ERROR = 9109;

    /* 9110 删除服务失败 */
    public static final Integer DELETE_APP_SERVICE_ERROR = 9110;

    /* 9111 创建sts失败 */
    public static final Integer CREATE_STS_ERROR = 9111;

    /* 9112 卸载持久化卷失败 */
    public static final Integer UNMOUNT_VOLUME_ERROR = 9112;

    /* 9113 启动或停止服务失败 */
    public static final Integer STOP_OR_START_ERROR = 9113;

    /* 9114 获取服务yaml详情失败 */
    public static final Integer GET_SERVICE_YAML_DETAIL_ERROR = 9114;

    /* 9115 通过yaml更新服务失败 */
    public static final Integer UPDATE_SERVICE_BY_YAML_ERROR = 9115;

    /* 9116 瑶光平台向用户发送站内信失败 */
    public static final Integer SEND_INTERNAL_MESSAGE_ERROR = 9116;

    public static final Integer NOT_FOUND_DATA = 9200;

    public static final Integer NOT_PERMISSION = 9205;

    /* 1000 参数错误*/
    public static final Integer PARAM_ERROR = 1000;

    public static final Map<Integer, String> STATUS_DEFAULT_MESSAGE = new HashMap<Integer, String>();

    static {
        STATUS_DEFAULT_MESSAGE.put(STATUS_OK, "OK.");
        STATUS_DEFAULT_MESSAGE.put(STATUS_JSON_SYNTAX_ERROR, "Json syntax error.");
        STATUS_DEFAULT_MESSAGE.put(UNKNOWN_ERROR, "Unknown error.");
        STATUS_DEFAULT_MESSAGE.put(PARAM_ERROR, "param error.");
        STATUS_DEFAULT_MESSAGE.put(DELETE_RESOURCE_ERROR, "delete resource error.");
        STATUS_DEFAULT_MESSAGE.put(IMAGE_NAME_NOT_EXIST, "镜像名不存在");
        STATUS_DEFAULT_MESSAGE.put(GET_RESOURCE_BY_CODE_INFO_ERROR, "校验是否已创建同类型容器失败");
        STATUS_DEFAULT_MESSAGE.put(GET_IMAGE_BY_IMAGE_NAME_ERROR, "获取资源总量失败");
        STATUS_DEFAULT_MESSAGE.put(GET_RESOURCE_COUNT_ERROR, "获取个人资源数量失败");
        STATUS_DEFAULT_MESSAGE.put(CREATE_RESOURCE_EXCEPTION, "创建资源异常");
        STATUS_DEFAULT_MESSAGE.put(CREATE_RESOURCE_FAIL, "创建资源失败");
        STATUS_DEFAULT_MESSAGE.put(GET_RESOURCE_CONF_FAIL, "获取资源配置失败");
        STATUS_DEFAULT_MESSAGE.put(GET_CODE_INFO_FROM_THIRD_FAIL, "从第三方获取代码信息状态异常");
        STATUS_DEFAULT_MESSAGE.put(GET_CODE_INFO_FROM_THIRD_PARAM_ERROR, "从第三方获取代码信息缺失");
        STATUS_DEFAULT_MESSAGE.put(REPEATED_RESOURCE_NAME, "资源名重复");
        STATUS_DEFAULT_MESSAGE.put(CREATE_CALLBACK_STATUS_INVALID, "create callback error:status is invalid");
        STATUS_DEFAULT_MESSAGE.put(CREATE_CALLBACK_STATUS_EXCEPTION, "create callback exception");
        STATUS_DEFAULT_MESSAGE.put(NO_AUTH_SSH_KEY, "无已授权的ssh key");
        STATUS_DEFAULT_MESSAGE.put(SUSPEND_RESOURCE_FAIL, "Web IDE暂停失败");
        STATUS_DEFAULT_MESSAGE.put(GET_USERINFO_FAIL, "获取用户信息失败");
        STATUS_DEFAULT_MESSAGE.put(DEL_RESOURCE_FAIL, "删除资源失败");
        STATUS_DEFAULT_MESSAGE.put(GET_CURRENT_RESOURCE_COUNT_ERROR, "获取系统资源总数量失败");
        STATUS_DEFAULT_MESSAGE.put(RESOURCES_COUNT_LIMIT, "系统资源不足，待添加资源后试用");
        STATUS_DEFAULT_MESSAGE.put(PERSONAL_RESOURCE_COUNT_LIMIT, "您所拥有的容器已达到最大数量");
        STATUS_DEFAULT_MESSAGE.put(CHECK_USER_OWNER_FAIL, "校验镜像所属关系失败");
        STATUS_DEFAULT_MESSAGE.put(UPDATE_DISPLAYNAME_FAIL, "修改代码空间名称失败或无权修改");
        STATUS_DEFAULT_MESSAGE.put(PARAM_DISPLAYNAME_ERROR, "代码空间名称长度需要介于3-100之间");
        STATUS_DEFAULT_MESSAGE.put(ADD_PORT_EXCEPTION, "添加端口重复");
        STATUS_DEFAULT_MESSAGE.put(ADD_PORT_FAIL, "添加端口失败");
        STATUS_DEFAULT_MESSAGE.put(DEL_PORT_EXCEPTION, "删除端口异常");
        STATUS_DEFAULT_MESSAGE.put(DEL_PORT_FAIL, "删除端口失败");
        STATUS_DEFAULT_MESSAGE.put(NO_MACHINE_VISIT_AUTH, "用户无机器访问权限");
        STATUS_DEFAULT_MESSAGE.put(CHANGE_PORT_AUTH_EXCEPTION, "修改端口权限异常");
        STATUS_DEFAULT_MESSAGE.put(CHANGE_PORT_AUTH_FAIL, "修改端口权限失败");
        STATUS_DEFAULT_MESSAGE.put(GET_PORT_LIST_EXCEPTION, "获取端口列表异常");
        STATUS_DEFAULT_MESSAGE.put(GET_PORT_LIST_FAIL, "获取端口列表失败");
        STATUS_DEFAULT_MESSAGE.put(CODE_REVIEW_DISABLE_MSG_ERROR, "评审插件禁用消息失败");
        STATUS_DEFAULT_MESSAGE.put(GET_MSG_WHEN_NO_NOTICE_ERROR, "用户已设置不再提醒消息");
        STATUS_DEFAULT_MESSAGE.put(TRY_AGAIN_CREATE_IDEA_RESOURCE, "换个姿势再试试");
        STATUS_DEFAULT_MESSAGE.put(NO_AVAILABLE_POD, "已抢完，快去催icoding同学补货啊啊啊啊");
        STATUS_DEFAULT_MESSAGE.put(CHECK_TEMPLATE_IMAGE_ERROR, "镜像信息校验失败");
        STATUS_DEFAULT_MESSAGE.put(NO_MODIFY_TEMPLATE_AUTH, "该用户无权修改该模版");
        STATUS_DEFAULT_MESSAGE.put(PREVIEW_RESOURCE_NUM_MAX, "已经存在预览类型的WebIDE，请先删除再使用预览功能");
        STATUS_DEFAULT_MESSAGE.put(GET_ICODE_TOKEN_FAIL, "获取iCode token失败");
        STATUS_DEFAULT_MESSAGE.put(NO_CODES_AUTH_FAIL, "部分或全部代码库务权限");
        STATUS_DEFAULT_MESSAGE.put(TEMPLATE_NAME_NOT_VALID, "模版名称不符合要求");
        STATUS_DEFAULT_MESSAGE.put(TEMPLATE_NAME_REPEAT, "模版名称重复");
        STATUS_DEFAULT_MESSAGE.put(HAVE_PREVIEW_RESOURCE_FAIL, "是否存在于创建类型资源失败");
        STATUS_DEFAULT_MESSAGE.put(SEND_VIRLON_MESSAGE_FAIL, "卧龙发送消息失败");
        STATUS_DEFAULT_MESSAGE.put(RECEIVE_VIRLON_MESSAGE_FAIL, "卧龙接收消息失败");
        STATUS_DEFAULT_MESSAGE.put(OPEN_DOCKER_RESOURCE_FAIL, "开启docker功能失败");
        STATUS_DEFAULT_MESSAGE.put(CLOSE_DOCKER_RESOURCE_FAIL, "关闭docker功能失败");
        STATUS_DEFAULT_MESSAGE.put(UPDATE_THIRD_RESOURCE_IMAGE_ERROR, "第三方平台更新镜像失败");
        STATUS_DEFAULT_MESSAGE.put(RESOURCE_CONFIG_OUT_CHARGE_ERROR, "资源配置不在计价套餐范围内");
        STATUS_DEFAULT_MESSAGE.put(GET_RESOURCE_BY_REPO_INFO_FAIL, "根据代码库获取用户WebIDE列表失败");
        STATUS_DEFAULT_MESSAGE.put(CODE_NO_HAVE_THIS_TEMPLATE, "该代码库未绑定这个模版");
        STATUS_DEFAULT_MESSAGE.put(CHECK_CAN_DOWNLOAD_ERROR, "判断该用户是否可以使用下载功能失败");
        STATUS_DEFAULT_MESSAGE.put(INVALID_TOKEN, "invalid utoken.");
        STATUS_DEFAULT_MESSAGE.put(CHANGE_RESOURCE_CONFIGURE_ERROR, "容器配置变更失败");
        STATUS_DEFAULT_MESSAGE.put(AWARD_MEDAL_ERROR, "授予徽章失败");
        STATUS_DEFAULT_MESSAGE.put(ATTACH_CDS_ERROR, "云盘挂载失败");
        STATUS_DEFAULT_MESSAGE.put(DETACH_CDS_ERROR, "云盘卸载失败");
        STATUS_DEFAULT_MESSAGE.put(CHECK_IS_ICODING, "检验是否是iCoding进程失败");
        STATUS_DEFAULT_MESSAGE.put(CHECK_IS_AI_INSIDER_USER, "检验是否是AI白名单用户失败");
        STATUS_DEFAULT_MESSAGE.put(GET_SCI_JOB_DETAIL_FAIL, "查询作业详细信息失败");
        STATUS_DEFAULT_MESSAGE.put(GET_SCI_USAGE_FAIL, "查询集群可用资源信息失败");
        STATUS_DEFAULT_MESSAGE.put(GET_SCI_RESOURCE_STATUS_FAIL, "查询资源状态失败");
        STATUS_DEFAULT_MESSAGE.put(CREATE_ENS_SERVICE_ERROR, "注册ens失败");
        STATUS_DEFAULT_MESSAGE.put(DELETE_ENS_SERVICE_ERROR, "注销ens失败");
        STATUS_DEFAULT_MESSAGE.put(JWT_TOKEN_ERROR, "鉴权失败.");
        STATUS_DEFAULT_MESSAGE.put(RESTART_RESOURCE_FAIL, "Web IDE重启失败.");
        STATUS_DEFAULT_MESSAGE.put(LOGIN_OUT_TIME, "用户未登录或者登录超时,请先登录");
        STATUS_DEFAULT_MESSAGE.put(COOKIE_EMPTY, "cookie为空");
        STATUS_DEFAULT_MESSAGE.put(COOKIE_ERROR, "cookie解析失败");
        STATUS_DEFAULT_MESSAGE.put(LOGIN_NAME_REPEAT, "账户重复,请检查是否已经注册");
        STATUS_DEFAULT_MESSAGE.put(OLD_PWD_ERROR, "原密码输入错误,请确认后再操作！");
        STATUS_DEFAULT_MESSAGE.put(REPO_LIST_ERROR, "第三方获取仓库列表失败");
        STATUS_DEFAULT_MESSAGE.put(REPO_BRANCH_LIST_ERROR, "第三方获取仓库分支列表失败");
        STATUS_DEFAULT_MESSAGE.put(TH_REQUEST_ERROR, "第三方请求失败");
        STATUS_DEFAULT_MESSAGE.put(EXEC_CMD_ERROR, "命令行执行失败");
        STATUS_DEFAULT_MESSAGE.put(FETCH_PUBLIC_ERROR, "获取公钥失败");
        STATUS_DEFAULT_MESSAGE.put(PUSH_PUBLIC_ERROR, "添加公钥失败");
        STATUS_DEFAULT_MESSAGE.put(POD_EXEC_CMD_ERROR, "容器中执行命令失败");
        STATUS_DEFAULT_MESSAGE.put(AUTO_SCALE_ERROR, "弹性伸缩失败");
        STATUS_DEFAULT_MESSAGE.put(GET_SERVICE_DETAIL_ERROR, "获取服务详情失败");
        STATUS_DEFAULT_MESSAGE.put(MODIFY_ENV_ERROR, "修改环境变量失败");
        STATUS_DEFAULT_MESSAGE.put(DELETE_VOLUME_ERROR, "删除持久化卷失败");
        STATUS_DEFAULT_MESSAGE.put(DELETE_APP_SERVICE_ERROR, "删除服务失败");
        STATUS_DEFAULT_MESSAGE.put(CREATE_STS_ERROR, "创建sts失败");
        STATUS_DEFAULT_MESSAGE.put(UNMOUNT_VOLUME_ERROR, "卸载持久化卷失败");
        STATUS_DEFAULT_MESSAGE.put(STOP_OR_START_ERROR, "启动或停止服务失败");
        STATUS_DEFAULT_MESSAGE.put(GET_SERVICE_YAML_DETAIL_ERROR, "获取服务yaml详情失败");
        STATUS_DEFAULT_MESSAGE.put(UPDATE_SERVICE_BY_YAML_ERROR, "通过yaml更新服务失败");
        STATUS_DEFAULT_MESSAGE.put(NOT_FOUND_DATA, "没有发现数据");
        STATUS_DEFAULT_MESSAGE.put(NOT_PERMISSION, "没有访问权限");
        STATUS_DEFAULT_MESSAGE.put(SEND_INTERNAL_MESSAGE_ERROR, "瑶光平台向用户发送站内信失败");
    }

    private Integer code;
    private String message;

    public ResponseCode() {
        this.code = STATUS_OK;
    }

    public ResponseCode(Integer code, String message) {
        setCode(code);
        this.message = message;
    }

    public ResponseCode(Integer code) {
        setCode(code);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
        this.message = STATUS_DEFAULT_MESSAGE.get(code);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommonResponse{");
        sb.append("code=").append(code);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
