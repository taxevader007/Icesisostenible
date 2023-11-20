package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * The Controller class manages users, pilars, and a map in a Java program.
 */

public class Controller {
    private ArrayList<User> users;
    private ArrayList<User> emulateUsers; //nosotros no podes poner los casos prueba en el programa que se va lanzar
    private Pilar[] pilars;
    private Map map;

    // The above code is defining a constructor for a class called "Controller". Inside the
	// constructor, it initializes an array of "Pilar" objects with different types (BIODIVERSITY,
	// WATER, TRASHCOLLECTOR, ENERGY). It also initializes two ArrayLists, one for "users" and one for
	// "emulateUsers". Finally, it initializes a "map" object.
	public Controller() {
        this.pilars = new Pilar[]{new Pilar(PilarType.BIODIVERSITY), new Pilar(PilarType.WATER),
                new Pilar(PilarType.TRASHCOLLECTOR), new Pilar(PilarType.ENERGY)};
        this.users = new ArrayList<>();
        this.emulateUsers = new ArrayList<>();
        this.map = new Map();
    }

    /**
	 * The function initializes a map with the given dimensions.
	 * 
	 * @param x The x parameter represents the width of the map. It determines the number of columns in
	 * the map grid.
	 * @param y The parameter "y" represents the number of rows in the map.
	 */
	public void initializeMap(int x, int y) {
		map.initializeMap(x, y);
	}

    /**
	 * The function checks if a given coordinate (x, y) is valid on a map and returns a corresponding
	 * availability message.
	 * 
	 * @param x The x parameter represents the x-coordinate of a location on a map.
	 * @param y The parameter "y" represents the y-coordinate of a location on a map.
	 * @return The method is returning a String value. If the coordinates (x, y) are valid on the map,
	 * the method will return "Esta disponible" (which means "It is available" in Spanish). Otherwise,
	 * it will return "No esta disponible" (which means "It is not available" in Spanish).
	 */
	public String checkAvailability(int x, int y) {
        if (map.isValid(x, y)) {
            return "Esta disponible";
        } else {
            return "No esta disponible";
        }
    }

    /**
	 * The function deletes a point of interest at the specified coordinates if it exists, and returns
	 * a message indicating whether the deletion was successful or not.
	 * 
	 * @param x The x-coordinate of the point of interest that you want to delete.
	 * @param y The y-coordinate of the point of interest to be deleted.
	 * @return The method is returning a String.
	 */
	public String deletePointInterest(int x, int y) {
        if (map.isValidForDelete(x, y)) {
            map.setPointInterest(x, y, null);
            return "Punto de interés eliminado";
        } else {
            return "Punto de interés vacío, no se puede eliminar";
        }
    }

   /**
	* The function "printMap" iterates through a 2D array of PointInterest objects and appends the
	* string representation of each active PointInterest object to a StringBuilder, then returns the
	* resulting string.
	* 
	* @return The method is returning a string representation of the active point of interest objects
	* in the map.
	*/
    public String printMap() {
		StringBuilder mapString = new StringBuilder();
		for (int i = 0; i < map.getPointInterest().length; i++) {
			for (int j = 0; j < map.getPointInterest()[i].length; j++) {
				PointInterest pi = map.getPointInterest()[i][j];
				if (pi != null && pi.isActive()) {
					mapString.append(pi.toString()).append("\n");
				}
			}
		}
		return mapString.toString();
	}




    /**
	 * The function registers a new visitant by creating a Visitants object with the provided username
	 * and password, adding it to a list of users, and returning a success message.
	 * 
	 * @param userName The username of the visitant that is being registered. It is a String value.
	 * @param password The password parameter is a String that represents the password chosen by the
	 * visitant during the registration process.
	 * @return The method is returning a String message "Visitant registered successfully".
	 */
	public String registerVisitants(String userName, String password) {
        Visitants visitants = new Visitants(userName, password);
        users.add(visitants);
        
        return "Visitant registered successfully";
    }

