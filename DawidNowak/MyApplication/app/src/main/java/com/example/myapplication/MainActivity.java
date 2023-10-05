package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView view = (ListView) findViewById(R.id.listView);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        switch (position){
            case 0:{
                Intent intent = new Intent(this, CoffeeActivity.class);
                intent.putExtra("type",0);
                startActivity(intent);
                break;
            }
            case 1:{
                Intent intent = new Intent(this, CoffeeActivity.class);
                intent.putExtra("type",1);
                startActivity(intent);
                break;
            }
            case 2:{
                Intent intent = new Intent(this, CoffeeActivity.class);
                intent.putExtra("type",2);
                startActivity(intent);
                break;
            }
        }
    }
}