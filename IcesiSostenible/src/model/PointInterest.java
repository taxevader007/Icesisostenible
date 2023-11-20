package model;
/**
 * The PointInterest class represents a point of interest with its associated information and
 * coordinates.
 */

public class PointInterest {

	private String pointInterestName;
	private String associatedEvidence;
	private String comment;
	private String codigoQR;
	private int x;
	private int y;
	private boolean active;


	// The code snippet is a constructor for the `PointInterest` class. It initializes the instance
	// variables `pointInterestName`, `associatedEvidence`, `comment`, `codigoQR`, `x`, and `y` with the
	// values passed as arguments to the constructor.
	public PointInterest(String pointInterestName, String associatedEvidence, String comment,
			String codigoQR, int x, int y) {
		this.pointInterestName = pointInterestName;
		this.comment = comment;
		this.codigoQR = codigoQR;
		this.x = x;
		this.y = y;

	}
	/**
	 * The function returns the value of the "active" variable.
	 * 
	 * @return The method is returning the value of the variable "active".
	 */

	public boolean isActive() {
        return active;
    }

    /**
	 * The function sets the active status of an object.
	 * 
	 * @param active The "active" parameter is a boolean variable that determines whether something is
	 * active or not.
	 */
	public void setActive(boolean active) {
        this.active = active;
    }

    /**
	 * The function returns the name of a point of interest.
	 * 
	 * @return The method is returning the value of the variable "pointInterestName".
	 */
	public String getPointInterestName() {
		return this.pointInterestName;
	}
	/**
	 * The function sets the name of a point of interest.
	 * 
	 * @param pointInterestName The parameter "pointInterestName" is a String that represents the name of a
	 * point of interest.
	 */

	public void setPointInterestName(String pointInterestName) {
		this.pointInterestName = pointInterestName;
	}

	/**
	 * The function "getAssociatedEvidence" returns the associated evidence.
	 * 
	 * @return The method is returning a String value.
	 */
	public String getAssociatedEvidence() {
		return associatedEvidence;
	}

	/**
	 * The function sets the value of the associatedEvidence variable.
	 * 
	 * @param associatedEvidence The parameter "associatedEvidence" is a string that represents the
	 * evidence associated with something.
	 */
	public void setAssociatedEvidence(String associatedEvidence) {
		this.associatedEvidence = associatedEvidence;
	}

	

	/**
	 * The getCodigoQR() function returns the value of the codigoQR variable.
	 * 
	 * @return The method is returning a String value.
	 */
	public String getCodigoQR() {
		return this.codigoQR;
	}

	/**
	 * The function sets the value of the "codigoQR" variable.
	 * 
	 * @param codigoQR The parameter "codigoQR" is a string that represents a QR code.
	 */
	public void setCodigoQR(String codigoQR) {
		this.codigoQR = codigoQR;
	}

	/**
	 * The getComment() function returns the comment associated with an object.
	 * 
	 * @return The comment that is stored in the variable "comment".
	 */
	public String getComment() {
		return this.comment;
	}


	/**
	 * The function sets the value of the comment variable.
	 * 
	 * @param comment The parameter "comment" is a String that represents the comment to be set.
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * The above function returns the value of the variable "x".
	 * 
	 * @return The method is returning the value of the variable "x".
	 */
	public int x () {
		return this.x;
	}

	/**
	 * The function sets the value of the variable "x".
	 * 
	 * @param x The parameter "x" is an integer value that is passed to the method. It is used to set the
	 * value of the instance variable "x" in the current object.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * The function returns the value of the variable "y".
	 * 
	 * @return The method is returning the value of the variable "y".
	 */
	public int y () {
		return this.y;
	}

	/**
	 * The function sets the value of the variable "y" to the given input.
	 * 
	 * @param y The parameter "y" is an integer value that represents the y-coordinate of a point or
	 * position.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * The toString() function returns a string representation of the PointInterest object.
	 * 
	 * @return The toString() method is returning a string representation of the object.
	 */
	@Override
	public String toString() {
		return "PointInterest [pointInterestName=" + pointInterestName + ", associatedEvidence=" + associatedEvidence
				+ ", comment=" + comment + ", codigoQR=" + codigoQR + ", x=" + x + ", y=" + y + "]";
	}
	

}