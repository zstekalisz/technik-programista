package pl.zste.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import pl.zste.app.R;


public class StoresFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(),
                R.layout.single_pasta_item, getResources().getStringArray(R.array.cities));
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}