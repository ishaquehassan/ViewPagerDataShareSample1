package com.ishaquehassan.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager1 = findViewById(R.id.pager1);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());

        pager1.setAdapter(new PagerAdapter(fragments,getSupportFragmentManager()));
        pager1.setOffscreenPageLimit(fragments.size());
    }
}
