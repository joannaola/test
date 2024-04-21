package com.jtdev.WaitSmart;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;


public class MainActivity extends AppCompatActivity {

    ImageButton nextbtn, skippp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextbtn = findViewById(R.id.nextbtn);
        skippp = findViewById(R.id.skippp);


        nextbtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondPage.class);
            startActivity(intent);

            Animatoo.animateFade(MainActivity.this);
        });

        skippp.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomePage.class);
            startActivity(intent);

            Animatoo.animateFade(MainActivity.this);
        });

    }


}