    /**
	 * The function registers an InfoCollector by creating a new instance and adding it to a list of
	 * users.
	 * 
	 * @param userName The username of the info collector. It is used to uniquely identify the info
	 * collector in the system.
	 * @param password The password parameter is a String that represents the password chosen by the
	 * user for their account.
	 * @param name The name parameter is a String that represents the name of the info collector.
	 * @param email The email parameter is a string that represents the email address of the user.
	 * @param phone The "phone" parameter is a String that represents the phone number of the info
	 * collector.
	 * @return The method is returning a String message "InfoCollector registered successfully".
	 */
	public String registerInfoCollector(String userName, String password, String name, String email, String phone) {
        InfoCollector infoCollector = new InfoCollector(userName, password, name, email, phone);
        users.add(infoCollector);

        return "InfoCollector registered successfully";
        
    }

	/**
	 * The function registers a researcher by creating a new Researcher object with the provided
	 * information and adding it to a list of users.
	 * 
	 * @param userName The username of the researcher. It is a unique identifier for the researcher's
	 * account.
	 * @param password The password parameter is a String that represents the password for the
	 * researcher's account.
	 * @param name The name parameter is a String that represents the name of the researcher.
	 * @param email The email parameter is a string that represents the email address of the researcher.
	 * @param phone The "phone" parameter is a string that represents the phone number of the researcher.
	 * @return The method is returning a string message "Researcher registered successfully".
	 */
	public String registerResearcher(String userName, String password, String name, String email, String phone) {
		Researcher researcher = new Researcher(userName, password, name, email, phone);
        users.add(researcher);
        
        return "Researcher registered successfully";
	}


	/**
	 * The function `registerProyect` registers a new project with the specified details and adds it to
	 * the appropriate pilar based on the researcher's name and pilar type.
	 * 
	 * @param researchername The name of the researcher who is registering the project.
	 * @param pilarType The parameter "pilarType" represents the type of pillar that the project belongs
	 * to. It can have values such as "biodiversity", "water", "trashcollector", or "energy".
	 * @param proyectStatus The parameter "proyectStatus" represents the status of the project. It could
	 * be a string value indicating whether the project is ongoing, completed, or any other status that is
	 * relevant to the project management system.
	 * @param proyectName The name of the project that you want to register.
	 * @param proyectIdentifier The proyectIdentifier is a unique identifier for the project. It could be
	 * a string or a number that distinguishes one project from another.
	 * @param proyectDescription The proyectDescription parameter is a String that represents the
	 * description of the project. It provides additional information about the project, such as its
	 * goals, objectives, and any other relevant details.
	 * @param initialDate The initialDate parameter is a Calendar object representing the start date of
	 * the project.
	 * @param endDate The endDate parameter is a Calendar object that represents the end date of the
	 * project.
	 * @return The method is returning a String message. If the project is successfully added, it will
	 * return "proyect added successfully". If the researcher name and pilar type do not match, it will
	 * return "cannot add proyect if not researcher and a pilar".
	 */
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

    /**
	 * The function modifies a project in a research system based on the provided parameters.
	 * 
	 * @param researchername The researcher's name who is modifying the project.
	 * @param pilarType The parameter "pilarType" represents the type of pillar to which the project
	 * belongs.
	 * @param newproyectStatus The new status of the project.
	 * @param newproyectName The new name for the project.
	 * @param newproyectIdentifier The new identifier for the project.
	 * @param newproyectDescription The parameter "newproyectDescription" is a String that represents
	 * the new description for the project.
	 * @param newinitialDate The new initial date for the project.
	 * @param newendDate The newendDate parameter is a Calendar object representing the new end date of
	 * the project.
	 * @return The method is returning a String message. If the project with the specified name is
	 * found and modified successfully, the message "Proyect modified successfully" is returned. If the
	 * project is not found, the same message is returned.
	 */
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

