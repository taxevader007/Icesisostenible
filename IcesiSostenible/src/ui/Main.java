/**
 * The Main class in the UI package is responsible for handling user input and executing the
 * corresponding actions in the Controller class.
 */
package ui;

import model.Controller;
import java.util.InputMismatchException;
import java.util.Calendar;
import java.util.Scanner;

/**
 * The Main class is a Java class that initializes a Controller object and provides a Scanner object
 * for user input.
 */
public class Main {
	private final static Scanner scan = new Scanner(System.in);
	private final Controller controller;

	public Main() {
		controller = new Controller();
	}


	/**
	 * The main function runs a menu-driven program that repeatedly displays a menu, prompts the user for
	 * an option, and executes the selected option until the user chooses to exit.
	 */
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



	// The above code is defining a method called "menu" in Java. This method is responsible for printing
	// out a menu with several options for the user to choose from. Each option is numbered and has a
	// corresponding action associated with it. The menu is displayed using a multi-line string (also
	// known as a text block) introduced in Java 15.
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

	// The above code is defining a method called `executeOption` that takes an integer parameter `op`. It
	// uses a switch statement to perform different actions based on the value of `op`.
	public void executeOption(int op) {
        switch (op) {
            case 0 -> System.out.println("bye");
            case 1 -> registerUser();
			case 2 -> manageProyects();
			case 3 -> manageEvidences();
			case 4 -> managePointInterest();
			case 5 -> {
				testcasesUser();
				testcasesProyect();
				testcasesReview();
			}
				
			case 6 -> infoPilarandAsociatedProyects();
			case 7 -> infoProyectandEvidencesandTypeReviewTypeEvidence();
			case 8 -> emulateAccessUsersTypes();

            default -> {
                System.out.println("Invalid");
            }
        }

    }

	// The above code is defining a method called `registerUser()` in Java.
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

	// The above code is defining a method called "registerVisitants" in Java. Inside the method, it
	// prompts the user to enter a username and password, and then calls a method called
	// "registerVisitants" on a controller object, passing in the username and password as arguments.
	public void registerVisitants() {
		System.out.println("Enter username");
		String userName = scan.next();
		System.out.println("Enter password");
		String password = scan.next();
		controller.registerVisitants(userName, password);
	}

	// The above code is defining a method called "registerInfoCollector" in a Java class. Inside the
	// method, it prompts the user to enter a username, password, name, email, and phone number. It then
	// reads the user input for each of these values using a Scanner object called "scan". Finally, it
	// calls a method called "registerInfoCollector" on an object called "controller" passing in the user
	// input values as arguments.
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

	// The above code is defining a method called "registerResearcher" in Java. This method prompts the
	// user to enter a username, password, name, email, and phone number. It then calls a
	// "registerResearcher" method on a "controller" object, passing in the entered values as arguments.
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

