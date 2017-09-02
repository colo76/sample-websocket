package mbaez.ag2.test;

import org.junit.Assert;
import org.junit.Test;

import ag2.test.palindrome.PalindromeChecker;

public class PalidromeCheckerTestCase {

	@Test
	public void test(){
		
		Assert.assertTrue(PalindromeChecker.isPalindrom("neuquen"));

		Assert.assertTrue(PalindromeChecker.isPalindrom("madam"));

		Assert.assertFalse(PalindromeChecker.isPalindrom("cat"));
		
	}
}
