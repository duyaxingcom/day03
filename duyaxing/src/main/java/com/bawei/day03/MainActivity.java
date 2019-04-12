package com.bawei.day03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.bawei.day03.Bean.LoginBean;
import com.bawei.day03.Iview.Iview;
import com.bawei.day03.adapter.ListAdapter;
import com.bawei.day03.persenter.Presenter;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Iview {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Presenter presenter = new Presenter();
        presenter.attchView(this);
        presenter.getData();
    }

    private void init() {
        listView = findViewById(R.id.xlist);
    }

    @Override
    public void getData(String data) {
        Gson gson=new Gson();
        LoginBean bean = gson.fromJson(data, LoginBean.class);
        List<LoginBean.ResultBean> list = bean.getResult();
        ListAdapter listAdapter=new ListAdapter(list, MainActivity.this);
        listView.setAdapter(listAdapter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
