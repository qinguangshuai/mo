package com.bw.qgs.gcz3;

import android.util.Log;

/**
 * date:2018/11/27    13:50
 * author:秦广帅(Lenovo)
 * fileName:Student
 */
public class Student implements Observer {
    @Override
    public void updata(SubjectList subjectList) {
        int xx = subjectList.getXx();
        if(xx == 0){
            Log.d("======000========", "updata: 不能睡觉了,假装学习");
        }else{
            Log.d("======111========", "updata: 不能睡觉了,假装学习");
        }
    }
}
