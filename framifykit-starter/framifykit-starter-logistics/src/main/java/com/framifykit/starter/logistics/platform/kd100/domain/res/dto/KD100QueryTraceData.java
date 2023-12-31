package com.framifykit.starter.logistics.platform.kd100.domain.res.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


/**
 * <p>
 * 快递100 查询物流信息数据
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
public class KD100QueryTraceData implements Serializable {
    /**
     * 操作标题
     */
    private String opeTitle;
    /**
     * 操作详情
     */
    private String opeRemark;
    /**
     * 操作人姓名
     */
    private String opeName;
    /**
     * 操作时间
     */
    private String opeTime;
    /**
     * 运单号
     */
    private String waybillCode;
    /**
     * 配送员
     */
    private String courier;
    /**
     * 配送员电话
     */
    private String courierTel;

    public KD100QueryTraceData() {
    }

    @JsonProperty("opeTitle")
    public void setOpeTitle(String opeTitle) {
        this.opeTitle = opeTitle;
    }

    @JsonProperty("opeTitle")
    public String getOpeTitle() {
        return this.opeTitle;
    }

    @JsonProperty("opeRemark")
    public void setOpeRemark(String opeRemark) {
        this.opeRemark = opeRemark;
    }

    @JsonProperty("opeRemark")
    public String getOpeRemark() {
        return this.opeRemark;
    }

    @JsonProperty("opeName")
    public void setOpeName(String opeName) {
        this.opeName = opeName;
    }

    @JsonProperty("opeName")
    public String getOpeName() {
        return this.opeName;
    }

    @JsonProperty("opeTime")
    public void setOpeTime(String opeTime) {
        this.opeTime = opeTime;
    }

    @JsonProperty("opeTime")
    public String getOpeTime() {
        return this.opeTime;
    }

    @JsonProperty("waybillCode")
    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    @JsonProperty("waybillCode")
    public String getWaybillCode() {
        return this.waybillCode;
    }

    @JsonProperty("courier")
    public void setCourier(String courier) {
        this.courier = courier;
    }

    @JsonProperty("courier")
    public String getCourier() {
        return this.courier;
    }

    @JsonProperty("courierTel")
    public void setCourierTel(String courierTel) {
        this.courierTel = courierTel;
    }

    @JsonProperty("courierTel")
    public String getCourierTel() {
        return this.courierTel;
    }
}
