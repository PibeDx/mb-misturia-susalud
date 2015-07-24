package com.jcuentas.mb_misturia_susalud.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Jose Cuentas Turpo on 24/07/2015 - 11:26 AM.
 * E-mail: jcuentast@gmail.com
 */
public class PagerAdapter extends FragmentPagerAdapter {


    private int pagerCount = 5;
    private ArrayList<Fragment> mFragments;

    public void setFragments(ArrayList<Fragment> fragments) {
        mFragments = fragments;
    }

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
//        return InfoFragment.newInstance();
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
