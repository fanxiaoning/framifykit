package com.framifykit.starter.logistics.platform.kd100.util;

import cn.hutool.core.util.StrUtil;
import com.famifykit.starter.common.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.framifykit.starter.logistics.common.constant.LogisticsErrorCodeConstants.THIRD_PARTY_API_ERROR;


/**
 * <p>
 * 快递100 http工具类 //TODO 待重构
 * </p>
 *
 * @author fxn
 * @since 1.0.0
 **/
@Slf4j
public class HttpUtils {

    private final static String CHARSET_DEFAULT = "UTF-8";

    /**
     * post请求  编码格式默认UTF-8
     *
     * @param url 请求url
     * @return
     */
    public static String doPost(String url, Object obj) throws ServiceException {

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse resp = null;

        try {
            Map<String, String> params = ObjectToMapUtils.objectToMap(obj);
            HttpPost httpPost = new HttpPost(url);
            if (params != null && params.size() > 0) {
                List<NameValuePair> list = new ArrayList<>();
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
                }
                httpPost.setEntity(new UrlEncodedFormEntity(list, CHARSET_DEFAULT));
            }

            resp = httpClient.execute(httpPost);
            String body = EntityUtils.toString(resp.getEntity(), CHARSET_DEFAULT);
            int statusCode = resp.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK && StrUtil.isNotBlank(body)) {
                return body;
            } else {
                throw new ServiceException(THIRD_PARTY_API_ERROR);
            }
        } catch (Exception e) {
            log.error("请求快递100平台接口失败！", e);
            throw new ServiceException(THIRD_PARTY_API_ERROR);
        } finally {
            if (null != resp) {
                try {
                    resp.close();
                } catch (IOException e) {
                    log.error("请求快递100平台接口失败！", e);
                }
            }
        }
    }
}
