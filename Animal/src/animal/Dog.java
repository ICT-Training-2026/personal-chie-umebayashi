package animal;

public class Dog extends Animal{
	private int power;
	
	public Dog() {
		super();
	}
	
	public Dog(String name, int age, int power) {
		super(name,age);
		this.power = power;
	}
	
	public void display() {
		System.out.println("現在の名前："+ getName() + "　現在の年齢：" + getAge() + "　現在の攻撃力；" + this.power);
	}
	
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	
	public void attack() {
		System.out.println(getName()+"の攻撃！");
		System.out.println("噛みつく："+power+"のダメージ");
	}
}
