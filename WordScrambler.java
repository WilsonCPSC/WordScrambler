public class WordScrambler{
	private String[] scrambledWords;

	public WordScrambler(String[] wordArr){
		scrambledWords = mixedWords(wordArr);
	}

	private String recombine(String word1, String word2){
		/* Include your method from part (a) */
	}

	private String[] mixedWords(String[] words){
		/* Include your method from part (b)*/
	}

	public String[] scrambledWords(){
		return scrambledWords;
	}

	public static void main(String[] args) {
		String[] arr1 = {"apple", "pear", "this", "cat"};
		WordScrambler w = new WordScrambler(arr1);

		arr1 = w.scrambledWords();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
