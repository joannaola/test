package com.example.mytestmobapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class StartQ extends AppCompatActivity {


    ImageButton cancelqueue, question2, exit_square2;
    FrameLayout frmlyt_btnhelp2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qstart);

        cancelqueue = findViewById(R.id.cancelqueue);
        question2 = findViewById(R.id.question2);
        frmlyt_btnhelp2 = findViewById(R.id.frmlyt_btnhelp2);
        exit_square2 = findViewById(R.id.exit_square2);

        cancelqueue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartQ.this, AdminLogin.class);
                startActivity(intent);
            }
        });

        question2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_btnhelp2.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_btnhelp2.setVisibility(View.GONE);
                }else{
                    frmlyt_btnhelp2.setVisibility(View.VISIBLE);
                }
            }
        });

        exit_square2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_btnhelp2.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_btnhelp2.setVisibility(View.GONE);
                }else{
                    frmlyt_btnhelp2.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
