package pl.zste.trenazer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import pl.zste.model.TrenagerListClicker;

public class MainActivity extends AppCompatActivity implements TrenagerListClicker {

    public final static String INTENT_KEY = "index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setTraining(int indexOfWorkout) {
        Intent intent = new Intent(this, WorkoutDetailActivity.class);
        intent.putExtra(MainActivity.INTENT_KEY, indexOfWorkout);
        startActivity(intent);
    }
}