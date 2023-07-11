import java.util.*;

public class ArrayListEx{
    public static void main(String[] args) {
        List <String> list=new ArrayList<String>();
        list.add("benz");
        list.add("ferrari");
        list.add("daimler");
        System.out.println("The elements in the array liat are");
        for(String cars:list){
            System.out.println(cars);
        }
        System.out.println("Returning element:"+list.get(1));
        System.out.println("Returning element:"+list.get(0));

        list.set(1,"suv");
        for(String cars:list){
            System.out.println(cars);
        }
        Collections.sort(list);
        System.out.println("After sorting");
        for(String cars1:list){
            System.out.println(cars1);

        
    }
}
}