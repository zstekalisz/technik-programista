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


    private int cos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        Intent intent = getIntent();
        int index = intent.getIntExtra("type", 0);
        cos=index;
        ArrayAdapter<Coffee> adapter;
        switch (index){
            default:
            case 0:
                adapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                        StaticDataBase.coffies);
                break;
            case 1:
                adapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                        StaticDataBase.napojezimne);
                break;
            case 2:
                adapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                        StaticDataBase.sniadania);
                break;
        }
        ListView view = (ListView) findViewById(R.id.coffeeTypes);

        view.setAdapter(adapter);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, CoffeeItemActivity.class);
        intent.putExtra("index", i);
        intent.putExtra("type", cos);
        startActivity(intent);
    }
}