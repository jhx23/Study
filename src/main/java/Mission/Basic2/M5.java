package Mission.Basic2;

//(Java) 사용자로부터 직사각형의 가로와 세로를 입력받아 넓이 출력하기

import java.util.Scanner;

public class M5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가로를 입력하세요: ");
        double width = sc.nextDouble();  // 가로 값 입력

        System.out.print("세로를 입력하세요: ");
        double height = sc.nextDouble();  // 세로 값 입력

        double area = width * height;

        System.out.println("직사각형의 넓이는: " + area);
    }
}