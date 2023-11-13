package model;
import java.util.Calendar;
import java.util.ArrayList;




public class Controller {
    private ArrayList<User> users;
    private Pilar [] pilars;

    public Controller() {
        this.pilars = new Pilar [] {new Pilar(PilarType.BIODIVERSITY), new Pilar(PilarType.WATER), new Pilar(PilarType.TRASHCOLLECTOR), new Pilar(PilarType.ENERGY)};
        this.users = new ArrayList<User>();
    }

    public String registerVisitants(String userName, String password) {
        Visitants visitants = new Visitants(userName, password);
        users.add(visitants);
        
        return "Visitant registered successfully";
    }

    public String registerInfoCollector(String userName, String password, String name, String email, String phone) {
        InfoCollector infoCollector = new InfoCollector(userName, password, name, email, phone);
        users.add(infoCollector);

        return "InfoCollector registered successfully";
        
    }

	public String registerResearcher(String userName, String password, String name, String email, String phone) {
		Researcher researcher = new Researcher(userName, password, name, email, phone);
        users.add(researcher);
        
        return "Researcher registered successfully";
	}


	public String registerProyect(String researchername, String pilarType, String proyectStatus, String proyectName, String proyectIdentifier, String proyectDescription, Calendar initialDate, Calendar endDate) {
        
        Project project = new Project(researchername, pilarType, proyectStatus, proyectName, proyectIdentifier, proyectDescription, initialDate, endDate);
        
		if (researchername.equals(project.getResearchername()) && pilarType.equals(project.getPilarType()))
			switch(pilarType.toLowerCase()){
				case "biodiversity" -> pilars[0].addProject(project);
				case "water" -> pilars[1].addProject(project);
				case "trashcollector" -> pilars[2].addProject(project);
				case "energy" -> pilars[3].addProject(project);
				default -> {
					return "cannot add proyect if not researcher and a pilar ";
				}
			}

        return "proyect added successfully";
        
	}

    public String modifyProyect(String researchername, String pilarType, String newproyectStatus, String newproyectName, String newproyectIdentifier, String newproyectDescription, Calendar newinitialDate, Calendar newendDate) {

		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){
					if (p.getProyectName().equalsIgnoreCase(newproyectName)){
						p.setProyectStatus(newproyectStatus);
						p.setProyectName(newproyectName);
						p.setProyectIdentifier(newproyectIdentifier);
						p.setProyectDescription(newproyectDescription);
						p.setInitialDate(newinitialDate);
						p.setEndDate(newendDate);

						return "Proyect modified successfully";
					} 
				}
			}
		}
			

		return "Proyect modified successfully";
	}

	public String removeProyect(String proyectName, String proyectIdentifier) {

		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){
					if (p.getProyectName().equalsIgnoreCase(proyectName) && p.getProyectIdentifier().equalsIgnoreCase(proyectIdentifier)){
						p = null;

						return "Proyect removed successfully";
					} 
				}
			}
		}

		return "Proyect not removed";
	}

	public String registerEvidence(String evidenceName, String evidenceDescription, String fileURL, String relatedProject, String associatedPointInterest, Calendar registrationDate) {

		// Find the project with the matching name and add the evidence to it
		for(int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){
					if (p.getProyectName().equalsIgnoreCase(relatedProject)){
						p.addEvidence(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);

						return "Evidence registered successfully";
					} 
				}
			}
		}
		// If no project was found, return an error message
		return "Cannot add evidence if not related to a project";
	}

	public String modifyEvidence(String evidenceName, String evidenceDescription, String fileURL, String relatedProject, String associatedPointInterest, Calendar registrationDate) {

		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){
					if (p.getProyectName().equalsIgnoreCase(relatedProject)){


						for (Evidence e : p.getEvidences()){
							if (e.getEvidenceName().equalsIgnoreCase(evidenceName)){
								e.setEvidenceDescription(evidenceDescription);
								e.setFileURL(fileURL);
								e.setRelatedProject(relatedProject);
								e.setAssociatedPointInterest(associatedPointInterest);
								e.setRegistrationDate(registrationDate);

								return "Evidence modified successfully";
							}
						}
					} 
				}
			}
		}

		return "Evidence not modified";

		
	}
	// 9. Remove evidence
	public String rmEvidence(String evidenceName, String relatedProject) {

		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){
					if (p.getProyectName().equalsIgnoreCase(relatedProject)){

						for (Evidence e : p.getEvidences()){
							if (e.getEvidenceName().equalsIgnoreCase(evidenceName)){
								e = null;

								return "Evidence removed successfully";
							}
						}
					} 
				}
			}
		}
		


		return "Evidence removed successfully";
	}

	public String registerPointInterest(String pointInterestName, String associatedEvidence, String comment,String codigoQR, int x, int y) {

		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){

					if (p.getProyectName().equalsIgnoreCase(associatedEvidence)){
						PointInterest pointInterest = new PointInterest(pointInterestName, associatedEvidence, comment, codigoQR, x, y);
						p.addPointInterest(pointInterest);

						return "Point of interest registered successfully";
					}
				}
			}
		}


			
		return "Point of interest not";
	}

	public String modifyPointInterest(String pointInterestName, String associatedEvidence, String comment, String codigoQR, int x, int y) {

		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){

					for (PointInterest pi : p.getPointInterests()){
						if (pi.getPointInterestName().equalsIgnoreCase(pointInterestName)){
							pi.setAssociatedEvidence(associatedEvidence);
							pi.setComment(comment);
							pi.setCodigoQR(codigoQR);
							pi.setX(x);
							pi.setY(y);

							return "Point of interest modified successfully";
						}
					}

				}
				return "There is no point of interest with that name";
				}
			}
	
			return "Point of interest not modified";
		}
	
		//12. Remove point of interest
		public String removePointInterest(String pointInterestName) {
	
			for (int i = 0; i < pilars.length; i++){
				if (pilars[i].getProjects() != null){
					for (Project p : pilars[i].getProjects()){
	
						for (PointInterest pi : p.getPointInterests()){
							if (pi.getPointInterestName().equalsIgnoreCase(pointInterestName)){
								pi = null;
	
								return "Point of interest removed successfully";
							}
						}
					}
				}
			}
			
			return "point of interest was not removed";
		}
	
		public void testcasesUser() {
			
		}
	
	public void testcasesProyect() {
		
	}

	public void testcasesReview() {
		
	}

	public String infoPilarandAsociatedProyects(String pilarType) {
		//Consultar la información detallada de un pilar y el listado de proyectos asociados.
		
		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getPilarType().toString().equalsIgnoreCase(pilarType)){
				return pilars[i].toString();
			}
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){
					if (p.getPilarType().toString().equalsIgnoreCase(pilarType)){
						return p.toString();
					}
				}
			}
		}
		

		return "the pilar do not have proyects";
	}

	public String infoProyectandEvidencesandTypeReviewTypeEvidence(String proyectName, String proyectIdentifier) {
		//Consultar la información detallada de un proyecto, cantidad de evidencias de tipo reseña y cantidad de evidencias de otro tipo.
		
		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){
					if (p.getProyectName().equalsIgnoreCase(proyectName) && p.getProyectIdentifier().equalsIgnoreCase(proyectIdentifier)){
					
						return p.toString() + p.getEvidences().toString() + p.getEvidences().length; //+ p.getreviews().toString() + p.getreviews().length;
					}
				}
			}
		}



		return "the proyect do not have evidences";
	}

	public void emulateAccessUsersTypes() {
		
	}




}
