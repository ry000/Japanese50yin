package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String go_to_JP = "2017-4-4 00:00:00";
        Date date_before;
        Date today = new Date();
        int days = 0;
        try {
            date_before = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(go_to_JP);
            days = (int) ((today.getTime() - date_before.getTime()) / (1000*3600*24));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String day_string = String.valueOf(days);

        TextView day_textView = findViewById(R.id.Days);
        day_textView.setText("范云霄不在的第" + day_string + "天，想她");
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
