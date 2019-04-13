package com.bawei.dyx3.presenter;

import com.bawei.dyx3.Iview.Iview;
import com.bawei.dyx3.model.Dmodel;
import com.bawei.dyx3.model.Imodel;
import com.bawei.dyx3.model.Model;
import com.bawei.dyx3.model.Modeld;

public class Presenterd implements Dpresenter {



    private Iview iview;
    private Modeld modeld;

    @Override
    public void attchView(Iview iview) {
      modeld = new Modeld();
        this.iview=iview;
    }

    @Override
    public void deteachView() {
        if (iview!=null){
            iview=null;
        }
        if (modeld!=null){
            modeld=null;
        }
        System.gc();
    }

    @Override
    public void getData(String phone, String pwd) {
   modeld.RequestData(phone,pwd, new Dmodel.Callback() {
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
