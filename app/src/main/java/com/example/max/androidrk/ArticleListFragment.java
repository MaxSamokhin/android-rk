package com.example.max.androidrk;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.max.androidrk.R;

public class ArticleListFragment extends Fragment {
    private ArticleListener cooperationListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        cooperationListener = (ArticleListener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.article_list_fragment, container, false);

        return view;
    }

    public interface ArticleListener {
        void showArticle();
    }

}
