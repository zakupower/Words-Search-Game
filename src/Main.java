
public class Main {
	public static void main(String[] args) {
		WordsSearch game = new WordsSearch(10);
		game.addWord("Dimitar", WordDirection.HORIZONTAL);
		System.out.println(game);
	}
}
