package com.example.wiktorcierniak.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wiktorcierniak.R;
import com.example.wiktorcierniak.model.Alkohol;
import com.example.wiktorcierniak.utils.StaticDateBase;

public class AlkoholItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alkohol_item);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        Alkohol alkohol = StaticDateBase.alkohols.get(index);
        ImageView imageView = (ImageView) findViewById(R.id.alkohol);
        TextView desc = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        imageView.setImageResource(alkohol.getPicture());
        desc.setText(alkohol.getDescription());
        name.setText(alkohol.getName());
    }
}