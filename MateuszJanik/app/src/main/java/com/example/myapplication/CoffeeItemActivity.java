package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.Coffee;
import com.example.utils.StaticDataBase;

public class CoffeeItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_item);
        Intent intent = getIntent();
        int indeks = intent.getIntExtra("index", 0);
        int type = intent.getIntExtra("type", 0);
        Coffee coffee;



        switch (type){
            default:
            case 0:
                coffee = StaticDataBase.kawusie.get(indeks);
                break;
            case 1:
                coffee = StaticDataBase.lody.get(indeks);
                break;
            case 2:
                coffee = StaticDataBase.wina.get(indeks);
                break;
        }
        ImageView imageView = (ImageView) findViewById(R.id.kawusie);
        TextView desc = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(coffee.getName());
        desc.setText(coffee.getDescription());
        imageView.setImageResource(coffee.getPicture());
        

    }
}