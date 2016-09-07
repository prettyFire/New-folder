
/**
 * Immutable 2-tuple type.
 * 
 * @author Nathan Sprague
 * @version V1, 8/2016
 * @author Shai Malik
 * 
 */
public class Pair<T, S> {// set type vars

	private final T first;// private type vars for first
	private final S second;// other private type var for second var

	/**
	 * Create an ObjectTuple with the provided objects.
	 * 
	 * @param first
	 *            The first object.
	 * @param second
	 *            The second object.
	 */
	public Pair(T first, S second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {// get method for first
		return first;
	}

	public S getSecond() {// get method for second
		return second;
	}

	@Override
	public String toString() {
		return "<" + first.toString() + ", " + second.toString() + ">";
	}

}