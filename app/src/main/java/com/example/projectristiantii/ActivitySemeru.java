package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySemeru extends AppCompatActivity {
    Button btnSemeru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semeru);
        btnSemeru = (Button) findViewById(R.id.btnSemeru);

        btnSemeru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahbtnSemeru = new Intent(ActivitySemeru.this, FotoSemeru.class);
                startActivity(pindahbtnSemeru);
            }
        });
    }
}