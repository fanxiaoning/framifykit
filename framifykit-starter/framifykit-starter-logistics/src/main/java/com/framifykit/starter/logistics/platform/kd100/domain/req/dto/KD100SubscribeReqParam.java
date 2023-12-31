package com.framifykit.starter.logistics.platform.kd100.domain.req.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>
 * 快递100 订阅接口请求参数
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100SubscribeReqParam {
    /**
     * 是否必须：是
     * 订阅的快递公司的编码，一律用小写字母。
     * 如:ems
     */
    private String company;

    /**
     * 是否必须: 是
     * 订阅的快递单号， 单号的最小长度6个字符，最大长度32个字符
     * 如:1136281381675
     */
    private String number;

    /**
     * 是否必须: 否
     * 出发地城市，省-市-区，非必填，填了有助于提升签收状态的判断的准确率，请尽量提供
     * 如:广东省深圳市南山区
     */
    private String from;

    /**
     * 是否必须: 否
     * 目的地城市，省-市-区，非必填，填了有助于提升签收状态的判断的准确率，且到达目的地后会加大监控频率, 请尽量提供
     * 如:北京市朝阳区
     */
    private String to;

    /**
     * 是否必填: 是
     * 授权码
     */
    private String key;

    /**
     * 附加参数信息
     */
    private KD100SubscribeReqParameters parameters;

}
