import java.util.Comparator;

public class PlanesComparatorViaY  implements Comparator{
	public int compare(Point o1, Point o2) {
	       return o1.getY().compartTo(o2.getY());
    }

}
