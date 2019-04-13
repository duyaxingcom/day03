package com.bawei.dyx3.presenter;

import com.bawei.dyx3.Iview.Iview;

public interface Ipresenter {
    void  attchView(Iview iview);
    void  deteachView();
    void  getData();
}
