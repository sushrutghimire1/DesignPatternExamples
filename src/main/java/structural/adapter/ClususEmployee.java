package structural.adapter;

public class ClususEmployee implements Employee {

    private Student student;

    public ClususEmployee(Student student) {
        this.student = student;
    }

    @Override
    public String getName() {
        return student.getName();
    }

    @Override
    public String getCollegeRegistrationNumber() {
        return student.getRegistrationNumber();
    }

    @Override
    public int getGraduationYear() {
        return student.getAdmissionYear() + 4;
    }
}
