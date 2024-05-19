package com.example.project_canteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView ivMakanan, ivMinuman, ivDesert, ivProfile, ivIcon;

    private CardView NasigorengCardView, nasiCampur, ayamGeprek;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivMakanan = findViewById(R.id.ivMakanan);
        ivMinuman = findViewById(R.id.ivMinuman);
        ivDesert = findViewById(R.id.ivDesert);
        ivProfile = findViewById(R.id.ivProfile);
        NasigorengCardView = findViewById(R.id.Nasigoreng);
        nasiCampur = findViewById(R.id.nasiCampur);
        ayamGeprek = findViewById(R.id.ayamGeprek);
        ivIcon = findViewById(R.id.ivIcon);

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

        ivMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food = new Intent(getApplicationContext(), Food.class);
                startActivity(food);
            }
        });

        ivMinuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drink = new Intent(getApplicationContext(), Drink.class);
                startActivity(drink);
            }
        });

        ivDesert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desert = new Intent(getApplicationContext(), Desert.class);
                startActivity(desert);
            }
        });

        NasigorengCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mycart = new Intent(getApplicationContext(), MyCart.class);
                startActivity(mycart);
            }
        });

        ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(getApplicationContext(), Profile.class);
                startActivity(profile);
            }
        });

        ivIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qr = new Intent(getApplicationContext(), QR.class);
                startActivity(qr);
            }
        });
    }

    private void displayToast() {
        Toast.makeText(this, "Stok Habis", Toast.LENGTH_SHORT).show();
    }
}