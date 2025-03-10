package Mission.Middle;

import java.util.Scanner;

public class M8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        // 문자열 변환 수행
        String reversed = M8Method.reverseString(input);
        String caseToggled = M8Method.toggleCase(input);

        // 결과 출력
        System.out.println("뒤집은 문자열: " + reversed);
        System.out.println("대소문자 변환 문자열: " + caseToggled);

        scanner.close();
    }
}
