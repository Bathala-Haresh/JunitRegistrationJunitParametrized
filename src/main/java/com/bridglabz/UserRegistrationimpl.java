/**
 * @author Bathala Haresh
 * @since 29/07/2021
 * Purpose: USER REGISTRATION PROBLEM: user registrartion problem needs to ensure all validations are in place during the user entry
 */
package com.bridglabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationimpl implements UserRegistrartion{
	/*
	 * Purpose: method to validate first name.
	 * Condition for regex is, first name should start 
	 * with capital letter and name should have minimum 3 letters.
	 *
	 * @param firstName takes the first name argument given by user 
	 * @return {@code true} if, and only if, a subsequence of the input
	 *          sequence matches this matcher's pattern.
	 */

	@Override
	public boolean firstNameValidate(String firstName) {
		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{3,20}$");
		Matcher matcher=pattern.matcher(firstName);
		if(firstName.isEmpty())
			return false;
		return matcher.matches();
	}
	/*
	 * Purpose: method to validate last name.
	 * Condition for regex is, last name should start 
	 * with capital letter and name should have minimum 3 letters.
	 *
	 * @param lastName takes the last name argument  given by user 
	 * @return {@code true} if, and only if, a subsequence of the input
	 *          sequence matches this matcher's pattern.
	 */

	@Override
	public boolean lastNameValidate(String lastName) {

		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{3,20}$");
		Matcher matcher=pattern.matcher(lastName);
		return matcher.find();

	}
	/*
	 * Purpose: method to validate valid phoneNumber .
	 * Condition for regex is, country code followed by space and 10 digit number
	 * @return {@code true} if, and only if, a subsequence of the input
	 *          sequence matches this matcher's pattern.
	 */

	@Override
	public boolean phoneNumberValidate(String phoneNumber) {
		Pattern pattern=Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");
		Matcher matcher=pattern.matcher(phoneNumber);
		return matcher.find();

	}
	/*
	 * Purpose: method to validate email.
	 * Condition for regex is, email has 3 mandatory parts that should be followed
	 *
	 * @param email: takes the email argument given by user
	 * @return {@code true} if, and only if, a subsequence of the input
	 *          sequence matches this matcher's pattern. 
	 */

	@Override
	public boolean emailValidate(String email) {
		Pattern pattern=Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher=pattern.matcher(email);
		return matcher.find();

	}
}


