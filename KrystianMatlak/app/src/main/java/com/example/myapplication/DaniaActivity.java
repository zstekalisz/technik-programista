package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.model.Dania;
import com.example.utiles.StaticDateBase;

public class DaniaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dania);
        ListView view = (ListView) findViewById(R.id.daniaTypes);
        ArrayAdapter<Dania> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                StaticDateBase.danias);
        view.setAdapter(adapter);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, DaniaItemActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);
    }
}