package com.bawei.dyx3.model;

import com.bawei.dyx3.HttpUttil;

public class Modeld implements Dmodel {

    String Dengurl ="http://172.17.8.100/small/user/v1/login";


    @Override
    public void RequestData(String phone, String pwd, final Callback callback) {
         HttpUttil.getInstance().postAsnTask(Dengurl,phone,pwd, new HttpUttil.CallbackString() {
             @Override
             public void chenggong(String list) {
                 callback.onSuccesse(list);
             }

             @Override
             public void shibai(int error, String message) {

             }
         });
    }
}
