package com.example.myapplication.AdapterPackage;

 import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

 import com.example.myapplication.R;
 import com.example.myapplication.model.MyListData;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{

      @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.activity_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
          return getItemCount();
     }

    public static class ViewHolder extends RecyclerView.ViewHolder {
             ImageView imageView;
             TextView textView;
           public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
           // relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}