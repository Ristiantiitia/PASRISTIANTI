package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoSemeru extends AppCompatActivity {
    Button bckSemeru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_semeru);
        bckSemeru = (Button) findViewById(R.id.bckSemeru);
        bckSemeru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahSemeru = new Intent(FotoSemeru.this, MainActivity.class);
                startActivity(pindahSemeru);
            }
        });
    }
}