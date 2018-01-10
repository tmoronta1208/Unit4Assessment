package com.example.android.unit4assessment;

import java.util.List;

/**
 * Created by TatianaM on 12/21/17.
 */

public class JsonModel {
    public JsonModel(List<Books> jsonBooks) {
        this.jsonBooks = jsonBooks;
    }

    private List<Books> jsonBooks;
    public void setJsonBooks(List<Books> jsonBooks) {
        this.jsonBooks = jsonBooks;
    }



}
