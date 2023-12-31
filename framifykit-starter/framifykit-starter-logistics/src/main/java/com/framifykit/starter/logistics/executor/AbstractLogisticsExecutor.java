package com.framifykit.starter.logistics.executor;


import com.famifykit.starter.common.exception.ServiceException;

/**
 * <p>
 * 第三方物流接口执行器父类
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
public abstract class AbstractLogisticsExecutor<REQ, RES> {


    /**
     * 下单
     *
     * @param req
     * @return
     * @throws ServiceException
     */

    protected abstract RES placeOrder(REQ req) throws ServiceException;


    /**
     * 取消下单
     *
     * @param req
     * @return
     * @throws ServiceException
     */
    protected abstract RES cancelOrder(REQ req) throws ServiceException;


    /**
     * 查询费用和时效
     *
     * @param req
     * @return
     * @throws ServiceException
     */
    protected abstract RES queryCost(REQ req) throws ServiceException;


    /**
     * 订阅订单
     *
     * @param req
     * @return
     * @throws ServiceException
     */
    protected abstract RES subscribeOrder(REQ req) throws ServiceException;


    /**
     * 查询运力
     *
     * @param req
     * @return
     * @throws ServiceException
     */
    protected abstract RES queryCapacity(REQ req) throws ServiceException;


    /**
     * 获取验证码
     *
     * @param req
     * @return
     * @throws ServiceException
     */
    protected abstract RES getCode(REQ req) throws ServiceException;


    /**
     * 校验地址
     *
     * @param req
     * @return
     * @throws ServiceException
     */
    protected abstract RES checkAddress(REQ req) throws ServiceException;


    /**
     * 创建sign
     *
     * @param signSource
     * @return
     * @throws ServiceException
     */
    protected abstract String createSign(String signSource) throws ServiceException;


    /**
     * 查询物流跟踪消息
     *
     * @param req
     * @return
     * @throws ServiceException
     */
    protected abstract RES queryTrack(REQ req) throws ServiceException;

}
