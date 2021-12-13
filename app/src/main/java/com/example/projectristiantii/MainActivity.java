package com.example.projectristiantii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgGalunggung, imgSemeru, imgBromo, imgLawu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGalunggung = (CircleImageView) findViewById(R.id.circleImageView6);
        imgSemeru = (CircleImageView) findViewById(R.id.circleImageView7);
        imgBromo = (CircleImageView) findViewById(R.id.circleImageView);
        imgLawu = (CircleImageView) findViewById(R.id.circleImageView8);

        imgGalunggung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahGalunggung = new Intent( MainActivity.this, ActivityGalunggung.class);
                startActivity(pindahGalunggung);
            }
        });
        imgSemeru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahSemeru = new Intent( MainActivity.this, ActivitySemeru.class);
                startActivity(pindahSemeru);
            }
        });
        imgBromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBromo = new Intent( MainActivity.this, ActivityBromo.class);
                startActivity(pindahBromo);
            }
        });
        imgLawu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahLawu = new Intent( MainActivity.this, ActivityLawu.class);
                startActivity(pindahLawu);
            }
        });


    }
}