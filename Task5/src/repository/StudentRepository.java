package repository;

import model.Student;

import java.util.List;

public interface StudentRepository {
    void add(Student student);
    void delete(Student student);
    void updateStipend(Student student, double stipend);
    void updateGpa(Student student, double gpa);
    void updateGroupName(Student student, String groupName);
    List<Student> getAll();
}
