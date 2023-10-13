package com.example.app.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app.R;
import com.example.app.model.Drink;
import com.example.app.utils.StaticDataBase;

public class DrinkActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        ListView view = (ListView) findViewById(R.id.drinkTypes);
        ArrayAdapter<Drink> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1,
                StaticDataBase.drinks);
        view.setAdapter(adapter);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, DrinkItemActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);
    }
}