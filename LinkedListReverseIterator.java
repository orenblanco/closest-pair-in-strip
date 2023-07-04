import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListReverseIterator<T> implements Iterator<T>  {

    private Link<T> current;

    public LinkedListReverseIterator(Link<T> last) {
        current = last;
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        T data = current.getData();
        current = current.getPrev();
        return data;
    }
}
