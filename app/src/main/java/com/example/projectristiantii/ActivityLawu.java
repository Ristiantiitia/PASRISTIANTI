package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLawu extends AppCompatActivity {
    Button btnLawu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawu);
        btnLawu = (Button) findViewById(R.id.btnLawu);

        btnLawu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahbtnLawu = new Intent(ActivityLawu.this, FotoLawu.class);
                startActivity(pindahbtnLawu);
            }
        });
    }
}