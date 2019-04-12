package com.bawei.day03;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.text.TextUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtil {
    public  boolean isNet(Context context){
        if (context!=null){
            ConnectivityManager connectivityManager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
            if (networkInfo!=null){
                return  networkInfo.isAvailable();
            }
        }
        return  false;
    }
    public static void httpAsnTask(String strUrl,final CallbaskString callbaskString){
        new AsyncTask<String, Integer, String>() {
            @Override
            protected String doInBackground(String... strings) {
                return httpGet(strings[0]);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
               if (!TextUtils.isEmpty(s)){
                   callbaskString.chenggong(s);
               }else{
                   callbaskString.shiban(404,"得到数据");
               }
            }
        }.execute(strUrl);
    }
     public  interface CallbaskString{
        void  chenggong(String list);

        void shiban(int error ,String meage);

     }
     public static String httpGet(String strUrl){
         try {
             URL url=new URL(strUrl);
             HttpURLConnection connection= (HttpURLConnection) url.openConnection();
             connection.setRequestMethod("GET");
             connection.setConnectTimeout(5000);
             connection.setReadTimeout(5000);
             InputStream stream=connection.getInputStream();
             StringBuilder builder=new StringBuilder();
             BufferedReader reader=new BufferedReader(new InputStreamReader(stream,"utf-8"));
             String str="";
             while ((str=reader.readLine())!=null){
                 builder.append(str);
             }
              connection.disconnect();
             return  builder.toString();
         } catch (Exception e) {
             e.printStackTrace();
         }
       return null;
    }
}
