package com.toni.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private Context context;
    private List<datadaily> data;


    public myAdapter(Context context, List<datadaily> data) {
        this.context = context;
        this.data = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama, isi;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = (TextView)itemView.findViewById(R.id.nama);
            isi = (TextView)itemView.findViewById(R.id.isi);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_daily, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        datadaily pu = data.get(position);
        holder.nama.setText(pu.getNama());
        holder.isi.setText(pu.getNama());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}

/**
 * nama : Toni Rizky Awalludin
 * Nim : 10117150
 * kelas : IF-4
 * tanggal pengerjaan : 7 - 15 mei 2020
 */

