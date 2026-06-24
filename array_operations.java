import java.util.Scanner;

public class ArrayOperations {

    // Method to sort the array using Bubble Sort
    public static void sortArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to find second highest and second lowest
    public static void findSecondHighestAndLowest(int arr[]) {

        sortArray(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int secondLowest = arr[1];
        int secondHighest = arr[arr.length - 2];

        System.out.println("\n\nSecond Lowest Number: " + secondLowest);
        System.out.println("Second Highest Number: " + secondHighest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 different numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        findSecondHighestAndLowest(arr);

        sc.close();
    }
}
