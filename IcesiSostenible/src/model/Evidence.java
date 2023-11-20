/**
 * The Evidence class represents a piece of evidence with various attributes such as name, description,
 * file URL, related project, associated point of interest, and registration date.
 */
package model;
import java.util.Calendar;

/**
 * The Evidence class represents a piece of evidence with its name, description, file URL, related
 * project, associated point of interest, and registration date.
 */
public class Evidence {
    private String evidenceName;
    private String evidenceDescription;
    private String fileURL;
    private String relatedProject;
    private String associatedPointInterest;
    private Calendar registrationDate;

   // The `public Evidence` constructor is used to create a new instance of the `Evidence` class. It
   // takes in several parameters such as `evidenceName`, `evidenceDescription`, `fileURL`,
   // `relatedProject`, `associatedPointInterest`, and `registrationDate`.
    public Evidence(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
            String associatedPointInterest, Calendar registrationDate) {
        this.evidenceName = evidenceName;
        this.evidenceDescription = evidenceDescription;
        this.fileURL = fileURL;
        this.relatedProject = relatedProject;
        this.associatedPointInterest = associatedPointInterest;
        this.registrationDate = registrationDate;
    }

   /**
    * The function "registerEvidence" is used to register evidence by providing its name, description,
    * file URL, related project, associated point of interest, and registration date.
    * 
    * @param evidenceName The name of the evidence being registered.
    * @param evidenceDescription The description of the evidence being registered. This could include
    * details about what the evidence is, its relevance to the project or point of interest, and any
    * other relevant information.
    * @param fileURL The fileURL parameter is the URL or file path of the evidence file that you want
    * to register.
    * @param relatedProject The relatedProject parameter is used to specify the project or task that
    * the evidence is associated with.
    * @param associatedPointInterest The associatedPointInterest parameter refers to the point of
    * interest or topic that the evidence is related to. It could be a specific area of study, a
    * research question, or a particular aspect of a project.
    * @param registrationDate The registrationDate parameter is a string that represents the date when
    * the evidence is being registered.
    */
    public void registerEvidence(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
            String associatedPointInterest, String registrationDate) {
        
    }

   /**
    * The function "getEvidenceName" returns the value of the variable "evidenceName".
    * 
    * @return The method is returning the value of the variable "evidenceName".
    */
    public String getEvidenceName() {
        return evidenceName;
    }
    /**
     * The function sets the value of the evidenceName variable.
     * 
     * @param evidenceName The parameter "evidenceName" is a String that represents the name of the
     * evidence.
     */
    public void setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName;
    }
    /**
     * The function "getEvidenceDescription" returns the value of the variable "evidenceDescription".
     * 
     * @return The method is returning the value of the variable "evidenceDescription".
     */
    public String getEvidenceDescription() {
        return evidenceDescription;
    }
    /**
     * The function sets the value of the evidenceDescription variable.
     * 
     * @param evidenceDescription The parameter "evidenceDescription" is a String that represents the
     * description of the evidence.
     */
    public void setEvidenceDescription(String evidenceDescription) {
        this.evidenceDescription = evidenceDescription;
    }
    /**
     * The function "getFileURL" returns the value of the variable "fileURL".
     * 
     * @return The method is returning the value of the variable "fileURL".
     */
    public String getFileURL() {
        return fileURL;
    }
    /**
     * The function sets the value of the fileURL variable.
     * 
     * @param fileURL The parameter "fileURL" is a String that represents the URL or file path of the
     * evidence file.
     */
    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }
    /**
     * The function "getRelatedProject" returns the value of the variable "relatedProject".
     * 
     * @return The method is returning the value of the variable "relatedProject".
     */
    public String getRelatedProject() {
        return relatedProject;
    }
    /**
     * The function sets the value of the relatedProject variable.
     * 
     * @param relatedProject The parameter "relatedProject" is a String that represents the project or
     * task that the evidence is associated with.
     */
    public void setRelatedProject(String relatedProject) {
        this.relatedProject = relatedProject;
    }
    /**
     * The function "getAssociatedPointInterest" returns the value of the variable
     * "associatedPointInterest".
     * 
     * @return The method is returning the value of the variable "associatedPointInterest".
     */
    public String getAssociatedPointInterest() {
        return associatedPointInterest;
    }
    /**
     * The function sets the value of the associatedPointInterest variable.
     * 
     * @param associatedPointInterest The parameter "associatedPointInterest" is a String that
     * represents the point of interest or topic that the evidence is related to.
     */
    public void setAssociatedPointInterest(String associatedPointInterest) {
        this.associatedPointInterest = associatedPointInterest;
    }
    /**
     * The function "getRegistrationDate" returns the value of the variable "registrationDate".
     * 
     * @return The method is returning the value of the variable "registrationDate".
     */
    public Calendar getRegistrationDate() {
        return registrationDate;
    }
    /**
     * The function sets the value of the registrationDate variable.
     * 
     * @param registrationDate The parameter "registrationDate" is a String that represents the date
     * when the evidence is being registered.
     */
    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * The toString() function returns a string representation of an Evidence object.
     * 
     * @return The toString() method is returning a string representation of an Evidence object.
     */
    @Override
    public String toString() {
        return "Evidence [evidenceName=" + evidenceName + ", evidenceDescription=" + evidenceDescription + ", fileURL="
                + fileURL + ", relatedProject=" + relatedProject + ", associatedPointInterest="
                + associatedPointInterest + ", registrationDate=" + registrationDate + "]";
    }
    



}
