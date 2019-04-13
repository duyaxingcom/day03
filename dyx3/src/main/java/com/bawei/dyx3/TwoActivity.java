package com.bawei.dyx3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawei.dyx3.Iview.Iview;
import com.bawei.dyx3.bean.DengBean;
import com.bawei.dyx3.presenter.Presenter;
import com.bawei.dyx3.presenter.Presenterd;
import com.google.gson.Gson;

public class TwoActivity extends AppCompatActivity implements Iview {

    private EditText editname;
    private EditText editpwd;
    private Button button;
    private DengBean bean;
    private Presenterd presenterd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        //初始化
        editname = findViewById(R.id.login_zh);
        editpwd = findViewById(R.id.login_mm);
        button = findViewById(R.id.button);
        //初始化P
        presenterd = new Presenterd();
        presenterd.attchView(this);
        //设置点击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //输入数据内容
                String phone = editname.getText().toString();
                String pwd = editpwd.getText().toString();
                if (!phone.isEmpty()&&!pwd.isEmpty()){
                   presenterd.getData(phone,pwd);
                }
            }
        });
    }

    @Override
    public void getData(String data) {
        Gson gson=new Gson();
      if(data!=null){
          bean = gson.fromJson(data, DengBean.class);
          if(bean.getStatus().equals("1001")){
              Toast.makeText(TwoActivity.this,"登陆成功",Toast.LENGTH_LONG).show();


          }else {

              Toast.makeText(TwoActivity.this,"登陆失败",Toast.LENGTH_LONG).show();
          }

      }
      }

    }
