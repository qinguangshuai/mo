package com.bw.qgs.paixu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                int[] arr = {1, 9, 4, 6, 3, 7, 5};
                int t;
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 0; j < arr.length - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            t = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = t;
                        }
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    Log.d("dsfsd", arr[i] + "\n");
                }
                break;
            case R.id.button2:
                int min, a;
                int[] aa = {1, 9, 4, 6, 3, 7, 5};
                for (int i = 0; i < aa.length; i++) {
                    min = i;
                    for (int j = i + 1; j < aa.length; j++) {
                        if (aa[min] > aa[j]) {
                            min = j;
                        }
                    }
                    if (min != i) {
                        a = aa[min];
                        aa[min] = aa[i];
                        aa[i] = a;
                    }
                }
                for (int i = 0; i < aa.length; i++) {
                    Log.d("dsfsd", aa[i] + "\n");
                }
                break;
            case R.id.button3:
                int[] source = {1, 2, 3, 6, 7, 8, 10};
                int num = 12;
                int start = 0;
                int end = source.length-1;
                int mid = (start+end)/2;
                while (num!=source[mid]){
                    if(source[mid]>num){
                        end = mid-1;
                    }else if(source[mid]<num){
                        start = mid+1;
                    }

                    if (start>end){
                        mid=-1;
                        break;
                    }
                    mid = (start+end)/2;
                }

                for (int i = 0; i < source.length; i++) {
                    Log.d("dsfsd", source[i] + "\n");
                }
                break;
            case R.id.button4:

                break;
        }
    }
}
