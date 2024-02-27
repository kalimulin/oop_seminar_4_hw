import java.util.List;

public class StudentController implements UserController {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFio(String firstName, String lastName, String middleName) {
        studentGroupService.RemoveStudentByFio(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFio() {
        List<Student> studentList = studentGroupService.getSortedStudentsByFio();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Stream> getSortedStreams() {
        return streamService.getSortedStreamList();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}