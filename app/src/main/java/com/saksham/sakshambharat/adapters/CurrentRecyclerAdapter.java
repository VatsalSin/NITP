package com.saksham.sakshambharat.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.saksham.sakshambharat.R;
import com.saksham.sakshambharat.model.ProposedSchemeItem;

import java.util.List;

public class CurrentRecyclerAdapter extends RecyclerView.Adapter<CurrentRecyclerAdapter.CurrentViewHolder> {

    List<ProposedSchemeItem> proposedSchemeItemList;

    public CurrentRecyclerAdapter(Context context, List<ProposedSchemeItem> proposedSchemeItemList){
        this.proposedSchemeItemList = proposedSchemeItemList;
    }


    @NonNull
    @Override
    public CurrentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.schemes_card, viewGroup, false);
        CurrentViewHolder viewHolder = new CurrentViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CurrentViewHolder proposedViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return proposedSchemeItemList.size();
    }

    public class CurrentViewHolder extends RecyclerView.ViewHolder{

        public final TextView schemeHeader;
        public final TextView schemeDetails;
        public CurrentViewHolder(@NonNull View itemView) {
            super(itemView);
            schemeDetails = (TextView) itemView.findViewById(R.id.scheme_details);
            schemeHeader = (TextView) itemView.findViewById(R.id.scheme_head);
        }
    }
}
