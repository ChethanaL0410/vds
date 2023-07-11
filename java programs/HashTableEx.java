import java.util.*;
public class HashTableEx{
    public static void main(String[] args) {
        Hashtable<Integer,String> table=new Hashtable<Integer,String>();
        table.put(1,"benz");
        table.put(2,"daimler");
        table.put(3,"suv");
        System.out.println("List:"+table);
        table.putIfAbsent(4,"ferrari");
        System.out.println("Updated map:"+table);
        table.putIfAbsent(1,"daimler");
        System.out.println("Updated map:"+table);
        table.remove(4);
        System.out.println("Updated map:"+table);


    }
}