package Mission.Middle;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("직원 이름: " + name);
        System.out.println("급여: " + salary);
    }
}

class Manager extends Employee {
    private String position;

    public Manager(String name, double salary, String position) {
        super(name, salary);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("직책: " + position);
    }
}

class M2Method {
    public static void displayEmployeeInfo(Employee employee) {
        employee.displayInfo();
    }
}