	// The above code is defining a method called `manageProyects()` in Java.
	public void manageProyects() {
		System.out.println("""
		enter proyect option
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


	// The above code is defining a method called "registerProyect()" in Java. This method prompts the
	// user to enter various details related to a project, such as researcher name, project type, project
	// status, project name, project identifier, project description, initial date, and end date. It then
	// creates instances of the Calendar class to store the initial and end dates. Finally, it calls a
	// method called "registerProyect()" on a controller object, passing in all the entered details as
	// arguments.
	public void registerProyect() {
		int photoCreationYear;
		int photoCreationMonth;
		int photoCreationDay;

		System.out.println("Enter researcher name");
		String researchername = scan.next();
		System.out.println("Enter pilar type: BIODIVERSITY, WATER, TRASHCOLLECTOR, ENERGY");
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

	// The above code is defining a method called `modifyProject()` in Java.
	public void modifyProject() {
		int photoCreationYear;
		int photoCreationMonth;
		int photoCreationDay;

		System.out.println("Enter researcher name");
		String researchername = scan.next();
		System.out.println("Enter pilar type: BIODIVERSITY, WATER, TRASHCOLLECTOR, ENERGY");
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

	// The above code is defining a method called "removeProyect" in a Java class.
	public void removeProyect() {
		System.out.println("Enter proyect name");
		String proyectName = scan.next();
		System.out.println("Enter proyect identifier");
		String proyectIdentifier = scan.next();
		controller.removeProyect(proyectName, proyectIdentifier);
		
	}

	// The above code is defining a method called `manageEvidences()`.
	public void manageEvidences() {
		System.out.println("""
		enter evidence option
		1. register evidence
		2. modify evidence
		3. remove evidence
		""");
		int evidenceOp;

		try {
            evidenceOp = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scan.next();
            return;
        }

		switch (evidenceOp) {
			case 1 -> registerEvidence();
			case 2 -> modifyEvidence();
			case 3 -> rmEvidence();
			default -> {
					System.out.println("Invalid");
				}
			}
			
		
		}

	// The above code is defining a method called "registerEvidence" in Java. This method prompts the user
	// to enter various details about an evidence, such as its name, description, file URL, related
	// project, associated point of interest, and registration date. It then creates a Calendar object
	// with the provided registration date and calls a "registerEvidence" method on a "controller" object,
	// passing in all the entered details.
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

	// The above code is defining a method called "modifyEvidence" in a Java class. Inside the method, it
	// prompts the user to enter various details related to an evidence, such as evidence name,
	// description, file URL, related project, associated point of interest, and registration date. It
	// then reads the user input and assigns the values to respective variables. Finally, it creates a
	// Calendar object with the registration date and calls a method called "modifyEvidence" on a
	// controller object, passing the entered details as arguments.
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

	// The above code is defining a method called "rmEvidence" in a Java class. Inside the method, it
	// prompts the user to enter the name of an evidence and the related project. It then calls a method
	// called "rmEvidence" on a controller object, passing the evidence name and related project as
	// arguments.
	public void rmEvidence() {

		System.out.println("Enter evidence name");
		String evidenceName = scan.next();
		System.out.println("Enter related proyect");
		String relatedProject = scan.next();
		controller.rmEvidence(evidenceName, relatedProject);
		
	}

	// The above code is implementing a method called `managePointInterest()` in Java.
	public void managePointInterest(){
		System.out.println("""
		enter point of interest option
		1. register point of interest
		2. modify point of interest
		3. remove point of interest
		""");
		int pointInterestOp;

		try {
			pointInterestOp = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid integer.");
			scan.next();
			return;
		}

		switch (pointInterestOp) {
			case 1 -> registerPointInterest();
			case 2 -> modifyPointInterest();
			case 3 -> removePointInterest();
			default -> {
				System.out.println("Invalid");
			}
		}

	}


	// The above code is defining a method called "registerPointInterest" in Java. This method prompts the
	// user to enter various details such as the point of interest name, associated evidence, comment, QR
	// code, x and y coordinates. It then calls a method called "registerPointInterest" on a controller
	// object, passing in the entered values as arguments.
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

	

	// The above code is defining a method called `modifyPointInterest()`. Inside the method, it prompts
	// the user to enter various details such as the point of interest name, associated evidence, comment,
	// QR code, x and y coordinates. It then calls a `modifyPointInterest()` method on a `controller`
	// object, passing in the entered values as arguments.
	public void modifyPointInterest() {

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

		controller.modifyPointInterest(pointInterestName, associatedEvidence, comment, codigoQR, x, y);
		
	}

	// The above code is defining a method called "removePointInterest" in a Java class.
	public void removePointInterest() {
		System.out.println("Enter point of interest name");
		String pointInterestName = scan.next();
		System.out.println("Enter x coordinate");
		int x = scan.nextInt();
		System.out.println("Enter y coordinate");
		int y = scan.nextInt();
		controller.removePointInterest(pointInterestName, x, y);

	}

	// The above code is calling a method called "testcasesUser" on an object called "controller".
	public void testcasesUser() {
		controller.testcasesUser();
	}
	// The above code is defining two methods: "testcasesProyect()" and "testcasesReview()". These methods
	// are calling methods from a "controller" object, which is assumed to be an instance of a class. The
	// purpose of these methods is not clear from the code provided.

	public void testcasesProyect() {
		controller.testcasesProyect();
	}

	// The above code is calling the method "testcasesReview()" on an object named "controller".
	public void testcasesReview() {
		controller.testcasesReview();
	}

	// The above code is defining a method called "infoPilarandAsociatedProyects" in Java.
	public void infoPilarandAsociatedProyects() {
		System.out.println("""
			Enter pilar type
			BIODIVERSITY,
			WATER,
			TRASHCOLLECTOR,
			ENERGY""");
		String pilarType = scan.next();

		String result = controller.infoPilarandAsociatedProyects(pilarType);
		System.out.println(result);
		
	}
	//matriz de evidencias
	// The above code is defining a method called "infoProyectandEvidencesandTypeReviewTypeEvidence" in
	// Java. Inside the method, it prompts the user to enter a project name and project identifier. It
	// then calls a method called "controller.infoProyectandEvidencesandTypeReviewTypeEvidence" with the
	// project name and project identifier as arguments, and prints the result of that method call.
	public void infoProyectandEvidencesandTypeReviewTypeEvidence() {

		System.out.println("Enter proyect name");
		String proyectName = scan.next();
		System.out.println("Enter proyect identifier");
		String proyectIdentifier = scan.next();

		System.out.println(controller.infoProyectandEvidencesandTypeReviewTypeEvidence(proyectName, proyectIdentifier));

	}

	/**
	 * 
	 */
	public void seeMap (){
		controller.printMap();
	}

	public void positionMapConsult (){
		System.out.println("Enter x coordinate");
		int x = scan.nextInt();
		System.out.println("Enter y coordinate");
		int y = scan.nextInt();
		controller.positionMapConsult(x, y);
	}


	// The above code is calling a method called "emulateAccessUsersTypes" on an object called
	// "controller".
	/**
	 * 
	 */
	public void emulateAccessUsersTypes() {
		int op = -1;
		System.out.println("""
		Enter option
		0. Exit
		1. Login system
		2. Register system
		

				""");
		
		op = scan.nextInt();
		switch(op) {
			case 0 :
				System.out.println("Bye");
				break;
			case 1:
				System.out.println("Login system");

				System.out.println("Enter the user name: ");
				String userName = scan.next();
				
				if (controller.identifyVisitant(userName)) {
					System.out.println("password pls:");
					String password = scan.next();
					if (controller.identifyVisitant(userName, password)) {
						System.out.println("welcome to sustainability Icesi  areas");
						userVisitantOp();
						


					} else {
						System.out.println("The password is incorrect");
					}
					
	

				} else if (controller.identifyInformationCollector(userName)) {
					System.out.println("password pls:");
					String password = scan.next();
					if (controller.identifyInformationCollector(userName, password)) {
						System.out.println("welcome to sustainability Icesi  areas");

						userInformationCollectorOp();


					} else {
						System.out.println("The password is incorrect");
					}


				} else if (controller.identifyResearcher(userName)) {
					System.out.println("password pls:");
					String password = scan.next();
					if (controller.identifyResearcher(userName, password)) {
						System.out.println("welcome to sustainability Icesi  areas");

						userResearcherOp();

					} else {
						System.out.println("The password is incorrect");
					}
				} else {
					System.out.println("The user doesn't exist");
				}
		
			default:
				System.out.println("Invalid input, try again");
				emulateAccessUsersTypes();
		}
		
		
		controller.emulateAccessUsersTypes();
		//XD
	}

	public void userVisitantOp(){

	System.out.println("""
	Enter option

	1. See map and register a review to a evidence
	2. consult a evidence/point of interest to a position in the map
	3. Register a review to a evidence and comments

			""");
	int optionVisitant = scan.nextInt();
	
		switch (optionVisitant) {
			case 1 -> seeMap();
			case 2 -> positionMapConsult();
			case 3 -> registerPointInterest(); 
			default -> {
				System.out.println("Invalid input, try again");
				emulateAccessUsersTypes();
			}
		}
	}

	public void userInformationCollectorOp(){

		System.out.println("""
		Enter option

		1. register a review as evidence to a proyect

		2. See map and register a review to a evidence
		3. consult a evidence/point of interest to a position in the map 
		4. Register a review to a evidence and comments

				""");
		int optionInformationCollector = scan.nextInt();
		
		switch (optionInformationCollector) {
			case 1 -> registerEvidence();

			case 2 -> seeMap();
			case 3 -> positionMapConsult();
			case 4 -> registerPointInterest(); 
			default -> {
				System.out.println("Invalid input, try again");
				emulateAccessUsersTypes();
			}
		}


	}

	public void userResearcherOp(){

		System.out.println("""
		Enter option

		1. consult project info and their evidences
		2. register project
		3. modify project

		4. register evidence
		5. modify evidence

		6. register point of interest
		7. modify point of interest

		8. register a review as evidence to a proyect

		9. See map and register a review to a evidence
		10. consult a evidence/point of interest to a position in the map
		11. Register a review to a evidence and comments

				""");

		int optionResearcher = scan.nextInt();

		switch (optionResearcher) {
			case 1 -> infoPilarandAsociatedProyects();
			case 2 -> registerProyect();
			case 3 -> modifyProject();
			case 4 -> registerEvidence();
			case 5 -> modifyEvidence();
			case 6 -> registerPointInterest();
			case 7 -> modifyPointInterest();
			case 8 -> registerEvidence();
			case 9 -> seeMap();
			case 10 -> positionMapConsult();
			case 11 -> registerPointInterest(); 
			default -> {
				System.out.println("Invalid input, try again");
				emulateAccessUsersTypes();
			}
		}

	}

}