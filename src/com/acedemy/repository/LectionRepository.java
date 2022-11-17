package com.acedemy.repository;

import com.acedemy.cources.Lection;

public class LectionRepository {
    private int arrayLength = 2;
    public Lection[] lectionArray = new Lection[arrayLength];

    public void addLection (Lection lection){
        for (int i = 0; i < lectionArray.length; i++) {
            if(lectionArray[i] == null){
               lectionArray[i] = lection;
               if(i == lectionArray.length - 1){
                   expandArray();
               }
               break;
            }
        }
    }

    public void expandArray(){
        int tmpArrayLength = (lectionArray.length * 3) / 2 + 1;
        Lection[] tmpLectionArray = new Lection[tmpArrayLength];
        System.arraycopy(lectionArray,0,tmpLectionArray,0,lectionArray.length);
        lectionArray = tmpLectionArray;
    }

    public Lection[] getLectionArray() {
        return lectionArray;
    }

}

