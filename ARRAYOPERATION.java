import java.util.Scanner;

public class ARRAYOPERATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int size = 0;
        int choice;

        while (true) {
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                if (size == arr.length) {
                    System.out.println("Array is full");
                } else {
                    System.out.print("Enter value: ");
                    arr[size] = sc.nextInt();
                    size++;
                }
            }

            else if (choice == 2) {
                if (size == arr.length) {
                    System.out.println("Array is full");
                } else {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    if (index < 0 || index > size) {
                        System.out.println("Invalid index");
                    } else {
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();

                        int i = size;
                        while (i > index) {
                            arr[i] = arr[i - 1];
                            i--;
                        }

                        arr[index] = value;
                        size++;
                    }
                }
            }

            else if (choice == 3) {
                size = 0;

                while (size < arr.length) {
                    System.out.print("Enter value (-1 to stop): ");
                    int value = sc.nextInt();

                    if (value == -1) {
                        break;
                    }

                    arr[size] = value;
                    size++;
                }
            }

            else if (choice == 4) {
                if (size == 0) {
                    System.out.println("Array is empty");
                } else {
                    System.out.println("Deleted: " + arr[size - 1]);
                    size--;
                }
            }

            else if (choice == 5) {
                System.out.print("Enter index: ");
                int index = sc.nextInt();

                if (index < 0 || index >= size) {
                    System.out.println("Invalid index");
                } else {
                    int i = index;

                    while (i < size - 1) {
                        arr[i] = arr[i + 1];
                        i++;
                    }

                    size--;
                    System.out.println("Element deleted");
                }
            }

            else if (choice == 6) {
                if (size == 0) {
                    System.out.println("Array is empty");
                } else {
                    int i = 0;

                    while (i < size) {
                        System.out.print(arr[i] + " ");
                        i++;
                    }

                    System.out.println();
                }
            }

            else if (choice == 7) {
                System.out.print("Enter value to search: ");
                int value = sc.nextInt();
                int i = 0;
                boolean found = false;

                while (i < size) {
                    if (arr[i] == value) {
                        System.out.println("Found at index: " + i);
                        found = true;
                        break;
                    }
                    i++;
                }

                if (!found) {
                    System.out.println("Value not found");
                }
            }

            else if (choice == 8) {
                System.out.print("Enter index: ");
                int index = sc.nextInt();

                if (index >= 0 && index < size) {
                    System.out.println("Value: " + arr[index]);
                } else {
                    System.out.println("Invalid index");
                }
            }

            else if (choice == 9) {
                System.out.print("Enter index: ");
                int index = sc.nextInt();

                if (index >= 0 && index < size) {
                    System.out.print("Enter new value: ");
                    arr[index] = sc.nextInt();
                    System.out.println("Value updated");
                } else {
                    System.out.println("Invalid index");
                }
            }

            else if (choice == 10) {
                System.out.println("Size: " + size);
            }

            else if (choice == 11) {
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