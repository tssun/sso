package org.sts.sso.pizza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ts.Sun
 * @since 0.1
 */
@Controller
public class WelcomeController {

    @RequestMapping("/test")
    public String test(){
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}