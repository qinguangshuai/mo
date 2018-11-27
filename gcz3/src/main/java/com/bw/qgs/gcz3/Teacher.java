package com.bw.qgs.gcz3;

import android.util.Log;

/**
 * date:2018/11/27    13:52
 * author:秦广帅(Lenovo)
 * fileName:Teacher
 */
public class Teacher implements Observer {
    @Override
    public void updata(SubjectList subjectList) {
        int xx = subjectList.getXx();
        if(xx == 0){
            Log.d("======0========", "updata: 不能睡觉了,假装学习");
        }else{
            Log.d("======1========", "updata: 不能睡觉了,假装学习");
        }
    }
}
