import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService {

    private TeacherList teacherList;

    public void removeTeacherByFio(String firstName, String lastName, String middleName) {
        Iterator<Teacher> iterator = teacherList.iterator();

        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();

            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> list = new ArrayList<>(teacherList.getTeacherList());
        Collections.sort(new ArrayList<>(teacherList.getTeacherList()));
        return list;
    }

    public List<Teacher> getSortedTeachersByFio() {
        List<Teacher> list = new ArrayList<>(teacherList.getTeacherList());
        list.sort(new UserComparator<Teacher>());
        return list;
    }

    public void createStudent(String firstName, String lastName, String middleName) {
        teacherList.createTeacher(firstName, lastName, middleName);
    }
}
