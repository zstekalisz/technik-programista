package pl.zste.aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);
        String age = intent.getStringExtra(MainActivity.AGE);
        TextView view = (TextView) findViewById(R.id.nameAge);
        view.setText(name+" "+age);
    }
}