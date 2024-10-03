package pl.kalisz.zste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import pl.kalisz.zste.adapters.CustomCoffeeArrayAdapter;
import pl.kalisz.zste.model.Coffee;
import pl.kalisz.zste.model.CoffeeDataSource;

public class CoffeeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public static final String INDEX = "id";


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, CoffeeDetailActivity.class);
        intent.putExtra(INDEX, position);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffee);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayAdapter<Coffee> coffeeArrayAdapter =
                new ArrayAdapter<>(this, R.layout.my_simple_list_item2, CoffeeDataSource.getCoffees());
        ListView view = (ListView) findViewById(R.id.coffees);
        //view.setAdapter(coffeeArrayAdapter);
        view.setAdapter(new CustomCoffeeArrayAdapter(this, CoffeeDataSource.getCoffees()));
        view.setOnItemClickListener(this);
    }
}