package com.framifykit.starter.logistics.platform.kd100.domain.req;

import com.framifykit.starter.logistics.executor.domain.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>
 * 快递100 下单req
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100PlaceOrderReq extends BaseReq {

    /**
     * 快递公司的编码，一律用小写字母，见《快递公司编码》
     */
    private String kuaidicom;
    /**
     * 收件人姓名
     */
    private String recManName;
    /**
     * 收件人的手机号，手机号和电话号二者其一必填
     */
    private String recManMobile;
    /**
     * 收件人所在完整地址，如广东深圳市深圳市南山区科技南十二路2号金蝶软件园
     */
    private String recManPrintAddr;
    /**
     * 寄件人姓名
     */
    private String sendManName;
    /**
     * 寄件人的手机号，手机号和电话号二者其一必填
     */
    private String sendManMobile;
    /**
     * 寄件人所在的完整地址，如广东深圳市深圳市南山区科技南十二路2号金蝶软件园B10
     */
    private String sendManPrintAddr;
    /**
     * 物品名称,例：文件
     */
    private String cargo;
    /**
     * 物品总重量KG，例：1.5，单位kg
     */
    private String weight;
    /**
     * 备注
     */
    private String remark;
    /**
     * 签名用随机字符串
     */
    private String salt;
    /**
     * callBackUrl订单信息回调
     */
    private String callBackUrl;
    /**
     * 快递业务服务类型，例：标准快递，默认为标准快递
     */
    private String serviceType;
}
