package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btnlihat;
    private TextView judul, penulis, penerbit, harga ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnlihat = findViewById(R.id.btn_lihat);
        judul = findViewById(R.id.getjudul);
        penulis = findViewById(R.id.getpenulis);
        penerbit = findViewById(R.id.getpenerbit);
        harga = findViewById(R.id.getharga);

        String judull = getIntent().getStringExtra("judul");
        String penuliss = getIntent().getStringExtra("penulis");
        String penerbitt = getIntent().getStringExtra("penerbit");
        String hargaa = getIntent().getStringExtra("harga");

        String text = "Judul Buku : "+judull+", Penulis : "+penuliss+", Penerbit : "+penerbitt+", Harga : "+hargaa;
        btnlihat.setText(text);
    }
}