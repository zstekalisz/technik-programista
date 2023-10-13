package com.example.wiktorcierniak.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.wiktorcierniak.R;
import com.example.wiktorcierniak.model.Alkohol;
import com.example.wiktorcierniak.utils.StaticDateBase;

public class AlkoholActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alkohol);
        ListView view = (ListView) findViewById(R.id.alkoholTypes);
        ArrayAdapter<Alkohol> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                StaticDateBase.alkohols);
        view.setAdapter(adapter);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, AlkoholItemActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);
    }
}