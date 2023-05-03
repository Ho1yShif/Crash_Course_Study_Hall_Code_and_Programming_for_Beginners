public class LivingRoom {
	private String paintColor;
	private String sofaStyle;
	private int numberOfChairs;
	
	public LivingRoom(String paintColor, String sofaStyle, int numberOfChairs) {
		this.paintColor = paintColor;
		this.sofaStyle = sofaStyle;
		this.numberOfChairs = numberOfChairs;
	}
}

public static void main(String[] args) {
	LivingRoom oceanTheme = new LivingRoom("blue", "sectional", 2);
	LivingRoom cozyTheme = new LivingRoom("beige", "recliner", 4);
	LivingRoom contemporaryTheme = new LivingRoom("black", "tuxedo", 3);
}
