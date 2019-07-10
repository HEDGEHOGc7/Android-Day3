package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class Tablayout extends AppCompatActivity {
  //  private ContentPagerAdapter contentAdapter;
    List<String> mTitle;
    List<Fragment> mFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
        final ViewPager pager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
//        tabLayout.addOnTabSelectedListener(this);

        mTitle = new ArrayList<>();
        mTitle.add("Tab 1");
        mTitle.add("Tab 2");
        mTitle.add("Tab 3");
        mTitle.add("Tab 4");
        mTitle.add("Tab 5");
        mTitle.add("Tab 6");

        mFragment = new ArrayList<>();
        mFragment.add(new Fragment());
        mFragment.add(new Fragment());
        mFragment.add(new Fragment());
        mFragment.add(new Fragment());
        mFragment.add(new Fragment());
        mFragment.add(new Fragment());

        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragment == null ? null : mFragment.get(position);

            }
            @Override
            public int getCount() {
                return mFragment.size();
            }
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });

        tabLayout.setupWithViewPager(pager);

    }



}
