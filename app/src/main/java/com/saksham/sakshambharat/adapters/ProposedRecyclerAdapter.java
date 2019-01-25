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

public class ProposedRecyclerAdapter extends RecyclerView.Adapter<ProposedRecyclerAdapter.ProposedViewHolder> {

    List<ProposedSchemeItem> proposedSchemeItemList;

    public ProposedRecyclerAdapter(Context context, List<ProposedSchemeItem> proposedSchemeItemList){
        this.proposedSchemeItemList = proposedSchemeItemList;
    }


    @NonNull
    @Override
    public ProposedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.schemes_card, viewGroup, false);
        ProposedViewHolder viewHolder = new ProposedViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProposedViewHolder proposedViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return proposedSchemeItemList.size();
    }

    public class ProposedViewHolder extends RecyclerView.ViewHolder{

        public final TextView schemeHeader;
        public final TextView schemeDetails;
        public ProposedViewHolder(@NonNull View itemView) {
            super(itemView);
            schemeDetails = (TextView) itemView.findViewById(R.id.scheme_details);
            schemeHeader = (TextView) itemView.findViewById(R.id.scheme_head);
        }
    }
}
