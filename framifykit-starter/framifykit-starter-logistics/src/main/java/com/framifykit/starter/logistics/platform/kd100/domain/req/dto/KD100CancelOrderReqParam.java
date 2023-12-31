package com.framifykit.starter.logistics.platform.kd100.domain.req.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 快递100 下单请求参数
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100CancelOrderReqParam {
    /**
     * 任务ID
     */
    private String taskId;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 取消原因，例：暂时不寄件了
     */
    private String cancelMsg;
}
