 import java.util.Scanner;
public class StackOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] stack = new int[5];
        int top = -1;
        int choice;

        while (true) {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                if (top == stack.length - 1) {
                    System.out.println("Stack is full");
                } else {
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    top++;
                    stack[top] = value;
                }
            }

            else if (choice == 2) {
                if (top == -1) {
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Popped value: " + stack[top]);
                    top--;
                }
            }

            else if (choice == 3) {
                if (top == -1) {
                    System.out.println("Stack is empty");
                } else {
                    int i = top;

                    while (i >= 0) {
                        System.out.println(stack[i]);
                        i--;
                    }
                }
            }

            else if (choice == 4) {
                System.out.println("Size: " + (top + 1));
            }

            else if (choice == 5) {
                if (top == -1) {
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Stack is not empty");
                }
            }

            else if (choice == 6) {
                if (top == stack.length - 1) {
                    System.out.println("Stack is full");
                } else {
                    System.out.println("Stack is not full");
                }
            }

            else if (choice == 7) {
                System.out.println("Program ended");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
