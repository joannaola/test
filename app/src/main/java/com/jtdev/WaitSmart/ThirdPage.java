package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class ThirdPage extends AppCompatActivity {

    ImageButton getstarted, backk;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdpage);

        getstarted = findViewById(R.id.getstarted);
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdPage.this, HomePage.class);
                startActivity(intent);

                Animatoo.animateSlideUp(ThirdPage.this);
            }
        });

        backk = findViewById(R.id.backk);
        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdPage.this, SecondPage.class);
                startActivity(intent);

                Animatoo.animateSlideLeft(ThirdPage.this);
            }
        });
    }
}
