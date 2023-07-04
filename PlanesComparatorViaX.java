import java.util.Comparator;
public class PlanesComparatorViaX implements Comparator{
	public int compare(Point o1, Point o2) {
       return o1.getX().compartTo(o2.getX());
    }
}

