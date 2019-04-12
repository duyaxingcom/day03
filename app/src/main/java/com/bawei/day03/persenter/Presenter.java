package com.bawei.day03.persenter;

import com.bawei.day03.Iview.Iview;
import com.bawei.day03.model.Imodel;
import com.bawei.day03.model.Medel;

public class Presenter implements Ipredenter{

    private Medel medel;
    private Iview iview;

    @Override
    public void attchView(Iview iview) {
          //初始化Model层
        medel = new Medel();
          this.iview=iview;
    }

    @Override
    public void deteachView() {
         if (iview!=null){
             iview=null;
         }
         if (medel!=null){
             medel=null;
         }
         System.gc();
    }

    @Override
    public void getData() {
       medel.RequestData(new Imodel.Callback() {
           @Override
           public void onSuccess(String data) {
               iview.getData(data);
           }

           @Override
           public void onFail(Exception e) {

           }
       });
    }
}
