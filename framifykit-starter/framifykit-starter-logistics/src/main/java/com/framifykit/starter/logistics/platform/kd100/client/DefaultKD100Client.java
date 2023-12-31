package com.framifykit.starter.logistics.platform.kd100.client;


import com.famifykit.starter.common.exception.ServiceException;
import com.framifykit.starter.logistics.platform.kd100.util.HttpUtils;
import lombok.Data;

/**
 * <p>
 *   快递100默认请求客户端 //TODO 待重构
 * </p>
 * @author fxn
 * @since 1.0.0
 **/
@Data
public class DefaultKD100Client implements IKD100Client {

    private String key;

    private String customer;

    private String secret;

    private String userId;


    public DefaultKD100Client(String key, String customer, String secret) {
        this.key = key;
        this.customer = customer;
        this.secret = secret;
    }

    @Override
    public String execute(String url, Object req) throws ServiceException {
        //TODO 调用第三方物流接口 此次待优化
        return HttpUtils.doPost(url, req);
    }
}
