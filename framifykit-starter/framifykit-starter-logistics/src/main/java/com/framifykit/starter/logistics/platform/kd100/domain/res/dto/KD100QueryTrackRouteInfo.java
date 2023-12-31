package com.framifykit.starter.logistics.platform.kd100.domain.res.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * <p>
 * 快递100 查询物流信息节点信息
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
public class KD100QueryTrackRouteInfo {
    /**
     * 出发位置
     */
    private KD100QueryTrackPosition from;
    /**
     * 当前位置
     */
    private KD100QueryTrackPosition cur;
    /**
     * 收货地
     */
    private KD100QueryTrackPosition to;
}
