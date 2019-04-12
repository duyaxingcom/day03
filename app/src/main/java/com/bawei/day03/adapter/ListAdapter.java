package com.bawei.day03.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.day03.Bean.LoginBean;
import com.bawei.day03.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    List<LoginBean.ResultBean> list;
    Context context;

    public ListAdapter(List<LoginBean.ResultBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView=View.inflate(context, R.layout.item,null);
            holder=new ViewHolder();
            holder.textView=convertView.findViewById(R.id.login_tv);
            holder.imageView=convertView.findViewById(R.id.login_iv);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        LoginBean.ResultBean bean = list.get(position);
        holder.textView.setText(bean.getName());
        Glide.with(context).load(bean.getLogo()).into(holder.imageView);
        return convertView;
    }
    class ViewHolder{
        TextView textView;
        ImageView imageView;
    }
}
