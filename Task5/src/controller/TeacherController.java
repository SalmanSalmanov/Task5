package controller;

import model.Teacher;
import service.TeacherServiceImpl;

import java.util.List;

public class TeacherController {
    private TeacherServiceImpl teacherService;

    public TeacherController(TeacherServiceImpl teacherService) {
        this.teacherService = teacherService;
    }

    public void addTeacher(Teacher teacher) {
        teacherService.add(teacher);
    }

    public void deleteTeacher(Teacher teacher) {
        teacherService.delete(teacher);
    }

    public void updateSalary(Teacher teacher, double salary) {
        teacherService.updateSalary(teacher, salary);
    }

    public void updateDepartment(Teacher teacher, String department) {
        teacherService.updateDepartment(teacher, department);
    }

    public void getAllTeachers() {
        List<Teacher> teachers = teacherService.getAll();
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }
    }
}
