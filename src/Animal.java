
public class Animal {

	int age;
	String spicies;
	int weight;
	
	
	public Animal(int age, String spicies, int weight) {
		this.age =age;
		this.spicies = spicies;
		this.weight = weight;
		
	}
	
	public void eat() {
		System.out.println("Eating.....");
		
	}
	
	public void sleep() {
		System.out.println("sleep....");
	}
	
	public void shit() {
		System.out.println("Poop.....");
	}
	
}
