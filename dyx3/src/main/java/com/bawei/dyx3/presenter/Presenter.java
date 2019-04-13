package com.bawei.dyx3.presenter;

import com.bawei.dyx3.Iview.Iview;
import com.bawei.dyx3.model.Imodel;
import com.bawei.dyx3.model.Model;

public class Presenter implements Ipresenter {

    private Model model;
    private Iview iview;

    @Override
    public void attchView(Iview iview) {
        model = new Model();
        this.iview=iview;
    }

    @Override
    public void deteachView() {
        if (iview!=null){
            iview=null;
        }
        if (model!=null){
            model=null;
        }
        System.gc();
    }

    @Override
    public void getData() {
    model.RequestData(new Imodel.Callback() {
        @Override
        public void onSuccesse(String data) {
            iview.getData(data);
        }

        @Override
        public void onFail(Exception e) {

        }
    });
    }


}
