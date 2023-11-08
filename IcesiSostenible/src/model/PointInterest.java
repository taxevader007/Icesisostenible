package model;

public class PointInterest {

	private String pointInterestName;
	private String associatedPilar;
	private String associatedProyect;
	private String comment;
	private String codigoQR;
	private int[][] cordinates;

	public PointInterest() {
		// TODO - implement PointInterest.PointInterest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pointInterestName
	 * @param associatedPillar
	 * @param comment
	 * @param codigoQR
	 * @param cordinates
	 */
	public void registerPointInterest(String pointInterestName, String associatedPillar, String comment, String codigoQR, String cordinates) {
		// TODO - implement PointInterest.registerPointInterest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pointInterestName
	 * @param associatedPillar
	 * @param comment
	 * @param codigoQR
	 * @param cordinates
	 */
	public void modifyPointInterest(String pointInterestName, String associatedPillar, String comment, String codigoQR, String cordinates) {
		// TODO - implement PointInterest.modifyPointInterest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pointInterestName
	 * @param associatedPillar
	 */
	public void removePointInterest(String pointInterestName, String associatedPillar) {
		// TODO - implement PointInterest.removePointInterest
		throw new UnsupportedOperationException();
	}

	public String getPointInterestName() {
		return this.pointInterestName;
	}

	/**
	 * 
	 * @param pointInterestName
	 */
	public void setPointInterestName(String pointInterestName) {
		this.pointInterestName = pointInterestName;
	}

	public String getAssociatedPilar() {
		return this.associatedPilar;
	}

	/**
	 * 
	 * @param associatedPilar
	 */
	public void setAssociatedPilar(String associatedPilar) {
		this.associatedPilar = associatedPilar;
	}

	public String getAssociatedProyect() {
		return this.associatedProyect;
	}

	/**
	 * 
	 * @param associatedProyect
	 */
	public void setAssociatedProyect(String associatedProyect) {
		this.associatedProyect = associatedProyect;
	}

	public String getCodigoQR() {
		return this.codigoQR;
	}

	/**
	 * 
	 * @param codigoQR
	 */
	public void setCodigoQR(String codigoQR) {
		this.codigoQR = codigoQR;
	}

	public int[][] getCordinates() {
		return this.cordinates;
	}

	/**
	 * 
	 * @param cordinates
	 */
	public void setCordinates(int[][] cordinates) {
		this.cordinates = cordinates;
	}

	public String getComment() {
		return this.comment;
	}

	/**
	 * 
	 * @param comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}