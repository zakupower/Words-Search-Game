
public class CharIndex {
	private Character character;
	private int xIndex, yIndex;
	public CharIndex(Character character, int xIndex, int yIndex) {
		super();
		this.character = character;
		this.xIndex = xIndex;
		this.yIndex = yIndex;
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	public int getxIndex() {
		return xIndex;
	}
	public void setxIndex(int xIndex) {
		this.xIndex = xIndex;
	}
	public int getyIndex() {
		return yIndex;
	}
	public void setyIndex(int yIndex) {
		this.yIndex = yIndex;
	}
	
}
