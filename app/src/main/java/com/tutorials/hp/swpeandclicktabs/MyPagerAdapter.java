package com.tutorials.hp.swpeandclicktabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class MyPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> pages=new ArrayList<>();

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pages.get(position).toString();
    }

    //ADD A APGE
    public void addPage(Fragment f)
    {
        pages.add(f);
    }
}
