package com.hog2020.ex56bottomappbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BottomAppbar를 액션바로 대체할 수 있음
        bab= findViewById(R.id.bab);
        setSupportActionBar(bab);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    boolean iscenter=true;

    public void clickFAB(View view) {
        iscenter= !iscenter;

        if(iscenter)bab.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
        else bab.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
    }
}