package Episode20;

public class efficientCereal {
	
	public static void main(String[] args) {
		String CocoaPuffs = "cereal";
		String FrootLoops = CocoaPuffs;
		System.out.println(CocoaPuffs == FrootLoops);
		System.out.println(CocoaPuffs.equals(FrootLoops));
	}
}