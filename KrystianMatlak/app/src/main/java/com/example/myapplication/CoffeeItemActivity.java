package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.Coffee;
import com.example.utiles.StaticDateBase;

public class CoffeeItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_item);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        Coffee coffee = StaticDateBase.coffies.get(index);
        ImageView imageView = (ImageView) findViewById(R.id.coffee);
        TextView desc = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        imageView.setImageResource(coffee.getPicture());
        desc.setText(coffee.getDescription());
        name.setText(coffee.getName());


    }
}