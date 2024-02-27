import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int count;

    public StreamIterator(Stream stream) {
        this.count = 0;
        this.streamGroups = stream.getGroupList();
        
    }

    private final List<StudentGroup> streamGroups;

    @Override
    public boolean hasNext() {
        return count < streamGroups.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }

        count++;
        return streamGroups.get(count);
    }
    
}
