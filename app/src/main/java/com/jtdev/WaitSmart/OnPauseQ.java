package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class OnPauseQ extends AppCompatActivity {

    ImageButton exit_square_p, cancel_queue_p, question_pause;
    FrameLayout frmlyt_btnhelp_p;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onpause_queue);

        exit_square_p = findViewById(R.id.exit_square_p);
        cancel_queue_p = findViewById(R.id.cancel_queue_p);
        frmlyt_btnhelp_p = findViewById(R.id.frmlyt_btnhelp_p);
        question_pause = findViewById(R.id.question_pause);

        exit_square_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_btnhelp_p.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_btnhelp_p.setVisibility(View.GONE);
                }else{
                    frmlyt_btnhelp_p.setVisibility(View.VISIBLE);
                }
            }
        });


        question_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_btnhelp_p.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_btnhelp_p.setVisibility(View.GONE);
                }else{
                    frmlyt_btnhelp_p.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
