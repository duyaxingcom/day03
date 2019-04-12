package com.bawei.day03.model;

import com.bawei.day03.HttpUtil;

public class Medel implements Imodel{
    public static final String BaseUrl="http://172.17.8.100/movieApi/cinema/v1/findRecommendCinemas?page=1&count=10";
    @Override
    public void RequestData(final Callback callback) {

        HttpUtil.httpAsnTask(BaseUrl, new HttpUtil.CallbaskString() {
            @Override
            public void chenggong(String list) {
                callback.onSuccess(list);
            }

            @Override
            public void shiban(int error, String meage) {

            }

        });
    }
}
