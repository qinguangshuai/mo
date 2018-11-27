package com.bw.qgs.gcz2;

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
        MagazineSubject magazineSubject = new MagazineSubject();
        People people = new People();
        Teacher teacher = new Teacher();
        magazineSubject.attach(teacher);
        magazineSubject.attach(people);
        magazineSubject.setXx();
        magazineSubject.notifyaAll();
        magazineSubject.detach(teacher);
        magazineSubject.notifyaAll();
    }
}
