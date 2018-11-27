package com.bw.qgs.gcz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test1();
            }
        });
    }

    private void test1() {

        SubjectAa aa1 = new SubjectAa();
        ObserverAa aa2 = new ObserverAa();

        aa1.attach(aa2);
        aa1.notifySubAll();

    }
}
