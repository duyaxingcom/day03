package com.bawei.dyx3.model;

import com.bawei.dyx3.HttpUttil;

public class Model implements Imodel {

    public static final String ListUrl="http://172.17.8.100/movieApi/cinema/v1/findRecommendCinemas?page=1&count=10";


    @Override
    public void RequestData(final Callback callback) {
          HttpUttil.httpAsnTask(ListUrl, new HttpUttil.CallbackString() {
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
