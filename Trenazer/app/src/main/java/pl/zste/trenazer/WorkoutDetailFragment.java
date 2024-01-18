package pl.zste.trenazer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pl.zste.model.Workout;
import pl.zste.model.WorkoutDB;


public class WorkoutDetailFragment extends Fragment {

    private int indexOfWorkout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    public void setIndexOfWorkout(int indexOfWorkout) {
        this.indexOfWorkout = indexOfWorkout;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        TextView nameView = (TextView) view.findViewById(R.id.name);
        TextView desc = (TextView) view.findViewById(R.id.description);
        Workout workout = WorkoutDB.workouts.get(indexOfWorkout);
        nameView.setText(workout.getName());
        desc.setText(workout.getDescription());
    }
}