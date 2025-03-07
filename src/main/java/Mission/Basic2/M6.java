package Mission.Basic2;

//(Java) 배열의 평균을 계산하고 배열 요소를 변경하는 메서드 작성하기
public class M6 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        double average = M6Method.Average(numbers);
        System.out.println("배열의 평균: " + average);

        M6Method.modify(numbers);

        System.out.println("변경된 배열 요소들:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

