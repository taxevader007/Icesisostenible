package model;

public class Researcher extends Usuario {

	private String name;
	private String email;
	private String phone;

	public Researcher() {
		// TODO - implement Researcher.Researcher
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userName
	 * @param password
	 * @param name
	 * @param email
	 * @param phone
	 */
	public void registerResearcher(String userName, String password, String name, String email, String phone) {
		// TODO - implement Researcher.registerResearcher
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}