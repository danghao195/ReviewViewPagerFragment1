package com.example.danghao195.fragmentpageradapterviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerFragmentAdapter extends FragmentPagerAdapter {
    private int pageNum;

    public ViewPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    public ViewPagerFragmentAdapter(FragmentManager fm, int pageNum) {
        super(fm);
        this.pageNum =pageNum;
    }



    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
        }
        return new Fragment3();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "tab "+ position;
    }

    @Override
    public int getCount() {
        return pageNum;
    }
}
