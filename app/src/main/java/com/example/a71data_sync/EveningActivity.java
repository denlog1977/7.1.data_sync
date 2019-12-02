package com.example.a71data_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class EveningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);

        TextView textView = findViewById(R.id.textViewEvening);
        textView.append("\n" + (new Date()).toString());

    }
}
