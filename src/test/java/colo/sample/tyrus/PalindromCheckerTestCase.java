package colo.sample.tyrus;

import static org.junit.Assert.*;

import org.junit.Test;

import colo.sample.tyrus.util.PalindromeChecker;

public class PalindromCheckerTestCase {

	@Test
	public void test() {

		assertTrue(PalindromeChecker.check("Neuquen"));

		assertTrue(PalindromeChecker.check("Perro"));

		assertFalse(PalindromeChecker.check("Gato"));

		assertTrue(PalindromeChecker.check("Madam"));

	}
}
