package com.javabase.week2day005;

import java.util.HashMap;
import java.util.Map;

public class Job2 {
    public static void main(String[] args) {
        Map<Integer,Integer> randoms=new HashMap<>();
        for (int i=0;i<1000;i++){
            int num=(int)(Math.random()*10+1);

            Integer v=randoms.get(num);

            if (v==null){
                randoms.put(num,1);
            }else {
                randoms.put(num,v+1);
            }

        }
        for (Map.Entry<Integer,Integer> temp: randoms.entrySet()){
            System.out.println(temp.getKey()+"-"+ temp.getValue());
        }

    }
}
