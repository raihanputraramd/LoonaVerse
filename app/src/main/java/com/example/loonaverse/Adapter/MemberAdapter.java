package com.example.loonaverse.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.loonaverse.Model.Member;
import com.example.loonaverse.R;

import java.util.ArrayList;

public class MemberAdapter extends RecyclerView.Adapter<MemberAdapter.MemberViewHolder>{

    private ArrayList<Member> listMember;
    private onItemClickCallback onItemClickCallback;

    public MemberAdapter(ArrayList<Member> list) {
        this.listMember = list;
    }

    public void setOnItemClickCallback(onItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public MemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MemberViewHolder holder, int position) {
        Member member = listMember.get(position);

        holder.memberName.setText(member.getStageName());
        Glide.with(holder.itemView.getContext())
                .load(member.getPhoto())
                .apply(new RequestOptions().override(150, 150 ))
                .into(holder.memberPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMember.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMember.size();
    }


    public interface onItemClickCallback{
        void onItemClicked(Member data);
    }

    class MemberViewHolder extends RecyclerView.ViewHolder {
        ImageView memberPhoto;
        TextView memberName;

        MemberViewHolder(View itemView) {
            super(itemView);
            memberPhoto = itemView.findViewById(R.id.iv_member);
            memberName = itemView.findViewById(R.id.tv_member);
        }
    }


}
