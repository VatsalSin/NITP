package com.saksham.sakshambharat.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saksham.sakshambharat.R;
import com.saksham.sakshambharat.adapters.CurrentRecyclerAdapter;
import com.saksham.sakshambharat.model.ProposedSchemeItem;

import java.util.ArrayList;
import java.util.List;

public class CurrentSchemesFragment extends Fragment {

    RecyclerView currentRecycler;
    public CurrentSchemesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_current_schemes, container, false);

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Proposed Schemes");

        List<ProposedSchemeItem> proposedSchemeItemList = new ArrayList<ProposedSchemeItem>();

        currentRecycler = (RecyclerView) rootView.findViewById(R.id.current_schemes_recycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        currentRecycler.setLayoutManager(linearLayoutManager);
        currentRecycler.setHasFixedSize(false);

        CurrentRecyclerAdapter currentRecyclerAdapter = new CurrentRecyclerAdapter(getContext(), proposedSchemeItemList);
        currentRecycler.setAdapter(currentRecyclerAdapter);

        return rootView;
    }
}
