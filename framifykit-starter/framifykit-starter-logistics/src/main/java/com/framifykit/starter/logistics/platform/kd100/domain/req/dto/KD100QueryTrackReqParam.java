package com.framifykit.starter.logistics.platform.kd100.domain.req.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 快递100 查询物流信息请求参数
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100QueryTrackReqParam {
    /**
     * 查询的快递公司的编码，一律用小写字母
     */
    private String com;
    /**
     * 查询的快递单号， 单号的最大长度是32个字符
     */
    private String num;
    /**
     * 收件人或寄件人的手机号或固话
     */
    private String phone;
    /**
     * 出发地城市，省-市-区
     */
    private String from;
    /**
     * 目的地城市，省-市-区
     */
    private String to;
    /**
     * 添加此字段表示开通行政区域解析功能。0：关闭（默认），1：开通行政区域解析功能，2：开通行政解析功能并且返回出发、目的及当前城市信息
     */
    private String resultv2 = "0";
    /**
     * 返回数据格式。0：json（默认），1：xml，2：html，3：text
     */
    private String show = "0";
    /**
     * 返回结果排序方式。desc：降序（默认），asc：升序
     */
    private String order = "desc";
}
