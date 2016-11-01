package com.example.viniciusfarias.appcivicopostosdosine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.viniciusfarias.appcivicopostosdosine.R;
import com.example.viniciusfarias.appcivicopostosdosine.entitys.PostoSine;

import java.util.ArrayList;

/**
 * Created by vinicius on 10/31/2016.
 */

public class PostoSineCGAdapter extends RecyclerView.Adapter<PostoSineCGAdapter.ViewHolder> {
    private ArrayList<PostoSine> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvNome;
        public TextView tvUf;
        public TextView tvCodPosto;

        public ViewHolder(View v) {
            super(v);
            tvNome = (TextView) v.findViewById(R.id.tvNome);
            tvUf = (TextView) v.findViewById(R.id.tvUf);
            tvCodPosto = (TextView) v.findViewById(R.id.tvCodPosto);
        }
    }

    public void add(int position, PostoSine item) {
        mDataset.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(PostoSine item) {
        int position = mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public PostoSineCGAdapter(ArrayList<PostoSine> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public PostoSineCGAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sine, parent, false);
        // set the view's size, margins, paddings and layout parameters
        //v.setOnClickListener(mOnClickListener);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
