package com.controller;

import com.dao.UserDAO;
import com.model.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    UserDAO dao;


    @GetMapping("/")
    public String loginPage(Model model) {

        model.addAttribute("user",
        new User());

        return "login";
    }


    @PostMapping("/login")
    public String loginUser(
            @ModelAttribute("user") User user,
            Model model) {

        boolean status = dao.validateUser(
                user.getEmail(),
                user.getPassword()
        );

        if(status) {

            model.addAttribute(
            "msg",
            "Login Successful");

            return "dashboard";
        }

        else {

            model.addAttribute(
            "msg",
            "Invalid Email or Password");

            return "error";
        }
    }

    @GetMapping("/register")
    public String registerPage(Model model) {

        model.addAttribute("user",
        new User());

        return "register";
    }

    @PostMapping("/saveUser")
    public String saveUser(
            @ModelAttribute("user") User user,
            Model model) {

        int result = dao.registerUser(
                user.getEmail(),
                user.getPassword()
        );

        if(result > 0) {

            model.addAttribute(
            "msg",
            "Registration Successful");

            return "login";
        }

        else {

            model.addAttribute(
            "msg",
            "Registration Failed");

            return "error";
        }
    }
}