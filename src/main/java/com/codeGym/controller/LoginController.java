package com.codeGym.controller;

import com.codeGym.dao.UserDao;
import com.codeGym.model.Login;
import com.codeGym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

   @GetMapping("/home")
    public ModelAndView home(){
       ModelAndView modelAndView=new ModelAndView("home", "login", new Login());
       return modelAndView;
   }

   @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
       User user= UserDao.checkLogin(login);
       if (user == null){
           ModelAndView modelAndView=new ModelAndView("error");
           return modelAndView;
       }else {
           ModelAndView modelAndView=new ModelAndView("user", "user", user);
           return modelAndView;
       }
   }
}
