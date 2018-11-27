package com.bw.qgs.gcz1;

import java.util.ArrayList;
import java.util.List;

/**
 * date:2018/11/27    11:38
 * author:秦广帅(Lenovo)
 * fileName:SubjectList
 */
public interface SubjectList {
    List<ObserverList> list = new ArrayList<>();
    void attach(ObserverList observerList);
    void detach(ObserverList observerList);
    void nitifyaAll();
}
