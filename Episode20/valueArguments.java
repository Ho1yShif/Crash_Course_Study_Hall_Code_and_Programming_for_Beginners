package Episode20;

public class valueArguments {

	public static void addOne(int num) {
		num = num + 1;
		System.out.println("Inside method, num = " + num);
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Before method call, num = " + num);
		addOne(num);
		System.out.println("After method call, num = " + num);
	}

}
