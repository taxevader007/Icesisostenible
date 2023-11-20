package model;

import java.util.Calendar;

/**
 * The "Project" class represents a research project with various attributes such as researcher name,
 * project type, status, name, identifier, description, initial date, and end date.
 */
public class Project {

	private String researchername;
	private String pilarType;
	private String proyectStatus;
	private String proyectName;
	private String proyectIdentifier;
	private String proyectDescription;
	private Calendar initialDate;
	private Calendar endDate;

	private Evidence[] evidences;

	// The `public Project` constructor is used to create a new instance of the `Project` class. It takes
	// several parameters such as `researchername`, `pilarType`, `proyectStatus`, `proyectName`,
	// `proyectIdentifier`, `proyectDescription`, `initialDate`, and `endDate`. These parameters are used
	// to initialize the corresponding attributes of the `Project` object.
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

	/**
	 * The removeEvidence function removes an element from an array of evidences at the specified index.
	 * 
	 * @param index The index parameter represents the index of the evidence that needs to be removed from
	 * the evidences array.
	 */
	public void removeEvidence(int index) {
        if (index >= 0 && index < evidences.length) {
            // Create a new array to replace the existing array without the removed evidence
            Evidence[] newEvidences = new Evidence[evidences.length - 1];
            
            // Copy elements before the removed index
            System.arraycopy(evidences, 0, newEvidences, 0, index);

            // Copy elements after the removed index
            System.arraycopy(evidences, index + 1, newEvidences, index, evidences.length - index - 1);

            evidences = newEvidences; // Update the array reference
        }
    }
	/**
	 * The function "addEvidence" is used to add evidence to a system, taking in various parameters such as
	 * evidence name, description, type, location, date, time, researcher name, and project details.
	 * 
	 * @param evidenceName The name of the evidence being added.
	 * @param evidenceDescription The description of the evidence.
	 * @param evidenceType The type of evidence, such as document, photo, video, etc.
	 * @param evidenceLocation The location where the evidence was found or collected.
	 * @param evidenceDate The evidenceDate parameter is a string that represents the date when the
	 * evidence was collected or recorded.
	 * @param evidenceTime The evidenceTime parameter is used to specify the time at which the evidence was
	 * collected or recorded. It can be in any format that represents time, such as "HH:mm" or "hh:mm a".
	 * @param evidenceResearcherName The name of the researcher who collected the evidence.
	 * @param evidencePilarType The evidencePilarType parameter represents the type or category of the
	 * evidence within a specific framework or system. It could be used to classify the evidence based on
	 * different criteria or aspects.
	 * @param evidenceProyectName The name of the project that the evidence is related to.
	 * @param evidenceProyectIdentifier The evidenceProyectIdentifier parameter is used to identify the
	 * project associated with the evidence. It could be a unique identifier or a reference to the project
	 * in a database.
	 * @param evidenceProyectDescription The evidenceProyectDescription parameter is a string that
	 * represents the description of the project associated with the evidence.
	 * @param evidenceProyectInitialDate The evidenceProyectInitialDate parameter represents the initial
	 * date of the project related to the evidence.
	 * @param evidenceProyectEndDate The parameter "evidenceProyectEndDate" represents the end date of the
	 * project associated with the evidence.
	 */

	public void addEvidence(String evidenceName, String evidenceDescription, String evidenceType, String evidenceLocation, String evidenceDate, String evidenceTime, String evidenceResearcherName, String evidencePilarType, String evidenceProyectName, String evidenceProyectIdentifier, String evidenceProyectDescription, String evidenceProyectInitialDate, String evidenceProyectEndDate) {
		
	}
	/**
	 * The function "registerProyect" is used to register a new project with various details such as
	 * researcher name, project type, project status, project name, project identifier, project
	 * description, initial date, and end date.
	 * 
	 * @param researchername The name of the researcher who is registering the project.
	 * @param pilarType The type of pillar the project belongs to. Examples could be "Education",
	 * "Healthcare", "Environment", etc.
	 * @param proyectStatus The proyectStatus parameter represents the current status of the project. It
	 * could be "ongoing", "completed", "cancelled", or any other relevant status.
	 * @param proyectName The name of the project that is being registered.
	 * @param proyectIdentifier The proyectIdentifier parameter is a unique identifier for the project. It
	 * could be a string or a number that distinguishes the project from others.
	 * @param proyectDescription The proyectDescription parameter is a String that represents the
	 * description of the project. It provides information about the purpose, goals, and scope of the
	 * project.
	 * @param initialDate The initial date of the project.
	 * @param endDate The endDate parameter represents the date when the project is expected to be
	 * completed or finished.
	 */
	
