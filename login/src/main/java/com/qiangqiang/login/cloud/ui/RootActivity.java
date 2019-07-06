package com.qiangqiang.login.cloud.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qiangqiang.login.R;

public class RootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        findViewById(R.id.btn_qq_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                QQLoginActivity.actionStart(RootActivity.this);
            }
        });
        findViewById(R.id.btn_wx_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WXLoginActivity.actionStart(RootActivity.this);
            }
        });
        findViewById(R.id.btn_sina_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                SinaLoginActivity.actionStart(RootActivity.this);
            }
        });
        findViewById(R.id.btn_common_shared).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                SharedActivity.actionStart(RootActivity.this);
            }
        });
        findViewById(R.id.btn_facebook_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FaceBookLoginActivity.actionStart(RootActivity.this);
            }
        });
        findViewById(R.id.btn_google_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                GoogleLoginActivity.actionStart(RootActivity.this);
            }
        });
        findViewById(R.id.btn_twitter_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TwitterLoginActivity.actionStart(RootActivity.this);
            }
        });
    }
}
