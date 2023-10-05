package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.model.Coffee;
import com.example.utils.StaticDataBase;

public class CoffeeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
        ListView view = (ListView) findViewById(R.id.coffeeTypes);
        ArrayAdapter<Coffee> adapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                StaticDataBase.coffies);
        view.setAdapter(adapter);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, CoffeeItemActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);
    }
}