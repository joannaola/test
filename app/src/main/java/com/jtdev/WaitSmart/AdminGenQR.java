package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class AdminGenQR extends AppCompatActivity {


    Button btn_home2, btn_genqr2, btn_anlytcs2, btn_logout2;
    FrameLayout frmlyt_sidebar2;
    ImageButton btn_green_genqrcode, btn_menu2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_genqr);

        btn_green_genqrcode = findViewById(R.id.btn_green_genqrcode);
        btn_menu2 = findViewById(R.id.btn_menu2);
        frmlyt_sidebar2 = findViewById(R.id.frmlyt_sidebar2);
        btn_home2 = findViewById(R.id.btn_home2);
        btn_genqr2 = findViewById(R.id.btn_genqr2);
        btn_anlytcs2 = findViewById(R.id.btn_anlytcs2);
        btn_logout2 = findViewById(R.id.btn_logout2);

        btn_green_genqrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenQR.this, AdminGenrtdQR.class);
                startActivity(intent);
            }
        });

        btn_menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_sidebar2.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_sidebar2.setVisibility(View.GONE);
                }else{
                    frmlyt_sidebar2.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenQR.this, AdminHome.class);
                startActivity(intent);
            }
        });

        btn_genqr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenQR.this, AdminGenQR.class);
                startActivity(intent);
            }
        });

        btn_anlytcs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenQR.this, AdminAnlytcs.class);
                startActivity(intent);
            }
        });

        btn_logout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenQR.this, AdminLogin.class);
                startActivity(intent);
            }
        });
    }
}
