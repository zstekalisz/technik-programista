package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.model.Coffee;
import com.example.model.Piwa;
import com.example.utiles.StaticDateBase;

public class PiwaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piwa);
        ListView view = (ListView) findViewById(R.id.piwaTypes);
        ArrayAdapter<Piwa> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                StaticDateBase.piwas);
        view.setAdapter(adapter);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, PiwaItemActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);
    }
}