package com.konloch;

import com.konloch.constants.MS;

/**
 * @author Konloch
 * @since 2/20/2023
 */
public class TestConstants
{
	//make sure you're passing -enableassertions
	public static void main(String[] args)
	{
		if(!TestConstants.class.desiredAssertionStatus())
			throw new RuntimeException("Enable assertions via `-enableassertions`");
		
		assert MS.SECOND == 1000;
		assert MS.MINUTE == 60 * 1000;
		assert MS.HOUR == 60 * 60 * 1000;
		
		System.out.println("All tests completed");
	}
}
