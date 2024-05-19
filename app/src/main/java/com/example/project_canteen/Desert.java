package com.example.project_canteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Desert extends AppCompatActivity {

    private ImageView ivBack;
    private CardView pisangCoklat, kentangGoreng, batataGoreng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        ivBack = findViewById(R.id.ivBack);
        pisangCoklat = findViewById(R.id.pisangCoklat);
        kentangGoreng = findViewById(R.id.kentangGoreng);
        batataGoreng = findViewById(R.id.batataGoreng);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainactivty = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainactivty);
            }
        });

        pisangCoklat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });

        kentangGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });

        batataGoreng.setOnClickListener(new View.OnClickListener() {
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