	/**
	 * The function removes a project from an array of pillars based on the project name and identifier.
	 * 
	 * @param proyectName The name of the project that you want to remove.
	 * @param proyectIdentifier The proyectIdentifier is a unique identifier for the project. It is used
	 * to identify and locate the specific project that needs to be removed.
	 * @return The method is returning a String message. If the project is successfully removed, it will
	 * return "Proyect removed successfully". If the project is not found or not removed, it will return
	 * "Proyect not removed".
	 */
	public String removeProyect(String proyectName, String proyectIdentifier) {

		for (int i = 0; i < pilars.length; i++){
			if (pilars[i].getProjects() != null){
				for (Project p : pilars[i].getProjects()){
					if (p.getProyectName().equalsIgnoreCase(proyectName) && p.getProyectIdentifier().equalsIgnoreCase(proyectIdentifier)){
						pilars[i].getProjects().remove(p);

						return "Proyect removed successfully";
					} 
				}
			}
		}

		return "Proyect not removed";
	}

	/**
	 * The function registers evidence by adding it to a project with a matching name.
	 * 
	 * @param evidenceName The name of the evidence being registered.
	 * @param evidenceDescription The evidence description is a String that describes the details or
	 * characteristics of the evidence being registered. It provides additional information about the
	 * evidence to help understand its purpose or relevance.
	 * @param fileURL The file URL is the location or path of the file that contains the evidence. It
	 * could be a local file path or a URL to a file stored online.
	 * @param relatedProject The relatedProject parameter is a String that represents the name of the
	 * project to which the evidence will be associated.
	 * @param associatedPointInterest The parameter "associatedPointInterest" is a String that represents
	 * the point of interest that the evidence is associated with. It could be a specific feature,
	 * requirement, or aspect of the project that the evidence is related to.
	 * @param registrationDate The registrationDate parameter is of type Calendar, which represents a
	 * specific point in time. It is used to specify the date and time when the evidence is being
	 * registered.
	 * @return The method is returning a String. If a project with the matching name is found, the method
	 * returns "Evidence registered successfully". If no project is found, the method returns "Cannot add
	 * evidence if not related to a project".
	 */
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

	/**
	 * The function modifies the details of an evidence object in a collection of projects based on the
	 * provided evidence name and related project.
	 * 
	 * @param evidenceName The name of the evidence that you want to modify.
	 * @param evidenceDescription The evidence description is a string that describes the details or
	 * characteristics of the evidence. It provides additional information about the evidence and helps in
	 * understanding its purpose or relevance.
	 * @param fileURL The file URL is the URL or path to the file associated with the evidence. It could
	 * be a local file path or a URL to a file stored online.
	 * @param relatedProject The relatedProject parameter is a String that represents the name of the
	 * project that the evidence is related to.
	 * @param associatedPointInterest The associatedPointInterest parameter is a String that represents
	 * the point of interest that is associated with the evidence.
	 * @param registrationDate The registrationDate parameter is of type Calendar, which represents a
	 * specific point in time. It is used to set the registration date of the evidence.
	 * @return The method is returning a String. If the evidence is found and modified successfully, it
	 * will return "Evidence modified successfully". If the evidence is not found, it will return
	 * "Evidence not modified".
	 */
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
	/**
	 * The function rmEvidence removes a specific evidence from a project based on its name and the
	 * related project name.
	 * 
	 * @param evidenceName The name of the evidence you want to remove.
	 * @param relatedProject The name of the project that the evidence is related to.
	 * @return The method is returning a String. If the evidence is successfully removed, it will return
	 * "Evidence removed successfully". If the evidence is not found, it will return "Evidence not found".
	 */
	public String rmEvidence(String evidenceName, String relatedProject) {
		for (int i = 0; i < pilars.length; i++) {
			if (pilars[i].getProjects() != null) {
				for (Project p : pilars[i].getProjects()) {
					if (p.getProyectName().equalsIgnoreCase(relatedProject)) {
						Evidence[] evidences = p.getEvidences();
						for (int j = 0; j < evidences.length; j++) {
							Evidence e = evidences[j];
							if (e != null && e.getEvidenceName().equalsIgnoreCase(evidenceName)) {
								p.removeEvidence(j); // Assuming you have a removeEvidence method in the Project class
								return "Evidence removed successfully";
							}
						}
					}
				}
			}
		}
		return "Evidence not found";
	}
	

	
	

