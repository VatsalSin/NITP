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

public class ChatRecyclerAdapter extends RecyclerView.Adapter<ChatRecyclerAdapter.ChatViewHolder> {

    List<ChatItem> chatItemList;

    public ChatRecyclerAdapter(Context context, List<ChatItem> chatItemList){
        this.chatItemList = chatItemList;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.feed_card, viewGroup, false);
        ChatViewHolder viewHolder = new ChatViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatRecyclerAdapter.ChatViewHolder chatViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return chatItemList.size();
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder{

        public TextView personName;
        public ImageView personImage;
        public TextView lastMessage;
        public TextView lastMessageTime;

        public ChatViewHolder(@NonNull View itemView){
            super(itemView);

        }

    }

}
