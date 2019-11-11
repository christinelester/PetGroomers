
public class Dog implements Comparable<Dog> {
	
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Dog arg0) {
		return this.age - arg0.getAge();
	}

}
