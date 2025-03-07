package Mission.Basic2;

//(Java) 두 개의 정수를 더하고 빼는 메서드 작성하기

import java.util.Scanner;

public class M4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        int sum = M4Method.add(num1, num2);
        int difference = M4Method.subtract(num1, num2);

        System.out.println("더하기: " + sum);
        System.out.println("빼기: " + difference);

        scanner.close();
    }
}