package com.anshansh.notification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayout;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        linearLayout = new LinearLayoutManager(this);


        String count = getIntent().getStringExtra("Count");

        //String[] a = {"a","b","c","d","e","f","g","h","i","j","a","b","c","d","e","f","g","h","i","j"};
        //ArrayList list = new ArrayList(Arrays.asList(count));
        List<String> list = new ArrayList<>();
        for(int i=0; i<=Integer.parseInt(count);i++)
        {
            list.add("Counter Increased");
        }

        adapter = new Adapter((ArrayList<String>) list, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.counter)
        {
            Intent intent = new Intent(MainActivity.this,Counter.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}