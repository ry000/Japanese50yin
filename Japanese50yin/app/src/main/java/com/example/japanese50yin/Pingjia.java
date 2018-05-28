package com.example.japanese50yin;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Pingjia extends AppCompatActivity {
    //MediaPlayer mp1 = MediaPlayer.create(this, R.raw.a);
    public List test = new List();
    Random rand = new Random();
    int  n = rand.nextInt(test.getSize());
    String[] array = test.getList(n);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pingjia);
        TextView pingjiaming = findViewById(R.id.Pianjiaming);
        pingjiaming.setText(array[0]);
        TextView pianjiaming = findViewById(R.id.Pingjiaming);
        pianjiaming.setText(array[1]);
        TextView fayin = findViewById(R.id.Fayin);
        fayin.setText(array[2]);
        TextView hint = findViewById(R.id.Hint);
        hint.setText(array[3]);
        test.initSound(this);
    }

    public void Show(View view) {
        // Do something in response to button
        TextView pianjiaming = findViewById(R.id.Pingjiaming);
        pianjiaming.setVisibility(View.VISIBLE);
        TextView fayin = findViewById(R.id.Fayin);
        fayin.setVisibility(View.VISIBLE);
        TextView hint = findViewById(R.id.Hint);
        hint.setVisibility(View.VISIBLE);
    }

    public void Next(View view) {
        // Do something in response to button
        Random rand = new Random();
        n = rand.nextInt(test.getSize());
        String[] array = test.getList(n);
        TextView pingjiaming = findViewById(R.id.Pianjiaming);
        pingjiaming.setText(array[0]);
        TextView pianjiaming = findViewById(R.id.Pingjiaming);
        pianjiaming.setVisibility(View.INVISIBLE);
        pianjiaming.setText(array[1]);
        TextView fayin = findViewById(R.id.Fayin);
        fayin.setVisibility(View.INVISIBLE);
        fayin.setText(array[2]);
        TextView hint = findViewById(R.id.Hint);
        hint.setVisibility(View.INVISIBLE);
        hint.setText(array[3]);
    }

    public void Sound(View view) {
        MediaPlayer mp = test.getSound(n);
        if(mp != null)
            mp.start();
    }
}
