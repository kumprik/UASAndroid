package com.example.giswatersportbenoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends AppCompatActivity {


    private final int pjg_spls=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent tampil = new Intent(Splashscreen.this,MainActivity.class);
                Splashscreen.this.startActivity(tampil);
                Splashscreen.this.finish();
            }
        }, pjg_spls);


    }
}
