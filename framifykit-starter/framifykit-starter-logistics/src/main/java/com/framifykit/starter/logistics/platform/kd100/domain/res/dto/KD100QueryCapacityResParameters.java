package com.framifykit.starter.logistics.platform.kd100.domain.res.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>
 * 快递100 查询运力返回附加参数
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100QueryCapacityResParameters {
    /**
     * 业务服务类型
     */
    private List<String> serviceType;
    /**
     * 支持的快递公司编码
     */
    private String kuaidiCom;

}
