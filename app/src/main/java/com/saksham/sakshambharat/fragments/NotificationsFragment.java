package com.saksham.sakshambharat.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saksham.sakshambharat.R;
import com.saksham.sakshambharat.adapters.NotificationsRecyclerViewAdapter;
import com.saksham.sakshambharat.model.Notifications;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {
    RecyclerView recyclerView;

    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_notifications, container, false);
        recyclerView = v.findViewById(R.id.recyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        List<Notifications> notificationsList=new ArrayList<Notifications>();
        NotificationsRecyclerViewAdapter adapter = new NotificationsRecyclerViewAdapter(notificationsList);
        recyclerView.setAdapter(adapter);
        return v;
    }

}
