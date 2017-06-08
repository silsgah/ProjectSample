package com.example.silas.parenteye;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


import com.example.silas.parenteye.adapter.DerpAdapter;
import com.example.silas.parenteye.model.DerpData;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
 private RecyclerView recview;
 private DerpAdapter adapter;
 Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Parent Eye-Student Report");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recview = (RecyclerView)findViewById(R.id.rec_list);
        recview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DerpAdapter(DerpData.getListData(), this);
        recview.setAdapter(adapter);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent messintent = new Intent(getApplicationContext(), Main2Activity.class);
                finish();
            }
        });

    }

}