		/**
	 * The function registers a point of interest by associating it with a project and adding it to a map.
	 * 
	 * @param pointInterestName The name of the point of interest that you want to register.
	 * @param associatedEvidence The parameter "associatedEvidence" refers to the name of the project that
	 * the point of interest is associated with.
	 * @param comment The comment parameter is a String that represents any additional information or
	 * notes about the point of interest. It can be used to provide context or details about the point of
	 * interest.
	 * @param codigoQR The parameter "codigoQR" is a String that represents the QR code associated with
	 * the point of interest.
	 * @param x The x-coordinate of the point of interest on the map.
	 * @param y The parameter "y" represents the y-coordinate of the point of interest on the map.
	 * @return The method is returning a String message. If a point of interest is successfully
	 * registered, the message "Punto de interés registrado exitosamente" is returned. If the point of
	 * interest is not registered, the message "Punto de interés no registrado" is returned.
	 */
	public String registerPointInterest(String pointInterestName, String associatedEvidence, String comment, String codigoQR, int x, int y) {
		for (int i = 0; i < pilars.length; i++) {
			if (pilars[i].getProjects() != null) {
				for (Project p : pilars[i].getProjects()) {
					if (p.getProyectName().equalsIgnoreCase(associatedEvidence)) {
						PointInterest pointInterest = new PointInterest(pointInterestName, associatedEvidence, comment, codigoQR, x, y);
						p.addPointInterest(pointInterest);
						map.setPointInterest(x, y, pointInterest);
						return "Punto de interés registrado exitosamente";
					}
				}
			}
		}
		return "Punto de interés no registrado";
	}


