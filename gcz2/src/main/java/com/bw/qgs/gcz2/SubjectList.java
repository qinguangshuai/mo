package com.bw.qgs.gcz2;

import java.util.ArrayList;
import java.util.List;

/**
 * date:2018/11/27    11:52
 * author:秦广帅(Lenovo)
 * fileName:SubjectList
 */
public class SubjectList {
    
    private List<ObserverList> list = new ArrayList();

    public void attach(ObserverList observerList) {
        list.add(observerList);
    }

    public void detach(ObserverList observerList) {
        list.remove(observerList);
    }

    public void notifyaAll() {
        for (ObserverList observerList : list) {
            observerList.updata(this);
        }
    }

    int xx;

    public int getXx() {
        return xx;
    }

    public void setXx() {
        xx = 1;
    }
}
