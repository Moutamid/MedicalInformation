package com.moutamid.medicalinformation.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;
import com.moutamid.medicalinformation.DetailActivity;
import com.moutamid.medicalinformation.R;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListVH> {

    Context context;
    ArrayList<String> itemsList;

    public ListAdapter(Context context, ArrayList<String> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ListVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items_layout, parent, false);
        return new ListVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListVH holder, int position) {
        holder.item.setText(itemsList.get(position));

        holder.item.setOnClickListener(v -> {
            Intent i = new Intent(context, DetailActivity.class);
            i.putExtra("title", itemsList.get(position));
            context.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ListVH extends RecyclerView.ViewHolder{
        TextView item;
        public ListVH(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.list_item);
        }
    }
}
