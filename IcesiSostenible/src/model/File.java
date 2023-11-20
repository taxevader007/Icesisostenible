package model;
import java.util.Calendar;

/**
 * The Evidence class represents a piece of evidence with its name, description, file URL, related
 * project, associated point of interest, and registration date.
 */
public class File extends Evidence {

	private int Url;
	
	// The `public Evidence` constructor is used to create a new instance of the `Evidence` class. It
	public File(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
			String associatedPointInterest, Calendar registrationDate, int url) {
				super(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);
				Url = url;
	}

	/**
	 * The function "registerEvidence" is used to register evidence by providing its name, description,
	 * file URL, related project, associated point of interest, and registration date.
	 * 
	 * @param evidenceName The name of the evidence being registered.
	 * @param evidenceDescription The description of the evidence being registered. This could include
	 * details about what the evidence is, its relevance to the project or point of interest, and any
	 * other relevant information.
	 * @param fileURL The fileURL parameter is the URL or file path of the evidence file that you want
	 * to register.
	 * @param relatedProject The relatedProject parameter is used to specify the project or task that
	 * the evidence is associated with.
	 * @param associatedPointInterest The associatedPointInterest parameter refers to the point of
	 * interest or topic that the evidence is related to. It could be a specific area of study, a
	 * research question, or a particular aspect of a project.
	 * @param registrationDate The registrationDate parameter is a string that represents the date when
	 * the evidence is being registered.
	 */
	public int getUrl() {
		return Url;
	}


	/**
	 * The function sets the value of the Url variable.
	 * 
	 * @param url The parameter "url" is an integer that represents the URL.
	 */
	public void setUrl(int url) {
		Url = url;
	}

	/**
	 * The toString() function returns a string representation of the File object, including the URL.
	 * 
	 * @return The toString() method is returning a string representation of the object. In this case, it
	 * is returning a string that includes the URL of the file.
	 */
	@Override
	public String toString() {
		return "File [Url=" + Url + "]";
	}
	

}