package Mission.Middle;

// 람다 표현식을 활용한 간단한 계산기 프로그램 작성하기

import java.util.Scanner;

public class M9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자 입력: ");
            double num1 = scanner.nextDouble();

            System.out.print("연산자 입력 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자 입력: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("올바르지 않은 연산자입니다.");
            }

            System.out.println("계산 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("입력 오류가 발생했습니다. 숫자를 올바르게 입력하세요.");
        } finally {
            scanner.close();
        }
    }
}