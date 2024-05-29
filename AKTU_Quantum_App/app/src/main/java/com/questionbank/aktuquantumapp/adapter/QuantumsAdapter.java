package com.questionbank.aktuquantumapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.questionbank.aktuquantumapp.Quantum;
import com.questionbank.aktuquantumapp.R;

import java.util.ArrayList;

public class QuantumsAdapter extends RecyclerView.Adapter<QuantumsAdapter.QuantumsViewHolder> {

    ArrayList<Quantum> quantums = new ArrayList<>();
    Context ctx;

    OnClickListener onClickListener;

    public QuantumsAdapter(ArrayList<Quantum> quantums, Context context){
        this.quantums = quantums;
        ctx = context;
    }

    @NonNull
    @Override
    public QuantumsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new QuantumsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quantum, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull QuantumsViewHolder holder, int position) {
        holder.quantumTxt.setText(quantums.get(position).getName());
        Log.d("Adapter",  quantums.toString());
        holder.itemView.setOnClickListener(view -> {
            onClickListener.onClick(position);
        });
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    @Override
    public int getItemCount() {
        return quantums.size();
    }

    static class QuantumsViewHolder extends RecyclerView.ViewHolder{

        public TextView quantumTxt;

        public QuantumsViewHolder(@NonNull View itemView) {
            super(itemView);
            quantumTxt = itemView.findViewById(R.id.quantum_title);
        }
    }

    public interface OnClickListener{
        void onClick(int position);
    }
}
