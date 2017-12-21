package com.example.android.unit4assessment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {
    private View rootView;


    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Books
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("books", new JSONArray()
                    .put(new JSONObject().put("title", "Northanger Abbey"))
                    .put(new JSONObject().put("author", "Austen, Jane"))
                    .put(new JSONObject().put("year", 1814))

                    .put(new JSONObject().put("title", "War and Peace"))
                    .put(new JSONObject().put("author", "Tolstoy, Leo"))
                    .put(new JSONObject().put("year", 1865))

                    .put(new JSONObject().put("title", "Anna Karenina"))
                    .put(new JSONObject().put("author", "Tolstoy, Leo"))
                    .put(new JSONObject().put("year", 1875))

                    .put(new JSONObject().put("title", "Mrs. Dalloway"))
                    .put(new JSONObject().put("author", "Woolf, Virginia"))
                    .put(new JSONObject().put("year", 1925))

                    .put(new JSONObject().put("title", "The Hours"))
                    .put(new JSONObject().put("author", "Cunningham, Michael"))
                    .put(new JSONObject().put("year", 1999))

                    .put(new JSONObject().put("title", "Bleak House"))
                    .put(new JSONObject().put("author", "Dickens, Charles"))
                    .put(new JSONObject().put("year", 1870))

                    .put(new JSONObject().put("title", "Hucklberry Finn"))
                    .put(new JSONObject().put("author", "Twain, Mark"))
                    .put(new JSONObject().put("year", 1865))

                    .put(new JSONObject().put("title", "Tom Sawyer"))
                    .put(new JSONObject().put("author", "Twain, Mark"))
                    .put(new JSONObject().put("year", 1862)));

        } catch (JSONException e) {
            e.printStackTrace();
        }


        rootView = inflater.inflate(R.layout.fragment_bottom, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView_layout);

        BooksListAdapter booksListAdapter = new BooksListAdapter();
       // LinearLayoutManager

        return rootView;
    }
}
