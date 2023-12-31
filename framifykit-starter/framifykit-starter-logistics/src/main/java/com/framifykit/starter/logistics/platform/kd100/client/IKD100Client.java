package com.framifykit.starter.logistics.platform.kd100.client;


/**
 * <p>
 * 快递100请求客户端接口 //TODO 待重构
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public interface IKD100Client {

    /***
     * 执行方法
     * @param url
     * @param req
     * @return
     * @throws Exception
     */

    String execute(String url, Object req) throws Exception;

}
