package model;
/**
 * The InfoCollector class extends the User class and collects information such as name, email, and
 * phone number.
 */

public class InfoCollector extends User {
    private String name;
    private String email;
    private String phone;

    // The `public InfoCollector(String userName, String password, String name, String email, String
	// phone)` is a constructor method for the `InfoCollector` class. It takes in parameters
	// `userName`, `password`, `name`, `email`, and `phone` and initializes the corresponding instance
	// variables of the `InfoCollector` class.
	public InfoCollector(String userName, String password, String name, String email, String phone) {
        super(userName, password);
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

	
	/**
	 * The function returns the name of an object.
	 * 
	 * @return The method is returning the value of the variable "name".
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

	// The `public String getEmail()` method is a getter method that returns the value of the `email`
	// instance variable. It allows other classes to access the email information of an `InfoCollector`
	// object.
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