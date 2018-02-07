package com.example.owner.gridviewlol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Owner on 2/7/2018.
 */

public class CustomGridAdapter extends BaseAdapter {

    Context context;
    int[] idImage;
    private static LayoutInflater inflater = null;

    public CustomGridAdapter(Context context, int[] idImage) {
        this.context = context;
        this.idImage = idImage;
    }

    @Override
    public int getCount() {
        return idImage.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View gridViewAndroid;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null ) {
            gridViewAndroid = inflater.inflate(R.layout.custom_gridlayout, null);
            ImageView imageViewAndroid = gridViewAndroid.findViewById(R.id.iv_image);
            imageViewAndroid.setImageResource(idImage[i]);
        } else {
            gridViewAndroid = view;
        }
        return gridViewAndroid;
    }
}