package Mission.Middle;

// 문자열 뒤집기 및 대소문자 변환 프로그램 작성하기

import java.util.Scanner;

public class M8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        String reversed = M8Method.reverseString(input);
        String caseToggled = M8Method.toggleCase(input);

        System.out.println("뒤집은 문자열: " + reversed);
        System.out.println("대소문자 변환 문자열: " + caseToggled);

        scanner.close();
    }
}
