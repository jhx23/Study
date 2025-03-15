package Mission.Middle;

// 예외 처리가 포함된 계산기 프로그램 작성하기

import java.util.Scanner;

public class M5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = getValidNumber(scanner);

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = getValidNumber(scanner);

            double result = calculate(num1, num2, operator);
            System.out.println("결과: " + result);

        } catch (ArithmeticException e) {
            System.out.println("수학 오류: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("입력 오류: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double getValidNumber(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("잘못된 입력입니다. 숫자를 입력하세요: ");
            }
        }
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/':
                if (num2 == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
                return num1 / num2;
            default: throw new IllegalArgumentException("유효하지 않은 연산자입니다.");
        }
    }
}