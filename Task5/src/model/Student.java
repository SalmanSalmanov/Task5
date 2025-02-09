package model;

public class Student extends User {
    private double stipend;
    private double gpa;
    private String groupName;

    public Student(int id, String username, String password, double stipend, double gpa, String groupName) {
        super(id, username, password);
        this.stipend = stipend;
        this.gpa = gpa;
        this.groupName = groupName;
    }

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", username=" + getUsername() +
                ", password=" + getPassword() +
                ", stipend=" + stipend +
                ", gpa=" + gpa +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
