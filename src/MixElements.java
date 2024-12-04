import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MixElements {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator =  first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterable<T> zipIterator = () -> new Iterator<>() {
            private boolean toggle = true;
            @Override
            public boolean hasNext() {
                return firstIterator.hasNext() && secondIterator.hasNext();
            }
            @Override
            public T next() {
                if (toggle) {
                    toggle = false;
                    return firstIterator.next();
                } else {
                    toggle = true;
                    return secondIterator.next();
                }
            }
        };
        return StreamSupport.stream(zipIterator.spliterator(), false);
    }
}
