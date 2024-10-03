package pl.kalisz.zste.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import pl.kalisz.zste.R;
import pl.kalisz.zste.model.Coffee;

public class CustomCoffeeArrayAdapter extends ArrayAdapter<Coffee> {

    public CustomCoffeeArrayAdapter(@NonNull Context context, List<Coffee> coffees) {
        super(context, 0, coffees);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        Coffee cofee = getItem(position);
        convertView = inflater.inflate(R.layout.custom_list_item, parent);
        ImageView image = (ImageView) convertView.findViewById(R.id.custompicture);
        
        return convertView;
    }
}
