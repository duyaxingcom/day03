package com.bawei.dyx3.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class TabAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> list;
    String str[];

    public TabAdapter(FragmentManager fm, ArrayList<Fragment> list, String[] str) {
        super(fm);
        this.list = list;
        this.str = str;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return str[position];
    }
}
