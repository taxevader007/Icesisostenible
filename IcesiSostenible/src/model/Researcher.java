package model;

/**
 * The Researcher class is a subclass of the User class.
 */
public class Researcher extends User {

	private String name;
	private String email;
	private String phone;

	// The `public Researcher(String userName, String password, String name, String email, String phone)`
	// is a constructor for the `Researcher` class. It takes in parameters `userName`, `password`, `name`,
	// `email`, and `phone` and initializes the corresponding instance variables in the `Researcher`
	// class. It also calls the constructor of the superclass `User` using the `super(userName, password)`
	// statement, which initializes the `userName` and `password` variables inherited from the `User`
	// class.
	public Researcher(String userName, String password, String name, String email, String phone) {
		super(userName, password);
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @param name
	 * @param email
	 * @param phone
	 */
	
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

	/**
	 * The getEmail() function returns the email address.
	 * 
	 * @return The email address stored in the "email" variable.
	 */
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

	/**
	 * The function returns the phone number.
	 * 
	 * @return The phone number.
	 */
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