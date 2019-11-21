package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView mylist;
    String operatingsystems []={"Mac OS Catalina","Windows 10","Ubuntu","Fedora","Windows 8.1","Windows 7","RedHat Linux","Boss Linux","Windows Vista"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist=(ListView)findViewById(R.id.oslist);
        ArrayAdapter myadapt = new ArrayAdapter<String>(this,R.layout.os,operatingsystems);
        mylist.setAdapter(myadapt);

    }

    public void go(View view) {
        Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);
    }
}
