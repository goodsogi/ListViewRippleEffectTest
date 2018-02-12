package com.plusapp.listviewrippleeffecttest;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * 공통 어댑터
 *
 * @param <T>
 * @author jeff
 */
public class PlusCommonListAdapter<T> extends ArrayAdapter<T> {
    protected Context mContext;
    protected LayoutInflater mLayoutInflater;
    protected List<T> mDatas;


    public PlusCommonListAdapter(Context context, int layoutId, List<T> datas) {
        super(context, layoutId, datas);
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mDatas = datas;


    }


}