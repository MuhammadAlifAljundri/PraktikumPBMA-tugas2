package com.example.praktikumpbma_tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChangeImg = findViewById(R.id.btnChangeImage);
        ImageView imgView = findViewById(R.id.imgView);

        int[] cards = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5};

        btnChangeImg.setOnClickListener(new View.OnClickListener() {
            int n = 1;
            @Override
            public void onClick(View view) {
                if(n >= cards.length){
                    n = 0;
                }
                imgView.setImageResource(cards[n]);
                n++;
            }
        });

    }
}