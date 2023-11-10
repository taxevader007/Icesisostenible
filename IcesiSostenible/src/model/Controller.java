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

		

			
        
		//public void editPlanet(String galaxyName, String planetName, String newPlanetName, int newNumberOfSatellites, double newPlanetRadius, double newPlanetMass) {
        //for (int i = 0; i < galaxyCounter; i++) {
          //  if (galaxyMemory[i] != null && galaxyMemory[i].getGalaxyName().equals(galaxyName)) {
          //      Galaxy associatedGalaxy = galaxyMemory[i];
    	//	
    	//            for (int j = 0; j < associatedGalaxy.getGalaxyPlanets().length; j++) {
          //          if (associatedGalaxy.getGalaxyPlanets()[j] != null && associatedGalaxy.getGalaxyPlanets()[j].getPlanetName().equals(planetName)) {
        //                associatedGalaxy.getGalaxyPlanets()[j].setPlanetName(newPlanetName);
          //              associatedGalaxy.getGalaxyPlanets()[j].setPlanetNumberSatelites(newNumberOfSatellites);
            //            associatedGalaxy.getGalaxyPlanets()[j].setPlanetRadio(newPlanetRadius);
          //              associatedGalaxy.getGalaxyPlanets()[j].setPlanetMass(newPlanetMass);
            //            break;
             //       }
             //   }
        //    }
        //}
    
			

		return "Proyect modified successfully";
	}

	public void removeProyect() {
	//* public void rmPlanet( String galaxyName, String planetName) {
    //    for (int i = 0; i < galaxyCounter; i++) {
    //        if (galaxyMemory[i] != null && galaxyMemory[i].getGalaxyName().equals(galaxyName)) {
    //            Galaxy associatedGalaxy = galaxyMemory[i];
    //
    //            for (int j = 0; j < associatedGalaxy.getGalaxyPlanets().length; j++) {
    //                if (associatedGalaxy.getGalaxyPlanets()[j] != null && associatedGalaxy.getGalaxyPlanets()[j].getPlanetName().equals(planetName)) {
    //                    associatedGalaxy.getGalaxyPlanets()[j] = null;
    //                    break;
    //                }
    //            }
    //       }
    //    }
    //}
	// */	
		
	}

	public void registerEvidence() {


		
	}

	public void modifyEvidence() {
		
	}

	public void rmEvidence() {
		
	}

	public void registerPointInterest() {
		
	}

	public void modifyPointInterest() {
		
	}

	public void removePointInterest() {
		
	}

	public void testcasesUser() {
		
	}

	public void testcasesProyect() {
		
	}

	public void testcasesReview() {
		
	}

	public void infoPilarandAsociatedProyects() {
		
	}

	public void infoProyectandEvidencesandTypeReviewTypeEvidence() {
		
	}

	public void emulateAccessUsersTypes() {
		
	}




}
