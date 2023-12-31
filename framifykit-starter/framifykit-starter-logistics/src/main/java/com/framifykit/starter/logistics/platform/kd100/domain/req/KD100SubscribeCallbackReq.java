package com.framifykit.starter.logistics.platform.kd100.domain.req;

import com.framifykit.starter.logistics.executor.domain.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 快递100 订阅回调接口req
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100SubscribeCallbackReq extends BaseReq {


    private String status;

    private String billstatus;

    private String message;

    private SubscribeCallbackQueryTrack lastResult;


    @Data
    public static class SubscribeCallbackQueryTrack {


        /**
         * 消息体，请忽略
         */
        private String message;
        /**
         * 快递单号
         */
        private String nu;
        /**
         * 是否签收标记
         */
        private String ischeck;
        /**
         * 快递公司编码,一律用小写字母
         */
        private String com;
        /**
         * 通讯状态
         */
        private String status;
        /**
         * 轨迹详情数组
         */
        private List<SubscribeCallbackQueryTrackData> data = new ArrayList<>();
        /**
         * 快递单当前状态，包括0在途，1揽收，2疑难，3签收，4退签，5派件，6退回，7转投，10待清关，11清关中，12已清关，13清关异常，14拒签等13个状态
         * 30 打印溯源码（相当于订单 6）
         */
        private String state;
        /**
         * 快递单明细状态标记
         */
        private String condition;

        /**
         * 查不到轨迹或者其他问题返回码
         */
        private String returnCode;
        /**
         * 查不到轨迹或者其他问题返回结果
         */
        private boolean result;

        private SubscribeCallbackQueryTrackRouteInfo routeInfo;

    }

    @Data
    public static class SubscribeCallbackQueryTrackData {

        /**
         * 时间，原始格式
         */
        private String time;
        /**
         * 物流轨迹节点内容
         */
        private String context;
        /**
         * 标题
         */
        private String title;
        /**
         * 格式化后时间
         */
        private String ftime;
        /**
         * 行政区域的编码
         */
        private String areaCode;
        /**
         * 行政区域的名称
         */
        private String areaName;
        /**
         * 签收状态 (0在途，1揽收，2疑难，3签收，4退签，5派件，6退回，7转投)
         */
        private String status;
    }

    @Data

    public static class SubscribeCallbackQueryTrackRouteInfo {

        /**
         * 出发位置
         */
        private SubscribeCallbackQueryTrackPosition from;
        /**
         * 当前位置
         */
        private SubscribeCallbackQueryTrackPosition cur;
        /**
         * 收货地
         */
        private SubscribeCallbackQueryTrackPosition to;

    }

    @Data
    public static class SubscribeCallbackQueryTrackPosition {

        /**
         * 地址编码
         */
        private String number;
        /**
         * 地址名称
         */
        private String name;

    }

}
