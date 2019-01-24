package com.saksham.sakshambharat.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saksham.sakshambharat.model.FeedItem;
import com.saksham.sakshambharat.adapters.FeedRecyclerAdapter;
import com.saksham.sakshambharat.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeedFragment extends Fragment {

    RecyclerView feedRecyclerView;

    public FeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_feed, container, false);

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Saksham Bharat");

        feedRecyclerView = rootView.findViewById(R.id.feed_recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        feedRecyclerView.setLayoutManager(linearLayoutManager);
        feedRecyclerView.setHasFixedSize(false);

        List<FeedItem> feedItemList = new ArrayList<FeedItem>();

        FeedRecyclerAdapter feedRecyclerAdapter = new FeedRecyclerAdapter(getContext(), feedItemList);
        feedRecyclerView.setAdapter(feedRecyclerAdapter);

        return rootView;
    }

}
