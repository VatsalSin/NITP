package com.saksham.sakshambharat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FeedRecyclerAdapter extends RecyclerView.Adapter<FeedRecyclerAdapter.FeedViewHolder> {

    List<FeedItem> feedItemList;

    public FeedRecyclerAdapter(Context context, List<FeedItem> feedItemList){
        this.feedItemList = feedItemList;
    }

    @Override
    public int getItemCount() {
        return feedItemList.size();
    }

    @NonNull
    @Override
    public FeedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.timetable_item, viewGroup, false);
        FeedViewHolder viewHolder = new FeedViewHolder(view);

        return viewHolder;

    }

    public class FeedViewHolder extends RecyclerView.ViewHolder{

        public final TextView timeTextView;
        public final TextView subjectTextView;

        public FeedViewHolder(@NonNull View itemView) {
            super(itemView);
            timeTextView = (TextView) itemView.findViewById(R.id.tt_time_view);
            subjectTextView = (TextView) itemView.findViewById(R.id.tt_subject_view);
        }

    }

}
