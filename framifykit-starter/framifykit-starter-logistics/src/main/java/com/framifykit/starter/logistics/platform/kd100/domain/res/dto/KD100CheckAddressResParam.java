package com.framifykit.starter.logistics.platform.kd100.domain.res.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * <p>
 * 快递100 地址校验返回参数
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100CheckAddressResParam {

    private String taskId;

    private List<ToReachableDetail> toReachable;


    /**
     * @author: fanxiaoning
     * @description: 校验地址详情内部类
     * @date: 2023/5/4
     * @since v1.0.0
     **/
    @Data
    public static class ToReachableDetail {

        /**
         * 是否可达，0：不可达，1：可达
         */
        private String reachable;

        /**
         * 快递公司编码
         */
        private String expressCode;

        /**
         * 不可达的原因
         */
        private String reason;
    }
}
