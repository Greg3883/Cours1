package com.example.bejaj.cours1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PlaceAdapteur extends ArrayAdapter<Place> {
    @BindView(R.id.lat)
    TextView lat;

    @BindView(R.id.longi)
    TextView longi;

    @BindView(R.id.zip)
    TextView zip;

    @BindView(R.id.street)
    TextView street;

    @BindView(R.id.city)
    TextView city;

    public PlaceAdapteur(Context context, List<Place> list) {
        super(context, -1, list);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View actualView = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            actualView = inflater.inflate(R.layout.item_place, parent, false);
        }
        ButterKnife.bind(this,actualView);
        lat.setText(String.valueOf(getItem(i).getLatitude()));
        longi.setText(String.valueOf(getItem(i).getLongitude()));
        zip.setText(getItem(i).getZipCode());
        street.setText(getItem(i).getStreet());
        city.setText(getItem(i).getCity());
        return actualView;
    }

}
