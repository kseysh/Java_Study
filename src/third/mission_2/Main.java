package third.mission_2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        aList=new ArrayList<Integer>(List.of(5,7,10,9,4));
        aList.remove(Integer.valueOf(7));
        System.out.println(aList.get(1));
        Collections.sort(aList,Collections.reverseOrder());
        for (int e : aList) {
            System.out.println(e);
        }
        System.out.println("ArrayList 안에 11의 값이 존재하는가? : "+ aList.contains(11));


    }
}