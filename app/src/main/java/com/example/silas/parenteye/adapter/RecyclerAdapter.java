package com.example.silas.parenteye.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.silas.parenteye.R;
import com.example.silas.parenteye.model.Landscape;

import java.util.List;

/**
 * Created by silas on 6/8/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<Landscape> mData;
    private LayoutInflater minflater;

   public RecyclerAdapter(Context context, List<Landscape> data){
       this.mData = data;
       this.minflater = LayoutInflater.from(context);
   }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = minflater.inflate(R.layout.list_itemsq, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Landscape currentObj = mData.get(position);
        holder.setData(currentObj, position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView titledescription;
        ImageView imgThumb, imgDelete, imgAdd;
        int position;
        Landscape current;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tvTitle);
            imgThumb = (ImageView) itemView.findViewById(R.id.img_row);
            imgDelete = (ImageView) itemView.findViewById(R.id.img_row_delete);
            imgAdd = (ImageView) itemView.findViewById(R.id.img_row_add);
            titledescription = (TextView) itemView.findViewById(R.id.tvDescription);
        }

        public void setData(Landscape current, int position){
          this.title.setText(current.getTitle());
          this.titledescription.setText(current.getDescription());
          this.imgThumb.setImageResource(current.getImageID());
          this.position = position;
          this.current = current;
        }

    }
}
