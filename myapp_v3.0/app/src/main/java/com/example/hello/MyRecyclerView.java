package com.example.hello;

import android.graphics.Color;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyRecyclerView extends RecyclerView.Adapter<MyRecyclerView.MyViewHolder> {
    private List<item> mList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recyclerview, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        item tempitem = mList.get(position);
        holder.Image.setImageResource(tempitem.getImageId());
        holder.Name.setText(tempitem.getName());

        holder.Num.setText(tempitem.getNum());
        if(tempitem.getNum()=="1"||tempitem.getNum()=="2"||tempitem.getNum()=="3"){
            holder.Num.setTextColor(Color.parseColor("#F20c00"));
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView Image;
        TextView Name,Num;
        MyViewHolder(View itemView) {
            super(itemView);
            Image = (ImageView)itemView.findViewById(R.id.image);
            Name = (TextView)itemView.findViewById(R.id.textname);
            Num = (TextView)itemView.findViewById(R.id.num);
        }
    }
    public MyRecyclerView(List<item> List) {
        mList = List;
    }

}
