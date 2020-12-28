package com.shop.service;

import com.shop.vo.AlipayBean;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

/**
 * 支付宝支付接口
 * @author 小道仙
 * @date 2020年2月18日
 */
@Component
public class Alipay {

    /**
     * 支付接口
     * @param alipayBean
     * @return
     * @throws AlipayApiException
     */
    public String pay(AlipayBean alipayBean) throws AlipayApiException {
        // 1、获得初始化的AlipayClient
        String serverUrl = "https://openapi.alipaydev.com/gateway.do";
        String appId = "2016103100780306";
        String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWptyin4OvmQV7ny5be5tC8HT7nSwToGtLLysaXraqMrzaa2H/sPI5wlXjl2/hZeB3bbpL2u4aG9EqBelKcjvXUOkplaWcR7MJjQ4H6mlxy/ARyOgZyKSdshDy0yrb4NU9dytsFrSqvuVuol9peEnc7ro0nZFgJoyZiLx6gbuRUJlLmpVXT/gPRmM0BDQ1oF1NrDhA3HfmEk/zXgC6+knB494v+1ZqgHZzyJaVCVE2BamqVTh5xknAx5u72gZNurzcTSRMbsIb/Q0JyO3Eq60zKRJrxs8eozkyzlLSEPPZAxxiJLdG7SNba6s3B6BIPo+vnxndl9ExRSx4j7KVd2CRAgMBAAECggEAAev2/IwUXfURwNXy/W/CN0Rh+aOzoDx3oenkHt3+boVfK1obUeur61izR8fywWlPR7a6naUZTHP2YxbYNv7mDIUXtFQYXLn9aq3F9AvldHIpidCKRWntz6Up2i8faNahYbtXbnWLsHHm81ZW6T2Dk7Hn5ivsYtGbEYpQ/S8SeXQMuNYPSz1+jigJiaG3T7SMufnKfFWysgt58OI/p4pQ/ktXGlWyd3+iW/QuNS2LYiUoVp4/W9aEO1rNaAo7urV2Ce3WB5pwVx9fFKRi1tdJhk0LTPB3dk7HoQDWjhC4O+Yu7hJVU6ix0Q5UwPfj1shzPt5WeSl3nnkUzH9JpJXtwQKBgQDWqe6DbInQYIjI7J35KG9DNyzknCBEMNytGidNWAt9GY/DiMAlPWrXcjeDvcLG0NBUVm46d4qS2s+ZSu8/zQkKeICtSmFYleT4zA9psMSC2pWSPPZ6BkrPWjLfxO8DFMH2O+wFRar7lKvdkRJg2xMpbgLGyLt0rnnIDXr4Qr5cHQKBgQCzqWT8sjArdtO+g6WiuyrYZVf9QD0cg4ybY5EtU6F39CtBViTmF549JE9+NuRg2C5yyyYUpJFvSEFE8Go7zX8/cBX4Z5LxAeUvLzB89xRfwSEYr39eC2j3/6kO8mhHiyt1sD8BAxbVLF57y7tuYNUJX79vaCu9S3XfpdlHOSGkBQKBgQC92HvAb3VSfI18ZQcxG7mK0Hk7lXhT1oLT9JVdqcg/UyP54i9MwAyFjdXbBTAFdRdJ/0ZtHtvHFQ0UnVkKK+MbB4eFuoptNePSxWW8K0EgGQC+3Ht/X6E50KO9kwVuzCTeCBCsePjGlq2IvoxqbFV+BnUeKNjgUI4ThxiCB0UjYQKBgDxYkJgkTfO7dQIP/Am97nVDDRv+gMhcE1V6SyA7cAf3lrPaeIhktHz6/kx5qZox4uAiBkd2w3bqgSnjyvsNWkl3n5mRSJT1OwLvSc0fvNMw7qn5AMIY+Qgb8rAXkhk90Lo2GeOAIyI1RgM0+l7n3YbJh2anSdHKT+xwK5w1v2v1AoGABhJPg1NUbQR/iPC+V2jDPyvRYJNok8GeVfgoveKPC9HQQqoN8qCbxtfsYZcL9Zv3KIiSnfSHRYNDhQuhKOnF+pPwH0b6HRYIAVT5xXo3p6Y9yxexTqqkBrP5P1Cxv1ohwYpZy8w7Eh7OI1xEn6PsS/IZrPs4Ti6hEaep4rGLjQ4=";
        String format = "json";
        String charset = "utf-8";
        String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwM9EGffw838yv6nsc4zV5FpwfnGB/A8TiV2mV431S7DgIopJipmdrk6rqVwOKrMV6+cEqIuIcUicAIuoi33wX8HZ382ZbPoFoAgvPL1CJydcTWjke+a9pzEQRyyGziCaHPTzAb0tfMabauVxwTsiWFZ9G8uruYJERo4SGOTnXcku/fdXl3KQ4O8LXETKvhfQYWYLWEGuRC6QDqDBtObkhUJVoIZ+mpdERzKev6qcRCRjVnG2Mwb8BOOpa6ZEgSfJTo08l/VrrMCQju10ees3riRKe91dyElZm8JqDq7sjsaJlY+FKQPEY0D/TZmQ80dwmnZgxk86vuU+DXsSNB2AVQIDAQAB";
        String signType = "RSA2";
        String returnUrl = "http://localhost:1012/#/success";
        String notifyUrl = "http://localhost:1012/#/404";
        AlipayClient alipayClient = new DefaultAlipayClient(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType);
        // 2、设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        // 页面跳转同步通知页面路径
        alipayRequest.setReturnUrl(returnUrl);
        // 服务器异步通知页面路径
        alipayRequest.setNotifyUrl(notifyUrl);
        // 封装参数
        alipayRequest.setBizContent(JSON.toJSONString(alipayBean));
        // 3、请求支付宝进行付款，并获取支付结果
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        // 返回付款信息
        return result;
    }
}
