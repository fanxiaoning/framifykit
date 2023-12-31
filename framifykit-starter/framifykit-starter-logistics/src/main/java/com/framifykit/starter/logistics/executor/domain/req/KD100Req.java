package com.framifykit.starter.logistics.executor.domain.req;

import com.framifykit.starter.logistics.platform.kd100.domain.req.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 快递100 req类
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KD100Req extends BaseReq {


    /**
     * 查询物流信息
     */
    private KD100QueryTrackReq queryTrackReq;


    /**
     * 下单
     */
    private KD100PlaceOrderReq placeOrderReq;

    /**
     * 取消下单
     */
    private KD100CancelOrderReq cancelOrderReq;


    /**
     * 查询运力
     */
    private KD100QueryCapacityReq queryCapacityReq;

    /**
     * 获取验证码
     */
    private KD100GetCodeReq getCodeReq;

    /**
     * 校验地址
     */
    private KD100CheckAddressReq checkAddressReq;


    /**
     * 订阅接口参数
     */
    private KD100SubscribeReq subscribeReq;
}
