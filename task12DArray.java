import java.util.Scanner;

public class task12DArray {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];
        int i, j;
        int choice;
        int sum;

        i = 0;
        while (i < 2) {
            j = 0;
            while (j < 2) {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

    
        choice = 0;
        while (choice != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Array");
            System.out.println("2. Sum of Elements");
            System.out.println("3. Search Element");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                i = 0;
                while (i < 2) {
                    j = 0;
                    while (j < 2) {
                        System.out.print(arr[i][j] + " ");
                        j++;
                    }
                    System.out.println();
                    i++;
                }
            }

            else if (choice == 2) {
                sum = 0;
                i = 0;
                while (i < 2) {
                    j = 0;
                    while (j < 2) {
                        sum = sum + arr[i][j];
                        j++;
                    }
                    i++;
                }
                System.out.println("Sum = " + sum);
            }

            else if (choice == 3) {
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();
                boolean found = false;

                i = 0;
                while (i < 2) {
                    j = 0;
                    while (j < 2) {
                        if (arr[i][j] == key) {
                            found = true;
                        }
                        j++;
                    }
                    i++;
                }

                if (found) {
                    System.out.println("Element found");
                } else {
                    System.out.println("Element not found");
                }
            }

            else if (choice == 4) {
                System.out.println("Program ended.");
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}  
    


