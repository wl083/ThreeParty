package com.example.administrator.threeparty;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class YMActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youmeng);

        Log.i("www", "onCreateaaa: ");
        initView();
    }

    private void initView() {

    }
}
