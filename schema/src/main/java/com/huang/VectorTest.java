package com.huang;

import java.util.Vector;

/**
 * Created by hlp on 2017/4/28.
 */
public class VectorTest {
    private static Vector<Integer> vector=new Vector<>();
    public static void main(String[] args) {
        while (true){
            for (int i = 0; i <10 ; i++) {
                vector.add(i);
            }
            Thread remove=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <vector.size() ; i++) {
                            vector.remove(i);
                    }
                }
            });

            Thread print=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <vector.size() ; i++) {
                        System.out.println(vector.get(i));
                    }
                }
            });
            remove.start();
            print.start();

            while (Thread.activeCount()>20);
        }
    }
}
