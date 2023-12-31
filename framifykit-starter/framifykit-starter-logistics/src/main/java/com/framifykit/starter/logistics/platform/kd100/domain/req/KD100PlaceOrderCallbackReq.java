package com.framifykit.starter.logistics.platform.kd100.domain.req;

import com.framifykit.starter.logistics.executor.domain.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>
 * 快递100 下单回调req
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100PlaceOrderCallbackReq extends BaseReq {

    /**
     * 快递公司的编码，一律用小写字母，见《快递公司编码》,选填。
     */
    private String kuaidicom;

    /**
     * 快递单号，单号的最大长度是32个字符。
     */
    private String kuaidinum;

    /**
     * 状态码
     */
    private String status;

    /**
     * 状态描述
     */
    private String message;
    /**
     * 订单内容
     */
    private PlaceOrderCallbackOrderContent placeOrderCallbackOrderContent;


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PlaceOrderCallbackOrderContent {

        /**
         * 平台订单ID
         */
        private String orderId;
        /**
         * 订单状态： 1,'已接单', 2,'收件中', 3,'改派', 7,'快递员修改订单信息', 9,'用户主动取消', 10,'已取件', 15,'已结算', 99,'订单已取消', 101, '运输中'
         */
        private String status;
        /**
         * 快递员姓名
         */
        private String courierName;
        /**
         * 快递员电话
         */
        private String courierMobile;
        /**
         * 重量
         */
        private String weight;
        /**
         * 运费
         */
        private String freight;

    }

}
