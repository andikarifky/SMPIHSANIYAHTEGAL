package com.example.smpihsaniyahtegal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.smpihsaniyahtegal.ProfilActivity.class);
        startActivity(intent);
    }

    public void eskul(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.smpihsaniyahtegal.EkskulActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.smpihsaniyahtegal.guruActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.smpihsaniyahtegal.FasilitasActivity.class);
        startActivity(intent);
    }



    public void galeri(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.smpihsaniyahtegal.GaleriActivity.class);
        startActivity(intent);
    }

    public void sosmed(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.smpihsaniyahtegal.SosmedActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.smpihsaniyahtegal.PerpusActivity.class);
        startActivity(intent);
    }

    public void eksperiment(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.smpihsaniyahtegal.ExperimentActivity.class);
        startActivity(intent);
    }
}

