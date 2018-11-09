package com.example.bejaj.cours1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OneViewActivity  extends AppCompatActivity {

    @BindView(R.id.detail)
    TextView mPlaceStreet;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_view);
        ButterKnife.bind(this);
        String myItentExtraValue = getIntent().getStringExtra("placeStreet");
        mPlaceStreet.setText(myItentExtraValue);


    }




}
