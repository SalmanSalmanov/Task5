package repository;

import model.Teacher;

import java.util.List;

public interface TeacherRepository {
    void add(Teacher teacher);
    void delete(Teacher teacher);
    void updateSalary(Teacher teacher, double salary);
    void updateDepartment(Teacher teacher, String department);
    List<Teacher> getAll();
}
