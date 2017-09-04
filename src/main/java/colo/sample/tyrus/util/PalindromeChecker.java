package colo.sample.tyrus.util;

/**
 * @author colo
 * Utilidad que verifica si una palabra es palíndrome
 */
public class PalindromeChecker {

	/**
	 * @param pWord2Check
	 * @return si el palíndrome, comparar letra x letras, del principio con el final
	 */
	public static boolean check(String pWord2Check) {

		
		char[] word = pWord2Check.toCharArray();
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;

	}

}
