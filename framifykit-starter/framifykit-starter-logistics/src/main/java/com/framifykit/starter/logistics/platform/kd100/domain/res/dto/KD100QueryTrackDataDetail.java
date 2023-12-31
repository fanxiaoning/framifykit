package com.framifykit.starter.logistics.platform.kd100.domain.res.dto;

import cn.hutool.core.date.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


/**
 * <p>
 * 快递100 查询物流信息数据详情
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
public class KD100QueryTrackDataDetail {
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

    public KD100QueryTrackDataDetail() {
    }

    public KD100QueryTrackDataDetail(KD100QueryTraceData traceDTO) {
        this.time = traceDTO.getOpeTime();
        this.context = traceDTO.getOpeRemark();
        this.ftime = DateUtil.format(DateUtil.parse(time, "yyyy/MM/dd HH:mm:ss"), "yyyy-MM-dd HH:mm:ss");
        this.title = traceDTO.getOpeTitle();
    }
}
