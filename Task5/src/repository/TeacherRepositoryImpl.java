package repository;

import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryImpl implements TeacherRepository {
    List<Teacher> teachers = new ArrayList<>();

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        teachers.remove(teacher);
        System.out.println(teacher.getUsername() + " was deleted");
    }

    @Override
    public void updateSalary(Teacher teacher, double salary) {
        teacher.setSalary(salary);
        System.out.println("Salary was updated: " + salary);
    }

    @Override
    public void updateDepartment(Teacher teacher, String department) {
        teacher.setDepartment(department);
        System.out.println("Department was updated: " + department);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
}
