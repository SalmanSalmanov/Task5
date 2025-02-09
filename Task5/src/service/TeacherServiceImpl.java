package service;

import model.Teacher;
import repository.TeacherRepositoryImpl;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    private TeacherRepositoryImpl teacherRepository;

    public TeacherServiceImpl(TeacherRepositoryImpl teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void add(Teacher teacher) {
        teacherRepository.add(teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        teacherRepository.delete(teacher);
    }

    @Override
    public void updateSalary(Teacher teacher, double salary) {
        teacherRepository.updateSalary(teacher, salary);
    }

    @Override
    public void updateDepartment(Teacher teacher, String department) {
        teacherRepository.updateDepartment(teacher, department);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }
}
