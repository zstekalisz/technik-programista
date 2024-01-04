package pl.zste.trenazer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import pl.zste.model.Workout;
import pl.zste.model.WorkoutDB;


public class WorkoutListFragment extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayAdapter<Workout> adapter = new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, WorkoutDB.workouts);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }
}