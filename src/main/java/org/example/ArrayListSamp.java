package org.example;
import java.util.*;
public class ArrayListSamp {
    Comparator comp =new Comparator() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1%10 > o2%10){
                return  1;
            }else {
                return 0;
            }
        }
    };
    public void addSample(){
        List<Integer> obj= new ArrayList<>();
        obj.add(100);
        obj.add(200);
        obj.add(400);
        for(int i : obj){
            System.out.println(i);
        }

    Collections.sort(obj,comp);
        Iterator itr = obj.iterator();
        while (itr.hasNext()){
            itr.next();
        }
    }
}
