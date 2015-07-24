package com.jcuentas.mb_misturia_susalud.ui.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jcuentas.mb_misturia_susalud.R;
import com.jcuentas.mb_misturia_susalud.ui.adapter.PagerAdapter;
import com.jcuentas.mb_misturia_susalud.ui.fragment.InfoFragment;
import com.jcuentas.mb_misturia_susalud.ui.fragment.IngredientesFragment;
import com.jcuentas.mb_misturia_susalud.ui.fragment.PreparacionFragment;
import com.jcuentas.mb_misturia_susalud.ui.fragment.Presentacion;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;


public class MenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_default);
        CircleIndicator circleIndicator = (CircleIndicator)findViewById(R.id.indicator_default);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.setFragments(obtenerFragment());
        viewPager.setAdapter(pagerAdapter);
        circleIndicator.setViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    ArrayList<Fragment> obtenerFragment(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new Presentacion());
        fragments.add(InfoFragment.newInstance());
        fragments.add(IngredientesFragment.newInstance());
        fragments.add(PreparacionFragment.newInstance());
        return fragments;
    }
}
