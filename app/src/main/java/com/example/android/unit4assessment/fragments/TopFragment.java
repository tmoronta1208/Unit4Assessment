package com.example.android.unit4assessment.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.unit4assessment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {
    private View rootView;
    TextView title;
    TextView author;
    TextView year;



    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_top, container, false);
        title = rootView.findViewById(R.id.itemview_title);
        author = rootView.findViewById(R.id.author);
        year = rootView.findViewById(R.id.year);

        Bundle bundle = getArguments();

        title.setText(bundle.getString("title"));
        year.setText(bundle.getInt("year") + "");
        author.setText(bundle.getString("author"));





        return rootView;
    }

}
