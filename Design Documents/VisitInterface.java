/** Interface for the Plant Catalog.
 *	Implements parcelable
 */
public interface VisitInterface {

	public String searchReserves(String reserves);
	
	/**
	 * Uses searchReserves() to find reserve names in the database
	 * If reserve does not exist, allows user to use their own reserve
	 * @return string of the reserve name
	 */
	public String obtainReserveName();
	
	/**
	 * Creates a new plant to be added to the visit
	 * @return plant object
	 */
	public Plant obtainPlant();
	
	/**
	 * Automatically obtains the time from the Android clock
	 * @return time string
	 */
	public String obtainTime();
}
