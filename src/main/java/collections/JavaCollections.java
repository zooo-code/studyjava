package collections;



import java.io.IOException;
import java.util.*;



public class JavaCollections {

    public static void main(String[] args)  {


        List<Integer> a = new ArrayList<>(1000);
        a.add(1);
        a.add(2);
        a.add(3);
        // 정상 작동 x
//        for (Integer integer : a) {
//            a.remove(1);
//
//        }

        LinkedList<Integer> li = new LinkedList<>();
        li.offer(1);
        li.offer(2);
        li.offer(3);
        for (Integer integer : li) {

            System.out.println("integer = " + integer);
        }
        System.out.println("li.pop() = " + li.pop());
        
    }


}
