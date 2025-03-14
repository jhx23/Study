package Mission.Middle;

// 배열을 사용하여 간단한 정렬 알고리즘 구현하기

import java.util.Scanner;
import java.util.Arrays;

public class M10 {

    public static void bubbleSort(int[] arr) {
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

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 크기 입력: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("배열 요소 입력: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("정렬 전: " + Arrays.toString(arr));

        int[] bubbleSortedArr = arr.clone();
        bubbleSort(bubbleSortedArr);
        System.out.println("버블 정렬 후: " + Arrays.toString(bubbleSortedArr));

        int[] selectionSortedArr = arr.clone();
        selectionSort(selectionSortedArr);
        System.out.println("선택 정렬 후: " + Arrays.toString(selectionSortedArr));

        scanner.close();
    }
}