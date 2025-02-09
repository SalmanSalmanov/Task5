package controller;

import model.Student;
import service.StudentServiceImpl;

import java.util.List;

public class StudentController {
    private StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public void addStudent(Student student) {
        studentService.add(student);
    }

    public void deleteStudent(Student student) {
        studentService.delete(student);
    }

    public void updateStipend(Student student, double stipend) {
        studentService.updateStipend(student, stipend);
    }

    public void updateGpa(Student student, double gpa) {
        studentService.updateGpa(student, gpa);
    }

    public void updateGroupName(Student student, String groupName) {
        studentService.updateGroupName(student, groupName);
    }

    public void getAllStudents() {
        List<Student> students = studentService.getAll();
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
