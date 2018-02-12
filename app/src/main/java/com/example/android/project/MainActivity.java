package com.example.android.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 0;
    public TextView T1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 = (TextView) findViewById(R.id.textView);

        // Form is temporary, spirit is eternal

    }

    public void inc(View v){
        x++;
        T1.setText(x + "");
    }
    public void dec(View v){
        x--;
        T1.setText(x + "");
    }
}
