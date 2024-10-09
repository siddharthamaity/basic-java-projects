import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void testanagramWord() {
		for (long i = 0; i < 10000000L; i++) {
			assertTrue(Anagram.anagramWord("post", "stop"));
		}
	}

	@Test
	public void testIsAnagram() {
		for (long i = 0; i < 10000000L; i++) {
			assertTrue(Anagram.isAnagram("post", "stop"));
		}
	}

	@Test
	public void testCheckAnagram() {
		for (long i = 0; i < 10000000L; i++) {
			assertTrue(Anagram.checkAnagram("post", "stop"));
		}
	}

}
