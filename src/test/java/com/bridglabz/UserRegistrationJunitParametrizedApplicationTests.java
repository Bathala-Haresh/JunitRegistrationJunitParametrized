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
	 
    // Test cases to validate email.

    @Test
    public void givenMail_whenValid_shouldReturnTrue() {
        Assert.assertTrue(validator.emailValidate("abc@yahoo.com"));
    }

    @Test
    public void givenMail_withoutAtTheRate_shouldReturnFalse() {
        Assert.assertFalse(validator.emailValidate("abc.com"));
    }

    @Test
    public void givenMail_withoutUserName_shouldReturnFalse() {
        Assert.assertFalse(validator.emailValidate("@gmail.com"));
    }

    @Test
    public void givenMail_withoutDomainName_shouldReturnFalse() {
        Assert.assertFalse(validator.emailValidate("@.com"));
    }

    @Test
    public void givenMail_withoutMain_shouldReturnFalse() {
        Assert.assertFalse(validator.emailValidate("@gmail"));
    }

    @Test
    public void givenMail_withOptionalTld_shouldReturnTrue() {
        Assert.assertTrue(validator.emailValidate("abc@yahoo.co.in"));
    }

    @Test
    public void givenMail_withOptionalUserName_shouldReturnTrue() {
        Assert.assertTrue(validator.emailValidate("abc+100@yahoo.co.in"));
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

    // Test Cases to validate Password.
    @Test
    public void givenPassword_WhenValid_shouldReturnTrue() {
        Assert.assertTrue(validator.passwordValidate("Abc$def18"));
    }

    @Test
    public void givenPassword_WhenShort_shouldReturnFalse() {
        Assert.assertFalse(validator.passwordValidate("Abc$11"));
    }

    @Test
    public void givenPassword_WhenNoUpperCase_shouldReturnFalse() {
        Assert.assertFalse(validator.passwordValidate("abc$defg18"));
    }

    @Test
    public void givenPassword_WhenNoNumber_shouldReturnFalse() {
        Assert.assertFalse(validator.passwordValidate("Abc$de"));
    }

    @Test
    public void givenPassword_With2SpecialChar_shouldReturnFalse() {
        Assert.assertFalse(validator.passwordValidate("@@Haresh"));
    }
	
	public static List<String> emailIds_With_ExpectedResult() {
		
		List<String> list = new ArrayList<>();
		list.add("abc.syz@bl.co.in");
		list.add("abc@%*.com");
		list.add("abc111@abc.com");
		
		return list;
	}
	@Test
	public void givenEmailIds_WhenProper_ShouldReturnExpectedResult()  {
		boolean result=false;
		for (String str:emailIds_With_ExpectedResult())
		{
			result = userRegistration.emailValidate(str);

		}
		
		Assert.assertEquals(true, result);
	}
}
