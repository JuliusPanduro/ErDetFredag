package com.example.erdetfredag.controllers;

import com.example.erdetfredag.services.ErDetFredag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Julius Panduro
 */

//<br> = "Breakline or \n"
//<b> = "Bold text"
//<big> = "Big text size+1"
//<div alignment> = "Alignment on the site"

@Controller
public class ErDetFredagController {

    @GetMapping("/")
    @ResponseBody
    public String calculateDay() {
        ErDetFredag erDetFredag = new ErDetFredag();
        return "<br><br><br><b><big><big><big><div align=center>Er det fredag?</b><big><big><big></div><br> " + erDetFredag.erDet();
    }

}

