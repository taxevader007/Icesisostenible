package model;

import java.util.ArrayList;

public class Pilar {

	private PilarType pilarType;
	private ArrayList<Project> projects;
	

	public Pilar(PilarType pilarType) {
		this.pilarType = pilarType;
		this.projects = new ArrayList<Project>();
	}


	public PilarType getPilarType() {
		return pilarType;
	}


	public void setPilarType(PilarType pilarType) {
		this.pilarType = pilarType;
	}


	public ArrayList<Project> getProjects() {
		return projects;
	}


	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public void addProject(Project project){
		this.projects.add(project);
	}

	
}