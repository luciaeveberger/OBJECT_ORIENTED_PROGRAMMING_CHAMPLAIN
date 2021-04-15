package COLLECTIONS_DATA_STRUCTURES;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList here! <OBJECT INTEGER> -> represnt a wrapper for our primative type

        LinkedList<Integer> integerList = new LinkedList<Integer>();
        LinkedList<String> stringValueList = new LinkedList<>();
        // {head} {tail} {size: 0}
        integerList.add(19);
        integerList.add(18);
        stringValueList.add("String Value Homie!");
        integerList.add(20);
       // integerList.add(21);

        //

        // update our linked list with our index of where it's located!
       // integerList.add(1, 17);
        //integerList.remove(1);
        // [19 => 20 => nothing)
        // [19, 20]
       // integerList.add(20);
        //integerList.add(0, 10);

        for (int i=0; i < integerList.size();i++){
            System.out.println("What is at the value " + i);
            System.out.println(integerList.get(i));
        }
        // more efficient -> let us traverse our linkedlist more efficienlty!!!
        ListIterator it = integerList.listIterator();
        // while the next node does not point to a null value!
        while (it.hasNext()){ // this will become false at some poin!
            System.out.println( it.next());
        }




    }
}
