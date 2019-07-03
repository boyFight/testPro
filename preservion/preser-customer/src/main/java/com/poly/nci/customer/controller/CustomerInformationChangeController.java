package com.poly.nci.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * 客户信息维护类Controller 2019.4.23 liangyc
 */
@RestController
public class CustomerInformationChangeController {
    /**
     * 根据保单号和客户信息查询保单
     * @return
     */
    @RequestMapping("/getInsurancePolicyList")
    public String getInsurancePolicyList(HttpServletRequest request){
        String contNo = request.getParameter("contNo");
        String name = request.getParameter("name");
        String cradType = request.getParameter("cradType");
        String cradId = request.getParameter("cradId");
        //用这四个参数，掉核心接口

        //目前写死返回报文
        StringBuffer bf = new StringBuffer();
        bf.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
        bf.append("<policy>");
        bf.append("<contNo>886821602886</contNo>");//保单号
        bf.append("<dateOfPolicy>2019-04-23</dateOfPolicy>");//保单生效日期
        bf.append("<insuranceName>险种A</insuranceName>");//险种名称
        bf.append("<insureName>张三</insureName>");//投保人姓名
        bf.append("<insureCustomer>001</insureCustomer>");//投保人客户号
        bf.append("<insuredName>李四</insuredName>");//被保人姓名
        bf.append("<insuredCustomer>002</insuredCustomer>");//被保人客户号
        bf.append("<insureBirthday>2010-04-23</insureBirthday>");//投保人出生日期
        bf.append("<insuredBirthday>2012-04-23</insuredBirthday>");//被保人出生日期
        bf.append("<policyStatus>****</policyStatus>");//保单状态
        bf.append("</policy>");
        return bf.toString();
    }
}
