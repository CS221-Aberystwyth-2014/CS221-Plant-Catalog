public interface SendData{

	
	/**
	 * This method takes the data from each record in the visit recording and adds it to a
	 * XML String.
	 * Calls setPictureContent(int speciesNumber) for each recording if imageTaken field is true.
	 * @param The visit record. 
	 */
	 public void setSendInformation(Data recordData);
	
	/**
	 * This method takes the processed text data from the full visit record and stores it in a text/xml MIME
	 * body part object.
	 */
	 public void setTextContent(String recordXML);
	 
	/**
	 * This method should add the image associated with the given record to a image/jpg MIME
	 * body part object.
	 */
	 public void setPictureContent(int speciesNumber);
	 
	/**
	 * This method builds the MIME message in preparation to be sent. It is very important
	 * that the text portion is added to the message before the image portion due to the
	 * MIME standard.
	 */
	 public void buildMime();
	 
	/**
	 * This method sets the target recipient of the message and sends it.
	 */
	 public void sendMessage();
		
	
