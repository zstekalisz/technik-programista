package pl.zste.stoper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int seconds = 0;
    private boolean running = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null){
            this.running = savedInstanceState.getBoolean("state");
            this.seconds = savedInstanceState.getInt("time");
        }
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        runTimer();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Test", "Aktywnosc została zniszczona");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Test", "Wykonała się metoda zapisująca stan aplikacji");
        outState.putBoolean("state", running);
        outState.putInt("time", seconds);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button){
            this.running = true;
        } else if (view.getId()==R.id.button2) {
            this.running = false;
        } else if (view.getId()==R.id.button3) {
            this.seconds = 0;
            this.running = false;
        }
    }
    private void runTimer(){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                TextView czas = (TextView) findViewById(R.id.time);
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int sec = seconds%60;
                String time = String.format("%d:%02d:%02d", hours, minutes, sec);
                czas.setText(time);
                if(running){
                    seconds++;
                }
                long stop = System.currentTimeMillis();
                handler.postDelayed(this,1000-(stop-start));
            }
        });

    }
}