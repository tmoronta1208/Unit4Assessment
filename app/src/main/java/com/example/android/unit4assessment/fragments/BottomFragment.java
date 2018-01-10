package com.example.android.unit4assessment.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.unit4assessment.Books;
import com.example.android.unit4assessment.BooksListAdapter;
import com.example.android.unit4assessment.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {
    private View rootView;
    private RecyclerView recyclerView;
    View textView;
    Context context;

    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_bottom, container, false);
        textView = (View) rootView.findViewById(R.id.item_view_textview);


        recyclerView = rootView.findViewById(R.id.recyclerView_layout);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("books", new JSONArray()

                    .put(new JSONObject().put("title", "Northanger Abbey")
                            .put("author", "Austen, Jane")
                            .put("year", 1814))
                    .put(new JSONObject().put("title", "War and Peace")
                            .put("author", "Tolstoy, Leo")
                            .put("year", 1865))
                    .put(new JSONObject().put("title", "Anna Karenina")
                            .put("author", "Tolstoy, Leo")
                            .put("year", 1875))
                    .put(new JSONObject().put("title", "Mrs. Dalloway")
                            .put("author", "Woolf, Virginia")
                            .put("year", 1925))
                    .put(new JSONObject().put("title", "The Hours")
                            .put("author", "Cunningham, Michael")
                            .put("year", 1999))
                    .put(new JSONObject().put("title", "Bleak House")
                            .put("author", "Dickens, Charles")
                            .put("year", 1870))
                    .put(new JSONObject().put("title", "Huckleberry Finn")
                            .put("author", "Twain, Mark")
                            .put("year", 1865))
                    .put(new JSONObject().put("title", "Tom Sawyer")
                            .put("author", "Twain, Mark")
                            .put("year", 1862)));


        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jsonString = jsonObject.toString();

        List<Books> books = new ArrayList<>();

        try {
            JSONObject oldStuff = new JSONObject(jsonString);
            JSONArray bookArray = oldStuff.getJSONArray("books");


            for (int i = 0; i < bookArray.length(); i++) {
                Books books1 = new Books();
                books1.setAuthor((String) bookArray.getJSONObject(i).get("author"));
                books1.setTitle((String) bookArray.getJSONObject(i).get("title"));
                books1.setYear((Integer) bookArray.getJSONObject(i).get("year"));

                books.add(books1);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


        BooksListAdapter booksListAdapter = new BooksListAdapter(books);
        recyclerView.setAdapter(booksListAdapter);

        context = rootView.getContext();
//
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TopFragment topFragment = new TopFragment();
//                FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.topFragment, topFragment).addToBackStack("topFrag");
//                fragmentTransaction.commit();
//            }
//        });




        return rootView;
    }


}