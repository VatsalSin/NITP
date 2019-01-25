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
import com.saksham.sakshambharat.adapters.NotificationsRecyclerViewAdapter;
import com.saksham.sakshambharat.model.Notifications;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {
    RecyclerView recyclerView;

    public NotificationsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notifications, container, false);

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Notifications");

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
