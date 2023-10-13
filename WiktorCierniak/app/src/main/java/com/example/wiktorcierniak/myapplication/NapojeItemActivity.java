package com.example.wiktorcierniak.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wiktorcierniak.R;
import com.example.wiktorcierniak.model.Napoje;
import com.example.wiktorcierniak.utils.StaticDateBase;

public class NapojeItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_napoje_item);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        Napoje napoje = StaticDateBase.napojes.get(index);
        ImageView imageView = (ImageView) findViewById(R.id.napoje);
        TextView desc = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        imageView.setImageResource(napoje.getPicture());
        desc.setText(napoje.getDescription());
        name.setText(napoje.getName());
    }
}