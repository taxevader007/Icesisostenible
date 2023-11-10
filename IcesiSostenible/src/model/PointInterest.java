package model;

public class PointInterest {

	private String pointInterestName;
	private String associatedEvidence;
	private String comment;
	private String codigoQR;
	private int x;
	private int y;


	public PointInterest(String pointInterestName, String associatedEvidence, String comment,
			String codigoQR, int x, int y) {
		this.pointInterestName = pointInterestName;
		this.comment = comment;
		this.codigoQR = codigoQR;
		this.x = x;
		this.y = y;

	}

    public String getPointInterestName() {
		return this.pointInterestName;
	}

	public void setPointInterestName(String pointInterestName) {
		this.pointInterestName = pointInterestName;
	}

	public String getAssociatedEvidence() {
		return associatedEvidence;
	}

	public void setAssociatedEvidence(String associatedEvidence) {
		this.associatedEvidence = associatedEvidence;
	}

	

	public String getCodigoQR() {
		return this.codigoQR;
	}

	public void setCodigoQR(String codigoQR) {
		this.codigoQR = codigoQR;
	}

	public String getComment() {
		return this.comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}

	public int x () {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int y () {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}