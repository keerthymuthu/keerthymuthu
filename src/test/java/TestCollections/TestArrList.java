package TestCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrList {

    public static void main(String[] args){
        int n=5;
        ArrayList<Integer> arrli=new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            arrli.add(i);
        }
        arrli.add(6);
        //arrli.add(0,1);
        System.out.println(arrli);
        System.out.println(arrli.lastIndexOf(6));
        arrli.set(0,0);
        for(int i:arrli){
            System.out.print(i+"\t");
        }
        System.out.println("Print via iterator: ");
        Iterator it=arrli.iterator();
        while(it.hasNext())
            System.out.print(it.next()+"\t");
    }

}
