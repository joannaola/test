package com.example.mytestmobapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class AdminGenrtdQR extends AppCompatActivity {

    ImageButton btn_share, btn_menu3;
    Button btn_home3, btn_genqr3, btn_anlytcs3, btn_logout3;
    FrameLayout frmlyt_shares, frmlyt_sidebar3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_genrtdqr);

        btn_share = findViewById(R.id.btn_share);
        frmlyt_sidebar3 = findViewById(R.id.frmlyt_sidebar3);
        btn_home3 = findViewById(R.id.btn_home3);
        btn_genqr3 = findViewById(R.id.btn_genqr3);
        btn_anlytcs3 = findViewById(R.id.btn_anlytcs3);
        btn_logout3 = findViewById(R.id.btn_logout3);
        btn_menu3 = findViewById(R.id.btn_menu3);
        frmlyt_shares = findViewById(R.id.frmlyt_shares);

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_shares.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_shares.setVisibility(View.GONE);
                }else{
                    frmlyt_shares.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_sidebar3.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_sidebar3.setVisibility(View.GONE);
                }else{
                    frmlyt_sidebar3.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenrtdQR.this, AdminHome.class);
                startActivity(intent);
            }
        });

        btn_genqr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenrtdQR.this, AdminGenQR.class);
                startActivity(intent);
            }
        });

        btn_anlytcs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenrtdQR.this, AdminAnlytcs.class);
                startActivity(intent);
            }
        });

        btn_logout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminGenrtdQR.this, AdminLogin.class);
                startActivity(intent);
            }
        });
    }
}
