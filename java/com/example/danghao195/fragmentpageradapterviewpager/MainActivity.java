package com.example.danghao195.fragmentpageradapterviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    private ViewPagerFragmentAdapter viewPagerFragmentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager ) findViewById(R.id.viewpager);
        viewPagerFragmentAdapter = new ViewPagerFragmentAdapter(getSupportFragmentManager(),4);
        viewPager.setAdapter(viewPagerFragmentAdapter);
        viewPager.setOffscreenPageLimit(5);
    }
}
