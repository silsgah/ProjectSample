package com.example.silas.parenteye.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.silas.parenteye.R;
import com.example.silas.parenteye.model.instantmessg;

import java.util.List;

/**
 * Created by silas on 6/8/17.
 */

public class AdapterInstant extends RecyclerView.Adapter<AdapterInstant.MyViewHolder> {
    private List<instantmessg> mData;
    private LayoutInflater minflater;

    public AdapterInstant(Context context, List<instantmessg> data){
        this.mData = data;
        this.minflater = LayoutInflater.from(context);
    }
    @Override
    public AdapterInstant.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = minflater.inflate(R.layout.list_itemsq, parent, false);
        AdapterInstant.MyViewHolder holder = new AdapterInstant.MyViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public void onBindViewHolder(AdapterInstant.MyViewHolder holder, int position) {
        instantmessg currentObj = mData.get(position);
        holder.setData(currentObj, position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView titledescription;
        ImageView imgThumb, imgDelete, imgAdd;
        int position;
        instantmessg current;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tvTitle);
            imgThumb = (ImageView) itemView.findViewById(R.id.img_row);
            imgDelete = (ImageView) itemView.findViewById(R.id.img_row_delete);
            imgAdd = (ImageView) itemView.findViewById(R.id.img_row_add);
            titledescription = (TextView) itemView.findViewById(R.id.tvDescription);
        }

        public void setData(instantmessg current, int position){
            this.title.setText(current.getTitle());
            this.titledescription.setText(current.getDescription());
            this.imgThumb.setImageResource(current.getImageID());
            this.position = position;
            this.current = current;
        }

    }
}
