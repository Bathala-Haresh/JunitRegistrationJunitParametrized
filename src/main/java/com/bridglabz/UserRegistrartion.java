/**
 * @author Bathala Haresh
 * @since 29/07/2021
 * Purpose: USER REGISTRATION PROBLEM: user registrartion problem needs to ensure all validations are in place during the user entry
 */

package com.bridglabz;
/*
 * all the interface methods are declared here
 */
public interface UserRegistrartion 
{
	boolean firstNameValidate(String firstName);
	boolean lastNameValidate(String lastName);
	boolean phoneNumberValidate(String phoneNumber);
	boolean emailValidate(String email);
	

}
