package com.cw.stu.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author WuLiangzhi  2019/06/14 18:28
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/hi")
    public String hi(Locale locale, Model model) {
        model.addAttribute("greeting","Hello!");

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(new Date());

        model.addAttribute("currentTime", dateStr);

        return "hi";
    }

}
