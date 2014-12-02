/** Interface for the Plant Catalog.
 *	Implements parcelable
 */
public interface PlantSpeciesInterface {
	
	public String searchPlant(String plantName);
	
	/**Returns XML address of photo
	 * If photo is from camera, accessCamera();
	 * else accessGallery();
	 */
	public String obtainPlantPhoto();
	
	/**
	 * Accesses the camera of the mobile phone
	 * @return photo form camera
	 */
	public String accessCamera();
	
	/**
	 * Accesses the gallery of the mobile phone
	 * @return photo form gallery
	 */
	public String accessGallery();
	
	/**
	 * Uses searchPlant() to find plant names in the database
	 * If plant does not exist, allows user to use their own species name
	 * @return string of the plant name
	 */
	public String obtainPlantName();
	
	/**
	 * Obtains GPS location from Android
	 * @return the GPS loctaion
	 */
	public String obtainGpsLocation();
	
	/**
	 * Obtains the text from the comment text box and adds it to the plant details
	 */
	public void addComment();

}
