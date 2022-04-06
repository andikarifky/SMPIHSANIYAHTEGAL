package com.example.smpihsaniyahtegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SosmedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosmed);
    }

    public void google(View view) {
        Intent intent = new Intent(SosmedActivity.this, com.example.smpihsaniyahtegal.GoogleActivity.class);
        startActivity(intent);
    }

    public void facebook(View view) {
        Intent intent = new Intent(SosmedActivity.this, com.example.smpihsaniyahtegal.FacebookActivity.class);
        startActivity(intent);

    }

    public void instagram(View view) {
        Intent intent = new Intent(SosmedActivity.this, com.example.smpihsaniyahtegal.InstagramActivity.class);
        startActivity(intent);
    }

    public void youtube(View view) {
        Intent intent = new Intent(SosmedActivity.this, com.example.smpihsaniyahtegal.YoutubeActivity.class);
        startActivity(intent);
    }
}