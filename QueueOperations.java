import java.util.Scanner;
public class QueueOperations {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] queue = new int[5];
        int front = 0;
        int rear = -1;
        int size = 0;
        int choice;

        while (true) {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                if (rear == queue.length - 1) {
                    System.out.println("Queue is full");
                } else {
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    rear++;
                    queue[rear] = value;
                    size++;
                }
            }

            else if (choice == 2) {
                if (size == 0) {
                    System.out.println("Queue is empty");
                } else {
                    System.out.println("Dequeued value: " + queue[front]);
                    front++;
                    size--;

                    if (size == 0) {
                        front = 0;
                        rear = -1;
                    }
                }
            }

            else if (choice == 3) {
                if (size == 0) {
                    System.out.println("Queue is empty");
                } else {
                    int i = front;

                    while (i <= rear) {
                        System.out.print(queue[i] + " ");
                        i++;
                    }

                    System.out.println();
                }
            }

            else if (choice == 4) {
                System.out.println("Size: " + size);
            }

            else if (choice == 5) {
                if (size == 0) {
                    System.out.println("Queue is empty");
                } else {
                    System.out.println("Queue is not empty");
                }
            }

            else if (choice == 6) {
                if (rear == queue.length - 1) {
                    System.out.println("Queue is full");
                } else {
                    System.out.println("Queue is not full");
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

