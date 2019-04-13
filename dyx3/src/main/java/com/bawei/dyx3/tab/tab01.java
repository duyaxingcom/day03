package com.bawei.dyx3.tab;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bawei.dyx3.Iview.Iview;
import com.bawei.dyx3.R;
import com.bawei.dyx3.TwoActivity;
import com.bawei.dyx3.adapter.ListAdapter;
import com.bawei.dyx3.bean.ListBean;
import com.bawei.dyx3.presenter.Presenter;
import com.google.gson.Gson;

import java.util.List;

public class tab01 extends Fragment implements Iview {

    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.tab01,container,false);
        listView = view.findViewById(R.id.xlist);
        Presenter presenter = new Presenter();
        presenter.attchView(this);
        presenter.getData();

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), TwoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void getData(String data) {
        Gson gson=new Gson();
        ListBean bean = gson.fromJson(data, ListBean.class);
        List<ListBean.ResultBean> list = bean.getResult();
        ListAdapter listAdapter=new ListAdapter(list, getActivity());
        listView.setAdapter(listAdapter);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
