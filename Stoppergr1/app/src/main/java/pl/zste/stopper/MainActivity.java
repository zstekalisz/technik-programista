package pl.zste.stopper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int seconds = 0;
    private boolean running = false;
    private boolean runningCopy = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null){
            seconds = savedInstanceState.getInt("sekundy");
            running = savedInstanceState.getBoolean("stan");

        }
        setContentView(R.layout.activity_main);
        findViewById(R.id.running).setOnClickListener(this);
        findViewById(R.id.stopping).setOnClickListener(this);
        findViewById(R.id.delete).setOnClickListener(this);
        runTimer();
        Log.i("Test", "Wykonała się metoda onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        running = runningCopy;
        Log.i("Test", "Wykonała się metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        running = runningCopy;
        Log.i("Test", "Wykonała się metoda onResume");
    }

    // na zajęciach przesłonilismy nie tą metodę - public nie działa, musi byc ta protected
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("sekundy", seconds);
        outState.putBoolean("stan", running );
        Log.i("Test", "Wykonała się metoda zapisująca stan aktywnosci");
    }

    @Override
    protected void onPause() {
        super.onPause();
        runningCopy = running;
        running = false;
        Log.i("Test", "Wykonała się metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //runningCopy = running;
        running = false;
        Log.i("Test", "Wykonała się metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Test", "Aktywnosc została zniszczona");
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.running){
            this.running = true;
        }else if(view.getId()==R.id.stopping){
            this.running = false;
        } else if (view.getId()==R.id.delete) {
            this.seconds = 0;
        }
    }
    private void runTimer(){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                TextView time = (TextView) findViewById(R.id.seconds);
                int hour = seconds/3600;
                int minutes = (seconds%3600)/60;
                int sec = seconds%60;
                String format = String.format("%d:%02d:%02d", hour, minutes, sec);
                time.setText(format);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
}