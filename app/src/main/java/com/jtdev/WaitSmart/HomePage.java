package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class HomePage extends AppCompatActivity {

    ImageButton btn_qstart, question, exit_square, qrcode;
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
        qrcode = findViewById(R.id.qrcode);

        btn_qstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, StartQ.class);
                startActivity(intent);

                Animatoo.animateFade(HomePage.this);
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
