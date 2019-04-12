package com.example.viewpagerdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ViewPagerAdapter mAdapter;
    public static final String TAB_ONE="Tab 1";
    public static final String TAB_TWO="Tab 2";
    public static final String TAB_THREE="Tab 3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initViewPager();
    }

    private void initView() {
        mViewPager=findViewById(R.id.view_pager);
        mTabLayout=findViewById(R.id.tab_layout);
    }

    private void initViewPager() {
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mAdapter.addFragment(new FragmentOne(), TAB_ONE);
        mAdapter.addFragment(new FragmentTwo(), TAB_TWO);
        mAdapter.addFragment(new FragmentThree(), TAB_THREE);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
