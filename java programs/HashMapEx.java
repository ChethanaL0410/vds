import java.util.*;  
class HashMapEx{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"benz");  
  hm.put(101,"daimler");  
  hm.put(102,"suv");  
  
for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
  System.out.println("Key:"+hm.keySet());
  System.out.println("Values:"+hm.values());
  System.out.println("Key value pair:"+hm.entrySet());
 }  
}  