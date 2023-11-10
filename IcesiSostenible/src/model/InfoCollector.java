package model;

public class InfoCollector extends User {
    private String name;
    private String email;
    private String phone;

    public InfoCollector(String userName, String password, String name, String email, String phone) {
        super(userName, password);
        this.name = name;
        this.email = email;
        this.phone = phone;
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