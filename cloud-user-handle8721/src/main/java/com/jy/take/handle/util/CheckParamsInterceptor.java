package com.jy.take.handle.util;


import com.js.ls.api.annotation.NoNull;
import org.apache.commons.lang.StringUtils;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
public class CheckParamsInterceptor extends HandlerInterceptorAdapter  {

    private static Logger logger = LoggerFactory.getLogger(CheckParamsInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            logger.warn("UnSupport handler");
            return true;
        }
        List<String> list = getParamsName((HandlerMethod) handler);
        for (String s : list) {
            String parameter = request.getParameter(s);
            if (StringUtils.isEmpty(parameter)) {
                JSONObject jsonObject = new JSONObject();
                //这个地方是定义缺少参数或者参数为空的时候返回的数据
                jsonObject.put("msg", "缺少必要的" + list + "值");
                response.setHeader("Content-type", "application/json;charset=UTF-8");
                response.setHeader("Access-Control-Allow-Origin", "*");//跨域
                response.getWriter().write(jsonObject.toJSONString());
                return false;
            }
        }
        return true;
    }

    private List getParamsName(HandlerMethod handlerMethod) {
        Parameter[] parameters = handlerMethod.getMethod().getParameters();
        List<String> list = new ArrayList<>();
        for (Parameter parameter : parameters) {
            //判断这个参数时候被加入了 ParamsNotNull. 的注解
            //.isAnnotationPresent()  这个方法可以看一下
            if (parameter.isAnnotationPresent(NoNull.class)) {
                list.add(parameter.getName());
            }
        }
        return list;
    }

}