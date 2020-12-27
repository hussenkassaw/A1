package com.example.assignmentfirst;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int a=0;
int x;
TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx = findViewById(R.id.textView);
    }

    public void callnext(View view) {
        Intent birukti=new Intent(this, MainActivity2.class);
        birukti.putExtra("pass", x);
        startActivity(birukti);
    }

    public void counte(View view) {
        a++;
        x=a;
        tx.setText(String.valueOf(a));
    }
}