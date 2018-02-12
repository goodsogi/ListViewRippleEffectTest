package com.plusapp.listviewrippleeffecttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeList();
    }

    private void makeList() {
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new ListAdapter(this, getDatas()));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, i + "번 아이템 클릭",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<String> getDatas() {

        List<String> places = new ArrayList<>();

        places.add("서울");
        places.add("부산");
        places.add("대구");

        return places;
    }
}
