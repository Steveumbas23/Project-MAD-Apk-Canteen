package com.example.project_canteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Drink extends AppCompatActivity {

    private ImageView ivBack;
    private CardView Nutrisari, esTeh, esCoklat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        ivBack = findViewById(R.id.ivBack);
        Nutrisari = findViewById(R.id.Nutrisari);
        esTeh = findViewById(R.id.esTeh);
        esCoklat = findViewById(R.id.esCoklat);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainactivty = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainactivty);
            }
        });

        Nutrisari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });

        esTeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });

        esCoklat.setOnClickListener(new View.OnClickListener() {
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