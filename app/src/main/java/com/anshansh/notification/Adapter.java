package com.anshansh.notification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Vholder> {

    ArrayList<String> data;
    Context mCtx;

    public Adapter(ArrayList<String> data, Context mCtx) {
        this.data = data;
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.items,parent,false);
        return new Vholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Vholder holder, int position) {
        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Vholder extends RecyclerView.ViewHolder{
        TextView textView;
        public Vholder(View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.textItem);
        }
    }
}
