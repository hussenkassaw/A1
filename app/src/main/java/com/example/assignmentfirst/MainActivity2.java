package com.example.assignmentfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView stx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        stx = findViewById(R.id.textView3);
        Intent biru= getIntent();
        int y=biru.getExtras().getInt("pass");
        stx.setText(String.valueOf(y));
    }
}