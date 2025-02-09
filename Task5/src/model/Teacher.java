package model;

public class Teacher extends User {
    private double salary;
    private String department;

    public Teacher(int id, String username, String password, double salary, String department) {
        super(id, username, password);
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", username=" + getUsername() +
                ", password=" + getPassword() +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
