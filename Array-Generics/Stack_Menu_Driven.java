import java.util.Scanner;
import java.util.Stack;

public class Stack_Menu_Driven {
    public static void main(String[] args) {
            Stack_Helper<?> stack_Helper;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Datatype for the Stack:");
            System.out.println("1->Integer\n2->String\n3->Character");
            int dt = sc.nextInt();
            switch (dt) {
                case 1:
                    stack_Helper = new Stack_Helper<Integer>();
                    break;
                case 2:
                    stack_Helper = new Stack_Helper<String>();
                    break;
                case 3:
                    stack_Helper = new Stack_Helper<Character>();
                    break;
                default:
                    System.out.println("Enter a valid input!");
                    return;
            }
        
        while(true){
            int choice;            
            System.out.println("Enter the operation to do using Stack");
            System.out.println("Enter \n1-> Create a stack\n2-> Push onto the stack\n2-> Pop from the stack\n3-> Peek from the stack\n0->EXIT!");
            System.out.println("Enter the value: ");
            choice = sc.nextInt();
            switch(choice){
                case 0:
                    return;
                case 1:
                    stack_Helper.createStack(sc);
                case 2:
                    stack_Helper.push(sc);
            }
        }
    }
}

class Stack_Helper<T>{
    Stack<T>stack;
    Scanner sc;
    public void createStack(Scanner sc){
        this.sc = sc;
        stack = new Stack<T>();
        System.out.println("Successfully created!");
    }
    public void push(Scanner sc){
        if(stack == null) System.out.println("First create a stack!");
        System.out.println("Enter the value to push onto the stack:");
        int val;
        val = sc.nextInt();                         //Cannot have nextInt() as we are using Generics
        stack.push(val);
    }
}