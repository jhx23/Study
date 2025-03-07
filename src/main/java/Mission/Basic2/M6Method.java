package Mission.Basic2;

public class M6Method {

    public static double Average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void modify(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }
}