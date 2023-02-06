package com.example.online_catalogue.controller;

import com.example.online_catalogue.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {


    @GetMapping("/adminPage")
        public ModelAndView adminPage(Model model){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("redirect:/logare");

        return mav;
        }

    @GetMapping("/userPage")
    public ModelAndView userPage(Model model){ModelAndView mav = new ModelAndView();

        mav.setViewName("redirect:/logare");
        return mav;
    }

}
