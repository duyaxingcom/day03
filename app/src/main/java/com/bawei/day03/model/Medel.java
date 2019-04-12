package com.bawei.day03.model;

public class Medel implements Imodel{
    @Override
    public void RequestData(Callback callback) {
        String name ="1611B杜亚星";
        callback.onSuccess(name);
    }
}