	/**
	 * The function "registerProyect" is used to register a new project with various details such as
	 * researcher name, project type, status, name, identifier, description, initial date, and end date.
	 * 
	 * @param researchername The name of the researcher who is registering the project.
	 * @param pilarType The type of pillar the project belongs to. Examples could be "Education",
	 * "Healthcare", "Environment", etc.
	 * @param proyectStatus The proyectStatus parameter represents the current status of the project. It
	 * could be "ongoing", "completed", "cancelled", or any other relevant status.
	 * @param proyectName The name of the project.
	 * @param proyectIdentifier The proyectIdentifier parameter is used to uniquely identify a project. It
	 * could be a unique identifier such as a project ID or a combination of letters and numbers that is
	 * unique to each project.
	 * @param proyectDescription The proyectDescription parameter is a String that represents the
	 * description of the project. It provides information about the purpose, goals, and scope of the
	 * project.
	 * @param initialDate The initial date of the project.
	 * @param endDate The endDate parameter represents the date when the project is expected to be
	 * completed or finished.
	 */
	public void registerProyect(String researchername, String pilarType, String proyectStatus, String proyectName, String proyectIdentifier, String proyectDescription, String initialDate, String endDate) {
		
	}

	/**
	 * The function "modifyProyect" takes in various parameters to modify a project's details.
	 * 
	 * @param researchername The name of the researcher working on the project.
	 * @param pilarType The type of pillar the project belongs to (e.g. social, economic, environmental).
	 * @param proyectStatus The status of the project (e.g. ongoing, completed, cancelled)
	 * @param proyectName The name of the project that you want to modify.
	 * @param proyectIdentifier The proyectIdentifier parameter is a unique identifier for the project. It
	 * could be a string or an integer value that distinguishes the project from others.
	 * @param proyectDescription The proyectDescription parameter is a String that represents the
	 * description of the project. It provides information about the purpose, goals, and scope of the
	 * project.
	 * @param initialDate The initial date of the project.
	 * @param endDate The endDate parameter represents the date when the project is expected to be
	 * completed or finished.
	 */
	public void modifyProyect(String researchername, String pilarType, String proyectStatus, String proyectName, String proyectIdentifier, String proyectDescription, String initialDate, String endDate) {
		
	}

	
	/**
	 * The function "removeProyect" takes a project name as input and does not have any implementation
	 * code.
	 * 
	 * @param proyectName The name of the project that you want to remove.
	 */
	public void removeProyect(String proyectName) {
		
	}

	/**
	 * The function returns the name of a researcher.
	 * 
	 * @return The researchername.
	 */
	public String getResearchername() {
		return researchername;
	}

	/**
	 * The function sets the value of the researchername variable.
	 * 
	 * @param researchername The researchername parameter is a String that represents the name of a
	 * researcher.
	 */
	public void setResearchername(String researchername) {
		this.researchername = researchername;
	}

	/**
	 * The function returns the type of a pilar.
	 * 
	 * @return The method is returning the value of the variable "pilarType".
	 */
	public String getPilarType() {
		return pilarType;
	}

	/**
	 * The function sets the value of the pilarType variable.
	 * 
	 * @param pilarType The parameter "pilarType" is a String that represents the type of a pilar.
	 */
	public void setPilarType(String pilarType) {
		this.pilarType = pilarType;
	}

	/**
	 * The function returns the status of a project.
	 * 
	 * @return The method is returning the value of the variable "proyectStatus".
	 */
	public String getProyectStatus() {
		return proyectStatus;
	}
	
	/**
	 * The function sets the value of the proyectStatus variable.
	 * 
	 * @param proyectStatus The parameter "proyectStatus" is a String that represents the status of a
	 * project.
	 */
	public void setProyectStatus(String proyectStatus) {
		this.proyectStatus = proyectStatus;
	}

	/**
	 * The function returns the name of a project.
	 * 
	 * @return The method is returning the value of the variable "proyectName".
	 */
	public String getProyectName() {
		return proyectName;
	}

	/**
	 * The function sets the value of the proyectName variable.
	 * 
	 * @param proyectName The parameter "proyectName" is a String that represents the name of a project.
	 */

	public void setProyectName(String proyectName) {
		this.proyectName = proyectName;
	}

