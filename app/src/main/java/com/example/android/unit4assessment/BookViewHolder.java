package com.example.android.unit4assessment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by TatianaM on 12/20/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;


    public BookViewHolder(View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.item_view_textview);
    }

    public void onBind(Books bookList){
        textView.setText(bookList.getTitle());
    }
}
