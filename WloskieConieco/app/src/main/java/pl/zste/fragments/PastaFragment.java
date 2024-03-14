package pl.zste.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import pl.zste.app.R;


public class PastaFragment extends ListFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<String> pastas = new ArrayList<>();
        pastas.add("Spaghetti Bolognese");
        pastas.add("Lasagne");
        pastas.add("Spaghetti Carbonara");
        pastas.add("Pene z łososiem");
        pastas.add("La bonita");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), R.layout.single_pasta_item, pastas);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container,savedInstanceState);
    }

}