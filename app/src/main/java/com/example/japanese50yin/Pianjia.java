package com.example.japanese50yin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Pianjia extends AppCompatActivity {
    public List test = new List();
    Random rand = new Random();
    int  n = rand.nextInt(test.getSize());
    String[] array = test.getList(n);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pingjia);
        TextView Pianjiaming = findViewById(R.id.Pianjiaming);
        Pianjiaming.setText(array[1]);
        TextView Pingjiaming = findViewById(R.id.Pingjiaming);
        Pingjiaming.setText(array[0]);
        TextView fayin = findViewById(R.id.Fayin);
        fayin.setText(array[2]);
        TextView hint = findViewById(R.id.Hint);
        hint.setText(array[3]);
    }

    public void Show(View view) {
        // Do something in response to button
        TextView Pingjiaming = findViewById(R.id.Pingjiaming);
        Pingjiaming.setVisibility(View.VISIBLE);
        TextView fayin = findViewById(R.id.Fayin);
        fayin.setVisibility(View.VISIBLE);
        TextView hint = findViewById(R.id.Hint);
        hint.setVisibility(View.VISIBLE);
    }

    public void Next(View view) {
        // Do something in response to button
        Random rand = new Random();
        int  n = rand.nextInt(test.getSize());
        String[] array = test.getList(n);
        TextView Pianjiaming = findViewById(R.id.Pianjiaming);
        Pianjiaming.setText(array[1]);
        TextView Pingjiaming = findViewById(R.id.Pingjiaming);
        Pingjiaming.setVisibility(View.INVISIBLE);
        Pingjiaming.setText(array[0]);
        TextView fayin = findViewById(R.id.Fayin);
        fayin.setVisibility(View.INVISIBLE);
        fayin.setText(array[2]);
        TextView hint = findViewById(R.id.Hint);
        hint.setVisibility(View.INVISIBLE);
        hint.setText(array[3]);
    }
}
