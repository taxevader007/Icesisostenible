package ui;

import model.Controller;
import java.util.InputMismatchException;
import java.util.Calendar;
import java.util.Scanner;


public class Main {
	private final static Scanner scan = new Scanner(System.in);
	private final Controller controller;

	public Main() {
		controller = new Controller();
	}


	public static void main(String[] args) {
        Main m = new Main();
        int op = -1;

        do {
            m.menu();
            try {
                op = scan.nextInt();
                m.executeOption(op);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); 
            }
        } while (op != 0);
    }



	public void menu() {
        System.out.println("""
			MENU
			0. exit
			1. register user
			2. Manage proyects
			3. Manage evidences
			4. Manage points of interest
			5. Test cases
			6. Info pilar and their proyects
			7. Info proyect and evidences and type of review and type of evidence
			8. Emulate access users types	
                    """);

    }

	public void executeOption(int op) {
        switch (op) {
            case 0 -> {
                System.out.println("bye");
            }
            case 1 -> registerUser();
			case 2 -> manageProyects();
            default -> {
                System.out.println("Invalid");
            }
        }

    }

	public void registerUser () {
		System.out.println("""
		enter user type

		1. register visitants
		2. register info collector
		3. register researcher		
		""");
		int userOp = scan.nextInt();

		switch (userOp) {
			case 1 -> registerVisitants();
			case 2 -> registerInfoCollector();
			case 3 -> registerResearcher();

			default -> {
				System.out.println("Invalid");
			}
		}
		
	}

	public void registerVisitants() {
		System.out.println("Enter username");
		String userName = scan.next();
		System.out.println("Enter password");
		String password = scan.next();
		controller.registerVisitants(userName, password);
	}

	public void registerInfoCollector() {
		System.out.println("Enter username");
		String userName = scan.next();
		System.out.println("Enter password");
		String password = scan.next();
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter email");
		String email = scan.next();
		System.out.println("Enter phone");
		String phone = scan.next();
		controller.registerInfoCollector(userName, password, name, email, phone);

		
	}

	public void registerResearcher() {
		System.out.println("Enter username");
		String userName = scan.next();
		System.out.println("Enter password");
		String password = scan.next();
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter email");
		String email = scan.next();
		System.out.println("Enter phone");
		String phone = scan.next();
		controller.registerResearcher(userName, password, name, email, phone);
		
	}

	public void manageProyects() {
		System.out.println("""
		1. register proyect
		2. modify proyect
		3. remove proyect
		4. register evidence
		5. modify evidence
		6. remove evidence
		7. register point of interest
		8. modify point of interest
		9. remove point of interest
		10. test cases user
		11. test cases proyect
		12. test cases review
		13. info pilar and asociated proyects
		14. info proyect and evidences and type review type evidence
		15. emulate access users types

		""");
		int proyectOp;

		try {
            proyectOp = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scan.next();
            return;
        }


		switch (proyectOp) {
			case 1 -> registerProyect();
			case 2 -> modifyProject();
			case 3 -> removeProyect();
			case 4 -> registerEvidence();
			case 5 -> modifyEvidence();
			case 6 -> rmEvidence();
			case 7 -> registerPointInterest();
			case 8 -> modifyPointInterest();
			case 9 -> removePointInterest();
			case 10 -> testcasesUser();
			case 11 -> testcasesProyect();
			case 12 -> testcasesReview();
			case 13 -> infoPilarandAsociatedProyects();
			case 14 -> infoProyectandEvidencesandTypeReviewTypeEvidence();
			case 15 -> emulateAccessUsersTypes();
			
			default -> {
				System.out.println("Invalid");
			}
		}
		
	}


	public void registerProyect() {
		int photoCreationYear;
		int photoCreationMonth;
		int photoCreationDay;

		System.out.println("Enter researcher name");
		String researchername = scan.next();
		System.out.println("Enter pilar type");
		String pilarType = scan.next();
		System.out.println("Enter proyect status");
		String proyectStatus = scan.next();
		System.out.println("Enter proyect name");
		String proyectName = scan.next();
		System.out.println("Enter proyect identifier");
		String proyectIdentifier = scan.next();
		System.out.println("Enter proyect description");
		String proyectDescription = scan.next();
		System.out.println("Enter initial date year");
		photoCreationYear = scan.nextInt();
		System.out.println("Enter initial date month");
		photoCreationMonth = scan.nextInt();
		System.out.println("Enter initial date day");
		photoCreationDay = scan.nextInt();

		Calendar initialDate = Calendar.getInstance();
		initialDate.set(photoCreationYear, photoCreationMonth - 1, photoCreationDay);
		
		System.out.println("Enter end date year");
		photoCreationYear = scan.nextInt();
		System.out.println("Enter end date month");
		photoCreationMonth = scan.nextInt();
		System.out.println("Enter end date day");
		photoCreationDay = scan.nextInt();

		Calendar endDate = Calendar.getInstance();
		endDate.set(photoCreationYear, photoCreationMonth - 1, photoCreationDay);

		controller.registerProyect(researchername, pilarType, proyectStatus, proyectName, proyectIdentifier, proyectDescription, initialDate, endDate);
		
	
    }

	public void modifyProject() {
		int photoCreationYear;
		int photoCreationMonth;
		int photoCreationDay;

		System.out.println("Enter researcher name");
		String researchername = scan.next();
		System.out.println("Enter pilar type");
		String pilarType = scan.next();
		System.out.println("Enter new proyect status");
		String newproyectStatus = scan.next();
		System.out.println("Enter new proyect name");
		String newproyectName = scan.next();
		System.out.println("Enter new proyect identifier");
		String newproyectIdentifier = scan.next();
		System.out.println("Enter new proyect description");
		String newproyectDescription = scan.next();
		System.out.println("Enter new initial date year");
		photoCreationYear = scan.nextInt();
		System.out.println("Enter new initial date month");
		photoCreationMonth = scan.nextInt();
		System.out.println("Enter new initial date day");
		photoCreationDay = scan.nextInt();

		Calendar newinitialDate = Calendar.getInstance();
		newinitialDate.set(photoCreationYear, photoCreationMonth - 1, photoCreationDay);
		
		System.out.println("Enter new end date year");
		photoCreationYear = scan.nextInt();
		System.out.println("Enter new end date month");
		photoCreationMonth = scan.nextInt();
		System.out.println("Enter new end date day");
		photoCreationDay = scan.nextInt();

		Calendar newendDate = Calendar.getInstance();
		newendDate.set(photoCreationYear, photoCreationMonth - 1, photoCreationDay);

		controller.modifyProyect(researchername, pilarType, newproyectStatus, newproyectName, newproyectIdentifier, newproyectDescription, newinitialDate, newendDate);

	}

	public void removeProyect() {
		System.out.println("Enter proyect name");
		String proyectName = scan.next();
		System.out.println("Enter proyect identifier");
		String proyectIdentifier = scan.next();
		controller.removeProyect(proyectName, proyectIdentifier);
		
	}

	public void registerEvidence() {
		int photoCreationYear;
		int photoCreationMonth;
		int photoCreationDay;

		System.out.println("Enter evidence name");
		String evidenceName = scan.next();
		System.out.println("Enter evidence description");
		String evidenceDescription = scan.next();
		System.out.println("Enter file URL");
		String fileURL = scan.next();
		System.out.println("Enter related proyect");
		String relatedProject = scan.next();
		System.out.println("Enter associated point of interest");
		String associatedPointInterest = scan.next();
		System.out.println("Enter registration date year");
		photoCreationYear = scan.nextInt();
		System.out.println("Enter registration date month");
		photoCreationMonth = scan.nextInt();
		System.out.println("Enter registration date day");
		photoCreationDay = scan.nextInt();
			

		Calendar registrationDate = Calendar.getInstance();
		registrationDate.set(photoCreationYear, photoCreationMonth - 1, photoCreationDay);

		controller.registerEvidence(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);

		
	}

	public void modifyEvidence() {
		int photoCreationYear;
		int photoCreationMonth;
		int photoCreationDay;

		System.out.println("Enter evidence name");
		String evidenceName = scan.next();
		System.out.println("Enter evidence description");
		String evidenceDescription = scan.next();
		System.out.println("Enter file URL");
		String fileURL = scan.next();
		System.out.println("Enter related proyect");
		String relatedProject = scan.next();
		System.out.println("Enter associated point of interest");
		String associatedPointInterest = scan.next();
		System.out.println("Enter registration date year");
		photoCreationYear = scan.nextInt();
		System.out.println("Enter registration date month");
		photoCreationMonth = scan.nextInt();
		System.out.println("Enter registration date day");
		photoCreationDay = scan.nextInt();
			

		Calendar registrationDate = Calendar.getInstance();
		registrationDate.set(photoCreationYear, photoCreationMonth - 1, photoCreationDay);

		controller.modifyEvidence(evidenceName, evidenceDescription, fileURL, relatedProject, associatedPointInterest, registrationDate);


		
	}

	public void rmEvidence() {

		System.out.println("Enter evidence name");
		String evidenceName = scan.next();
		System.out.println("Enter related proyect");
		String relatedProject = scan.next();
		controller.rmEvidence(evidenceName, relatedProject);
		
	}

	public void registerPointInterest() {

		System.out.println("Enter point of interest name");
		String pointInterestName = scan.next();
		System.out.println("Enter associated evidence");
		String associatedEvidence = scan.next();
		System.out.println("Enter comment");
		String comment = scan.next();
		System.out.println("Enter QR code");
		String codigoQR = scan.next();
		System.out.println("Enter x coordinate");
		int x = scan.nextInt();
		System.out.println("Enter y coordinate");
		int y = scan.nextInt();

		controller.registerPointInterest(pointInterestName, associatedEvidence, comment, codigoQR, x, y);		
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