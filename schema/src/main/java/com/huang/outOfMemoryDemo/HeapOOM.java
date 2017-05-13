package com.huang.outOfMemoryDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by hlp on 2017/4/25.
 */
public class HeapOOM {

     static class OOMObject{

    }
    public void stackOverFlowMethod(){
        stackOverFlowMethod();
    }
    public static void main(String[] args) {
        List<Object> list=new ArrayList<>();
        while (true){
            list.add(new HeapOOM());
        }
//        HeapOOM n=new HeapOOM();
//        n.stackOverFlowMethod();
    }
}
