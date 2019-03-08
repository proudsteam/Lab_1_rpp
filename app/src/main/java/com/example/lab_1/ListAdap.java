package com.example.lab_1;

import android.app.Service;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdap extends BaseAdapter {
    private ArrayList<String> arrayList;
    Context context;
    LayoutInflater inflater;

    public ListAdap(ArrayList<String> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null)
        {
            view = inflater.inflate(R.layout.list_layout,null);
        }
        String str = (String)getItem(position);
        if(position%2==0)
        {
            view.setBackgroundColor(Color.GRAY);
        }
        else
        {
            view.setBackgroundColor(Color.WHITE);
        }
        ((TextView) view.findViewById(R.id.list_tx)).setText(str);
        ((ImageView) view.findViewById(R.id.list_iv)).setImageResource(R.drawable.ic_launcher_foreground);

        return view;
    }
}
