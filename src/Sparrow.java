
public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String spicies, int weight) {
		super(age, spicies, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying.....");
	}

}
