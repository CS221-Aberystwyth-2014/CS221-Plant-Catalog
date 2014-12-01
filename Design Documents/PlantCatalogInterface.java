package uk.ac.aber.cs22120.group10.plantcatalog.interface;

/** Interface for the main class.
 *
 *  Contains methods needed when the application boots up.
 *  Creates instances of naturalist, reserves and species data stored.
 *  If local data is available parse these using the obtain methods.
 *  If network connection is true then call the update method.
 */
public interface PlantCatalogInterface {

	/** Some private attributes:
	 *
	 *  private Naturalist naturalist;
	 *  private ReservesData reservesData;
	 *  private SpeciesNames speciesNames;
	 *  private SendData sendVisit;
	 *  private Visit visit;
	 */

	/** Obtains local reserves data.
	 *
	 *  Creates an instance of ReservesData,
	 *  if local XML file is available uses method
	 *  inside this instance to parse the content.
	 *  @return reservesData new instance of ReservesData created.
	 */
	public ReservesData obtainReserves();

	/** Obtains local species names.
	 *
	 *  Creates an instance of SpeciesNames,
	 *  if local XML file is available uses method
	 *  inside this instance to parse the content.
	 *  @return speciesNames new instance of SpeciesNames created.
	 */
	public SpeciesNames obtainSpeciesNames();

	/** Obtains local naturalists contact details.
	 *
	 *  Creates an instance of Naturalist,
	 *  if local XML file is available uses method
	 *  inside this instance to parse the content.
	 *  Else calls setNaturalistDetails() passing the naturalist object.
	 *  @return Naturalist new instance of Naturalist created.
	 */
	public Naturalist obtainNaturalist();

	/** Sets contact details for naturalist.
	 *
	 *  Takes user input to set contact details for the naturalist provided.
	 *  @param Naturalist naturalist sets contact details for this object.
	 */
	public void setNaturalistDetails(Naturalist naturalist);

	/** Checks for updates of the reserves and species data.
	 *
	 *  Takes local data versions and calls their respective methods
	 *  to check if there are updates.
	 *  If updates are available then calls their respective methods
	 *  to download the new version and parse it to an XML file,
	 *  to store it on Android.
	 */
	public void checkUpdates();

	/** Creates a visit instance.
	 *  
	 *  Creates a new visit using the naturalists contact details..
	 */
	public void recordVisit();

	/** Uploads visit to server.
	 *
	 *  Prepares visit to be send to the server when data network is available
	 *  by calling a method in visit instance to parse the object to an XML file.
	 *  The file is then passed to the sendVisit instance created in main,
	 *  that prepares it to be uploaded.
	 */
	public void sendVisit();

}
