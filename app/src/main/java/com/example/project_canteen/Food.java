package com.example.project_canteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Food extends AppCompatActivity {

    private ImageView ivBack;
    private CardView mieCakalangCardView, MieGoreng, Nasigoreng, nasiCampur, ayamGeprek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ivBack = findViewById(R.id.ivBack);
        mieCakalangCardView = findViewById(R.id.MieCakalang);
        MieGoreng = findViewById(R.id.MieGoreng);
        Nasigoreng = findViewById(R.id.Nasigoreng);
        nasiCampur = findViewById(R.id.nasiCampur);
        ayamGeprek = findViewById(R.id.ayamGeprek);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
            }
        });

        MieGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });

        mieCakalangCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });

        Nasigoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });

        nasiCampur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });

        ayamGeprek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });
    }
    private void displayToast() {
        Toast.makeText(this, "Stok Habis", Toast.LENGTH_SHORT).show();
    }
}