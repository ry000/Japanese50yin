package com.example.japanese50yin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //public List test = new List(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //List test = new List();
        /*Random rand = new Random();
        int  n = rand.nextInt(test.getSize());
        String[] array = test.getList(n);*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*TextView pingjiaming = findViewById(R.id.Pingjiaming);
        pingjiaming.setText(array[0]);
        TextView pianjiaming = findViewById(R.id.Pianjiaming);
        pianjiaming.setText(array[1]);
        TextView fayin = findViewById(R.id.Fayin);
        fayin.setText(array[2]);
        TextView hint = findViewById(R.id.Hint);
        hint.setText(array[3]);*/

        TextView days = findViewById(R.id.Days);
        Fyx fyx = new Fyx();
        days.setText("范云霄不在的第" + fyx.getDays() + "天，想她");
    }

    public void Jump_to_pingjia(View view){
        // Do something in response to jump_to_pingjia button
        Intent intent = new Intent(this, Pingjia.class);
        startActivity(intent);
    }

    public void Jump_to_pianjia(View view){
        // Do something in response to jump_to_pingjia button
        Intent intent = new Intent(this, Pianjia.class);
        startActivity(intent);
    }

    public void Jump_to_50yinpic(View view){
        // Do something in response to jump_to_pingjia button
        Intent intent = new Intent(this, Pic_50yin.class);
        startActivity(intent);
    }
}
