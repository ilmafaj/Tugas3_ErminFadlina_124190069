package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<BukuModel> listBuku = new ArrayList<>();
    Button btnlihat, btnbeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCetak = findViewById(R.id.mainRV);
        rvCetak.setHasFixedSize(true);
        listBuku.addAll(BukuData.getListData());
        btnlihat = findViewById(R.id.btn_lihat);
        btnbeli =  findViewById(R.id.btn_beli);

        showRecyclerList();

/*
        btnlihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(pindah);
            }
        });

        btnbeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gramedia.com/author/author-tere-liye"));
                startActivity(browser);
            }
        });
*/
    }

    private void showRecyclerList() {
        rvCetak.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        BukuAdapter bukuAdapter = new BukuAdapter(this);
        bukuAdapter.setBukuModels(listBuku);
        rvCetak.setAdapter(bukuAdapter);
    }


}