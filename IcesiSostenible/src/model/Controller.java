package model;



public class Controller {

    public Controller() {
    }

    public String registerVisitants(String userName, String password) {
        Visitants visitants = new Visitants(userName, password);


        visitants.setUserName(userName);
        visitants.setPassword(password);
        
        return "Visitant registered successfully";
    }

    public String registerInfoCollector(String userName, String password, String name, String email, String phone) {
        InfoCollector infoCollector = new InfoCollector(userName, password, name, email, phone);

        infoCollector.setUserName(userName);
        infoCollector.setPassword(password);
        infoCollector.setName(name);
        infoCollector.setEmail(email);
        infoCollector.setPhone(phone);

        return "InfoCollector registered successfully";
    
    }

	public String registerResearcher(String userName, String password, String name, String email, String phone) {
		Researcher researcher = new Researcher(userName, password, name, email, phone);

        researcher.setUserName(userName);
        researcher.setPassword(password);
        researcher.setName(name);
        researcher.setEmail(email);
        researcher.setPhone(phone);
        
        return "Researcher registered successfully";
	}


	public void registerProyect() {
		
	}

	public void modifyProject() {
		
	}

	public void removeProyect() {
		
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