		/**
	 * The function modifies a point of interest in a map by updating its associated evidence, comment,
	 * QR code, and coordinates.
	 * 
	 * @param pointInterestName The name of the point of interest that you want to modify.
	 * @param associatedEvidence The associated evidence for the point of interest. This could be any
	 * relevant information or documentation related to the point of interest.
	 * @param comment The comment parameter is a String that represents any additional information or
	 * notes about the point of interest.
	 * @param codigoQR The parameter "codigoQR" is a String that represents the QR code associated with
	 * the point of interest.
	 * @param x The x-coordinate of the point of interest on the map.
	 * @param y The parameter "y" represents the y-coordinate of the point of interest on the map.
	 * @return The method is returning a String message. If the point of interest is found and modified
	 * successfully, the message "Punto de interés modificado exitosamente" is returned. If the point
	 * of interest is not found or not modified, the message "Punto de interés no modificado" is
	 * returned.
	 */
	public String modifyPointInterest(String pointInterestName, String associatedEvidence, String comment, String codigoQR, int x, int y) {
		for (int i = 0; i < pilars.length; i++) {
			if (pilars[i].getProjects() != null) {
				for (Project p : pilars[i].getProjects()) {
					for (PointInterest pi : p.getPointInterests()) {
						if (pi.getPointInterestName().equalsIgnoreCase(pointInterestName)) {
							pi.setAssociatedEvidence(associatedEvidence);
							pi.setComment(comment);
							pi.setCodigoQR(codigoQR);
							pi.setX(x);
							pi.setY(y);
							map.setPointInterest(x, y, pi); // Modify point of interest in the map
							return "Punto de interés modificado exitosamente";
						}
					}
				}
			}
		}
		return "Punto de interés no modificado";
	}
	/**
	 * The function removes a point of interest by setting it as inactive in a list of projects.
	 * 
	 * @param pointInterestName The parameter "pointInterestName" is a String that represents the name
	 * of the point of interest that you want to remove.
	 * @param x The x-coordinate of the point of interest on the map.
	 * @param y The parameter "y" represents the y-coordinate of the point of interest on the map.
	 * @return The method is returning a String message. If the point of interest with the specified
	 * name is found and successfully set as inactive, the method returns "Punto de interés eliminado
	 * exitosamente" (which means "Point of interest successfully removed" in Spanish). If the point of
	 * interest is not found or cannot be removed, the method returns "Punto de interés no eliminado" (
	 */
    // The above code is a method in Java that takes in a point of interest name, and x and y
	// coordinates. It is intended to remove the specified point of interest from a collection or data
	// structure. However, the implementation of the method is missing, as indicated by the "
	public String removePointInterest(String pointInterestName, int x, int y) {
		for (int i = 0; i < pilars.length; i++) {
			if (pilars[i].getProjects() != null) {
				for (Project p : pilars[i].getProjects()) {
					for (PointInterest pi : p.getPointInterests()) {
						if (pi.getPointInterestName().equalsIgnoreCase(pointInterestName) && pi.x() == x && pi.y() == y) {
							pi.setActive(false); // Set the PointInterest as inactive
							map.removePointInterest(x, y); // Remove point of interest from the map
							return "Punto de interés eliminado exitosamente";
						}
					}
				}
			}
		}
		return "Punto de interés no eliminado";
	}

	

    
	/**
	 * The function creates and adds multiple instances of different types of users to a list.
	 */
	public void testcasesUser() {
		User newVisitant=new Visitants("marlon123", "12345678");
		User newInfoCollector=new InfoCollector("justin123", "2468", "justin", "justin123@email.com", "234234323423");
		User newResearcher=new Researcher("robert123", "87654321", "robert", "rober123@email.com", "315100000");
		
		User newVisitant2=new Visitants("luis", "12345678");
		User newInfoCollector2=new InfoCollector("juan", "2468", "juan"," juan123", "234323423");
		User newResearcher2=new Researcher("oscar", "87654321", "oscar", "oscar123", "3100000");


		this.emulateUsers.add(newVisitant);
		this.emulateUsers.add(newInfoCollector);
		this.emulateUsers.add(newResearcher);

		this.emulateUsers.add(newVisitant2);
		this.emulateUsers.add(newInfoCollector2);
		this.emulateUsers.add(newResearcher2);

		
	}
	
	/**
	 * The function "testcasesProyect" registers two projects with different details and start/end dates.
	 */
	public void testcasesProyect() {
		
		
		Calendar startDate = Calendar.getInstance();
		startDate.set(Calendar.YEAR, 2021);
		startDate.set(Calendar.MONTH, Calendar.JANUARY);
		startDate.set(Calendar.DAY_OF_MONTH, 15);

		Calendar endDate = Calendar.getInstance();
		endDate.set(Calendar.YEAR, 2023);
		endDate.set(Calendar.MONTH, Calendar.DECEMBER);
		endDate.set(Calendar.DAY_OF_MONTH, 3);



		registerProyect("robert", "WATER", "active", "water1", "1", "first in their pillar", startDate, endDate);
		
		
		Calendar startDate2 = Calendar.getInstance();
		startDate.set(Calendar.YEAR, 2022);
		startDate.set(Calendar.MONTH, Calendar.JANUARY); 
		startDate.set(Calendar.DAY_OF_MONTH, 1);

		Calendar endDate2 = Calendar.getInstance();
		endDate.set(Calendar.YEAR, 2023);
		endDate.set(Calendar.MONTH, Calendar.DECEMBER);
		endDate.set(Calendar.DAY_OF_MONTH, 31);

		registerProyect("oscar", "BIODIVERSITY,", "inactive", "biodiversity1", "2", "first in their pillar", startDate2, endDate2);

		
	}

