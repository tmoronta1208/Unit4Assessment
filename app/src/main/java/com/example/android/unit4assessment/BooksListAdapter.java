package com.example.android.unit4assessment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by TatianaM on 12/20/17.
 */

public class BooksListAdapter extends RecyclerView.Adapter<BookViewHolder> {

    List<Books> bookLists;

    public BooksListAdapter(List<Books> bookLists){

        this.bookLists = bookLists;

    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new BookViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {

       Books books = bookLists.get(position);
       holder.onBind(books);

    }

    @Override
    public int getItemCount() {
        return bookLists.size();
    }
}
