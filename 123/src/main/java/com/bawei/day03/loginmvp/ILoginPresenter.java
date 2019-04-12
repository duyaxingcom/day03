package com.bawei.day03.loginmvp;

public interface ILoginPresenter {
    void  getModel();
    void  attch(ILoginView view);
    void  detch();
}
