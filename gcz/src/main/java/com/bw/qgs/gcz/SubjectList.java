package com.bw.qgs.gcz;

import java.util.ArrayList;
import java.util.List;

/**
 * date:2018/11/27    11:15
 * author:秦广帅(Lenovo)
 * fileName:SubjectList
 */
public interface SubjectList {
    List list = new ArrayList();
    void attach(Object a);
    void dettach(Object a);
    void notifySubAll();
}
