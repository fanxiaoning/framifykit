package com.framifykit.starter.logistics.executor;


import cn.hutool.core.lang.TypeReference;
import cn.hutool.core.util.ReflectUtil;
import com.alibaba.fastjson.JSONObject;
import com.famifykit.starter.common.exception.ServiceException;
import com.famifykit.starter.common.result.FramifyResult;
import com.framifykit.starter.logistics.executor.constant.LogisticsTypeEnum;
import com.framifykit.starter.logistics.executor.config.ILogisticsGetConfig;
import com.framifykit.starter.logistics.executor.domain.req.KD100Req;
import com.framifykit.starter.logistics.executor.domain.res.KD100Res;
import com.framifykit.starter.logistics.platform.kd100.client.DefaultKD100Client;
import com.framifykit.starter.logistics.platform.kd100.config.KD100ApiConfig;
import com.framifykit.starter.logistics.platform.kd100.config.KD100ApiConfigKit;
import com.framifykit.starter.logistics.platform.kd100.domain.res.*;
import com.framifykit.starter.logistics.platform.kd100.domain.res.dto.KD100CheckAddressResParam;
import com.framifykit.starter.logistics.platform.kd100.domain.res.dto.KD100QueryCapacityResParam;
import com.framifykit.starter.logistics.platform.kd100.util.SignUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

import static com.framifykit.starter.logistics.common.constant.LogisticsErrorCodeConstants.THIRD_PARTY_API_ERROR;
import static com.framifykit.starter.logistics.platform.kd100.constant.KD100ApiConstant.*;


/**
 * <p>
 * 调用快递100接口执行器
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Slf4j
public class KD100Executor extends AbstractLogisticsExecutor<KD100Req, KD100Res>
        implements ILogisticsExecutor<KD100Req, FramifyResult<KD100Res>>,
        ILogisticsGetConfig<KD100ApiConfig> {


    @Override
    public FramifyResult<KD100Res> execute(KD100Req KD100Req) throws ServiceException {

        KD100Res KD100Res;
        try {
            String methodType = KD100Req.getMethodType();
            KD100Res = ReflectUtil.invoke(this, methodType, KD100Req);
        } catch (Exception e) {
            log.error("第三方物流平台:{}调用系统异常", LogisticsTypeEnum.KD_100.getName(), e);
            throw new ServiceException(THIRD_PARTY_API_ERROR);
        }

        return FramifyResult.success(KD100Res);
    }

    @Override
    protected KD100Res queryTrack(KD100Req KD100Req) throws ServiceException {

        DefaultKD100Client KD100Client = getApiConfig().getKD100Client();
        String result = KD100Client.execute(QUERY_URL, KD100Req.getQueryTrackReq());

        KD100QueryTrackRes KD100QueryTrackRes = JSONObject.parseObject(result, KD100QueryTrackRes.class);

        KD100Res kd100Res = KD100Res.builder()
                .queryTrackRes(KD100QueryTrackRes)
                .build();

        return kd100Res;
    }


    @Override
    protected KD100Res placeOrder(KD100Req KD100Req) throws ServiceException {

        DefaultKD100Client KD100Client = getApiConfig().getKD100Client();
        String result = KD100Client.execute(B_ORDER_URL, KD100Req.getPlaceOrderReq());

        KD100PlaceOrderRes KD100PlaceOrderRes = JSONObject.parseObject(result, KD100PlaceOrderRes.class);

        KD100Res kd100Res = KD100Res.builder()
                .placeOrderRes(KD100PlaceOrderRes)
                .build();

        return kd100Res;
    }

    @Override
    protected KD100Res cancelOrder(KD100Req KD100Req) throws ServiceException {

        DefaultKD100Client KD100Client = getApiConfig().getKD100Client();
        String result = KD100Client.execute(B_ORDER_URL, KD100Req.getPlaceOrderReq());

        KD100CancelOrderRes KD100CancelOrderRes = JSONObject.parseObject(result, KD100CancelOrderRes.class);

        KD100Res kd100Res = KD100Res.builder()
                .cancelOrderRes(KD100CancelOrderRes)
                .build();

        return kd100Res;
    }

    @Override
    protected KD100Res queryCost(KD100Req KD100Req) {
        return null;
    }

    @Override
    protected KD100Res subscribeOrder(KD100Req KD100Req) throws ServiceException {

        DefaultKD100Client KD100Client = getApiConfig().getKD100Client();
        String result = KD100Client.execute(SUBSCRIBE_URL, KD100Req.getSubscribeReq());

        KD100SubscribeRes KD100SubscribeRes = JSONObject.parseObject(result, KD100SubscribeRes.class);

        KD100Res kd100Res = KD100Res.builder()
                .subscribeRes(KD100SubscribeRes)
                .build();

        return kd100Res;
    }

    @Override
    protected KD100Res queryCapacity(KD100Req KD100Req) throws ServiceException {

        DefaultKD100Client KD100Client = getApiConfig().getKD100Client();
        String result = KD100Client.execute(QUERY_URL, KD100Req.getQueryCapacityReq());

        KD100QueryCapacityRes<KD100QueryCapacityResParam> KD100QueryCapacityRes = JSONObject
                .parseObject(result, new TypeReference<KD100QueryCapacityRes<KD100QueryCapacityResParam>>() {
                });

        KD100Res kd100Res = KD100Res.builder()
                .queryCapacityRes(KD100QueryCapacityRes)
                .build();

        return kd100Res;
    }

    @Override
    protected KD100Res getCode(KD100Req KD100Req) throws ServiceException {

        DefaultKD100Client KD100Client = getApiConfig().getKD100Client();
        String result = KD100Client.execute(QUERY_URL, KD100Req.getGetCodeReq());

        KD100GetCodeRes<Map<String, String>> KD100GetCodeRes = JSONObject
                .parseObject(result, new TypeReference<KD100GetCodeRes<Map<String, String>>>() {
                });

        KD100Res kd100Res = KD100Res.builder()
                .getCodeRes(KD100GetCodeRes)
                .build();

        return kd100Res;
    }

    @Override
    protected KD100Res checkAddress(KD100Req KD100Req) throws ServiceException {

        DefaultKD100Client KD100Client = getApiConfig().getKD100Client();
        String result = KD100Client.execute(REACHABLE_URL, KD100Req.getCheckAddressReq());

        KD100CheckAddressRes<KD100CheckAddressResParam> KD100GetCodeRes = JSONObject
                .parseObject(result, new TypeReference<KD100CheckAddressRes<KD100CheckAddressResParam>>() {
                });

        KD100Res kd100Res = KD100Res.builder()
                .checkAddressRes(KD100GetCodeRes)
                .build();

        return kd100Res;
    }

    @Override
    public KD100ApiConfig getApiConfig() {
        return KD100ApiConfigKit.getApiConfig();
    }

    @Override
    protected String createSign(String signSource) {
        return SignUtils.sign(signSource);
    }

    protected String createSign(String timeMillis, String signSource) {
        return SignUtils.sign(timeMillis + signSource);
    }
}


