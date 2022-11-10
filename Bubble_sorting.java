import java.util.Scanner;

public class Bubble_sorting {
    public static void main(String[] args) {
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        len = sc.nextInt();
        int array[] = new int[len];
        System.out.println("Enter the data in array");
        inputArray(array, len);
        System.out.println("Array entered is ");
        display(array);
        bubbleSort(array);
        System.out.println("\nArray after sorting is ");
        display(array);
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int arr[]) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    private static void inputArray(int arr[], int l) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
