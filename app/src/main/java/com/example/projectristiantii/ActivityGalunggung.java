package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityGalunggung extends AppCompatActivity {
    Button btnGalunggung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galunggung);
        btnGalunggung = (Button) findViewById(R.id.btnGalunggung);

        btnGalunggung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahbtnGalunggung = new Intent(ActivityGalunggung.this, FotoGalunggung.class);
                startActivity(pindahbtnGalunggung);
            }
        });
    }
}