package Mission.Middle;

public class M1Method {
    private double length;
    private double width;

    public M1Method(double length, double width) {  // 클래스 이름과 동일하게 수정
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}