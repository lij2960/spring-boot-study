package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.Locale;

@Controller
public class MyMessagesController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/login")
    public String login(Model model) {
        Locale locale = LocaleContextHolder.getLocale();
        model.addAttribute("welcomeLang", messageSource.getMessage("welcome", null, locale));
        return "login";
    }
}
