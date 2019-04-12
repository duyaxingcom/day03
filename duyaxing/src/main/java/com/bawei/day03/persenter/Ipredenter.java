package com.bawei.day03.persenter;

import com.bawei.day03.Iview.Iview;

public interface Ipredenter {
    //重写方法
    void attchView(Iview iview);
    void deteachView();
    void getData();
}
