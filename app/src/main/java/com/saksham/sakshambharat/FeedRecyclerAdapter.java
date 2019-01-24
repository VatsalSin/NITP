package com.saksham.sakshambharat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

        View view = inflater.inflate(R.layout.feed_card, viewGroup, false);
        FeedViewHolder viewHolder = new FeedViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull FeedViewHolder feedViewHolder, int i) {
        
    }

    public class FeedViewHolder extends RecyclerView.ViewHolder{

        public final TextView feedHeader;
        public final TextView feedContent;
        public final ImageView feedImage;

        public FeedViewHolder(@NonNull View itemView) {
            super(itemView);
            feedHeader = (TextView) itemView.findViewById(R.id.feed_header);
            feedContent = (TextView) itemView.findViewById(R.id.feed_content);
            feedImage = (ImageView) itemView.findViewById(R.id.feed_image);
        }

    }

}
