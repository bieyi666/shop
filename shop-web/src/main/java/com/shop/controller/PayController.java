package com.shop.controller;

import com.alipay.api.AlipayApiException;
import com.shop.service.PayService;
import com.shop.vo.AlipayBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付宝沙箱测试
 *
 * @author 小道仙
 * @date 2020年2月17日
 */
@RestController
@CrossOrigin
public class PayController {

    @Autowired
    private PayService payService;

    /**
     * 阿里支付1
     * @param outTradeNo
     * @param subject
     * @param totalAmount
     * @param body
     * @return
     * @throws AlipayApiException
     */
    @PostMapping(value = "alipay.action")
    public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmount);
        alipayBean.setBody(body);
        return payService.aliPay(alipayBean);
    }

}
