package com.teamnequit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class KPIActivity extends AppCompatActivity {
    PDFView kpi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_p_i);

        kpi=(PDFView) findViewById(R.id.teamKPI);
        kpi.fromAsset("kpi.pdf").load();
    }
}