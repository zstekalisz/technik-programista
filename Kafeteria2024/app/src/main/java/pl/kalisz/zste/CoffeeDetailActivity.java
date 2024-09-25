package pl.kalisz.zste;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

import android.content.Intent;
import android.graphics.text.LineBreaker;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import pl.kalisz.zste.model.Coffee;
import pl.kalisz.zste.model.CoffeeDataSource;

public class CoffeeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffee_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        int position = intent.getIntExtra(CoffeeActivity.INDEX, -1);
        if(position!=-1){
            Coffee coffee = CoffeeDataSource.getCoffees().get(position);
            TextView nameView = (TextView) findViewById(R.id.name);
            nameView.setText(coffee.name);
            TextView descView = (TextView) findViewById(R.id.desc);
            descView.setText(coffee.desc);
            ImageView pictureView = (ImageView) findViewById(R.id.picture);
            pictureView.setImageResource(coffee.picture);
        }
    }
}