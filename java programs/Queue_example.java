import java.util.*;
class Queue_example{
    public static void main(String[] args) {
        //Queue <String> queue=new LinkedList<String>();
        Queue <String> queue=new PriorityQueue<String>();
        queue.add("benz");
        queue.add("daimler");
        queue.add("bmw");
        queue.add("mercedes");
        queue.add("ferarri");
        System.out.println("Head:"+queue.element());
        //System.out.println("Head:"+queue.peek());
        System.out.println("Iterating through the queue elements");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements");
        Iterator itr2=queue.iterator(); {
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }
            
        };

    }
}