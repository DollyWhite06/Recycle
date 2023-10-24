package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycle.adapter.PikachuAdapter;
import com.example.recycle.models.Chapete;
import com.example.recycle.models.Pikachu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Pikachu> pikachus = new ArrayList<>();
        pikachus.add(new Pikachu(new Chapete("Amarillo"), new Chapete("Rojo")));

        rc=findViewById(R.id.rc);
        PikachuAdapter piA=new PikachuAdapter(pikachus);
        rc.setAdapter(new PikachuAdapter(pikachus));

        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);

    }
}