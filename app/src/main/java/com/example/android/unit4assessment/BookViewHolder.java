package com.example.android.unit4assessment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.android.unit4assessment.fragments.TopFragment;

import java.util.List;

/**
 * Created by TatianaM on 12/20/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    private Context context;
    private int year;
    private String author;
    private String title;



    public BookViewHolder(View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.item_view_textview);
        context =itemView.getContext();
    }

    public void onBind(final Books books){
        textView.setText(books.getTitle());
        author = books.getAuthor();
        year = books.getYear();
        title = books.getTitle();


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TopFragment topFragment = new TopFragment();
                FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Bundle myBundle = new Bundle();
                myBundle.putString("author", author);
                myBundle.putInt("year", year);
                myBundle.putString("title", title);
                topFragment.setArguments(myBundle);
                fragmentTransaction.replace(R.id.topFragment, topFragment).addToBackStack("topFrag");
                fragmentTransaction.commit();
            }
        });


    }
}
//    String editTextContents = editText.getText().toString();
//    Bundle bundle = new Bundle();
//                bundle.putString("random", editTextContents);
//                        randomFragment.setArguments(bundle);