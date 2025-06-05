package animal;

public class Cat extends Animal{
	private int power;
	
	public Cat() {
		super();
	}
	
	public Cat(String name, int age, int power) {
		super(name,age);
		this.power = power;
	}
	
	public void display() {
		System.err.println("現在の名前："+ getName() + "　現在の年齢：" + getAge() + "　現在の攻撃力；" + this.power);
	}
	
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	
	public void attack() {
		System.out.println(getName()+"の攻撃！");
		System.out.println("猫パンチ："+power+"のダメージ");
	}
}