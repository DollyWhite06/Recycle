package com.example.recycle.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle.R;
import com.example.recycle.models.Pikachu;

import java.util.List;

public class PikachuAdapter extends RecyclerView.Adapter<PikachuAdapter.ViewHolder>{

    public PikachuAdapter(List<Pikachu> pikachus) {
        this.pikachus = pikachus;
    }

    private List<Pikachu> pikachus;

    @NonNull
    @Override
    public PikachuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly=LayoutInflater.from(parent.getContext());
        View v=ly.inflate(R.layout.activity_pokemoni, parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PikachuAdapter.ViewHolder holder, int position) {
        Pikachu p=pikachus.get(position);
    }

    @Override
    public int getItemCount() {
        return pikachus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtchapeteizq;
        TextView txtchapeteder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtchapeteder=itemView.findViewById(R.id.txtchapeteder);
            txtchapeteizq=itemView.findViewById(R.id.txtchapeteizq);
        }

        public void setdata(Pikachu p)
        {
            txtchapeteizq.setText(p.getChapeteIzq().getColor());
            txtchapeteder.setText(p.getChapeteDer().getColor());
        }
    }
}