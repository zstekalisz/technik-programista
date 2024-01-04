package pl.zste.pass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText pass = (EditText) findViewById(R.id.pass);
        EditText repeat = (EditText) findViewById(R.id.repeat);
        TextView message = (TextView) findViewById(R.id.message);
        if(pass.getText().toString().equals(repeat.getText().toString())){
            message.setText(R.string.messageok);
        }else{
            message.setText(R.string.messageerror);
        }
    }
}