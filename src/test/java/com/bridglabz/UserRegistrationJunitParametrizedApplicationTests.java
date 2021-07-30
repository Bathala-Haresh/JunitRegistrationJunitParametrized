package com.bridglabz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRegistrationJunitParametrizedApplicationTests {

	UserRegistrationimpl validator=new UserRegistrationimpl();
	public UserRegistrationimpl userRegistration = new UserRegistrationimpl();
	

	@Test
	public void givenFirstName_whenValid_thenResultsTrue() 
	{
		Assert.assertTrue(validator.firstNameValidate("Haresh"));
	}

	@Test
	public void givenFirstName_whenInvalid_thenResultsFalse()
	{
		boolean result=validator.firstNameValidate("har");
		Assert.assertFalse(result);
	}
	@Test
	public void givenLastName_whenvalid_thenResultsTrue() 
	{
		boolean result=validator.firstNameValidate("Bathala");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_whenInvalid_thenResultsFalse()
	{
		boolean result=validator.firstNameValidate("");
		Assert.assertFalse(result);
	}

}
