import java.util.*;
public class LinkedListReverse{
    public static void main(String[] args) {
    LinkedList <String> ll=new LinkedList<String>();
    ll.add("benz");
    ll.add("daimler");
    ll.add("ferarri");
    Iterator i=ll.descendingIterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }
}


    
}