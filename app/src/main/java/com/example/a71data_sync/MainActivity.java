package com.example.a71data_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SYNC);

                int currentHour = new Date().getHours();

                if (currentHour > 14 && currentHour <= 15) {
                    intent.setData(Uri.parse("http://afternoon"));
                } else if (currentHour > 6 && currentHour <= 14) {
                    intent.setData(Uri.parse("http://morning"));
                } else {
                    intent.setData(Uri.parse("http://evening"));
                }

                startActivity(intent);            }
        });
    }
}
