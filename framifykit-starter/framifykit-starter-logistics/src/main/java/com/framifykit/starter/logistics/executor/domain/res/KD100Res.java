package com.framifykit.starter.logistics.executor.domain.res;

import com.framifykit.starter.logistics.platform.kd100.domain.res.*;
import com.framifykit.starter.logistics.platform.kd100.domain.res.dto.KD100QueryCapacityResParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>
 * 快递100 res类
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KD100Res extends BaseRes {


    /**
     * 查询物流信息
     */
    private KD100QueryTrackRes queryTrackRes;

    /**
     * 下单
     */
    private KD100PlaceOrderRes placeOrderRes;

    /**
     * 取消下单
     */
    private KD100CancelOrderRes cancelOrderRes;

    /**
     * 获取验证码
     */
    private KD100GetCodeRes getCodeRes;

    /**
     * 校验地址
     */
    private KD100CheckAddressRes checkAddressRes;


    /**
     * 查询运力
     */
    private KD100QueryCapacityRes<KD100QueryCapacityResParam> queryCapacityRes;

    /**
     * 订阅
     */
    private KD100SubscribeRes subscribeRes;
}
