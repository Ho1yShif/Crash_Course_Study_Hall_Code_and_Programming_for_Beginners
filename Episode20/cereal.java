package Episode20;

public class cereal {
	
	public static void main(String[] args) {
		String FrootLoops = new String("cereal");
		String CocoaPuffs = new String("cereal");
		System.out.println(FrootLoops == CocoaPuffs);
		System.out.println(FrootLoops.equals(CocoaPuffs));

		if (FrootLoops == CocoaPuffs) {
			System.out.println("FrootLoops and CocoaPuffs point to the same memory location");
		} else {
			System.out.println("FrootLoops and CocoaPuffs point to different memory locations");
		}

		if (FrootLoops.equals(CocoaPuffs)) {
			System.out.println("FrootLoops and CocoaPuffs have the same content");
		} else {
			System.out.println("FrootLoops and CocoaPuffs have different content");
		}
}
}