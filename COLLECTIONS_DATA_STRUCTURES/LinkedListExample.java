package COLLECTIONS_DATA_STRUCTURES;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList here! <OBJECT INTEGER> -> represnt a wrapper for our primative type

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        // {head} {tail} {size: 0}
        linkedList.add(19);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(20);
        // update our linked list with our index of where it's located!
        linkedList.add(1, 17);
        // [19 => 20 => nothing)
        // [19, 20]
       // linkedList.add(20);
        //linkedList.add(0, 10);

//        for (int i =0; i < linkedList.size();i++){
//            System.out.println("What is at the value " + i);
//            System.out.println(linkedList.get(i));
//        }
        // more efficient -> let us traverse our linkedlist more efficienlty!!!
        ListIterator it = linkedList.listIterator();
        // while the next node does not point to a null value!
        while (it.hasNext()){ // this will become false at some poin!
            System.out.println( it.next());
        }




    }
}
