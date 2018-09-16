import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HorizontalWord implements Word {
	ArrayList<CharIndex> wordIndeces;
	int length;
	public HorizontalWord(String word, int startingXIndex, int startingYIndex) {
		length = word.length();
		wordIndeces = new ArrayList<>();
		int X = startingXIndex;
		int Y = startingYIndex;
		word = word.toUpperCase();
		for(int i = 0; i < word.length(); i++) {
			wordIndeces.add(new CharIndex(word.charAt(i),X++,Y));
		}
	}
	@Override
	public int getLength() {
		return length;
	}
	
}
