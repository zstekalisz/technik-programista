package com.example.app.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app.R;
import com.example.app.model.Drink;
import com.example.app.utils.StaticDataBase;

public class DrinkItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_item);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        Drink drink = StaticDataBase.drinks.get(index);
        ImageView imageView = (ImageView) findViewById(R.id.drink);
        TextView desc = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        imageView.setImageResource(drink.getPicture());
        desc.setText(drink.getDescription());
        name.setText(drink.getName());
    }
}

