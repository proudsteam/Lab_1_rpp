package com.example.lab_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static long back_pressed;

    ArrayList<String> arrayList;
    ListAdap listAdapter;
    ListView lv;
    LinearLayout llMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList = new ArrayList<>();
        listAdapter = new ListAdap(arrayList, this);
        llMain = findViewById(R.id.llMain);
        lv = new ListView(this);
        lv.setAdapter(listAdapter);

        llMain.addView(lv);
        for(int i = 0; i < 1000000; i++)
        {
            arrayList.add(i+1+"");
        }
       // listAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
