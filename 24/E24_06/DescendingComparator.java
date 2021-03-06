import java.util.Comparator;

public class DescendingComparator<E extends Comparable<E>> implements Comparator<E> {
  @Override
  public int compare(E o1, E o2) {
    if (o1.compareTo(o2) < 0) {
      return 1;
    } else if (o1.compareTo(o2) > 0) {
      return -1;
    }
    return 0;
  }
}
