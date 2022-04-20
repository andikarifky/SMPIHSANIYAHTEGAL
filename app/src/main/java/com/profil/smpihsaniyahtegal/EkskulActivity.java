package com.profil.smpihsaniyahtegal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class EkskulActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.mainhasbk,
            R.drawable.headergaleri1,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        sliderView = findViewById(R.id.image_slider);

        com.profil.smpihsaniyahtegal.SliderAdapter sliderAdapter = new com.profil.smpihsaniyahtegal.SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void pramuka(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.PmrActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.FutsalActivity.class);
        startActivity(intent);
    }

    public void volly(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.VollyActivity.class);
        startActivity(intent);
    }

    public void karate(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.KarateActivity.class);
        startActivity(intent);
    }

    public void basket(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.BasketActivity.class);
        startActivity(intent);
    }

    public void musik(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.MusikActivity.class);
        startActivity(intent);
    }

    public void literasi(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.literasiActivity.class);
        startActivity(intent);
    }

    public void olimpiade(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.OlimpiadeActivity.class);
        startActivity(intent);
    }

    public void kir(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.kirActivity.class);
        startActivity(intent);
    }

    public void pks(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.pksActivity.class);
        startActivity(intent);
    }

    public void silat(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.silatActivity.class);
        startActivity(intent);
    }

    public void Tilawah(View view) {
        Intent intent = new Intent(EkskulActivity.this, com.profil.smpihsaniyahtegal.tilawahActivity.class);
        startActivity(intent);
    }
}