package model;

public class File extends Evidence {

	private int Url;
	

	public File(String evidenceName, String evidenceDescription, String fileURL, String relatedProject,
			String associatedPointInterest, String registrationDate, int url) {
		super(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);
		Url = url;
	}

	public int getUrl() {
		return Url;
	}

	public void setUrl(int url) {
		Url = url;
	}
	

}