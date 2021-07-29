package com.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<String> listArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        listArray.add("Rajiv Suresh Nair");
        listArray.add("Sahara Shrestha");
        listArray.add("Zakiy Riyaz");
        listArray.add("Apurba Shrestha");
        listArray.add("Soumik Bhattacharjee");
        listArray.add("Archit Sharma");
        listArray.add("Thihan Vithanage");
        listArray.add("Mohammed Ridhwan");
        listArray.add("Sivaranjini Sivaraman");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, listArray);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You selected: " + listArray.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}