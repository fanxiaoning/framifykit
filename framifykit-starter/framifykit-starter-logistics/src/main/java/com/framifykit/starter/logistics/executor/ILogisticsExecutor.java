package com.framifykit.starter.logistics.executor;


import com.famifykit.starter.common.exception.ServiceException;

/**
 * <p>
 * 第三方物流接口执行器接口
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public interface ILogisticsExecutor<REQ, RES> {


    /**
     * 执行方法
     *
     * @param req 执行请求参数
     * @return 执行返回结果
     * @throws ServiceException
     */
    RES execute(REQ req) throws ServiceException;
}
