package com.moutamid.medicalinformation.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.medicalinformation.R;
import com.moutamid.medicalinformation.model.HistoryModel;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryVH> {

    Context context;
    ArrayList<HistoryModel> itemsList;

    public HistoryAdapter(Context context, ArrayList<HistoryModel> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public HistoryAdapter.HistoryVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.history, parent, false);
        return new HistoryAdapter.HistoryVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.HistoryVH holder, int position) {
        HistoryModel model = itemsList.get(position);
        holder.title.setText(model.getTitle());
        holder.desc.setText(model.getDesc());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class HistoryVH extends RecyclerView.ViewHolder{
        TextView title, desc;
        public HistoryVH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
        }
    }
}
