package com.bw.qgs.gcz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Observable;

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
        Manager manager = new Manager();
        Teacher teacher = new Teacher();
        Student student = new Student();
        manager.attach(teacher);
        manager.attach(student);
        manager.setXx();
        manager.notifafy();
        manager.detach(student);
        manager.notifafy();
        Observer observer;
        Observable observable;
    }
}
