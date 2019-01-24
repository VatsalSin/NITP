package com.saksham.sakshambharat.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.saksham.sakshambharat.R;
import com.saksham.sakshambharat.model.Notifications;

import java.util.List;

public class NotificationsRecyclerViewAdapter extends RecyclerView.Adapter<NotificationsRecyclerViewAdapter.ViewHolder> {

    private List<Notifications> notifications;

    public NotificationsRecyclerViewAdapter(List<Notifications> notifications) {
        this.notifications = notifications;
    }

    @NonNull
    @Override
    public NotificationsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.notification_card, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationsRecyclerViewAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView header, short_details, time_stamp;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            header = itemView.findViewById(R.id.header);
            short_details = itemView.findViewById(R.id.short_details);
            time_stamp = itemView.findViewById(R.id.timestamp);
            imageView = itemView.findViewById(R.id.icon);
        }
    }
}

