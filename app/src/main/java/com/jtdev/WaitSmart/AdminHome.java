package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TimePicker;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.util.Calendar;

public class AdminHome extends AppCompatActivity {


    ImageButton btn_menu, btn_yellow, btn_red_home, btn_green_next, btn_stop;
    Button btn_home, btn_genqr, btn_anlytcs, btn_logout;
    FrameLayout frmlyt_sidebar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_home);

        btn_menu = findViewById(R.id.btn_menu);
        frmlyt_sidebar = findViewById(R.id.frmlyt_sidebar);
        btn_home = findViewById(R.id.btn_home);
        btn_genqr = findViewById(R.id.btn_genqr);
        btn_anlytcs = findViewById(R.id.btn_anlytcs);
        btn_logout = findViewById(R.id.btn_logout);
        btn_yellow = findViewById(R.id.btn_yellow);
        btn_red_home = findViewById(R.id.btn_red_home);
        btn_green_next = findViewById(R.id.btn_green_next);
        btn_stop = findViewById(R.id.btn_stop);



        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isVisible = frmlyt_sidebar.getVisibility();
                if (isVisible == View.VISIBLE){
                    frmlyt_sidebar.setVisibility(View.GONE);
                }else{
                    frmlyt_sidebar.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHome.this, AdminHome.class);
                startActivity(intent);


            }
        });

        btn_genqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHome.this, AdminGenQR.class);
                startActivity(intent);
            }
        });

        btn_anlytcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHome.this, AdminAnlytcs.class);
                startActivity(intent);
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHome.this, AdminLogin.class);
                startActivity(intent);
            }
        });

        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();

                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(AdminHome.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Intent intent = new Intent(AdminHome.this, AdminBreak.class);
                        startActivity(intent);
                    }
                },hour, minute, false);
                timePickerDialog.show();

            }
        });



    }
}