package com.bawei.dyx3.model;


public interface Dmodel {
    void RequestData(String phone,String pwd,Callback callback);
    interface Callback{
        void onSuccesse(String data);
        void onFail(Exception e);
    }
}
