package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBromo extends AppCompatActivity {
    Button btnBromo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bromo);
        btnBromo = (Button) findViewById(R.id.btnBromo);

        btnBromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahbtnBromo = new Intent(ActivityBromo.this, FotoBromo.class);
                startActivity(pindahbtnBromo);
            }
        });
    }
}