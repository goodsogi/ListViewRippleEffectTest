package com.plusapp.listviewrippleeffecttest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * @author jeff
 */
public class ListAdapter extends PlusCommonListAdapter<String> {


    public ListAdapter(Context context, List<String> datas) {
        super(context, R.layout.list_item, datas);

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.list_item,
                    parent, false);
        }

        TextView placeName = (TextView) convertView.findViewById(R.id.place_name);
        placeName.setText(mDatas.get(position));

        return convertView;
    }


}
