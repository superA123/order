package com.fmi.ordering.mobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(value = "/mobile", method = RequestMethod.GET)
public class LoginMobileController {
	  /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
            return "/mobile/login.html";
    }
    /**
     * 跳转修改密码
     */
    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String password() {
            return "/mobile/password.html";
    }
    
    /**
     * 跳转重置密码
     */
    @RequestMapping(value = "/repassword", method = RequestMethod.GET)
    public String repassword() {
            return "/mobile/repassword.html";
    }
}
