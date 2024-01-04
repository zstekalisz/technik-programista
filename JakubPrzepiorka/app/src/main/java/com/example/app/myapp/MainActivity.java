package com.example.app.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app.R;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView view = (ListView) findViewById(R.id.listView);
        view.setOnItemClickListener(this);
    }

    Intent intent;
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        switch (position){
            case 0:{
                intent = new Intent(this, CoffeeActivity.class);
                startActivity(intent);
                break;
            }
            case 1:{
                intent = new Intent(this, SnackActivity.class);
                startActivity(intent);
                break;
            }
            case 2:{
                intent = new Intent(this, DrinkActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}