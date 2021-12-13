package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoLawu extends AppCompatActivity {
    Button bckLawu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_lawu);
        bckLawu = (Button) findViewById(R.id.bckLawu);
        bckLawu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahLawu = new Intent(FotoLawu.this, MainActivity.class);
                startActivity(pindahLawu);
            }
        });
    }
}