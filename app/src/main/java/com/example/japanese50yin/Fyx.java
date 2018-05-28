package com.example.japanese50yin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fyx {
    String go_to_JP;
    Date date_before;
    Fyx(){
        go_to_JP = "2017-4-4 00:00:00";
    }

    public String getDays(){
        int days = 0;
        Date today = new Date();
        try {
            date_before = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(go_to_JP);
            days = (int) ((today.getTime() - date_before.getTime()) / (1000*3600*24));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String day_string = String.valueOf(days);

        return day_string;
    }
}
