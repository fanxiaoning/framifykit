package com.framifykit.starter.logistics.executor.constant;

/**
 * <p>
 * 物流平台类型枚举
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public enum LogisticsTypeEnum {


    /**
     * 京东物流
     */
    JD("1000", "京东物流"),

    /**
     * 快递100
     */
    KD_100("1001", "快递100"),

    /**
     * 顺丰
     */
    SF("1002", "顺丰快递"),

    /**
     * 其他
     */
    OTHER("1003", "其他物流");


    private String code;
    private String name;

    LogisticsTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static LogisticsTypeEnum getType(String code) {
        for (LogisticsTypeEnum type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return OTHER;
    }

    public String getCode() {
        return code;
    }


    public String getName() {
        return name;
    }


}
