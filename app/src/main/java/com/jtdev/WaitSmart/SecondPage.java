package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class SecondPage extends AppCompatActivity {

    ImageButton nextbtn2, back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        nextbtn2 = findViewById(R.id.nextbtn2);
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPage.this, ThirdPage.class);
                startActivity(intent);

                Animatoo.animateFade(SecondPage.this);
            }
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPage.this, MainActivity.class);
                startActivity(intent);

                Animatoo.animateSlideLeft(SecondPage.this);
            }
        });
    }
}
