package COLLECTIONS_DATA_STRUCTURES;

// we need to import these dependencies
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.Queue;

public class StackExample {

    public static void main(String[] args) {
        Queue <String> ourLine = new Queue<>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }
        };
        ourLine.add("First Person");
        ourLine.add("Second Person");
        ourLine.remove();
        ourLine.remove();


        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("G");
        stack.push("F");
        // [A, G, F] => first element
        // pop them off -> F, G, A
//        String firstPoppedElement = stack.pop();
//        String secondElement = stack.pop();
//        System.out.println(secondElement);
        Iterator<String> itr=stack.iterator();
        int index = 0;
        while(itr.hasNext()){
            //System.out.println(itr.next());
            index ++;
            System.out.println("Which index ? " + index);
            System.out.println(stack.pop());
        }
    }
}
