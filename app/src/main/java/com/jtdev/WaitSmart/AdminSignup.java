package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class AdminSignup extends AppCompatActivity {

    ImageButton blk_btn_login, btn_signup;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_signup);

        blk_btn_login = findViewById(R.id.blk_btn_login);
        btn_signup = findViewById(R.id.btn_signup);
        blk_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminSignup.this, AdminLogin.class);
                startActivity(intent);

                Animatoo.animateSlideLeft(AdminSignup.this);
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminSignup.this, AdminLogin.class);
                startActivity(intent);

                Animatoo.animateSlideRight(AdminSignup.this);
            }
        });
    }
}