package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class AdminAnlytcs extends AppCompatActivity {

    ImageButton btn_menu4;
    Button btn_home4, btn_genqr4, btn_anlytcs4, btn_logout4;
    FrameLayout frmlyt_sidebar4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_analytics);


        frmlyt_sidebar4 = findViewById(R.id.frmlyt_sidebar4);
        btn_home4 = findViewById(R.id.btn_home4);
        btn_genqr4 = findViewById(R.id.btn_genqr4);
        btn_anlytcs4 = findViewById(R.id.btn_anlytcs4);
        btn_logout4 = findViewById(R.id.btn_logout4);
        btn_menu4 = findViewById(R.id.btn_menu4);



        btn_menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_sidebar4.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_sidebar4.setVisibility(View.GONE);
                }else{
                    frmlyt_sidebar4.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminAnlytcs.this, AdminHome.class);
                startActivity(intent);
            }
        });

        btn_genqr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminAnlytcs.this, AdminGenQR.class);
                startActivity(intent);
            }
        });

        btn_anlytcs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminAnlytcs.this, AdminAnlytcs.class);
                startActivity(intent);
            }
        });

        btn_logout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminAnlytcs.this, AdminLogin.class);
                startActivity(intent);
            }
        });
    }
}
