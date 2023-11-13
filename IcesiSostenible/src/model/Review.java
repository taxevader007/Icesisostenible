package model;
import java.util.Calendar;

public class Review extends Evidence {
	private int textualReview;

	public Review(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
			String associatedPointInterest, Calendar registrationDate) {
		super(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);
	}




	public Review(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
			String associatedPointInterest, Calendar registrationDate, int textualReview) {
		super(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);
		this.textualReview = textualReview;
	}



	
	public int getTextualReview() {
		return textualReview;
	}

	public void setTextualReview(int textualReview) {
		this.textualReview = textualReview;
	}

	@Override
	public String toString() {
		return "Review [textualReview=" + textualReview + "]";
	}


}