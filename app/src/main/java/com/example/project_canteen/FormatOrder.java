package com.example.project_canteen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormatOrder extends AppCompatActivity {
    private EditText etNama, etNo, etAlamat, etMetode, etCatatan;
    private ImageView ivBack;
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_format_order);

        etNama = findViewById(R.id.etNama);
        etNo = findViewById(R.id.etNo);
        etAlamat = findViewById(R.id.etAlamat);
        etMetode = findViewById(R.id.etMetode);
        etCatatan = findViewById(R.id.etCatatan);
        ivBack = findViewById(R.id.ivBack);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thankyou = new Intent(getApplicationContext(), ThankYou.class);
                startActivity(thankyou);
            }
        });

        database = FirebaseDatabase.getInstance().getReferenceFromUrl("https://projectcunteen-default-rtdb.firebaseio.com/");

        Button sendButton = findViewById(R.id.btnSend);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String nama = etNama.getText().toString().trim();
        String nomor = etNo.getText().toString().trim();
        String alamat = etAlamat.getText().toString().trim();
        String metode = etMetode.getText().toString().trim();

        if (TextUtils.isEmpty(nama) || TextUtils.isEmpty(nomor) || TextUtils.isEmpty(alamat) || TextUtils.isEmpty(metode)) {
            Toast.makeText(this, "Harap lengkapi semua bidang terlebih dahulu", Toast.LENGTH_SHORT).show();
        } else {
            String catatan = etCatatan.getText().toString().trim();

            StringBuilder message = new StringBuilder();
            message.append("Data yang telah Anda masukkan:\n\n");
            message.append("Nama: ").append(nama).append("\n");
            message.append("Nomor Telepon: ").append(nomor).append("\n");
            message.append("Alamat Pengiriman: ").append(alamat).append("\n");
            message.append("Metode Pembayaran: ").append(metode).append("\n");
            message.append("Catatan Khusus: ").append(catatan).append("\n");

            saveToFirebase(nama, nomor, alamat, metode, catatan);

            new AlertDialog.Builder(this)
                    .setTitle("Data Terkirim!")
                    .setMessage(message.toString())
                    .setPositiveButton("OK", (dialog, which) -> {
                        etNama.setText("");
                        etNo.setText("");
                        etAlamat.setText("");
                        etMetode.setText("");
                        etCatatan.setText("");

                        Intent thankyou = new Intent(getApplicationContext(), ThankYou.class);
                        startActivity(thankyou);
            })
                    .show();
        }
    }
    private void saveToFirebase(String name, String nomor, String alamat, String metode, String catatan) {
        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(nomor) && !TextUtils.isEmpty(alamat) && !TextUtils.isEmpty(metode)){
            database = FirebaseDatabase.getInstance().getReference("Users");
            database.child(name).child("user").setValue(name);
            database.child(name).child("nomor").setValue(nomor);
            database.child(name).child("alamat").setValue(alamat);
            database.child(name).child("metode").setValue(metode);
            database.child(name).child("catatan").setValue(catatan);
        }
    }
}