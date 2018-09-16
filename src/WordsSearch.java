import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WordsSearch {
	ArrayList<ArrayList<Character>> matrix = new ArrayList<>();
	public WordsSearch (int length) {
		for(int i = 0; i < length; i++) {
			matrix.add(new ArrayList<>());
		}
		fillWithRandomLetters();
	}
	private void fillWithRandomLetters() {
		Random random = new Random();
		IntStream stream = random.ints(65, 91);
		ArrayList<Integer> randomCharacters = stream.limit(matrix.size()*matrix.size()).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		int nextRandomChar = 0;
		for(int i = 0; i < matrix.size(); i++) {
			for(int j = 0; j < matrix.size(); j++) {
				matrix.get(i).add((char)(int)randomCharacters.get(nextRandomChar++));
			}
		}
	}
	public void addWord(String word,WordDirection wordDirection) {
		if(matrix.size()-word.length()<0) throw new IllegalArgumentException("word too big for matrix");
		word = word.toUpperCase();
		switch(wordDirection) {
			case HORIZONTAL:
				int yPosition = randomNumberInRange(0,matrix.size());
				int xPosition = randomNumberInRange(0,matrix.size()-word.length());
				int wordIndex = 0;
				for(int i = xPosition;i<xPosition+word.length();i++) {
					System.out.println(word.charAt(wordIndex));
					matrix.get(yPosition).set(i, word.charAt(wordIndex++));
				}
				break;
		}
	}
    private int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
	public ArrayList<ArrayList<Character>> getMatrix() {
		return matrix;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < matrix.size(); i++) {
			builder.append(matrix.get(i)+"\n");
		}
		return builder.toString();
	}
	
}
