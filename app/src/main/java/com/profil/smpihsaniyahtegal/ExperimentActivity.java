package com.profil.smpihsaniyahtegal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ExperimentActivity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);
        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset ("guruws").load();
    }
}