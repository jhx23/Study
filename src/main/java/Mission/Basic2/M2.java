package Mission.Basic2;

//(Java) 1부터 10까지의 숫자 배열 출력하기

public class M2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("배열의 요소:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
