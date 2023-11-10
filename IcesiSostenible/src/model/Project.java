package model;
import java.util.Calendar;

public class Project {

	private String researchername;
	private String pilarType;
	private String proyectStatus;
	private String proyectName;
	private String proyectIdentifier;
	private String proyectDescription;
	private Calendar initialDate;
	private Calendar endDate;

	public Project(String researchername, String pilarType, String proyectStatus, String proyectName, String proyectIdentifier, String proyectDescription, Calendar initialDate, Calendar endDate) {
		this.researchername = researchername;
		this.pilarType = pilarType;
		this.proyectStatus = proyectStatus;
		this.proyectName = proyectName;
		this.proyectIdentifier = proyectIdentifier;
		this.proyectDescription = proyectDescription;
		this.initialDate = initialDate;
		this.endDate = endDate;
		
		
	}

	public void registerProyect(String researchername, String pilarType, String proyectStatus, String proyectName, String proyectIdentifier, String proyectDescription, String initialDate, String endDate) {
		
	}

	public void modifyProyect(String researchername, String pilarType, String proyectStatus, String proyectName, String proyectIdentifier, String proyectDescription, String initialDate, String endDate) {
		
	}

	
	public void removeProyect(String proyectName) {
		
	}

	public String getResearchername() {
		return researchername;
	}

	public void setResearchername(String researchername) {
		this.researchername = researchername;
	}

	public String getPilarType() {
		return pilarType;
	}

	public void setPilarType(String pilarType) {
		this.pilarType = pilarType;
	}

	public String getProyectStatus() {
		return proyectStatus;
	}

	public void setProyectStatus(String proyectStatus) {
		this.proyectStatus = proyectStatus;
	}

	public String getProyectName() {
		return proyectName;
	}

	public void setProyectName(String proyectName) {
		this.proyectName = proyectName;
	}

	public String getProyectIdentifier() {
		return proyectIdentifier;
	}

	public void setProyectIdentifier(String proyectIdentifier) {
		this.proyectIdentifier = proyectIdentifier;
	}

	public String getProyectDescription() {
		return proyectDescription;
	}

	public void setProyectDescription(String proyectDescription) {
		this.proyectDescription = proyectDescription;
	}

	public Calendar getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Calendar initialDate) {
		this.initialDate = initialDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

    public Evidence[] getEvidences() {
        return null;
    }

	public void setEvidences(Evidence[] evidences) {
	}

    public void addPointInterest(PointInterest pointInterest) {
    }

    public PointInterest[] getPointInterests() {
        return null;
    }


	

	

}