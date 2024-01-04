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
        ListView view = (ListView) findViewById(R.id.ListView);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0:{
                Intent intent = new Intent(this,CoffeeActivity.class);
                startActivity(intent);
                break;
            }
            case 1:{
                Intent intent = new Intent(this, DaniaActivity.class);
                startActivity(intent);
                break;
            }
            case 2:{
                Intent intent = new Intent(this,PiwaActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}