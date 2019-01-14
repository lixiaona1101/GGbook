package com.example.ggbook;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    ScanView scanview;
    ScanViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scanview = (ScanView) findViewById(R.id.scanview);

        List<String> items = new ArrayList<String>();
        for (int i = 0; i < 8; i++)
            items.add("第 " + (i + 1) + " 页");

        adapter = new ScanViewAdapter(this, items);
        scanview.setAdapter(adapter);
    }
}
