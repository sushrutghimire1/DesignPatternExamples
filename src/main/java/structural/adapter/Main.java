package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Student student = new VITStudent();
        Employee employee = new ClususEmployee(student);
        System.out.println(employee.getGraduationYear());
    }
}
