import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private List<StudentGroup> groupList;
    private List<Stream> streamList;

    public List<Stream> getStreamList() {
        return streamList;
    }

    public void setStreamList(List<Stream> streamList) {
        this.streamList = streamList;
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }
    
}
