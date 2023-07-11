import java.util.*;
class Frequency{
    public static void main(String[] args){
         int[] arr={1,1,2,3,3,4};
         int count=0;
         for(int i=0;i<arr.length;i++){
            count++;//first time it encounters,it gets repeated
             int temp=arr[i];

             for(int j=i+1;j<arr.length-1;j++){
                 if(temp==arr[j] && arr[j]!=-1){
                     count++;//2nd time the same element is encountered count gets incremented
                    arr[j]=-1;

                 }
             }
             if (arr[i]!=-1){
             System.out.println("Array element "+arr[i]+" count "+count);
            
             }
             count=0;

         }
        
        
    }
    // public static void main(String[] args){
    //     HashMap<Integer,Integer> hm=new HashMap<>();
    //     hm.put(null, null)

    // }
   
}
