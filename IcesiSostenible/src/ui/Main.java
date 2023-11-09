package ui;

import model.Controller;
import java.util.InputMismatchException;
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
				

                    """);

    }

	public void executeOption(int op) {
        switch (op) {
            case 0 -> {
                System.out.println("bye");
            }
            case 1 -> registerUser();
            default -> {
                System.out.println("Invalid");
            }
        }

    }

	public void registerUser () {
		System.out.println("""
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