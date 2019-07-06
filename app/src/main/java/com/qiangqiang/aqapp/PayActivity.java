package com.qiangqiang.aqapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qiangqiang.alipay.sdk.pay.demo.PayDemoActivity;
import com.qiangqiang.aqapp.R;

public class PayActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        findViewById(R.id.alipay).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.alipay:
                startActivity(new Intent(PayActivity.this, PayDemoActivity.class));
                break;

        }
    }
}
