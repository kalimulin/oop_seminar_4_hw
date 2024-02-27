import java.util.List;

public class StreamService {
    public List<Stream> getSortedStreamList() {
        List<Stream> streamList = new Stream().getStreamList();
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
