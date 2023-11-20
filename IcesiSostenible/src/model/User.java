package model;

/**
 * The User class represents a user with a username and password.
 */
public class User {

	private String userName;
	private String password;

	// The `public User(String userName, String password)` is a constructor method for the `User` class.
	// It takes two parameters, `userName` and `password`, and assigns them to the corresponding instance
	// variables of the `User` object being created. This allows you to create a new `User` object and
	// initialize its `userName` and `password` properties in a single step.
	public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
	/**
	 * The function returns the value of the userName variable.
	 * 
	 * @return The method is returning the value of the variable "userName".
	 */

	/**
	 * The function returns the value of the userName variable.
	 * 
	 * @return The method is returning the value of the variable "userName".
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * The function sets the value of the userName variable.
	 * 
	 * @param userName The parameter "userName" is a String that represents the username that will be set
	 * for an object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * The getPassword() function returns the password.
	 * 
	 * @return The password.
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * The function sets the password for an object.
	 * 
	 * @param password The parameter "password" is a String that represents the new password that will be
	 * set for an object.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}