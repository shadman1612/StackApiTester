import java.util.Stack ;
/**
    Practices using the Stack from the Java API.
 */
public class StackApiTester
{
    public static void main(String[] args)
    {
 Stack<String> stack = new Stack<String>() ;
 stack.push("horse") ;
 stack.push("cat") ;
 stack.push("dog") ;
 stack.push("cow") ;
 stack.push("mouse") ;
 System.out.println(stack.pop()) ;
 System.out.println(stack.pop()) ;
 System.out.println(stack.pop()) ;
 System.out.println(stack.peek()) ;
 System.out.println("stack is empty? " + stack.isEmpty()) ;
 System.out.println(stack.pop()) ;
 System.out.println("stack is empty? " + stack.isEmpty()) ;
 System.out.println(stack.pop()) ;
 System.out.println("stack is empty? " + stack.isEmpty()) ;
 //-----------Start below here. To do: approximate lines of code = 8
 // 1. make a stack that holds integers ; 
 Stack<Integer> s = new Stack<Integer>();
 //2. push in the integers from 1 to 100 that are divisible by 3 ; 
 for (int i = 1; i < 100; i++) {
   if (i%3 == 0) s.push(i);
 }
 //3. print the size ; 
 System.out.println(s.size());
 //4. while stack not empty ; 
 while(!s.empty()) {
     //5. let value hold pop ; 
   int value = s.pop();
     //6. if value divisible by 9 then print it.
   if(value%9 == 0) System.out.println(value);
 }
 
 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
