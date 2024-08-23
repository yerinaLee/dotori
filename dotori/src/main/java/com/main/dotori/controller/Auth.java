package com.main.dotori.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/web/test/auth")
public abstract class Auth {

    @RequestMapping("/request")
    public abstract String authRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception;

}
