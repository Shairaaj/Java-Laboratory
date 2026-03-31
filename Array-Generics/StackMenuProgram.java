import java.util.*;

public class StackMenuProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        int choice;
        int maxSize = 0;
        boolean created = false;

        while (true) {
            System.out.println("\nEnter the options to proceed!");
            System.out.println("1 -> Create Stack");
            System.out.println("2 -> Insert (Push)");
            System.out.println("3 -> getLength()");
            System.out.println("4 -> Delete an Element");
            System.out.println("5 -> Increase Stack Size");
            System.out.println("6 -> Print all Elements");
            System.out.println("0 -> Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    stack.clear();
                    System.out.print("Enter initial stack size: ");
                    maxSize = sc.nextInt();

                    System.out.println("Enter " + maxSize + " elements:");
                    for (int i = 0; i < maxSize; i++) {
                        stack.push(sc.next());
                    }

                    created = true;
                    System.out.println("Stack Created Successfully!");
                    break;

                case 2:
                    if (!created) {
                        System.out.println("Stack not created! Choose option 1 first.");
                        break;
                    }

                    if (stack.size() == maxSize) {
                        System.out.println("Stack is FULL! Increase size first.");
                        break;
                    }

                    System.out.print("Enter element to push: ");
                    stack.push(sc.next());
                    System.out.println("Element inserted successfully.");
                    break;

                case 3:
                    if (!created) {
                        System.out.println("Stack not created! Choose option 1 first.");
                        break;
                    }

                    System.out.println("Stack Length = " + stack.size());
                    break;

                case 4:
                    if (!created) {
                        System.out.println("Stack not created! Choose option 1 first.");
                        break;
                    }

                    if (stack.isEmpty()) {
                        System.out.println("Stack is EMPTY! Nothing to delete.");
                        break;
                    }

                    System.out.print("Enter element to delete: ");
                    String del = sc.next();

                    if (stack.remove(del)) {
                        System.out.println("Element deleted successfully.");
                    } else {
                        System.out.println("Element not found in stack.");
                    }
                    break;

                case 5:
                    if (!created) {
                        System.out.println("Stack not created! Choose option 1 first.");
                        break;
                    }

                    System.out.print("Enter how much size to increase: ");
                    int inc = sc.nextInt();
                    maxSize += inc;

                    System.out.println("Stack size limit increased. New Max Size = " + maxSize);
                    break;

                case 6:
                    if (!created) {
                        System.out.println("Stack not created! Choose option 1 first.");
                        break;
                    }

                    if (stack.isEmpty()) {
                        System.out.println("Stack is EMPTY!");
                        break;
                    }

                    System.out.println("Stack Elements (Top to Bottom):");
                    for (int i = stack.size() - 1; i >= 0; i--) {
                        System.out.print(stack.get(i) + " ");
                    }
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}