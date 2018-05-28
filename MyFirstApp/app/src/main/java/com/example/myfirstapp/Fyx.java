package com.example.myfirstapp;

import java.util.Date;

public class Fyx {
    public String DateCalculator(Date date_before, Date date_after){
        int days = (int) ((date_after.getTime() - date_before.getTime()) / (1000*3600*24));
        String result = String.valueOf(days);
        return result;
    }
}
