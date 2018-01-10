package com.example.android.unit4assessment.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.unit4assessment.R;
import com.example.android.unit4assessment.fragments.BottomFragment;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {

    private View rootView;
    private Context context;
   // TextView textView;

    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_display, container, false);
        //textView = (TextView) rootView.findViewById(R.id.item_view_textview);

        context = rootView.getContext();

        BottomFragment bottomFragment = new BottomFragment();

        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.bottomFragment, bottomFragment).addToBackStack("bottomFrag");
        fragmentTransaction.commit();



        return rootView;

    }


}
