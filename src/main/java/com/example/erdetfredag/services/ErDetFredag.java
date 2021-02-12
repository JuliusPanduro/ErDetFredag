package com.example.erdetfredag.services;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Julius Panduro
 */

//<br> = "Breakline or \n"
//<b> = "Bold text"
//<big> = "Big text size+1"
//<div alignment> = "Alignment on the site"

public class ErDetFredag {
    public String erDet() {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        if (dayOfWeek.equals(DayOfWeek.FRIDAY)) {

            return "<b><big><big><div align=center>Ja</b><big><big></div><br><br>";
        } else

            return "<b><big><big><div align=center>Nej</b><big><big></div><br><br>";
    }
}
