import java.util.Iterator;
import java.util.List;

public class TeacherListIterator implements Iterator<Teacher> {

    private int count;


    public TeacherListIterator(TeacherList teacherList) {
        this.count = 0;
        this.teacherList = teacherList.getTeacherList();
    }

    private final List<Teacher> teacherList;

    @Override
    public boolean hasNext() {
        return count < teacherList.size() - 1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            return null;
        }

        count++;
        return teacherList.get(count);
    }

    @Override
    public void remove() {
        teacherList.remove(count);
    }
}
