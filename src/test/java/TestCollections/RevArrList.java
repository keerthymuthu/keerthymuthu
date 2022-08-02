package TestCollections;

import java.util.ArrayList;
import java.util.List;

public class RevArrList {

    public static void main(String[] args){
        int n=5;
        List<Integer> arrli=new ArrayList<Integer>();
        List<Integer> newLi=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            arrli.add(i);
        }
        System.out.println("Original List: "+arrli);
        for(int i=arrli.size()-1;i>=0;i--){
            newLi.add(arrli.get(i));
        }
        System.out.print("Output: "+newLi);
    }

}
