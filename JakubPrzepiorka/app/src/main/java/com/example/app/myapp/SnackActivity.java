package com.example.app.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app.R;
import com.example.app.model.Snack;
import com.example.app.utils.StaticDataBase;

public class SnackActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
        ListView view = (ListView) findViewById(R.id.snackTypes);
        ArrayAdapter<Snack> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1,
                StaticDataBase.snacks);
        view.setAdapter(adapter);
        view.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, SnackItemActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);
    }
}
