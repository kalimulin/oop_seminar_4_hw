import java.util.List;

public class StudentController implements UserController {
    private final TeacherService teacherService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    public void removeTeacherByFio(String firstName, String lastName, String middleName) {
        teacherService.removeTeacherByFio(firstName, lastName, middleName);
    }

    public List<Teacher> getSortedStudentList() {
        List<Teacher> teacherList = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedStudentByFio() {
        List<Teacher> teacherList = teacherService.getSortedTeachersByFio();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createStudent(firstName, lastName, middleName);
    }
}