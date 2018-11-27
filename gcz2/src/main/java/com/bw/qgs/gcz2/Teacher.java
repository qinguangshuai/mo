package com.bw.qgs.gcz2;

import android.util.Log;

/**
 * date:2018/11/27    13:32
 * author:秦广帅(Lenovo)
 * fileName:Teacher
 */
public class Teacher implements ObserverList {
    @Override
    public void updata(SubjectList subjectList) {
        int xx = subjectList.getXx();
        if(xx==0){
            Log.d("======11========", "updata: 不能睡觉了,假装学习");
        }else{
            Log.d("======22========", "updata: 不能睡觉了,假装学习");
        }
    }
}
