package com.example.testreclayout;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Vholder> {

    Context context;
    List<Item>items;
    public Adapter(Context context, List<Item>items)
    {
        this.items=items;
        this.context=context;
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_adapter, viewGroup, false);
        return new Vholder(view);
    }

    @NonNull
    @Override
    public void onBindViewHolder(final Vholder holder, final int position) {
        final Item item = items.get(position);

        View.OnClickListener shift = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
            }
        };

        holder.idView.setText(item.id);
        holder.nameView.setText(item.name);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Vholder extends RecyclerView.ViewHolder {

        TextView nameView;
        TextView idView;

        public Vholder(View itemView) {
            super(itemView);

            nameView = (TextView) itemView.findViewById(R.id.nameTag);
            idView = (TextView) itemView.findViewById(R.id.idTag);
        }
    }
}

