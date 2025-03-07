package Mission.Basic2;

//(Java) 홀수/짝수 판별 프로그램 작성하기

import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "는 짝수 입니다.");
        }else {
            System.out.println(num + "는 홀수 입니다.");
        }
    }
}
