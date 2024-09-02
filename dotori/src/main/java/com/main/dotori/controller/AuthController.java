package com.main.dotori.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class AuthController extends Auth{

    /** 본인인증 api 연동 _ 1차 검증 **/
    @Override
    public String authRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception{

        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map<String, Object> paramMap = new HashMap<>();
        Enumeration<String> getParamsName = req.getParameterNames();

        while(getParamsName.hasMoreElements()){
            String getParamName = getParamsName.nextElement();
            paramMap.put(getParamName, req.getParameter(getParamName));
        }

        return "index";
    }



}
