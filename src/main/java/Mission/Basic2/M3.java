package Mission.Basic2;

//(Java) 5개의 정수 오름차순 정렬하기

import java.util.Scanner;
import java.util.Arrays;

public class M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 하나씩 입력하세요:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("오름차순으로 정렬된 결과:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
