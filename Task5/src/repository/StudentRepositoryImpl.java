package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
        System.out.println(student.getUsername() + " was deleted");
    }

    @Override
    public void updateStipend(Student student, double stipend) {
        student.setStipend(stipend);
        System.out.println("Stipend was updated: " + stipend);
    }

    @Override
    public void updateGpa(Student student, double gpa) {
        student.setGpa(gpa);
        System.out.println("GPA was updated: " + gpa);
    }

    @Override
    public void updateGroupName(Student student, String groupName) {
        student.setGroupName(groupName);
        System.out.println("Group name was updated: " + groupName);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
