package model;

public class Proyect {

	private String researchername;
	private String pilarType;
	private String proyectStatus;
	private String proyectName;
	private String proyectIdentifier;
	private String proyectDescription;
	private String initialDate;
	private String endDate;

	public Proyect() {
		// TODO - implement Proyecto.Proyecto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researchername
	 * @param pilarType
	 * @param proyectStatus
	 * @param proyectName
	 * @param proyectIdentifier
	 * @param proyectDescription
	 * @param initialDate
	 * @param endDate
	 */
	public void registerProyect(String researchername, String pilarType, String proyectStatus, String proyectName, String proyectIdentifier, String proyectDescription, String initialDate, String endDate) {
		// TODO - implement Proyecto.registerProyect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researchername
	 * @param pilarType
	 * @param proyectStatus
	 * @param proyectName
	 * @param proyectIdentifier
	 * @param proyectDescription
	 * @param initialDate
	 * @param endDate
	 */
	public void modifyProyect(String researchername, String pilarType, String proyectStatus, String proyectName, String proyectIdentifier, String proyectDescription, String initialDate, String endDate) {
		// TODO - implement Proyecto.modifyProyect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param proyectName
	 */
	public void removeProyect(String proyectName) {
		// TODO - implement Proyecto.removeProyect
		throw new UnsupportedOperationException();
	}

	public String getResearchername() {
		return this.researchername;
	}

	/**
	 * 
	 * @param researchername
	 */
	public void setResearchername(String researchername) {
		this.researchername = researchername;
	}
	

	public String getPilar() {
		// TODO - implement Proyecto.getPilar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pilar
	 */
	public void setPilar(String pilar) {
		// TODO - implement Proyecto.setPilar
		throw new UnsupportedOperationException();
	}

	public String getProyectStatus() {
		return this.proyectStatus;
	}

	/**
	 * 
	 * @param proyectStatus
	 */
	public void setProyectStatus(String proyectStatus) {
		this.proyectStatus = proyectStatus;
	}

	public String getProyectName() {
		return this.proyectName;
	}

	/**
	 * 
	 * @param proyectName
	 */
	public void setProyectName(String proyectName) {
		this.proyectName = proyectName;
	}
public String getPilarType() {
		return pilarType;
	}

	public void setPilarType(String pilarType) {
		this.pilarType = pilarType;
	}

	
	public String getProyectIdentifier() {
		return this.proyectIdentifier;
	}

	/**
	 * 
	 * @param proyectIdentifier
	 */
	public void setProyectIdentifier(String proyectIdentifier) {
		this.proyectIdentifier = proyectIdentifier;
	}

	public String getProyectDescription() {
		return this.proyectDescription;
	}

	/**
	 * 
	 * @param proyectDescription
	 */
	public void setProyectDescription(String proyectDescription) {
		this.proyectDescription = proyectDescription;
	}

	public String getInitialDate() {
		return this.initialDate;
	}

	/**
	 * 
	 * @param initialDate
	 */
	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}