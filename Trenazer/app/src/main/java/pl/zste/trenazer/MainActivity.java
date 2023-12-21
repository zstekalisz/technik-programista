package pl.zste.trenazer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import pl.zste.model.TrenagerListClicker;

public class MainActivity extends AppCompatActivity implements TrenagerListClicker {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setTraining(int indexOfWorkout) {
        //Intent intent = new Intent(this, null);
        //intent.putExtra("index", indexOfWorkout);
        //startActivity(intent);
        Log.i("TEST", "Kliknięto "+indexOfWorkout+ " element listy");
    }
}