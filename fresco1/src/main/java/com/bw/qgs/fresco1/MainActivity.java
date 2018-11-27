package com.bw.qgs.fresco1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDraweeView image = findViewById(R.id.simple);
        FrescoUtil frescoUtil = new FrescoUtil();
        frescoUtil.setTu("https://i.loli.net/2017/11/09/5a046546a2a1f.jpg",image);
    }
}
