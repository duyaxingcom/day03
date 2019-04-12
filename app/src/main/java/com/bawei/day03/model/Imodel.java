package com.bawei.day03.model;

import javax.security.auth.callback.Callback;

public interface Imodel {
    //定义方法
    void RequestData(Callback callback);
    //定义接口
    interface  Callback{
        //定义成功失败的方法
        void onSuccess(String data);
        void onFail(Exception e);
    }
}
