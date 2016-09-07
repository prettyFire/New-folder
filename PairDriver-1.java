
/**
 * Test driver for the ObjectPair class.
 * 
 * @author Nathan Sprague
 * @version V1, 8/2016
 * @author Shai Malik
 */
public class PairDriver {

	/**
	 * Create several stadium pairs then print the name of the stadium with the
	 * largest capacity.
	 * 
	 * @param args 
	 *            
	 */
	public static void main(String[] args) {

		Pair<String, Integer>[] stadiums = new Pair[3];
		stadiums[0] = new Pair<String, Integer>("Bridgeforth Stadium", 25000);
		stadiums[1] = new Pair<String, Integer>("Michigan Stadium", 109901);
		stadiums[2] = new Pair<String, Integer>("Lane Stadium", 66233);
		String biggest = largestStadium(stadiums);// setting stadiums string
													// equal to biggest
		System.out.println(biggest);// print largest stadium
	}

	/**
	 * Returns the name of the stadium with the largest capacity.
	 * 
	 * @param stadiums
	 *            An array of ObjectPairs where each pair contains a stadium
	 *            name followed by an integer capacity
	 * @return The name of the stadium with the largest capacity
	 */
	public static String largestStadium(Pair[] stadiums) {
		int largest = 0; // set largest to 0
		String largestName = stadiums[0].getFirst().toString();// iterate thru
																// string

		for (int i = 1; i < stadiums.length; i++) {// iterate thru stadiums to
													// find largest

			if (Integer.parseInt(stadiums[i].getSecond().toString()) > Integer
					.parseInt(stadiums[i - 1].getSecond().toString())) {
				largest = i; // compares ints in stadiums[] to find largest one

			}
			largestName = stadiums[largest].getFirst().toString();
		}//sets equal to the name of largest stadium by calling getfirst

		return largestName; // returns largest stadium name
	}

}