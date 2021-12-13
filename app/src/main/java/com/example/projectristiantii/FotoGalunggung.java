package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoGalunggung extends AppCompatActivity {
    Button bckgalunggung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_galunggung);

        bckgalunggung = (Button) findViewById(R.id.bckgalunggung);
        bckgalunggung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahGalunggung = new Intent(FotoGalunggung.this, MainActivity.class);
                startActivity(pindahGalunggung);
            }
        });
    }
}