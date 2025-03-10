package Mission.Middle;

// 직사각형 클래스 작성하기

public class M1 {
    public static void main(String[] args) {
        M1Method rect = new M1Method(10.0, 5.0);
        System.out.println("직사각형의 길이: " + rect.getLength());
        System.out.println("직사각형의 너비: " + rect.getWidth());
        System.out.println("직사각형의 넓이: " + rect.getArea());
        System.out.println("직사각형의 둘레: " + rect.getPerimeter());
    }
}
