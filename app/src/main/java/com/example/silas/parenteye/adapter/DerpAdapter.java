package com.example.silas.parenteye.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.silas.parenteye.R;
import com.example.silas.parenteye.model.DerpList;

import java.util.List;

/**
 * Created by silas on 6/7/17.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder>{

    private List<DerpList> listdata;
    private LayoutInflater inflater;

    public DerpAdapter(List<DerpList> listdata, Context c){
        this.inflater = LayoutInflater.from(c);
        this.listdata = listdata;
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_items2,parent,false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
      DerpList item = listdata.get(position);
      holder.title.setText(item.getTitle());
      holder.titlescore.setText(item.getTitlescore());
      holder.titlescoregrade.setText(item.getTitlescoregrade());
      holder.icon.setText(item.getImageResId());
    }

    @Override
    public int getItemCount() {
       return listdata.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView icon;
        private TextView titlescore;
        private TextView titlescoregrade;
        private View container;
        public DerpHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.lbl_item_text);
            icon = (TextView)itemView.findViewById(R.id.im_item_icon);
            titlescore = (TextView)itemView.findViewById(R.id.lbl_item_text2);
            titlescoregrade = (TextView)itemView.findViewById(R.id.lbl_item_text3);
        }
    }
}
