package com.example.app.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app.R;
import com.example.app.model.Snack;
import com.example.app.utils.StaticDataBase;

public class SnackItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_item);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        Snack snack = StaticDataBase.snacks.get(index);
        ImageView imageView = (ImageView) findViewById(R.id.snack);
        TextView desc = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        imageView.setImageResource(snack.getPicture());
        desc.setText(snack.getDescription());
        name.setText(snack.getName());
    }
}
