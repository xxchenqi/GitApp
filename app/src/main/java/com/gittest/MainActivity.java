package com.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
//test
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("====","测试提交");
        Log.i("====","测试提交2");
        Log.i("====","测试提交TEST");
    }
}
