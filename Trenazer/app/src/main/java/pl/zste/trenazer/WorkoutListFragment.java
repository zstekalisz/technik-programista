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
<<<<<<< HEAD

=======
import android.widget.ListView;

import pl.zste.model.TrenagerListClicker;
>>>>>>> bc07182e2d4d89c01922bebf2c7c1ad2ef950eb6
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
<<<<<<< HEAD
        ArrayAdapter<Workout> adapter = new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, WorkoutDB.workouts);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
=======
        context = (TrenagerListClicker)inflater.getContext();
        ArrayAdapter<Workout> adapter = new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, WorkoutDB.workouts);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container, savedInstanceState);
>>>>>>> bc07182e2d4d89c01922bebf2c7c1ad2ef950eb6
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        context.setTraining(position);
    }
}