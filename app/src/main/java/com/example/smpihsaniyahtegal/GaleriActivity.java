package com.example.smpihsaniyahtegal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GaleriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
    }

    public void albumpelantikanosis(View view) {
        Intent intent = new Intent(GaleriActivity.this, com.example.smpihsaniyahtegal.AlbumOsisActivity.class);
        startActivity(intent);
    }

    public void albumperpisahan(View view) {
        Intent intent = new Intent(GaleriActivity.this, com.example.smpihsaniyahtegal.AlbumPerpisahanActivity.class);
        startActivity(intent);
    }

    public void albumkegiatankemahbudaya(View view) {
        Intent intent = new Intent(GaleriActivity.this, com.example.smpihsaniyahtegal.AlbumKemahBudayaActivity.class);
        startActivity(intent);
    }

    public void albumkegiatanhutpgri(View view) {
        Intent intent = new Intent(GaleriActivity.this, com.example.smpihsaniyahtegal.AlbumHutPgriActivity.class);
        startActivity(intent);
    }

    public void albumkegiatanvaksinisasi(View view) {
        Intent intent = new Intent(GaleriActivity.this, com.example.smpihsaniyahtegal.AlbumVaksinActivity.class);
        startActivity(intent);
    }

    public void albumnative(View view) {
        Intent intent = new Intent(GaleriActivity.this, com.example.smpihsaniyahtegal.albumnativeActivity.class);
        startActivity(intent);
    }
}