package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andrewdmo on 9/28/16.
 */
@Controller
public class controller {

    @RequestMapping ("/")
    public String goCloud () {
        return "landingPage";
    }
}
