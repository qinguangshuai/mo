package com.bw.qgs.gcz1;

/**
 * date:2018/11/27    11:42
 * author:秦广帅(Lenovo)
 * fileName:SubjectAa
 */
public class SubjectAa implements SubjectList {
    @Override
    public void attach(ObserverList observerList) {
        list.add(observerList);
    }

    @Override
    public void detach(ObserverList observerList) {
        list.remove(observerList);
    }

    @Override
    public void nitifyaAll() {
        for (ObserverList observerList:list){
            observerList.updata(this);
        }
    }
}
