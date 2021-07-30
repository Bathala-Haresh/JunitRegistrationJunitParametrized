package com.bridglabz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ValidateEmailIdTest {
	
		public UserRegistrationimpl userRegistration = new UserRegistrationimpl();
		private boolean expectedResult;

		@Before
		public void initialize() {
			
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
			
			Assert.assertEquals(this.expectedResult, result);
		}
}