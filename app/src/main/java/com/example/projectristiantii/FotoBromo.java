package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoBromo extends AppCompatActivity {
    Button bckbromo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_bromo);
        bckbromo = (Button) findViewById(R.id.bckbromo);
        bckbromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBromo = new Intent(FotoBromo.this, MainActivity.class);
                startActivity(pindahBromo);
            }
        });
    }
}