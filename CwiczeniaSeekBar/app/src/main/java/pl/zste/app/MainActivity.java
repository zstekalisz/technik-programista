package pl.zste.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar bar = (SeekBar) findViewById(R.id.seekBar);
        Button button = (Button) findViewById(R.id.button);
        bar.setOnSeekBarChangeListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        TextView text = (TextView) findViewById(R.id.textView);
        String progText = getString(R.string.progress);
        text.setText(progText + i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Log.i("MainActivity - seekbar", "Suwak ma wartość " + seekBar.getProgress());
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Log.i("MainActivity - seekbar", "Suwak ma wartość " + seekBar.getProgress());
    }
}