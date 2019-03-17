package com.example.testreclayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        setup();
    }

    private void setup()
    {
        List<Item>items=new ArrayList<>();
        items.add(new Item("Hablu","1"));
        items.add(new Item("Gablu","2"));
        items.add(new Item("Dablu","3"));
        items.add(new Item("Bablu","4"));
        items.add(new Item("Sablu","5"));

        Adapter adapter = new Adapter(getApplicationContext(), items);
        recycler.setAdapter(adapter);
    }
}
