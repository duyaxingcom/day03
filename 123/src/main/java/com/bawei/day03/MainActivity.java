package com.bawei.day03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPwd;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //第一步
        init();
    }

    private void init() {
        //第二步
        editTextName = findViewById(R.id.login_name_et);
        editTextPwd = findViewById(R.id.login_pwd_et);
        button = findViewById(R.id.button);
    }
}
