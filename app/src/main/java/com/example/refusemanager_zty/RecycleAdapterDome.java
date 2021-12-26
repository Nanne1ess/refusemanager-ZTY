package com.example.refusemanager_zty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class RecycleAdapterDome extends RecyclerView.Adapter<RecycleAdapterDome.MyViewHolder> {
    private Context context;
    private List<String> list;
    private View inflater;

    public RecycleAdapterDome(Context context, List<String> list){
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public RecycleAdapterDome.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater= LayoutInflater.from(context).inflate(R.layout.item_dome,parent,false);
        MyViewHolder myViewHolder= new MyViewHolder(inflater);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView3);
        }
    }
}