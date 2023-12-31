package com.framifykit.starter.logistics.platform.kd100.domain.req;

import com.framifykit.starter.logistics.executor.domain.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 快递100 订阅req
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100SubscribeReq extends BaseReq {
    /**
     * 是否必须：否
     * 返回的数据格式，json(默认) ,xml
     */
    private String schema;

    /**
     * 是否必须：是
     * 需要将KuaiDi100SubscribeReqParam转成jsonStr
     */
    private String param;
}
