import java.util.*;
public class LinkedListEx{
    public static void main(String[] args) {
        LinkedList <String> ll=new LinkedList<String>();
        ll.add("benz");
        ll.add("daimler");
        ll.add("ferrari");
        ll.add("bmw");
        Iterator <String> itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ll.add(1,"suv");
        System.out.println("Afer adding a element at 1st index");
        for(String s:ll){
            System.out.println(s);
        }
        ll.addFirst("cars list");
        ll.addLast("end");
        System.out.println("After adding elements at first and last position");
        for(String s1:ll){
            System.out.println(s1);
        }
        ll.remove("suv");
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removing elements");
        for(String s3:ll){
            System.out.println(s3);
        }
        ll.add(2,"suv");
        ll.add(4,"suv");
        System.out.println("After adding");
        for(String s4:ll){
            System.out.println(s4);
            }
            ll.removeFirstOccurrence("suv");
            System.out.println("After removal of first occurence");
            for(String s5:ll){
                System.out.println(s5);
                }

}


}
