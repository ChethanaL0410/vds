import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;
public class Stack_example{
public static void main(String[] args) {
    Stack <Integer> stk=new Stack<>();
    boolean result=stk.empty();
    System.out.println("Is stack empty"+result);
    stk.push(5);
    stk.push(15);
    stk.push(23);
    System.out.println("The elements in the stack are:"+stk);
    result=stk.empty();
    System.out.println("Is stack empty"+result);
    stk.pop();
    System.out.println("The elements in the stack are:"+stk);
    Integer Stack=stk.peek();
    System.out.println("The upper elements in the stack are:"+Stack);
    int location=stk.search(15);
    System.out.println("Location "+location);
    int s=stk.size();
    System.out.println("Size "+s);
    stk.push(30);
    stk.push(45);
    Iterator iterator=stk.iterator();
    while(iterator.hasNext()){
        Object values=iterator.next();
        System.out.println("The elements in the stack are:");
        System.out.println(values);
    }
//         stk.forEach(n ->  
// {  
// System.out.println(n);  
// });  
ListIterator<Integer> ListIterator = stk.listIterator(stk.size());  
while(ListIterator.hasPrevious()){
    Integer prev=ListIterator.previous();
    System.out.println("Iteration over the Stack from top to bottom:");
    System.out.println(prev);

}

    }

    

    
    


}

