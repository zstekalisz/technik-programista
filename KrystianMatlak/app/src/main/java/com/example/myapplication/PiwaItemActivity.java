package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.Coffee;
import com.example.model.Piwa;
import com.example.utiles.StaticDateBase;

public class PiwaItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piwa_item);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        Piwa piwa = StaticDateBase.piwas.get(index);
        ImageView imageView = (ImageView) findViewById(R.id.piwa);
        TextView desc = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        imageView.setImageResource(piwa.getPicture());
        desc.setText(piwa.getDescription());
        name.setText(piwa.getName());
    }
}