package com.framifykit.starter.logistics.platform.kd100.domain.res.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>
 * 快递100 查询运力返回参数
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100QueryCapacityResParam {

    private String province;

    private String city;

    private String district;

    private String addr;

    private String latitude;

    private String longitude;

    private List<KD100QueryCapacityResParameters> queryCapacityResParameters;
}
