//importing libraries needed to build my stack in java

import java.util.Stack;

//Stack class
public class Main {


    //Push operation pushing the element on the top of the stack
    static void push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++ )
        {
            stack.push(i);
        }
    }

    //  Pop operation to pop eleent from the top of the Stack
    static void pop(Stack<Integer> stack) {
        System.out.println("Pop : ");

        for (int i = 0; i < 5; i++)
        {
            Integer data = (Integer) stack.pop();
            System.out.println(data);
        }
    }

    //Peak operation Displays the element on the top of the stack
    static void  peek(Stack<Integer>stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top is : " + element);
    }

    //Search operation lets you search for element in stack
    static void search(Stack<Integer>stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element cannot be found");
        else
            System.out.println("Element is found at position " + pos );
    }

    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();

        push(stack);
        pop(stack);
        push(stack);
        peek(stack);
        search(stack, 2);
        search(stack, 6);


    }
}
