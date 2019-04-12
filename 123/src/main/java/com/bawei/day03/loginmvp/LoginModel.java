package com.bawei.day03.loginmvp;

public class LoginModel implements  ILoginModel{


    @Override
    public void login(Callback callback) {
         String names="1611B杜亚星";
         callback.onSuccess(names);
    }
}
