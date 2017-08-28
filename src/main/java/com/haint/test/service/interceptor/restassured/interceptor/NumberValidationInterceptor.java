/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haint.test.service.interceptor.restassured.interceptor;


import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Hai Nguyen (hai.nguyentrung2@vn.bosch.com)
 */
@Interceptor
@NumberValidation
public class NumberValidationInterceptor {
    
    @AroundInvoke
    public Object validateObject(InvocationContext context) throws Exception {
        int num2 = (int) context.getParameters()[1];
        if (num2 == 0) {
            throw new NumberFormatException("Divided by 0");
        }
        return context.proceed();
    }
}
