package model;

public class Review extends Evidence {

	private int textualReview;

	public Review(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
			String associatedPointInterest, String registrationDate, int textualReview) {
		super(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);
		this.textualReview = textualReview;
	}

	public void getTextualReview() {
		// TODO - implement Review.getTextualReview
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param textualReview
	 */
	public void setTextualReview(int textualReview) {
		this.textualReview = textualReview;
	}

}