	/**
	 * The function returns the identifier of a project.
	 * 
	 * @return The method is returning the value of the variable "proyectIdentifier".
	 */
	public String getProyectIdentifier() {
		return proyectIdentifier;
	}

	public void setProyectIdentifier(String proyectIdentifier) {
		this.proyectIdentifier = proyectIdentifier;
	}

	public String getProyectDescription() {
		return proyectDescription;
	}



	// The above code is defining a method called "setProyectDescription" that takes a parameter of type
	// String. This method is used to set the value of the "proyectDescription" variable in a Java class.
	public void setProyectDescription(String proyectDescription) {
		this.proyectDescription = proyectDescription;
	}

	/**
	 * The function returns the initial date stored in a Calendar object.
	 * 
	 * @return The method is returning a Calendar object named initialDate.
	 */
	public Calendar getInitialDate() {
		return initialDate;
	}

	/**
	 * The function sets the initial date for a calendar object.
	 * 
	 * @param initialDate The initialDate parameter is a Calendar object that represents the initial date.
	 */
	public void setInitialDate(Calendar initialDate) {
		this.initialDate = initialDate;
	}

	/**
	 * The function returns the end date of a calendar.
	 * 
	 * @return The method is returning a Calendar object, specifically the endDate.
	 */
	public Calendar getEndDate() {
		return endDate;
	}

	/**
	 * The function sets the end date of a calendar object.
	 * 
	 * @param endDate The endDate parameter is a Calendar object that represents the end date of a certain
	 * event or period.
	 */
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

    /**
	 * The function returns an array of Evidence objects.
	 * 
	 * @return The method is returning an array of Evidence objects. However, in this specific
	 * implementation, it is returning null, indicating that there are no evidences available.
	 */
	public Evidence[] getEvidences() {
        return null;
    }

	/**
	 * The function sets an array of Evidence objects as the value for a variable.
	 * 
	 * @param evidences The parameter "evidences" is an array of type "Evidence". It is used to set the
	 * array of evidence objects for a particular instance of a class.
	 */
	public void setEvidences(Evidence[] evidences) {
	}
	/**
	 * The function "addPointInterest" adds a PointInterest object to a collection.
	 * 
	 * @param pointInterest The parameter `pointInterest` is of type `PointInterest`, which means it is an
	 * object of the `PointInterest` class.
	 */

    /**
	 * The function "addPointInterest" adds a PointInterest object to a collection.
	 * 
	 * @param pointInterest The parameter "pointInterest" is an object of type "PointInterest".
	 */
	public void addPointInterest(PointInterest pointInterest) {
    }

    /**
	 * The function returns an array of PointInterest objects.
	 * 
	 * @return The method is returning an array of PointInterest objects. However, in this specific
	 * implementation, it is returning null, indicating that there are no PointInterest objects to
	 * return.
	 */
	public PointInterest[] getPointInterests() {
        return null;
    }

	/**
	 * The toString() function returns a string representation of the Project object.
	 * 
	 * @return The toString() method is returning a string representation of the Project object. It
	 * includes the values of the researchername, pilarType, proyectStatus, proyectName,
	 * proyectIdentifier, proyectDescription, initialDate, and endDate properties.
	 */
	@Override
	public String toString() {
		return "Project [researchername=" + researchername + ", pilarType=" + pilarType + ", proyectStatus="
				+ proyectStatus + ", proyectName=" + proyectName + ", proyectIdentifier=" + proyectIdentifier
				+ ", proyectDescription=" + proyectDescription + ", initialDate=" + initialDate + ", endDate=" + endDate
				+ "]";
	}

	/**
	 * The function adds evidence with the given details to a system.
	 * 
	 * @param evidenceName The name of the evidence being added. This could be a title or a brief
	 * description of the evidence.
	 * @param evidenceDescription The evidence description is a string that provides additional details or
	 * information about the evidence being added.
	 * @param fileURL The fileURL parameter is a string that represents the URL or file path of the
	 * evidence file.
	 * @param relatedProject The relatedProject parameter is used to specify the project or task that the
	 * evidence is associated with.
	 * @param associatedPointInterest The associatedPointInterest parameter refers to the specific point
	 * of interest or topic that the evidence is related to. It could be a specific feature, requirement,
	 * or aspect of the project that the evidence supports or provides information about.
	 * @param registrationDate The registrationDate parameter is of type Calendar and represents the date
	 * when the evidence is registered.
	 */
	public void addEvidence(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
			String associatedPointInterest, Calendar registrationDate) {
	}


	

	

}