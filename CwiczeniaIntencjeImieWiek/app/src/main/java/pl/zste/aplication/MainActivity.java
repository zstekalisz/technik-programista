package pl.zste.aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String NAME = "imie";
    public static final String AGE = "wiek";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText nameEdit = (EditText) findViewById(R.id.name);
        String name = nameEdit.getText().toString();
        EditText ageEdit = (EditText) findViewById(R.id.age);
        String age = ageEdit.getText().toString();
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(MainActivity.NAME, name);
        intent.putExtra(MainActivity.AGE, age);
        startActivity(intent);
    }
}