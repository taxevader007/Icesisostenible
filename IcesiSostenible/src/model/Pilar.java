package model;

import java.util.ArrayList;
/**
 * The Pilar class represents a pilar object with a specific type and a list of associated projects.
 */

public class Pilar {
	
	private PilarType pilarType;
	private ArrayList<Project> projects;
	

	// The `public Pilar(PilarType pilarType)` is a constructor method for the `Pilar` class. It takes a
	// `PilarType` parameter and initializes the `pilarType` variable with the provided value. It also
	// initializes the `projects` variable as a new empty `ArrayList` of `Project` objects.
	public Pilar(PilarType pilarType) {
		this.pilarType = pilarType;
		this.projects = new ArrayList<Project>();
	}

	


	/**
	 * The function returns the PilarType of an object.
	 * 
	 * @return The method is returning the value of the variable "pilarType".
	 */
	public PilarType getPilarType() {
		return pilarType;
	}

/**
 * The function sets the pilarType property of an object.
 * 
 * @param pilarType The parameter "pilarType" is of type "PilarType".
 */

	/**
	 * The function sets the pilarType property to the specified value.
	 * 
	 * @param pilarType The parameter "pilarType" is of type "PilarType".
	 */
	public void setPilarType(PilarType pilarType) {
		this.pilarType = pilarType;
	}


	/**
	 * The function returns an ArrayList of Project objects.
	 * 
	 * @return An ArrayList of Project objects is being returned.
	 */
	public ArrayList<Project> getProjects() {
		return projects;
	}


	/**
	 * The function sets the value of the "projects" variable to the provided ArrayList of Project
	 * objects.
	 * 
	 * @param projects An ArrayList of Project objects.
	 */
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	/**
	 * The addProject function adds a project to a list of projects.
	 * 
	 * @param project The parameter "project" is of type Project.
	 */
	public void addProject(Project project){
		this.projects.add(project);
	}

/**
 * The toString() function returns a string representation of the Pilar object, including its pilar
 * type.
 * 
 * @return The method is returning a string representation of the pilar type.
 */

	@Override
    public String toString() {
        return "Pilar type: " + getPilarType(); 
    }
}
	

	
