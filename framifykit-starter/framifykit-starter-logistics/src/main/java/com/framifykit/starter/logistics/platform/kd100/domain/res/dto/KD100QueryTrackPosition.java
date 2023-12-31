package com.framifykit.starter.logistics.platform.kd100.domain.res.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 快递100 查询物流信息地址信息
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100QueryTrackPosition {

    /**
     * 地址编码
     */
    private String number;
    /**
     * 地址名称
     */
    private String name;
}
