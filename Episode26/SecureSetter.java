package Episode26;

public class SecureSetter {
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			throw new IllegalArgumentException("Age cannot be negative or greater than 100!");
		}
		this.age = age;
	}
}
