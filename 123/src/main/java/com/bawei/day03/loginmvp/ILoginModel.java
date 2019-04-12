package com.bawei.day03.loginmvp;

import javax.security.auth.callback.Callback;

public interface ILoginModel {
    void  login(Callback callback);
    interface Callback{
        void onSuccess(String names);

        void onFail();
    }
}
