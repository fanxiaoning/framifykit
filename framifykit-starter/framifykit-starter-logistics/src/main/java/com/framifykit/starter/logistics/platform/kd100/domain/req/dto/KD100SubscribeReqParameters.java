package com.framifykit.starter.logistics.platform.kd100.domain.req.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>
 * 快递100 订阅请求参数附加参数
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100SubscribeReqParameters {
    /**
     * 是否必须: 是
     * 回调接口的地址，默认仅支持http，如需兼容https请联系快递100技术人员处理
     * 如http://www.您的域名.com/kuaidi?callbackid=...
     */
    private String callbackurl;

    /**
     * 是否必须：否
     * 签名用随机字符串
     */
    private String salt;

    /**
     * 是否必须：否
     * 添加此字段表示开通行政区域解析功能。空：关闭（默认），1：开通行政区域解析功能以及物流轨迹增加物流状态名称
     * 4: 开通行政解析功能以及物流轨迹增加物流高级状态名称、状态值并且返回出发、目的及当前城市信息
     */
    private String resultv2;

    /**
     * 是否必须：否
     * 添加此字段且将此值设为1，则表示开启智能判断单号所属公司的功能，
     * 开启后，需确保company字段为空,即只传运单号（number字段），我方收到后会根据单号判断出其所属的快递公司（即company字段）。
     * 建议只有在无法知道单号对应的快递公司（即company的值）的情况下才开启此功能。
     */
    private String autoCom;

    /**
     * 是否必须：否
     * 添加此字段表示开启国际版，开启后，若订阅的单号（即number字段）属于国际单号，会返回出发国与目的国两个国家的跟踪信息，
     * 本功能暂时只支持邮政体系（国际类的邮政小包、EMS）内的快递公司，若单号我方识别为非国际单，即使添加本字段，
     * 也不会返回destResult元素组
     */
    private String interCom;

    /**
     * 是否必须：否
     * 出发国家编码
     * 如：CN
     */
    private String departureCountry;

    /**
     * 是否必填：否
     * 出发的快递公司编码
     * 如：ems
     */
    private String departureCom;

    /**
     * 是否必填：否
     * 目的国家编码
     * 如：JP
     */
    private String destinationCountry;

    /**
     * 是否必填：否
     * 目的的快递公司的编码
     * 如：japanposten
     */
    private String destinationCom;

    /**
     * 是否必须: 否
     * 收、寄件人的电话号码（手机和固定电话均可，只能填写一个，
     * 顺丰速运、顺丰快运和丰网速运必填，
     * 其他快递公司选填。如座机号码有分机号，分机号无需上传。）
     */
    private String phone;
}
