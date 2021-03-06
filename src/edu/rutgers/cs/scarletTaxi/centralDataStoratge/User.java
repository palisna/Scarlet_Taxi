package edu.rutgers.cs.scarletTaxi.centralDataStoratge;

/**
 * A User maintains information about a user in public fields.
 * @author Isaac Yochelson
 *
 */
public class User {
	public int userID;
	public String name;
	public String username;
	public byte[] password;
	public String email;
	public Address address;
	public String mobileNumber;
	public boolean receiveEmailNotification;
	public boolean receiveSMSNOtification;
	
	/**
	 * This constructor creates a User with all fields specified at the time of constuction.
	 * @param userID
	 * @param name
	 * @param username
	 * @param password
	 * @param email
	 * @param address
	 * @param mobileNumber
	 * @param emailNotification
	 * @param SMSNoticication
	 */
	public User (final int userID, final String name, final String username, final byte[] password,
			final String email, final Address address, final String mobileNumber,
			final boolean emailNotification, final boolean SMSNoticication) {
		this.userID = userID;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.receiveEmailNotification = emailNotification;
		this.receiveSMSNOtification = SMSNotification;
	}
	/**
	 * returns a string representation of this User.
	 */
	public String toString () {
		return username;
	}
}
