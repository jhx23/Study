package Mission.Middle;

// 도형 인터페이스 작성하기

interface Shapee {
    double getAreae();
}

class Circlee implements Shapee {
    private double radiuse;

    public Circlee(double radiuse) {
        this.radiuse = radiuse;
    }

    @Override
    public double getAreae() {
        return Math.PI * radiuse * radiuse;
    }
}

class Rectanglee implements Shapee {
    private double widthe, heighte;

    public Rectanglee(double widthe, double heighte) {
        this.widthe = widthe;
        this.heighte = heighte;
    }

    @Override
    public double getAreae() {
        return widthe * heighte;
    }
}

class Trianglee implements Shapee {
    private double basee, heighte;

    public Trianglee(double basee, double heighte) {
        this.basee = basee;
        this.heighte = heighte;
    }

    @Override
    public double getAreae() {
        return 0.5 * basee * heighte;
    }
}

public class M4 {
    public static void main(String[] args) {
        Shapee circlee = new Circlee(5);
        Shapee rectanglee = new Rectanglee(4, 6);
        Shapee trianglee = new Trianglee(3, 8);

        System.out.println("Circlee Areae: " + circlee.getAreae());
        System.out.println("Rectanglee Areae: " + rectanglee.getAreae());
        System.out.println("Trianglee Areae: " + trianglee.getAreae());
    }
}
