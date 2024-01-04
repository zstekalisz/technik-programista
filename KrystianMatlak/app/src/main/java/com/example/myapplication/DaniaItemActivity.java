package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.Coffee;
import com.example.model.Dania;
import com.example.utiles.StaticDateBase;

public class DaniaItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dania_item);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        Dania dania = StaticDateBase.danias.get(index);
        ImageView imageView = (ImageView) findViewById(R.id.dania);
        TextView desc = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        imageView.setImageResource(dania.getPicture());
        desc.setText(dania.getDescription());
        name.setText(dania.getName());
    }
}