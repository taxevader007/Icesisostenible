package model;
import java.util.Calendar;

public class Evidence {
    private String evidenceName;
    private String evidenceDescription;
    private String fileURL;
    private String relatedProject;
    private String associatedPointInterest;
    private Calendar registrationDate;

    public Evidence(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
            String associatedPointInterest, Calendar registrationDate) {
        this.evidenceName = evidenceName;
        this.evidenceDescription = evidenceDescription;
        this.fileURL = fileURL;
        this.relatedProject = relatedProject;
        this.associatedPointInterest = associatedPointInterest;
        this.registrationDate = registrationDate;
    }
    public String getEvidenceName() {
        return evidenceName;
    }
    public void setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName;
    }
    public String getEvidenceDescription() {
        return evidenceDescription;
    }
    public void setEvidenceDescription(String evidenceDescription) {
        this.evidenceDescription = evidenceDescription;
    }
    public String getFileURL() {
        return fileURL;
    }
    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }
    public String getRelatedProject() {
        return relatedProject;
    }
    public void setRelatedProject(String relatedProject) {
        this.relatedProject = relatedProject;
    }
    public String getAssociatedPointInterest() {
        return associatedPointInterest;
    }
    public void setAssociatedPointInterest(String associatedPointInterest) {
        this.associatedPointInterest = associatedPointInterest;
    }
    public Calendar getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }
    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


}
