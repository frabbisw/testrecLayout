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

        for(int i=0; i<26; i++)
        {
            items.add(new Item((char)(i+65)+"ablu",""+i));
        }

        Adapter adapter = new Adapter(getApplicationContext(), items);
        recycler.setAdapter(adapter);
    }
}
