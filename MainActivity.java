package com.example.administrator.threeparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,btn2,btn3,btn4,btn5;
    private String TAG = "lei";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                showLog("btn1");
                startActivity(new Intent(MainActivity.this,YMActivity.class));
                break;
            case R.id.btn2:
                showLog("btn2");
                break;
            case R.id.btn3:
                showLog("btn3");
                break;
            case R.id.btn4:
                showLog("btn4");
                break;
            case R.id.btn5:
                showLog("btn5");
                break;
        }

    }

    public void showLog(String msg){
        Log.i(TAG, msg);
    }

}
