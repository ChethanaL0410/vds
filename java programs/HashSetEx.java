import java.util.*;
public class HashSetEx{
    public static void main(String[] args) {
    HashSet <String> hash=new HashSet<>();
    hash.add("benz");
    hash.add("daimler");
    hash.add("suv");
    hash.add("ferrari");
    System.out.println(hash.size());   
    Iterator <String> itr=hash.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
}