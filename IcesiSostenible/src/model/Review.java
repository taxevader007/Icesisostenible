package model;

public class Review extends Evidence {
	private int textualReview;

	public Review(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
	String associatedPointInterest, String registrationDate) {
		super(evidenceName, evidenceDescription, fileURL, relatedProject,
		associatedPointInterest,registrationDate);
		this.textualReview = textualReview;
	
		
	}

	public int getTextualReview() {
		return textualReview;
	}

	public void setTextualReview(int textualReview) {
		this.textualReview = textualReview;
	}


}