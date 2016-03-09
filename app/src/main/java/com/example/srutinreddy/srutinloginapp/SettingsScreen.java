package com.example.srutinreddy.srutinloginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import arrayList.MyAdapter;
import arrayList.StudentList;

public class SettingsScreen extends AppCompatActivity {

    private ListView mListView,mListView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_screen);
        mListView = (ListView)findViewById(R.id.id_listView);
        mListView1 = (ListView)findViewById(R.id.id_listView1);
        //setListStudents();
        settings();
        //

    }
    private void settings(){
        ArrayList<String> list= StudentList.List();
        MyAdapter adapter= new MyAdapter(list,getLayoutInflater());
        mListView1.setAdapter(adapter);

    }


    private void setListStudents(){
        ArrayList<String> list= StudentList.List();
        ArrayAdapter adapter= new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1 , list);
        mListView.setAdapter(adapter);
    }
}

