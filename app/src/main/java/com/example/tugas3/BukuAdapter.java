package com.example.tugas3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BukuModel> bukuModels;

    public BukuAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<BukuModel> getBukuModels() {
        return bukuModels;
    }

    public void setBukuModels(ArrayList<BukuModel> bukuModels) {
        this.bukuModels = bukuModels;
    }

    @NonNull
    @Override
    public BukuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buku, parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull BukuAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getBukuModels().get(position).getGambarBuku()).into(holder.gambar);
        holder.text.setText(getBukuModels().get(position).getNamaBuku());
    }

    @Override
    public int getItemCount() {
        return getBukuModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.cetak_gambar);
            text = itemView.findViewById(R.id.cetak_text);
        }
    }
}
