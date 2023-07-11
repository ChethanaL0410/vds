import java.util.*;
class ArrayDequeExample{
    public static void main(String[] args) {
        Deque <String> deque=new ArrayDeque<String>();
        deque.add("benz");
        deque.add("ferrari");
        deque.add("daimler");
        Iterator itr=deque.iterator();{
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            deque.pollFirst();
            System.out.println("After removal");
            Iterator itr2=deque.iterator();{
                while(itr2.hasNext()){
                    System.out.println(itr2.next());
                }
                


            
        };
        System.out.println("After removal");
        deque.pollLast();
        for(String s:deque){
            System.out.println(s);
        }
        
        
    }
}
}