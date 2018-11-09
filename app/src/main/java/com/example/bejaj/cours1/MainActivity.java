package com.example.bejaj.cours1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RatingBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.listMy)
    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        List<Place> listItems = new ArrayList<Place>();
        for (int i = 0; i < 25; i ++) {
            listItems.add(new Place(1+i, 1000+i, "street", "zipCode", "city"));

        }

        ArrayAdapter adapter = new PlaceAdapteur(this,listItems);
        myList.setAdapter(adapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent seePlaceDetailIntent = new Intent(MainActivity.this, OneViewActivity.class);
                startActivity(seePlaceDetailIntent);
            }
        });
    }




}
