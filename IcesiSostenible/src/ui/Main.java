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