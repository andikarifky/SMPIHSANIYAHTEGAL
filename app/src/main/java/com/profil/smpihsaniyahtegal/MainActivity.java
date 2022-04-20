package com.profil.smpihsaniyahtegal;

import android.content.Intent;
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
        Intent intent = new Intent(MainActivity.this, com.profil.smpihsaniyahtegal.ProfilActivity.class);
        startActivity(intent);
    }

    public void eskul(View view) {
        Intent intent = new Intent(MainActivity.this, com.profil.smpihsaniyahtegal.EkskulActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, com.profil.smpihsaniyahtegal.guruActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, com.profil.smpihsaniyahtegal.FasilitasActivity.class);
        startActivity(intent);
    }



    public void galeri(View view) {
        Intent intent = new Intent(MainActivity.this, com.profil.smpihsaniyahtegal.GaleriActivity.class);
        startActivity(intent);
    }

    public void sosmed(View view) {
        Intent intent = new Intent(MainActivity.this, com.profil.smpihsaniyahtegal.SosmedActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, com.profil.smpihsaniyahtegal.PerpusActivity.class);
        startActivity(intent);
    }

    public void eksperiment(View view) {
        Intent intent = new Intent(MainActivity.this, com.profil.smpihsaniyahtegal.ExperimentActivity.class);
        startActivity(intent);
    }
}

