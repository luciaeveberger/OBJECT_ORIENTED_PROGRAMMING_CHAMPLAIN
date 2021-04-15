package COLLECTIONS_DATA_STRUCTURES;

import java.util.Stack;

public class StackCheck {
    public static void main(String[] args) {
        // primative array
        // a fixed size! =>
        int [] myPrimativeArray = new int[10];


        Stack s = new Stack();
        s.add("Hello");
        s.add("World");
        // 0: Hello
        // 1: World

        System.out.println(s.pop());
        // calling on this object -> stack -> asking the question of are you empty?
        System.out.println(s.isEmpty());

    }
}