	/**
	 * The function "testcasesReview" registers evidence and point of interest with specific details.
	 */
	public void testcasesReview() {

		Calendar registationDate = Calendar.getInstance();
		registationDate.set(Calendar.YEAR, 2021);
		registationDate.set(Calendar.MONTH, Calendar.FEBRUARY);
		registationDate.set(Calendar.DAY_OF_MONTH, 15);

		registerEvidence("evidence1", "evidence1", "evidence1", "water1", "evidence1", registationDate);

		registerPointInterest("pointInterest1", "evidence1", "pointInterest1", "pointInterest1", 1, 1);

		
	}

	/**
	 * The function "testcasesEvidence" registers evidence and a point of interest with specific details.
	 */
	public void testcasesEvidence(){
		Calendar registationDate = Calendar.getInstance();
		registationDate.set(Calendar.YEAR, 2021);
		registationDate.set(Calendar.MONTH, Calendar.FEBRUARY);
		registationDate.set(Calendar.DAY_OF_MONTH, 15);

		registerEvidence("evidence1", "evidence1", "evidence1", "water1", "evidence1", registationDate);

		registerPointInterest("pointInterest1", "evidence1", "pointInterest1", "pointInterest1", 1, 1);


	}

	/**
	 * The function "infoPilarandAsociatedProyects" takes a pilar type as input and returns information
	 * about the specified pilar type and its associated projects.
	 * 
	 * @param pilarType The parameter `pilarType` is a String that represents the type of pilar. It is
	 * used to search for pilars with a matching type and retrieve information about them and their
	 * associated projects.
	 * @return The method is returning a string that contains information about the specified pilar type
	 * and its associated projects.
	 */
	public String infoPilarandAsociatedProyects(String pilarType) {
		if (pilars == null) {
			return "No pilars available.";
		}
	
		StringBuilder result = new StringBuilder();
		boolean foundPilar = false;
	
		// Iterate over the pilars
		for (Pilar pilar : pilars) {
			if (pilar.getPilarType().toString().equalsIgnoreCase(pilarType)) {
				// Pilar found, set the flag to true
				foundPilar = true;
				result.append("Pilar type: ").append(pilar.getPilarType()).append("\n");
	
				// Check if the pilar has associated projects
				ArrayList<Project> projects = pilar.getProjects(); // Use ArrayList here
				if (projects != null && !projects.isEmpty()) {
					// Iterate over the projects and append their information
					result.append("Associated projects:\n");
					for (Project project : projects) {
						result.append(project.toString()).append("\n").append(map.toString()).append("\n");
					}
				} else {
					result.append("No projects associated with this pilar.\n");
				}
			}
		}
	
		if (!foundPilar) {
			result.append("No projects found for the specified pilar type.\n");
		}
	
		return result.toString();
	}
	
	



	/**
	 * This function retrieves detailed information about a project, including the number of review-type
	 * evidences and the number of evidences of other types.
	 * 
	 * @param proyectName The name of the project you want to retrieve information for.
	 * @param proyectIdentifier The proyectIdentifier is a unique identifier for a project. It is used to
	 * differentiate between different projects with the same name.
	 * @return The method is returning a string that contains the information of the project, the number
	 * of evidence of type "reseña", and the number of evidence of another type. If the project is not
	 * found, it returns the message "the project does not have evidences".
	 */
	public String infoProyectandEvidencesandTypeReviewTypeEvidence(String proyectName, String proyectIdentifier) {
		// Consultar la información detallada de un proyecto, cantidad de evidencias de tipo reseña y cantidad de evidencias de otro tipo.
	
		for (int i = 0; i < pilars.length; i++) {
			if (pilars[i].getProjects() != null) {
				for (Project p : pilars[i].getProjects()) {
					if (p.getProyectName().equalsIgnoreCase(proyectName) && p.getProyectIdentifier().equalsIgnoreCase(proyectIdentifier)) {
						StringBuilder result = new StringBuilder();
						result.append(p.toString()).append("\n");
	
						Evidence[] evidences = p.getEvidences();
						if (evidences != null && evidences.length > 0) {
							result.append("Evidences:\n");
							for (Evidence evidence : evidences) {
								result.append(evidence.toString()).append("\n");
							}
							result.append("Number of evidences: ").append(evidences.length).append("\n");
						} else {
							result.append("No evidences associated with this project.\n");
						}
	
						// Agregar información del mapa
						result.append("Map:\n").append(map.toString()).append("\n");
	
						return result.toString();
					}
				}
			}
		}
	
		return "The project does not have evidences.";
	}
	
