package pl.zste.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import pl.zste.fragments.PastaFragment;
import pl.zste.fragments.PizzaFragment;
import pl.zste.fragments.StoresFragment;
import pl.zste.fragments.TopFragment;

public class MyFragmentAdapter extends FragmentStateAdapter {
    public MyFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fr = new TopFragment();
        switch (position){
            case 0:
                //fr= new TopFragment();
                break;
            case 1:
                fr= new PizzaFragment();
                break;
            case 2:
                fr = new PastaFragment();
                break;
            case 3:
                fr = new StoresFragment();
                break;

        }
        return fr;
    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
