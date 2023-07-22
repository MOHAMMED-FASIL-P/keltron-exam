package com.example.keltron_exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickCallBack{

    RecyclerView rvStudents;
    List<Students> nameList;
    StudentsListAdapter studentsListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvStudents = findViewById(R.id.rvList);
        nameList = new ArrayList<>();

        nameList.add(new Students("bheem","dfgfgie@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("raju","dfskjie@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("jaggu","nbve@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("chutki","bnbdie@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("khaliya","oiiie@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("dolu","dhjkne@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("bolu","dfbnie@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("motu","fhghgsdie@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("patlu","hjgsdie@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("singam","iuusdie@gmail.com","CS","94324874391","suni"));
        nameList.add(new Students("doctor","hgjuyie@gmail.com","CS","94324874391","suni"));

        studentsListAdapter = new StudentsListAdapter(nameList,this);
        rvStudents.setLayoutManager(new LinearLayoutManager(this));
        rvStudents.setAdapter(studentsListAdapter);
    }

    @Override
    public void itemClick(Students students) {

//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:9400193958"));
//        startActivity(callIntent);

        Toast.makeText(this, students.getName(), Toast.LENGTH_SHORT).show();
    }
}