package com.placeremainder.place.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String>arrayList=new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList.add("Habib");
        arrayList.add("Habib1");
        arrayList.add("Habib2");
        arrayList.add("Habib3");
        arrayList.add("Habib4");
        arrayList.add("Habib5");
        arrayList.add("Habib6");
        arrayList.add("Habib7");
        arrayList.add("Habib8");
        arrayList.add("Habib9");
        arrayList.add("Habib10");
        arrayList.add("Habib11");
        arrayList.add("Habib12");
        arrayList.add("Habib13");
        arrayList.add("Habib14");
        arrayList.add("Habib15");
        arrayList.add("Habib16");
        arrayList.add("Habib17");
        arrayList.add("Habib18");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(this,arrayList);

        recyclerView.setAdapter(recyclerViewAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