	/**
	 * The function "emulateAccessUsersTypes" emulates the access of users of different types to the
	 * system and prints their respective types.
	 */
	public String emulateAccessUsersTypes() {
		//Emular el acceso de usuarios de los diferentes tipos al sistema.
		
		StringBuilder result = new StringBuilder();
		for (User user : emulateUsers) {
			if (user instanceof Visitants) {
				result.append("Visitant: ").append(user.getUserName()).append("\n").append(map.toString()).append(map.toString());
			} else if (user instanceof InfoCollector) {
				result.append("InfoCollector: ").append(user.getUserName()).append("\n");
			} else if (user instanceof Researcher) {
				result.append("Researcher: ").append(user.getUserName()).append("\n");
			}
		}
		return result.toString();

		

		
	}











    /**
     * @param userName
     * @return
     */
    public boolean identifyVisitant(String userName) {
		for (User user : users) {
			if (user instanceof Visitants) {
				if (user.getUserName().equals(userName)) {
					return true;
				}
			}
		}

        return false;
    }

    /**
     * @param userName
     * @return
     */
    public boolean identifyInformationCollector(String userName) {

		for (User user : users) {
			if (user instanceof InfoCollector) {
				if (user.getUserName().equals(userName)) {
					return true;
				}
			}
		}


        return false;
    }

    /**
     * @param userName
     * @return
     */
    public boolean identifyResearcher(String userName) {
        
		for (User user : users) {
			if (user instanceof Researcher) {
				if (user.getUserName().equals(userName)) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * @param userName
	 * @return
	 */
	public boolean identifyUser(String userName) {
		for (User user : users) {
			if (user.getUserName().equals(userName)) {
				return true;
			}
		}

		
		return false;
    }

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public boolean identifyVisitant(String userName, String password) {

		for (User user : users) {
			if (user instanceof Visitants) {
				if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
					return true;
				}
			}
		}


		return false;
	}

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
    public boolean identifyInformationCollector(String userName, String password) {
		
		for (User user : users) {
			if (user instanceof InfoCollector) {
				if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
					return true;
				}
			}
		}

		
		return false;
    }

    /**
     * @param userName
     * @param password
     * @return
     */
    public boolean identifyResearcher(String userName, String password) {

		for (User user : users) {
			if (user instanceof Researcher) {
				if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
					return true;
				}
			}
		}

        return false;
    }

    /**
     * @param x
     * @param y
     * @return
     */
    public String positionMapConsult(int x, int y) {
		
		if (map.positionMapConsult(x, y)) {
			//Consultar a partir de la posición en el mapa la información detallada de una evidencia.

			for (int i = 0; i < pilars.length; i++) {
				if (pilars[i].getProjects() != null) {
					for (Project p : pilars[i].getProjects()) {
						for (PointInterest pi : p.getPointInterests()) {
							if (pi.x() == x && pi.y() == y) {
								StringBuilder result = new StringBuilder();
								result.append(pi.toString()).append("\n");
		
								Evidence[] evidences = p.getEvidences();
								if (evidences != null && evidences.length > 0) {
									result.append("Evidences:\n");
									for (Evidence evidence : evidences) {
										result.append(evidence.toString()).append("\n");
									}
									result.append("Number of evidences: ").append(evidences.length).append("\n");
								} else {
									result.append("No evidences associated with this project.\n");
								}
		
								// Agregar información del mapa
								result.append("Map:\n").append(map.toString()).append("\n");
		
								return result.toString();
							}
						}
					}
				}
			}


		}

		
		return "No hay punto de interés en la posición indicada";
    }


	//hi 




}
