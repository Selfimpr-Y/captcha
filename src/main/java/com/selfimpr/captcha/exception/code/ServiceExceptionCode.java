package com.selfimpr.captcha.exception.code;


/**
 * @Description: service层异常代码
 * -------------------
 * @Author: YangXingfu
 * @Date: 2019/07/24 17:22
 */

public enum ServiceExceptionCode {
    NULL("SERVICE_001", "值为NULL"),

    EMPTY("SERVICE_002", "值为空"),

    ERROR("SERVICE_003", "错误"),

    URL_DECODER_ERROR("SERVICE_004", "URL解码错误"),

    URL_ENCODER_ERROR("SERVICE_005", "URL转码错误"),

    IO_EXCEPTON("SERVICE_006", "IO异常");

    ServiceExceptionCode(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}