package service;

import model.Student;
import repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepositoryImpl studentRepository;

    public StudentServiceImpl(StudentRepositoryImpl studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public void updateStipend(Student student, double stipend) {
        studentRepository.updateStipend(student, stipend);
    }

    @Override
    public void updateGpa(Student student, double gpa) {
        studentRepository.updateGpa(student, gpa);
    }

    @Override
    public void updateGroupName(Student student, String groupName) {
        studentRepository.updateGroupName(student, groupName);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }
}
