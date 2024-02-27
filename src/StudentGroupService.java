import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public void RemoveStudentByFio(String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = studentGroup.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentsList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentsList);
        return studentsList;
    }

    public List<Student> getSortedStudentsByFio() {
        List<Student> studentsList = new ArrayList<>(studentGroup.getStudentList());
        studentsList.sort(new UserComparator<Student>());
        return studentsList;
    }

    public void createStudent(String firstName, String lastName, String middleName) {
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}
