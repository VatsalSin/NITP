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
import com.saksham.sakshambharat.adapters.ProposedRecyclerAdapter;
import com.saksham.sakshambharat.model.ProposedSchemeItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProposedSchemesFragment extends Fragment {

    RecyclerView proposedRecycler;


    public ProposedSchemesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_proposed_schemes, container, false);

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Proposed Schemes");

        List<ProposedSchemeItem> proposedSchemeItemList = new ArrayList<ProposedSchemeItem>();

        proposedRecycler = (RecyclerView) rootView.findViewById(R.id.proposed_recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        proposedRecycler.setLayoutManager(linearLayoutManager);
        proposedRecycler.setHasFixedSize(false);

        ProposedRecyclerAdapter proposedRecyclerAdapter = new ProposedRecyclerAdapter(getContext(), proposedSchemeItemList);
        proposedRecycler.setAdapter(proposedRecyclerAdapter);

        return rootView;
    }

}
