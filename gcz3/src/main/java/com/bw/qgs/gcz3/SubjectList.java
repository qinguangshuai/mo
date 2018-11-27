package com.bw.qgs.gcz3;

import java.util.ArrayList;
import java.util.List;

/**
 * date:2018/11/27    13:43
 * author:秦广帅(Lenovo)
 * fileName:SubjectList
 */
public class SubjectList {

    private List<Observer> mList = new ArrayList();

    public void attach(Observer observer) {
        mList.add(observer);
    }

    public void detach(Observer observer) {
        mList.remove(observer);
    }

    public void notifafy(){
        for(Observer observer:mList){
            observer.updata(this);
        }
    }

    int xx;

    public int getXx() {
        return xx;
    }

    public void setXx() {
        xx=1;
    }
}
