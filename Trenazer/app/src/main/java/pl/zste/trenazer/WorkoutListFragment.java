package pl.zste.trenazer;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import pl.zste.model.TrenagerListClicker;
import pl.zste.model.Workout;
import pl.zste.model.WorkoutDB;


public class WorkoutListFragment extends ListFragment {
    private TrenagerListClicker context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = (TrenagerListClicker)inflater.getContext();
        ArrayAdapter<Workout> adapter = new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, WorkoutDB.workouts);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container, savedInstanceState);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        context.setTraining(position);
    }
}