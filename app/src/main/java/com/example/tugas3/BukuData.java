package com.example.tugas3;

import java.util.ArrayList;

public class BukuData {
    private static  String[] nama = new String[]{"Bumi", "Bulan", "Matahari", "Bintang", "Komet", "Komet Minor", "Ceros dan Batozar", "Nebula"};

    private static int[] gambar = new int[]{R.drawable.bumi, R.drawable.bulan, R.drawable.matahari, R.drawable.bintang, R.drawable.komet, R.drawable.minor, R.drawable.ceros, R.drawable.nebula};

    public static ArrayList<BukuModel> getListData(){
        BukuModel bukuModel = null;
        ArrayList<BukuModel> list = new ArrayList<BukuModel>();
        for ( int i = 0; i < nama.length; i++){
            bukuModel = new BukuModel();
            bukuModel.setGambarBuku(gambar[i]);
            bukuModel.setNamaBuku(nama[i]);
            list.add(bukuModel);
        }
        return list;
    }
}
