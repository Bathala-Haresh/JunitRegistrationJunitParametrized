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
    // Test cases to validate Mobile number.


    @Test
    public void givenMobileNumber_whenValid_shouldReturnTrue() {
        Assert.assertTrue(validator.phoneNumberValidate("91 8247614882"));
    }

    @Test
    public void givenMobileNumber_whenNoSpaceAfterCode_shouldReturnFalse() {
        Assert.assertFalse(validator.phoneNumberValidate("918247614882"));
    }

    @Test
    public void givenMobileNumber_whenNoCountryCode_shouldReturnFalse() {
        Assert.assertFalse(validator.phoneNumberValidate("8247614882"));
    }

    @Test
    public void givenMobileNumber_whenShort_shouldReturnFalse() {
        Assert.assertFalse(validator.phoneNumberValidate("8247614"));
    }
}
