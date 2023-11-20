package model;
import java.util.Calendar;

/**
 * The Review class extends the Evidence class and includes an additional attribute for textual
 * reviews.
 */
public class Review extends Evidence {
	private int textualReview;

	// The code snippet is defining a constructor for the Review class. This constructor takes in several
	// parameters: evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest,
	// and registrationDate. It then calls the constructor of the superclass (Evidence) using the "super"
	// keyword, passing in these parameters. This allows the Review object to inherit the properties and
	// behavior of the Evidence class.
	public Review(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
			String associatedPointInterest, Calendar registrationDate) {
		super(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);
	}




	// The code snippet is defining a constructor for the Review class. This constructor takes in several
	// parameters: evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest,
	// registrationDate, and textualReview.
	public Review(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
			String associatedPointInterest, Calendar registrationDate, int textualReview) {
		super(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);
		this.textualReview = textualReview;
	}



	
	/**
	 * The function returns the textual review.
	 * 
	 * @return The method is returning the value of the variable "textualReview".
	 */
	public int getTextualReview() {
		return textualReview;
	}

	/**
	 * The function sets the textual review value for an object.
	 * 
	 * @param textualReview The parameter "textualReview" is an integer that represents the textual review
	 * for a certain item or product.
	 */
	public void setTextualReview(int textualReview) {
		this.textualReview = textualReview;
	}

	/**
	 * The toString() function returns a string representation of the Review object, including the
	 * textualReview attribute.
	 * 
	 * @return The toString() method is returning a string representation of the Review object. The string
	 * includes the textualReview attribute of the Review object.
	 */
	@Override
	public String toString() {
		return "Review [textualReview=" + textualReview + "]";
	}


}