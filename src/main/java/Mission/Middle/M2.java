package Mission.Middle;

public class M2 {
    public static void main(String[] args) {
        Employee employee = new Employee("김땡땡", 3000000);
        Manager manager = new Manager("이땡땡", 4000000, "관리자");

        System.out.println("=== 직원 정보 ===");
        M2Method.displayEmployeeInfo(employee);

        System.out.println("=== 관리자 정보 ===");
        M2Method.displayEmployeeInfo(manager);
    }
}