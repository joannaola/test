package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class AdminBreak extends AppCompatActivity {

    ImageButton btn_menu5, btn_red_resume;
    Button btn_home5, btn_genqr5, btn_anlytcs5, btn_logout5;
    FrameLayout frmlyt_sidebar5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_home);

        btn_menu5 = findViewById(R.id.btn_menu5);
        frmlyt_sidebar5 = findViewById(R.id.frmlyt_sidebar5);
        btn_home5 = findViewById(R.id.btn_home5);
        btn_genqr5 = findViewById(R.id.btn_genqr5);
        btn_anlytcs5 = findViewById(R.id.btn_anlytcs5);
        btn_logout5 = findViewById(R.id.btn_logout5);
        btn_red_resume = findViewById(R.id.btn_red_resume);



        btn_menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_sidebar5.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_sidebar5.setVisibility(View.GONE);
                }else{
                    frmlyt_sidebar5.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminBreak.this, AdminHome.class);
                startActivity(intent);
            }
        });

        btn_genqr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminBreak.this, AdminGenQR.class);
                startActivity(intent);
            }
        });

        btn_anlytcs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminBreak.this, AdminAnlytcs.class);
                startActivity(intent);
            }
        });

        btn_logout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminBreak.this, AdminLogin.class);
                startActivity(intent);
            }
        });

        btn_red_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminBreak.this, AdminHome.class);
                startActivity(intent);
            }
        });

    }
}
