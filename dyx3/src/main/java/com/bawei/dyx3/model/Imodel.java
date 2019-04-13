package com.bawei.dyx3.model;


public interface Imodel {
    void RequestData(Callback callback);
    interface Callback{
        void onSuccesse(String data);
        void onFail(Exception e);
    }
}
