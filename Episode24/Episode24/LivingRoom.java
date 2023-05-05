package Episode24;
public class LivingRoom {
	public String paintColor;
	public String sofaSize;
	public int numberOfChairs;
	
	public LivingRoom(String paintColor, String sofaSize, int numberOfChairs) {
		this.paintColor = paintColor;
		this.sofaSize = sofaSize;
		this.numberOfChairs = numberOfChairs;
	}

	public static void main(String[] args) {
		LivingRoom oceanTheme = new LivingRoom("blue", "medium", 2);
		LivingRoom cozyTheme = new LivingRoom("beige", "small", 4);
		LivingRoom contemporaryTheme = new LivingRoom("black", "large", 3);
	}
}
