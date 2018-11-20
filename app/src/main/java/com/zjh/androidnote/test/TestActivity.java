package com.zjh.androidnote.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Author：Created by zhaojh on 2018/11/20 18:34.
 * Description: 测试用例，没有多大用处
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("这是一个测试用例");
        setContentView(tv);
    }
}
