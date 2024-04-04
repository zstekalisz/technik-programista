package pl.zste.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import pl.zste.adapters.MyFragmentAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 pager = (ViewPager2) findViewById(R.id.pager);
        pager.setAdapter(new MyFragmentAdapter(this));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.karty);
        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, pager, (tab, pos) -> {
            switch (pos){
                case 0 : tab.setText(R.string.start);
                    break;
                case 1 : tab.setText(R.string.pizza);
                    break;
                case 2 : tab.setText(R.string.pasta);
                    break;
                case 3 : tab.setText(R.string.pizza_store);
                    break;
            }

        });
        mediator.attach();
    }
}