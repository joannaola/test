package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {

    ImageButton btn_qstart, question, exit_square;
    FrameLayout frmlyt_btnhelp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        btn_qstart = findViewById(R.id.btn_qstart);
        question = findViewById(R.id.question);
        frmlyt_btnhelp = findViewById(R.id.frmlyt_btnhelp);
        exit_square = findViewById(R.id.exit_square);

        btn_qstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, StartQ.class);
                startActivity(intent);
            }
        });

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_btnhelp.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_btnhelp.setVisibility(View.GONE);
                }else{
                    frmlyt_btnhelp.setVisibility(View.VISIBLE);
                }
            }
        });

        exit_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_btnhelp.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_btnhelp.setVisibility(View.GONE);
                }else{
                    frmlyt_btnhelp.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
