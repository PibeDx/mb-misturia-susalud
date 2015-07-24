package com.jcuentas.mb_misturia_susalud.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcuentas.mb_misturia_susalud.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class IngredientesFragment extends Fragment {


    public static IngredientesFragment newInstance() {
        IngredientesFragment fragment = new IngredientesFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receta, container, false);
    }


}
