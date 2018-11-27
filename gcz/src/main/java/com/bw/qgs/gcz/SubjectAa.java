package com.bw.qgs.gcz;

/**
 * date:2018/11/27    11:20
 * author:秦广帅(Lenovo)
 * fileName:SubjectAa
 */
public class SubjectAa implements SubjectList {
    @Override
    public void attach(Object a) {
        list.add(a);
    }

    @Override
    public void dettach(Object a) {
        list.remove(a);
    }

    @Override
    public void notifySubAll() {
        for (int i = 0;i<list.size();i++){
            ObserverList o = (ObserverList) list.get(i);
            o.updata();
        }
    }
}
