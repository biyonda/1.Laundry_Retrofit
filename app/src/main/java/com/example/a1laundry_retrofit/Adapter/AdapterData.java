package com.example.a1laundry_retrofit.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1laundry_retrofit.Model.DataModel;
import com.example.a1laundry_retrofit.R;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {

    private Context ctx;
    private List<DataModel> listLaundry;

    public AdapterData(Context ctx, List<DataModel> listLaundry) {
        this.ctx = ctx;
        this.listLaundry = listLaundry;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dm = listLaundry.get(position);
        holder.tv_id.setText(String.valueOf(dm.getId()));
        holder.tv_nama.setText(dm.getNama());
        holder.tv_alamat.setText(dm.getAlamat());
        holder.tv_telepon.setText(dm.getTelepon());
    }

    @Override
    public int getItemCount() {
        return listLaundry.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView tv_id, tv_nama, tv_alamat, tv_telepon;

        public HolderData(@NonNull View itemView) {
            super(itemView);

            tv_id = itemView.findViewById(R.id.tv_id);
            tv_nama = itemView.findViewById(R.id.tv_nama);
            tv_alamat = itemView.findViewById(R.id.tv_alamat);
            tv_telepon = itemView.findViewById(R.id.tv_telepon);
        }
    }

}
