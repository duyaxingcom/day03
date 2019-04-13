package com.bawei.dyx3;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.dyx3.adapter.TabAdapter;
import com.bawei.dyx3.tab.tab01;
import com.bawei.dyx3.tab.tab02;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ArrayList<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.logon_tab);
        viewPager = findViewById(R.id.pager);
        String str[]={"我的","他的"};
        list = new ArrayList<>();
        list.add(new tab01());
        list.add(new tab02());
        TabAdapter tabAdapter=new TabAdapter(this.getSupportFragmentManager(),list,str);
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
