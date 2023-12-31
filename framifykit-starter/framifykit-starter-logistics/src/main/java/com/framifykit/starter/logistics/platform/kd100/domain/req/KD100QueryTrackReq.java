package com.framifykit.starter.logistics.platform.kd100.domain.req;

import com.framifykit.starter.logistics.executor.domain.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 快递100 查询物流信息req
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KD100QueryTrackReq extends BaseReq {
    /**
     * 我方分配给贵司的的公司编号, 点击查看账号信息
     */
    private String customer;
    /**
     * 签名， 用于验证身份， 按param + key + customer 的顺序进行MD5加密（注意加密后字符串要转大写）， 不需要“+”号
     */
    private String sign;
    /**
     * 其他参数组合成的json对象
     */
    private String param;
}
