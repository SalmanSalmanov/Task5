import controller.StudentController;
import controller.TeacherController;
import controller.UserController;
import model.Student;
import model.Teacher;
import repository.StudentRepositoryImpl;
import repository.TeacherRepositoryImpl;
import repository.UserRepositoryImpl;
import service.StudentServiceImpl;
import service.TeacherServiceImpl;
import service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        StudentRepositoryImpl studentRepository = new StudentRepositoryImpl();
        TeacherRepositoryImpl teacherRepository = new TeacherRepositoryImpl();
        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        StudentServiceImpl studentService = new StudentServiceImpl(studentRepository);
        TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
        UserServiceImpl userService = new UserServiceImpl(userRepository);

        StudentController studentController = new StudentController(studentService);
        TeacherController teacherController = new TeacherController(teacherService);
        UserController userController = new UserController(userService);

        Student student1 = new Student(1, "Salman", "1234", 142, 82, "1163a1");
        Student student2 = new Student(2, "Tom", "1111", 98, 74, "1163a1");
        Student student3 = new Student(3, "Mike", "2222", 98, 79, "1163a2");

        Teacher teacher1 = new Teacher(1, "Tom", "1111", 1500, "IT");
        Teacher teacher2 = new Teacher(2, "Jake", "3333", 1000, "IT");

        studentController.addStudent(student1);
        studentController.addStudent(student2);
        studentController.addStudent(student3);

        teacherController.addTeacher(teacher1);
        teacherController.addTeacher(teacher2);

        teacherController.deleteTeacher(teacher1);
        teacherController.addTeacher(teacher1);
        userController.updateUsername(teacher1, "Paul");
        teacherController.getAllTeachers();
    }
}
